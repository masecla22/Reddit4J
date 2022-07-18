package masecla.reddit4j.requests;

import masecla.reddit4j.factories.AuthorizationFactory;
import masecla.reddit4j.objects.response.AccessToken;

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
