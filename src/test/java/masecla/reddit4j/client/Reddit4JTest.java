package masecla.reddit4j.client;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.jsoup.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.*;

@WireMockTest
class Reddit4JTest {
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
    void userlessConnect() throws Exception {
        reddit4J
                .setClientId("TEST_CLIENT_ID")
                .setClientSecret("TEST_CLIENT_SECRET")
                .userlessConnect();
    }

    @Test
    void connect() throws Exception {
        reddit4J
                .setUsername("TEST_USERNAME")
                .setPassword("TEST_PASSWORD")
                .connect();
    }

    @Test
    void useEndpoint() throws IOException {
        stubFor(get("/test").willReturn(ok().withBody("TEST_BODY")));

        Connection connection = reddit4J.useEndpoint("/test");
        Connection.Response response = connection.execute();

        assertEquals(200, response.statusCode());
        assertEquals("TEST_BODY", response.body());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // min length
            "a1_",
            // max length, has numbers
            "012345678901234567890",
            // upper- and lower-case letters
            "FundiesOakland"})
    void isValidSubredditNameTrue(String name) {
        assertTrue(Reddit4J.isValidSubredditName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // too short
            "a", "bb",
            // illegal characters
            "cc#", "ddé",
            // underscore in first position
            "_hi",
            // too long (22 chars)
            "0123456789012345678901"})
    void isValidSubredditNameFalse(String name) {
        assertFalse(Reddit4J.isValidSubredditName(name));
    }
}