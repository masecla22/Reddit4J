package masecla.reddit4j.requests;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditPost;
import masecla.reddit4j.objects.Time;

public class SubredditPostListingEndpointRequest extends AbstractListingEndpointRequest<RedditPost, SubredditPostListingEndpointRequest> {
    private Time time;

    public SubredditPostListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditPost.class, SubredditPostListingEndpointRequest.class);
    }

    @Override
    public List<RedditPost> submit() throws IOException, InterruptedException, AuthenticationException {
        List<RedditPost> result = super.submit();

        for (RedditPost post : result) {
            post.setClient(client);
        }
        return result;
    }

    @Override
    protected Connection createConnection() {
        Connection conn = super.createConnection();

        if (this.time != null) {
            conn.data("t", this.time.getValue());
        }

        return conn;
    }

    public SubredditPostListingEndpointRequest time(Time time) {
        this.time = time;
        return this;
    }
}
