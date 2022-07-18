package masecla.reddit4j.factories;

import masecla.reddit4j.requests.GetAccessToken;
import masecla.reddit4j.requests.GetRedditRequest;
import masecla.reddit4j.requests.ListingRedditRequest;

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
