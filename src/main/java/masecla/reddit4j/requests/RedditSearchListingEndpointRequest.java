package masecla.reddit4j.requests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import lombok.Getter;
import lombok.Setter;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.Time;
import masecla.reddit4j.objects.Type;
import masecla.reddit4j.objects.subreddit.RedditSearch;
import org.jsoup.Connection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RedditSearchListingEndpointRequest extends AbstractListingEndpointRequest<RedditSearch, RedditSearchListingEndpointRequest> {
    private Time time;
    private String category;
    private boolean includeFacets;
    private String query;
    private boolean restrictSr;
    private Type type;

    public RedditSearchListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditSearch.class, RedditSearchListingEndpointRequest.class);
    }

    @Override
    public List<RedditSearch> submit() throws IOException, InterruptedException, AuthenticationException {
        client.ensureConnection();
        Connection conn = createConnection();

        Connection.Response rsp = conn.execute();
        JsonArray array = JsonParser.parseString(preprocess(rsp.body()))
                .getAsJsonObject().getAsJsonObject("data")
                .getAsJsonArray("children");
        Gson gson = new Gson();

        List<RedditSearch> result = new ArrayList<>();
        array.forEach(c -> {
            RedditSearch value = gson.fromJson(c.getAsJsonObject().getAsJsonObject("data").getAsJsonObject(), clazz);
            result.add(value);
        });
        return result;
    }

    @Override
    protected Connection createConnection() {
        Connection conn = super.createConnection();

        if (time != null) {
            conn.data("t", time.getValue());
        }
        if (category != null && !category.isEmpty()) {
            if (category.length() > 5) {
                throw new IllegalArgumentException("Category must be no longer than 5 characters");
            }
            conn.data("category", category);
        }
        conn.data("include_facets", includeFacets ? "true" : "false");
        conn.data("restrict_sr", restrictSr ? "true" : "false");
        if (type != null) {
            conn.data("type", type.getValue());
        }
        if (query == null) {
            throw new IllegalArgumentException("The query string to look for must be not null");
        }
        if (query.length() > 512) {
            throw new IllegalArgumentException("The query string to look for must be no longer than 512 characters");
        }
        conn.data("q", query);

        return conn;
    }
}
