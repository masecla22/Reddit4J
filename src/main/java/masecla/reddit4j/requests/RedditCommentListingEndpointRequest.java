package masecla.reddit4j.requests;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import masecla.reddit4j.RedditUtils;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditComment;
import masecla.reddit4j.objects.RedditListing;

public class RedditCommentListingEndpointRequest extends AbstractListingEndpointRequest<RedditComment, RedditCommentListingEndpointRequest> {
    public RedditCommentListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditComment.class, RedditCommentListingEndpointRequest.class);
    }

    @Override
    public List<RedditComment> submit() throws IOException, InterruptedException, AuthenticationException {
        client.ensureConnection();
        Connection conn = createConnection();

        Connection.Response rsp = conn.execute();

        JsonElement commentData = JsonParser.parseString(preprocess(rsp.body()))
                .getAsJsonArray().get(1);
        // index 0 is a listing
        // Seems to only include 1 entry of a t3 kind object which is the original post being replied to.

        TypeToken<?> token = TypeToken.getParameterized(RedditListing.class, clazz);
        RedditListing<RedditComment> listing = RedditUtils.gson.fromJson(commentData, token.getType());
        return listing.getChildren();
    }
}