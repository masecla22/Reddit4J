package masecla.reddit4j.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Reddit4JBeta {
	private Reddit4J client;

	public Reddit4JBeta(Reddit4J client) {
		super();
		this.client = client;
	}

	public List<String> getAllEndpoints() throws IOException {
		Document endpoints = Jsoup.connect("https://www.reddit.com/dev/api").get();
		List<String> result = new ArrayList<>();
		endpoints.getElementsByClass("supports-oauth").forEach(c -> result.add(c.text().trim()));
		return result;
	}

	public List<String> getCoveredEndpoints() {
		List<String> result = new ArrayList<>();
		result.add("/api/v1/me");
		result.add("/api/v1/me/blocked");
		result.add("/api/v1/me/friends");
		result.add("/api/v1/me/karma");
		result.add("/api/v1/me/prefs");
		result.add("/api/v1/me/trophies");

		result.add("/prefs/blocked");
		result.add("/prefs/friends");
		result.add("/prefs/messaging");
		result.add("/prefs/trusted");
		result.add("/prefs/where");

		// Seems to have been discontinued?
		// https://www.reddit.com/r/bugs/comments/6bw5hd/needs_captcha_api_method_returns_403_forbidden/
		result.add("/api/needs_captcha");

		result.add("/r/subreddit/about");
		result.add("/r/subreddit/about/edit");

		return result;
	}

	public void showCoverage() throws IOException {
		List<String> coverage = getAllEndpoints();
		int totalSize = coverage.size();
		coverage.removeAll(getCoveredEndpoints());
		int currentSize = coverage.size();

		System.out.println("API Coverage is currently at: "
				+ ((int) ((totalSize - currentSize) * 10000 / totalSize) / 100.00) + "%");
		System.out.println("The next endpoints to implement are: ");
		coverage.stream().limit(Math.min(5, currentSize)).map(c -> "\tEndpoint: - " + c).forEach(System.out::println);
	}

}
