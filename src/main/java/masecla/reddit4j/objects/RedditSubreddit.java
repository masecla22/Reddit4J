package masecla.reddit4j.objects;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import masecla.reddit4j.client.Reddit4J;

public class RedditSubreddit {
	private String name;
	private Reddit4J client;

	public RedditSubreddit(String name, Reddit4J client) {
		super();
		this.name = name;
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public Reddit4J getClient() {
		return client;
	}

	public void getCollections() throws IOException, InterruptedException {
		Connection conn = Jsoup.connect(Reddit4J.OAUTH_URL() + "/api/v1/collections/subreddit_collections");
		conn = client.authorize(conn).data("sr_fullname", name);
		System.out.println(client.getHttpClient().execute(conn).body());
	}
}
