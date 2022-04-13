package masecla.reddit4j.requests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;
import masecla.reddit4j.objects.RedditPost;
import masecla.reddit4j.objects.Time;
import org.jsoup.Connection;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SubredditPostListingEndpointRequest extends AbstractListingEndpointRequest<RedditPost, SubredditPostListingEndpointRequest> {
    private Time time;

    public SubredditPostListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, null, SubredditPostListingEndpointRequest.class);
    }

    @Override
    public List<RedditPost> submit() throws IOException, InterruptedException, AuthenticationException {
        client.ensureConnection();
        Connection conn = createConnection();

        Connection.Response rsp = conn.execute();

        TypeToken<?> ttPost = TypeToken.getParameterized(RedditData.class, RedditPost.class);
        TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, ttPost.getType());
        TypeToken<?> ttData = TypeToken.getParameterized(RedditData.class, ttListing.getType());

        Gson gson = new Gson();

        RedditData<RedditListing<RedditData<RedditPost>>> fromJson = gson.fromJson(rsp.body(), ttData.getType());

        return fromJson.getData().getChildren().stream()
                .map(RedditData::getData)
                .peek(redditPost -> redditPost.setClient(this.client))
                .collect(Collectors.toList());
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
