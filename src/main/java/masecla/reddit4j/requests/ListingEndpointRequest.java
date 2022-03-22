package masecla.reddit4j.requests;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import com.google.gson.Gson;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditThing;

public class ListingEndpointRequest<T extends RedditThing> {
	private String endpointPath;
	private Reddit4J client;
	private Class<T> clazz;
	private Type type;

	public ListingEndpointRequest(String endpointPath, Reddit4J client, Class<T> clazz) {
		super();
		this.endpointPath = endpointPath;
		this.client = client;
		this.clazz = clazz;
	}

	public ListingEndpointRequest(String endpointPath, Reddit4J client, Type type) {
		super();
		this.endpointPath = endpointPath;
		this.client = client;
		this.type = type;
	}

	private int count = 0;
	private int limit = 25;
	private boolean show = false;
	private T before = null;
	private T after = null;

	public String preprocess(String body) {
		return body;
	}

	public List<T> submit() throws IOException, InterruptedException, AuthenticationException {
		client.ensureConnection();
		Connection conn = client.useEndpoint(endpointPath);

		if (after != null)
			conn.data("after", after.getId());
		else
			conn.data("after", "null");
		if (before != null)
			conn.data("before", after.getId());
		if (count != 0)
			conn.data("count", count + "");
		conn.data("limit", limit + "");

		if (show)
			conn.data("show", "all");

		Response rsp = conn.execute();

		TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, (clazz != null ? clazz : type));
		TypeToken<?> ttData = TypeToken.getParameterized(RedditData.class, ttListing.getType());

		Gson gson = new Gson();

		RedditData<RedditListing<T>> fromJson = gson.fromJson(rsp.body(), ttData.getType());

		return fromJson.getData().getChildren();
	}

	public ListingEndpointRequest<T> after(T after) {
		this.after = after;
		return this;
	}

	public ListingEndpointRequest<T> before(T before) {
		this.before = before;
		return this;
	}

	public ListingEndpointRequest<T> count(int count) {
		this.count = count;
		return this;
	}

	public ListingEndpointRequest<T> limit(int limit) {
		if (limit < 25 || limit > 100)
			throw new IllegalArgumentException("Limit must be between 25 and 100");
		this.limit = limit;
		return this;
	}

	public ListingEndpointRequest<T> show(boolean show) {
		this.show = show;
		return this;
	}
}
