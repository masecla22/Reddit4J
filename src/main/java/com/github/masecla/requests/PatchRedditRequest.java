package com.github.masecla.requests;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.StringEntity;

public class PatchRedditRequest<Response> extends RedditRequest<Response> {
    private final Request request;

    public PatchRedditRequest(String url, RequestPreprocessor requestPreprocessor, Class<Response> responseClass) {
        super(requestPreprocessor, responseClass);
        this.request = Request.patch(url);
    }

    protected void setBody(String data) {
        request.body(new StringEntity(data, ContentType.APPLICATION_JSON));
    }

    @Override
    protected Request createRequest() {
        return request;
    }
}
