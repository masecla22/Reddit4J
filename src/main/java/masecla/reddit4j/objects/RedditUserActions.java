package masecla.reddit4j.objects;

import masecla.reddit4j.requests.ListingEndpointRequest;

import java.io.IOException;

public interface RedditUserActions {
    ListingEndpointRequest<RedditPost> submitted() throws IOException, InterruptedException;
}
