package masecla.reddit4j.objects;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.requests.SubredditPostListingEndpointRequest;

public class RedditUser extends RedditThing implements RedditUserActions, RedditNameable {
	private Reddit4J client;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public SubredditPostListingEndpointRequest submitted() {
		return this.client.getUserSubmitted(this.name);
	}

	public void setClient(Reddit4J client) {
		this.client = client;
	}
}
