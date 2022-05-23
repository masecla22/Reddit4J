package masecla.reddit4j.objects;

import masecla.reddit4j.requests.SubredditPostListingEndpointRequest;

import java.io.IOException;

public interface RedditUserActions {
    SubredditPostListingEndpointRequest submitted() throws IOException, InterruptedException;
}
