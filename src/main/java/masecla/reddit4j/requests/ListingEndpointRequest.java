package masecla.reddit4j.requests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditThing;

public class ListingEndpointRequest<T extends RedditThing> {
	protected String endpointPath;
	protected Reddit4J client;
	protected Class<T> clazz;

	public ListingEndpointRequest(String endpointPath, Reddit4J client, Class<T> clazz) {
		super();
		this.endpointPath = endpointPath;
		this.client = client;
		this.clazz = clazz;
	}

	protected int count = 0;
	protected int limit = 25;
	protected boolean show = false;
	protected T before = null;
	protected T after = null;

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
		JsonArray array = JsonParser.parseString(preprocess(rsp.body())).getAsJsonObject().getAsJsonObject("data")
				.getAsJsonArray("children");
		Gson gson = new Gson();

		List<T> result = new ArrayList<>();
		array.forEach(c -> {
			T value = gson.fromJson(c.getAsJsonObject(), clazz);
			result.add(value);
		});
		return result;
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
