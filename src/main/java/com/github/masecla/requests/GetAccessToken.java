package com.github.masecla.requests;

import com.github.masecla.objects.reddit.AccessToken;

public class GetAccessToken extends PostRedditRequest<AccessToken> {
    public GetAccessToken(String url, RequestPreprocessor requestPreprocessor) {
        super(url, requestPreprocessor, AccessToken.class);
    }

    public GetAccessToken setGrantType(String grantType) {
        addTextBody("grant_type", grantType);
        return this;
    }

    public GetAccessToken setUsername(String username) {
        addTextBody("username", username);
        return this;
    }

    public GetAccessToken setPassword(String password) {
        addTextBody("password", password);
        return this;
    }
}
