package masecla.reddit4j.objects;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.requests.ListingEndpointRequest;

import java.io.IOException;

public class RedditUser extends RedditThing implements RedditUserActions {
	private Reddit4J client;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ListingEndpointRequest<RedditPost> submitted() throws IOException, InterruptedException {
		return this.client.getUserSubmitted(this.name);
	}

	public void setClient(Reddit4J client) {
		this.client = client;
	}
}
