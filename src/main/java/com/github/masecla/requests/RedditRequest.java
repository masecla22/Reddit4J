package com.github.masecla.requests;

import com.google.gson.Gson;
import org.apache.hc.client5.http.fluent.Async;
import org.apache.hc.client5.http.fluent.ContentResponseHandler;
import org.apache.hc.client5.http.fluent.Request;

import java.io.IOException;
import java.util.concurrent.Future;

public abstract class RedditRequest<Response> {
    private final RequestPreprocessor requestPreprocessor;

    private final Class<Response> responseClass;

    private final Gson gson = new Gson();

    public RedditRequest(RequestPreprocessor requestPreprocessor, Class<Response> responseClass) {
        this.requestPreprocessor = requestPreprocessor;
        this.responseClass = responseClass;
    }

    public Response execute() throws IOException {
        String responseBody = buildRequest()
                .execute()
                .returnContent()
                .toString();

        return gson.fromJson(responseBody, responseClass);
    }

    public Future<Response> executeAsync() throws IOException {
        return Async.newInstance().execute(buildRequest(), classicHttpResponse -> {
            String responseBody = new ContentResponseHandler().handleResponse(classicHttpResponse).asString();
            return gson.fromJson(responseBody, responseClass);
        });
    }

    protected abstract Request createRequest();

    private Request buildRequest() throws IOException {
        return requestPreprocessor.preprocess(createRequest());
    }
}
