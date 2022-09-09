package com.github.masecla.factories;

import com.github.masecla.objects.reddit.PreferenceSettings;
import com.github.masecla.requests.GetRedditRequest;
import com.github.masecla.requests.ListingRedditRequest;
import com.github.masecla.requests.RequestPreprocessor;
import com.github.masecla.requests.SetMyPreferences;

public class RedditRequestFactory {
    private final String baseUrl;
    private final RequestPreprocessor requestPreprocessor;

    public RedditRequestFactory(String baseUrl, RequestPreprocessor requestPreprocessor) {
        this.baseUrl = baseUrl;
        this.requestPreprocessor = requestPreprocessor;
    }

    public <Response> GetRedditRequest<Response> getRedditRequest(String endpoint, Class<Response> responseClass) {
        return new GetRedditRequest<>(
                baseUrl + endpoint,
                requestPreprocessor,
                responseClass
        );
    }

    public <Response> ListingRedditRequest<Response> listingRedditRequest(String endpoint, Class<Response> responseClass) {
        return new ListingRedditRequest<>(
                baseUrl + endpoint,
                requestPreprocessor,
                responseClass
        );
    }

    public SetMyPreferences setMyPreferences(String endpoint) {
        return new SetMyPreferences(baseUrl + endpoint, requestPreprocessor, PreferenceSettings.class);
    }
}
