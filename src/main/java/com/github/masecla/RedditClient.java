package com.github.masecla;

import com.github.masecla.objects.app.Credentials;
import com.github.masecla.objects.app.RedditApp;
import com.github.masecla.objects.app.UserAgent;
import com.github.masecla.objects.reddit.User;
import com.github.masecla.objects.response.GetMyKarmaResponse;
import com.github.masecla.factories.AuthorizationFactory;
import com.github.masecla.factories.RedditRequestFactory;
import com.github.masecla.objects.reddit.AccessToken;
import com.github.masecla.objects.response.GetSubredditNewResponse;
import com.github.masecla.requests.GetRedditRequest;
import com.github.masecla.requests.ListingRedditRequest;

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
