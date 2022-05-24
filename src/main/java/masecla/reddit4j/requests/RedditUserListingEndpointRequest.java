package masecla.reddit4j.requests;

import java.io.IOException;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import masecla.reddit4j.objects.RedditUser;

public class RedditUserListingEndpointRequest extends AbstractListingEndpointRequest<RedditUser, RedditUserListingEndpointRequest> {
    public RedditUserListingEndpointRequest(String endpointPath, Reddit4J client) {
        super(endpointPath, client, RedditUser.class, RedditUserListingEndpointRequest.class);
    }

    @Override
    public List<RedditUser> submit() throws IOException, InterruptedException, AuthenticationException {
        List<RedditUser> result = super.submit();

        for (RedditUser post : result) {
            post.setClient(client);
        }
        return result;
    }

    @Override
    public String preprocess(String body) {
        if (body.startsWith("[")) { // Sometimes a UserList will be an array where the 2nd entry is empty.
            JsonArray array = JsonParser.parseString(body).getAsJsonArray();
            return array.get(0).getAsJsonObject().toString();
        }
        return body;
    }
}
