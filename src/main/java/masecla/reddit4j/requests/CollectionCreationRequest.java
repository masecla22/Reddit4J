package masecla.reddit4j.requests;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

import masecla.reddit4j.RedditUtils;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.subreddit.RedditSubreddit;
import masecla.reddit4j.objects.subreddit.SubredditCollection;
import masecla.reddit4j.objects.subreddit.enums.DisplayLayout;

public class CollectionCreationRequest {
	private Reddit4J client;
	private RedditSubreddit subreddit;

	public CollectionCreationRequest(Reddit4J client, RedditSubreddit subreddit) {
		super();
		this.client = client;
		this.subreddit = subreddit;
	}

	private String description = "";
	private DisplayLayout displayLayout = DisplayLayout.GALLERY;
	private String title = "";

	public CollectionCreationRequest description(String description) {
		if (description.length() > 500)
			throw new IllegalArgumentException("The description cannot be longer than 500 characters!");
		this.description = description;
		return this;
	}

	public CollectionCreationRequest displayLayout(DisplayLayout displayLayout) {
		this.displayLayout = displayLayout;
		return this;
	}

	public CollectionCreationRequest title(String title) {
		if (title.length() > 300)
			throw new IllegalArgumentException("The title cannot be longer than 300 characters!");
		this.title = title;
		return this;
	}

	public SubredditCollection execute() throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/api/v1/collections/create_collection");
		conn = conn.method(Method.POST);
		conn.data("description", description);
		conn.data("display_layout", displayLayout.toString());
		conn.data("sr_fullname", subreddit.getFullName());
		conn.data("title", title);

		Response rsp = client.getHttpClient().execute(conn);
		return RedditUtils.gson.fromJson(rsp.body(), SubredditCollection.class);
	}
}
