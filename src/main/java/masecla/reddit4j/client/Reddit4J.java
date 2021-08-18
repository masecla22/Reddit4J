package masecla.reddit4j.client;

import java.io.IOException;
import java.time.Instant;
import java.util.Base64;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.http.GenericHttpClient;
import masecla.reddit4j.http.clients.RateLimitedClient;
import masecla.reddit4j.objects.RedditProfile;
import masecla.reddit4j.objects.RedditUser;
import masecla.reddit4j.requests.ListingEndpointRequest;

public class Reddit4J {
	private static String BASE_URL = "https://www.reddit.com";
	private static String OAUTH_URL = "https://oauth.reddit.com";

	private String username;
	private String password;
	private String clientId;
	private String clientSecret;
	private String userAgent;

	private String token;
	private long expirationDate = -1;
	private GenericHttpClient httpClient;

	public void connect() throws IOException, InterruptedException, AuthenticationException {
		if (userAgent == null) {
			throw new NullPointerException("User Agent was not set!");
		}
		Connection conn = Jsoup.connect(BASE_URL + "/api/v1/access_token").ignoreContentType(true)
				.ignoreHttpErrors(true).method(Method.POST).userAgent(userAgent);
		// Set the required params;
		conn.data("grant_type", "password");
		conn.data("username", username).data("password", password);

		// Generate the Authorization header
		String combination = clientId + ":" + clientSecret;
		combination = Base64.getEncoder().encodeToString(combination.getBytes());
		conn.header("Authorization", "Basic " + combination);

		Response response = httpClient.execute(conn);
		if (response.statusCode() == 401) {
			throw new AuthenticationException("Unauthorized! Invalid clientId or clientSecret!");
		}

		JsonObject object = JsonParser.parseString(response.body()).getAsJsonObject();

		// Something went wrong
		if (object.keySet().contains("error")) {
			throw new AuthenticationException(object.get("error").getAsString());
		}
		this.token = object.get("access_token").getAsString();
		this.expirationDate = object.get("expires_in").getAsInt() + Instant.now().getEpochSecond();
	}

	public Connection authorize(Connection connection) {
		return connection.header("Authorization", "bearer " + token).ignoreContentType(true).userAgent(userAgent);
	}

	public void ensureConnection() throws IOException, InterruptedException, AuthenticationException {
		// There is no token
		if (token == null) {
			connect();
			return;
		}
		// The token is expired
		if (Instant.now().getEpochSecond() > expirationDate) {
			connect();
			return;
		}
	}

	public ListingEndpointRequest<RedditUser> getBlocked() {
		return new ListingEndpointRequest<>("/prefs/blocked", this, RedditUser.class);
	}

	public ListingEndpointRequest<RedditUser> getFriends() {
		return new ListingEndpointRequest<RedditUser>("/prefs/friends", this, RedditUser.class) {
			@Override
			public String preprocess(String body) {
				JsonArray array = JsonParser.parseString(body).getAsJsonArray();
				return array.get(0).getAsJsonObject().toString();
			}
		};
	}

	public RedditProfile getSelfProfile() throws IOException, InterruptedException, AuthenticationException {
		ensureConnection();
		Connection request = authorize(Jsoup.connect(OAUTH_URL + "/api/v1/me"));
		Response rsp = httpClient.execute(request);
		RedditProfile properties = new Gson().fromJson(rsp.body(), RedditProfile.class);
		return properties;
	}

	public static Reddit4J rateLimited() {
		Reddit4J result = new Reddit4J();
		result.httpClient = new RateLimitedClient();
		return result;
	}

	@Deprecated
	public static Reddit4J unlimited() {
		Reddit4J result = new Reddit4J();
		result.httpClient = new masecla.reddit4j.http.clients.UnlimitedClient();
		return result;
	}

	public Reddit4J setUsername(String username) {
		this.username = username;
		return this;
	}

	public Reddit4J setPassword(String password) {
		this.password = password;
		return this;
	}

	public Reddit4J setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	public Reddit4J setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
		return this;
	}

	public Reddit4J setUserAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	public Reddit4J setUserAgent(UserAgentBuilder userAgent) {
		this.userAgent = userAgent.toString();
		return this;
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public String getToken() {
		return token;
	}

	public long getTokenExpirationDate() {
		return expirationDate;
	}

	public GenericHttpClient getHttpClient() {
		return httpClient;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public static String BASE_URL() {
		return BASE_URL;
	}

	public static String OAUTH_URL() {
		return OAUTH_URL;
	}

}
