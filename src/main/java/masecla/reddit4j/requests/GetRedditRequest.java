package masecla.reddit4j.requests;

import masecla.reddit4j.factories.AuthorizationFactory;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URI;

public class GetRedditRequest<Response> extends RedditRequest<Response> {
    private final URIBuilder uriBuilder;

    public GetRedditRequest(String url, String userAgent, AuthorizationFactory authorizationFactory, Class<Response> responseClass) {
        super(userAgent, authorizationFactory, responseClass);
        this.uriBuilder = new URIBuilder(URI.create(url));
    }

    @Override
    protected Request createRequest() {
        return Request.get(uriBuilder.toString());
    }

    public GetRedditRequest<Response> rawJson() {
        addParameter("raw_json", "1");
        return this;
    }

    protected void addParameter(String param, String value) {
        uriBuilder.addParameter(param, value);
    }
}
