package masecla.reddit4j.objects;

import masecla.reddit4j.requests.RedditUserCommentListingEndpointRequest;
import masecla.reddit4j.requests.SubredditPostListingEndpointRequest;

import java.io.IOException;

public interface RedditUserActions {
    SubredditPostListingEndpointRequest submitted() throws IOException, InterruptedException;

    RedditUserCommentListingEndpointRequest comments() throws IOException, InterruptedException;
}
