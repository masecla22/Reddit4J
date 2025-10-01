package masecla.reddit4j.requests;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.RedditUser;
import org.jsoup.Connection;

public class RedditUserSearchEndpointRequest extends AbstractListingEndpointRequest<RedditUser, RedditUserSearchEndpointRequest> {
    private String query;
    private String sort;
    private String time;

    public RedditUserSearchEndpointRequest(Reddit4J client) {
        super("/users/search", client, RedditUser.class, RedditUserSearchEndpointRequest.class);
    }

    public RedditUserSearchEndpointRequest query(String query) {
        this.query = query;
        return this;
    }

    public RedditUserSearchEndpointRequest sort(String sort) {
        this.sort = sort;
        return this;
    }

    public RedditUserSearchEndpointRequest time(String time) {
        this.time = time;
        return this;
    }

    @Override
    protected Connection createConnection() {
        Connection conn = super.createConnection();

        if (query != null && !query.isEmpty()) {
            conn.data("q", query);
        }
        if (sort != null) {
            conn.data("sort", sort);
        }
        if (time != null) {
            conn.data("t", time);
        }

        return conn;
    }
}
