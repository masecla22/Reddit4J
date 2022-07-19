package com.github.masecla;

import com.github.masecla.config.RedditClientConfig;
import com.github.masecla.factories.RedditRequestFactory;
import com.github.masecla.objects.reddit.PreferenceSettings;
import com.github.masecla.objects.reddit.User;
import com.github.masecla.objects.response.GetMyKarmaResponse;
import com.github.masecla.objects.response.GetSubredditNewResponse;
import com.github.masecla.requests.GetRedditRequest;
import com.github.masecla.requests.ListingRedditRequest;

public class RedditClient {
    private final RedditRequestFactory redditRequestFactory;

    public RedditClient(RedditClientConfig redditClientConfig) {
        this.redditRequestFactory = redditClientConfig.getRedditRequestFactory();
    }

    public GetRedditRequest<User> getMe() {
        return redditRequestFactory.getRedditRequest(
                "/api/v1/me",
                User.class
        );
    }

    public GetRedditRequest<GetMyKarmaResponse> getMyKarma() {
        return redditRequestFactory.getRedditRequest(
                "/api/v1/me/karma",
                GetMyKarmaResponse.class
        );
    }

    public ListingRedditRequest<GetSubredditNewResponse> getSubredditNew(String subreddit) {
        return redditRequestFactory.listingRedditRequest(
                "/r/" + subreddit + "/new",
                GetSubredditNewResponse.class
        );
    }

    public GetRedditRequest<PreferenceSettings> getMyPreferences() {
        return redditRequestFactory.getRedditRequest(
                "/api/v1/me/prefs",
                PreferenceSettings.class
        );
    }
}
