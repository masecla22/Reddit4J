package masecla.reddit4j.requests;

import lombok.Getter;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.RedditUser;

public class RedditUserWhereEndpointRequest extends AbstractListingEndpointRequest<RedditUser, RedditUserWhereEndpointRequest> {

    @Getter
    public enum UserWhere {
        NEW("new"),
        POPULAR("popular");

        private final String value;

        UserWhere(String value) {
            this.value = value;
        }

    }

    public RedditUserWhereEndpointRequest(UserWhere where, Reddit4J client) {
        super("/users/" + where.getValue(), client, RedditUser.class, RedditUserWhereEndpointRequest.class);
    }
}

