package masecla.reddit4j.requests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditComment;
import org.jsoup.Connection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RedditUserCommentListingEndpointRequest extends AbstractListingEndpointRequest<RedditComment, RedditUserCommentListingEndpointRequest> {
    public RedditUserCommentListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditComment.class, RedditUserCommentListingEndpointRequest.class);
    }

    @Override
    public List<RedditComment> submit() throws IOException, InterruptedException, AuthenticationException {
        client.ensureConnection();
        Connection conn = createConnection();

        Connection.Response rsp = conn.execute();
        JsonArray array = JsonParser.parseString(preprocess(rsp.body()))
                .getAsJsonObject().getAsJsonObject("data")
                .getAsJsonArray("children");
        Gson gson = new Gson();

        List<RedditComment> result = new ArrayList<>();
        array.forEach(c -> {
            RedditComment value = gson.fromJson(c.getAsJsonObject().getAsJsonObject("data").getAsJsonObject(), clazz);
            result.add(value);
        });
        return result;
    }
}