package com.github.masecla.requests;

import com.github.masecla.factories.AuthorizationFactory;
import com.github.masecla.objects.reddit.AccessToken;

public class GetAccessToken extends PostRedditRequest<AccessToken> {
    public GetAccessToken(String url, String userAgent, AuthorizationFactory authorizationFactory) {
        super(url, userAgent, authorizationFactory, AccessToken.class);
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
