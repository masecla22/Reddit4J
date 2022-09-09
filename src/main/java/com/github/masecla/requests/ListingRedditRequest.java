package com.github.masecla.requests;

public class ListingRedditRequest<Response> extends GetRedditRequest<Response> {
    public ListingRedditRequest(String url, RequestPreprocessor requestPreprocessor, Class<Response> responseClass) {
        super(url, requestPreprocessor, responseClass);
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
