package masecla.reddit4j.requests;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.RedditUser;

public class RedditUserListingEndpointRequest extends AbstractListingEndpointRequest<RedditUser, RedditUserListingEndpointRequest> {
    public RedditUserListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditUser.class, RedditUserListingEndpointRequest.class);
    }
}
