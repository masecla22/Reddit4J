package masecla.reddit4j;

import masecla.reddit4j.factories.AuthorizationFactory;
import masecla.reddit4j.factories.RedditRequestFactory;
import masecla.reddit4j.objects.reddit.AccessToken;
import masecla.reddit4j.objects.app.Credentials;
import masecla.reddit4j.objects.app.RedditApp;
import masecla.reddit4j.objects.app.UserAgent;
import masecla.reddit4j.objects.reddit.User;
import masecla.reddit4j.objects.response.GetMyKarmaResponse;
import masecla.reddit4j.objects.response.GetSubredditNewResponse;
import masecla.reddit4j.requests.GetRedditRequest;
import masecla.reddit4j.requests.ListingRedditRequest;

import java.io.IOException;

public class RedditClient {
    private final RedditApp redditApp;

    private final Credentials credentials;
    private final RedditRequestFactory baseRedditRequestFactory;

    private final RedditRequestFactory oauthRedditRequestFactory;

    private AccessToken accessToken;

    private final AuthorizationFactory bearerFactory = () -> {
        if (accessToken == null || accessToken.isExpired()) {
            initialize();
        }
        return "bearer " + accessToken.getAccessToken();
    };

    public RedditClient(RedditApp redditApp, UserAgent userAgent, Credentials credentials) {
        this.redditApp = redditApp;
        this.credentials = credentials;
        this.baseRedditRequestFactory = new RedditRequestFactory(
                "https://www.reddit.com",
                userAgent.toString()
        );
        this.oauthRedditRequestFactory = new RedditRequestFactory(
                "https://oauth.reddit.com",
                userAgent.toString()
        );
    }

    private void initialize() throws IOException {
        this.accessToken = baseRedditRequestFactory.getAccessToken(
                        "/api/v1/access_token",
                        redditApp::toString
                )
                .setGrantType("password")
                .setUsername(credentials.getUsername())
                .setPassword(credentials.getPassword())
                .execute();
    }

    public GetRedditRequest<User> getMe() {
        return oauthRedditRequestFactory.getRedditRequest(
                "/api/v1/me",
                bearerFactory,
                User.class
        );
    }

    public GetRedditRequest<GetMyKarmaResponse> getMyKarma() {
        return oauthRedditRequestFactory.getRedditRequest(
                "/api/v1/me/karma",
                bearerFactory,
                GetMyKarmaResponse.class
        );
    }

    public ListingRedditRequest<GetSubredditNewResponse> getSubredditNew(String subreddit) {
        return oauthRedditRequestFactory.listingRedditRequest(
                "/r/" + subreddit + "/new",
                bearerFactory,
                GetSubredditNewResponse.class
        );
    }
}
