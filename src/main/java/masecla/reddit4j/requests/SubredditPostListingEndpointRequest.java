package masecla.reddit4j.requests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;
import masecla.reddit4j.objects.RedditPost;
import masecla.reddit4j.objects.RedditThing;
import org.jsoup.Connection;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class SubredditPostListingEndpointRequest<T extends RedditThing> extends ListingEndpointRequest<RedditPost> {
    private Type type;

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
        Connection conn = client.useEndpoint(endpointPath);

        if (after != null)
            conn.data("after", after.getId());
        else
            conn.data("after", "null");
        if (before != null)
            conn.data("before", after.getId());
        if (count != 0)
            conn.data("count", count + "");
        conn.data("limit", limit + "");

        if (show)
            conn.data("show", "all");

        Connection.Response rsp = conn.execute();

        TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, (clazz != null ? clazz : type));
        TypeToken<?> ttData = TypeToken.getParameterized(RedditData.class, ttListing.getType());

        Gson gson = new Gson();

        RedditData<RedditListing<RedditData<RedditPost>>> fromJson = gson.fromJson(rsp.body(), ttData.getType());

        return fromJson.getData().getChildren().stream().map(RedditData::getData).collect(Collectors.toList());
    }

}