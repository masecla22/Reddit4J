package masecla.reddit4j.requests;

import com.google.gson.Gson;
import masecla.reddit4j.factories.AuthorizationFactory;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.HttpHeaders;

import java.io.IOException;

public abstract class RedditRequest<Response> {
    private final String userAgent;

    private final AuthorizationFactory authorizationFactory;

    private final Class<Response> responseClass;

    private final Gson gson = new Gson();

    public RedditRequest(String userAgent, AuthorizationFactory authorizationFactory, Class<Response> responseClass) {
        this.userAgent = userAgent;
        this.authorizationFactory = authorizationFactory;
        this.responseClass = responseClass;
    }

    public Response execute() throws IOException {
        String responseBody = createRequest()
                .userAgent(userAgent)
                .addHeader(HttpHeaders.AUTHORIZATION, authorizationFactory.get())
                .execute()
                .returnContent()
                .toString();

        return gson.fromJson(responseBody, responseClass);
    }

    protected abstract Request createRequest();
}
