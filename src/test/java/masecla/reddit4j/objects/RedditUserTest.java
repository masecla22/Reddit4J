package masecla.reddit4j.objects;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.AuthenticationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.*;

@WireMockTest
class RedditUserTest {

    private Reddit4J reddit4J;

    private final String TEST_USER_AGENT = "TEST_USER_AGENT";
    private RedditUser redditUser;

    @BeforeEach
    void setUp(WireMockRuntimeInfo wmRuntimeInfo) {
        int port = wmRuntimeInfo.getHttpPort();

        reddit4J = Reddit4J.unlimited()
                .setUserAgent(TEST_USER_AGENT)
                .setUsername("TEST")
                .setPassword("TEST")
                .setBaseUrl(String.format("http://localhost:%d", port))
                .setOauthUrl(String.format("http://localhost:%d", port));

        stubFor(post("/api/v1/access_token").willReturn(ok().withBodyFile("access_token_response.json")));

        redditUser = new RedditUser();
        redditUser.setClient(reddit4J);
        redditUser.setName("spez");
    }

    @Test
    void submitted() throws AuthenticationException, IOException, InterruptedException {
        stubFor(get("/user/spez/submitted?limit=25").willReturn(ok().withBodyFile("user_spez_submitted_25_1_response.json")));
        stubFor(get("/user/spez/submitted?after=t3_5q4qmg&limit=25").willReturn(ok().withBodyFile("user_spez_submitted_25_2_response.json")));

        List<RedditPost> posts = redditUser.submitted().limit(25).submit();
        List<RedditPost> postsAfter = redditUser.submitted().limit(25).after(posts.get(posts.size() - 1)).submit();

        HashSet<String> uniqueIds = new HashSet<>();
        posts.forEach(p -> uniqueIds.add(p.getName()));
        postsAfter.forEach(p -> uniqueIds.add(p.getName()));

        assertEquals(50, uniqueIds.size());
    }
}