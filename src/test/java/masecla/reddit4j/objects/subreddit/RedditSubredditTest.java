package masecla.reddit4j.objects.subreddit;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import masecla.reddit4j.client.Reddit4J;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@WireMockTest
class RedditSubredditTest {

    private Reddit4J reddit4J;

    private final String TEST_USER_AGENT = "TEST_USER_AGENT";

    @BeforeEach
    void setUp(WireMockRuntimeInfo wmRuntimeInfo) {
        int port = wmRuntimeInfo.getHttpPort();

        reddit4J = Reddit4J.unlimited()
                .setUserAgent(TEST_USER_AGENT)
                .setBaseUrl(String.format("http://localhost:%d", port))
                .setOauthUrl(String.format("http://localhost:%d", port));

        stubFor(post("/api/v1/access_token").willReturn(ok().withBodyFile("access_token_response.json")));
    }

    @Test
    public void test() throws IOException, InterruptedException {
        stubFor(get("/r/reddit/about").willReturn(ok().withBodyFile("subreddit_reddit_about_response.json")));
        RedditSubreddit subreddit = reddit4J.getSubreddit("reddit");

        assertNotNull(subreddit);

        String json = subreddit.getGson().toJson(subreddit);
        System.out.println(json);
    }
}