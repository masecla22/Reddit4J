package com.github.masecla.factories;

import com.github.masecla.requests.GetAccessToken;
import com.github.masecla.requests.GetRedditRequest;
import com.github.masecla.requests.ListingRedditRequest;

public class RedditRequestFactory {
    private final String baseUrl;
    private final String userAgent;

    public RedditRequestFactory(String baseUrl, String userAgent) {
        this.baseUrl = baseUrl;
        this.userAgent = userAgent;
    }

    public GetAccessToken getAccessToken(String endpoint, AuthorizationFactory authorizationFactory) {
        return new GetAccessToken(
                baseUrl + endpoint,
                userAgent,
                authorizationFactory
        );
    }

    public <Response> GetRedditRequest<Response> getRedditRequest(String endpoint, AuthorizationFactory authorizationFactory, Class<Response> responseClass) {
        return new GetRedditRequest<>(
                baseUrl + endpoint,
                userAgent,
                authorizationFactory,
                responseClass
        );
    }

    public <Response> ListingRedditRequest<Response> listingRedditRequest(String endpoint, AuthorizationFactory authorizationFactory, Class<Response> responseClass) {
        return new ListingRedditRequest<>(
                baseUrl + endpoint,
                userAgent,
                authorizationFactory,
                responseClass
        );
    }
}
