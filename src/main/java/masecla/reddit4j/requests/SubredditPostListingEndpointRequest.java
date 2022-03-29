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
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class SubredditPostListingEndpointRequest extends ListingEndpointRequest<RedditPost> {
    private Type type;
    private Time time;

    public SubredditPostListingEndpointRequest(String endpointPath, Reddit4J client, Class<RedditPost> clazz) {
        super(endpointPath, client, clazz);
    }

    public SubredditPostListingEndpointRequest(String endpointPath, Reddit4J client, Type type) {
        super(endpointPath, client, null);
        this.type = type;
    }

    @Override
    public List<RedditPost> submit() throws IOException, InterruptedException, AuthenticationException {
        client.ensureConnection();
        Connection conn = createConnection();

        Connection.Response rsp = conn.execute();

        TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, (clazz != null ? clazz : type));
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

    @Override
    public SubredditPostListingEndpointRequest after(RedditPost after) {
        return (SubredditPostListingEndpointRequest) super.after(after);
    }

    @Override
    public SubredditPostListingEndpointRequest after(String after) {
        return (SubredditPostListingEndpointRequest) super.after(after);
    }

    @Override
    public SubredditPostListingEndpointRequest before(RedditPost before) {
        return (SubredditPostListingEndpointRequest) super.before(before);
    }

    @Override
    public SubredditPostListingEndpointRequest before(String before) {
        return (SubredditPostListingEndpointRequest) super.before(before);
    }

    @Override
    public SubredditPostListingEndpointRequest count(int count) {
        return (SubredditPostListingEndpointRequest) super.count(count);
    }

    @Override
    public SubredditPostListingEndpointRequest limit(int limit) {
        return (SubredditPostListingEndpointRequest) super.limit(limit);
    }

    @Override
    public SubredditPostListingEndpointRequest show(boolean show) {
        return (SubredditPostListingEndpointRequest) super.show(show);
    }

    public SubredditPostListingEndpointRequest time(Time time) {
        this.time = time;
        return this;
    }
}
