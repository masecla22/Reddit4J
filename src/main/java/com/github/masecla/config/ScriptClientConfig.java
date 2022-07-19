package com.github.masecla.config;

import com.github.masecla.factories.RedditRequestFactory;
import com.github.masecla.objects.reddit.AccessToken;
import com.github.masecla.requests.GetAccessToken;
import com.github.masecla.requests.RequestPreprocessor;
import com.github.masecla.objects.app.script.Credentials;
import com.github.masecla.objects.app.script.PersonalUseScript;
import com.github.masecla.objects.app.script.UserAgent;
import org.apache.hc.core5.http.HttpHeaders;

public class ScriptClientConfig implements RedditClientConfig {
    private final RequestPreprocessor userAgentPreprocessor;

    private final GetAccessToken getAccessToken;

    private AccessToken accessToken;

    public ScriptClientConfig(PersonalUseScript personalUseScript, UserAgent userAgent, Credentials credentials) {
        this.userAgentPreprocessor = request -> request.userAgent(userAgent.toString());
        this.getAccessToken =
                new RedditRequestFactory("https://www.reddit.com", request ->
                        this.userAgentPreprocessor
                                .preprocess(request)
                                .addHeader(HttpHeaders.AUTHORIZATION, personalUseScript.toString()))
                        .getAccessToken("/api/v1/access_token")
                        .setGrantType("password")
                        .setUsername(credentials.getUsername())
                        .setPassword(credentials.getPassword());
    }

    @Override
    public RedditRequestFactory getRedditRequestFactory() {
        return new RedditRequestFactory(
                "https://oauth.reddit.com",
                request -> {
                    if (this.accessToken == null || this.accessToken.isExpired()) {
                        this.accessToken = this.getAccessToken.execute();
                    }

                    return this.userAgentPreprocessor.preprocess(request)
                            .addHeader(
                                    HttpHeaders.AUTHORIZATION,
                                    "bearer " + this.accessToken.getAccessToken()
                            );
                }
        );
    }
}
