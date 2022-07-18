package com.github.masecla.requests;

import com.google.gson.Gson;
import org.apache.hc.client5.http.fluent.Request;

import java.io.IOException;

public abstract class RedditRequest<Response> {
    private final RequestPreprocessor requestPreprocessor;

    private final Class<Response> responseClass;

    private final Gson gson = new Gson();

    public RedditRequest(RequestPreprocessor requestPreprocessor, Class<Response> responseClass) {
        this.requestPreprocessor = requestPreprocessor;
        this.responseClass = responseClass;
    }

    public Response execute() throws IOException {
        String responseBody = requestPreprocessor.preprocess(createRequest())
                .execute()
                .returnContent()
                .toString();

        return gson.fromJson(responseBody, responseClass);
    }

    protected abstract Request createRequest();
}
