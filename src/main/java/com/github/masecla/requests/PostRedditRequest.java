package com.github.masecla.requests;

import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.fluent.Request;

import java.nio.charset.StandardCharsets;

public class PostRedditRequest<Response> extends RedditRequest<Response> {
    private final Request request;

    private final MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create().setCharset(StandardCharsets.UTF_8);

    public PostRedditRequest(String url, RequestPreprocessor requestPreprocessor, Class<Response> responseClass) {
        super(requestPreprocessor, responseClass);
        this.request = Request.post(url);
    }

    @Override
    protected Request createRequest() {
        return request.body(multipartEntityBuilder.build());
    }

    protected void addTextBody(String name, String text) {
        multipartEntityBuilder.addTextBody(name, text);
    }
}
