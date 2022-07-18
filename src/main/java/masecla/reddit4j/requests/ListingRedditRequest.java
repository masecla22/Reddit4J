package masecla.reddit4j.requests;

import masecla.reddit4j.factories.AuthorizationFactory;

public class ListingRedditRequest<Response> extends GetRedditRequest<Response> {
    public ListingRedditRequest(String url, String userAgent, AuthorizationFactory authorizationFactory, Class<Response> responseClass) {
        super(url, userAgent, authorizationFactory, responseClass);
    }

    @Override
    public ListingRedditRequest<Response> rawJson() {
        return (ListingRedditRequest<Response>) super.rawJson();
    }

    public ListingRedditRequest<Response> setAfter(String after) {
        addParameter("after", after);
        return this;
    }

    public ListingRedditRequest<Response> setBefore(String before) {
        addParameter("before", before);
        return this;
    }

    public ListingRedditRequest<Response> setCount(int count) {
        addParameter("count", String.valueOf(count));
        return this;
    }

    public ListingRedditRequest<Response> setLimit(int limit) {
        addParameter("limit", String.valueOf(limit));
        return this;
    }

    public ListingRedditRequest<Response> setShow() {
        addParameter("show", "all");
        return this;
    }
}
