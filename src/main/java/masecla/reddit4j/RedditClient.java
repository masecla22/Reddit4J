package masecla.reddit4j;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import masecla.reddit4j.objects.AccessToken;
import masecla.reddit4j.objects.app.Credentials;
import masecla.reddit4j.objects.app.RedditApp;
import masecla.reddit4j.objects.app.UserAgent;
import masecla.reddit4j.objects.reddit.KarmaBreakdown;
import masecla.reddit4j.objects.reddit.RedditData;
import masecla.reddit4j.objects.reddit.User;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.HttpHeaders;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RedditClient {
    private final Gson gson = new Gson();
    private final RedditApp redditApp;
    private final UserAgent userAgent;
    private final Credentials credentials;
    private AccessToken accessToken;
    private String bearerToken;

    public RedditClient(RedditApp redditApp, UserAgent userAgent, Credentials credentials) {
        this.redditApp = redditApp;
        this.userAgent = userAgent;
        this.credentials = credentials;
    }

    public void initialize() throws IOException {
        String responseBody = Request.post("https://www.reddit.com/api/v1/access_token")
                .userAgent(userAgent.toString())
                .addHeader(HttpHeaders.AUTHORIZATION, redditApp.getAuthorization())
                .body(
                        MultipartEntityBuilder.create()
                                .addTextBody("grant_type", "password")
                                .addTextBody("username", credentials.getUsername())
                                .addTextBody("password", credentials.getPassword())
                                .setCharset(StandardCharsets.UTF_8)
                                .build()
                )
                .execute()
                .returnContent()
                .toString();

        this.accessToken = gson.fromJson(responseBody, AccessToken.class);
        this.bearerToken = "bearer " + accessToken.getAccessToken();
    }

    public User getMe() throws IOException {
        String responseBody = Request.get("https://oauth.reddit.com/api/v1/me")
                .userAgent(userAgent.toString())
                .addHeader(HttpHeaders.AUTHORIZATION, bearerToken)
                .execute()
                .returnContent()
                .toString();
        return gson.fromJson(responseBody, User.class);
    }

    public RedditData<KarmaBreakdown> getKarmaBreakdown() throws IOException {
        String responseBody = Request.get("https://oauth.reddit.com/api/v1/me/karma")
                .userAgent(userAgent.toString())
                .addHeader(HttpHeaders.AUTHORIZATION, bearerToken)
                .execute()
                .returnContent()
                .toString();
        return gson.fromJson(
                responseBody,
                TypeToken.getParameterized(RedditData.class, KarmaBreakdown.class).getType()
        );
    }
}
