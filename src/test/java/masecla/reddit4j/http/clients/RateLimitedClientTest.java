package masecla.reddit4j.http.clients;

import org.jsoup.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

class RateLimitedClientTest {

    private RateLimitedClient httpClient;

    @BeforeEach
    void setUp() {
        httpClient = new RateLimitedClient();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void execute() throws Exception {
        Connection connection = mock(Connection.class);

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            // Execute up to the rate limit
            for (int i = 0; i < RateLimitedClient.RATE_LIMIT_MINUTE; i++) {
                httpClient.execute(connection);
            }
        });
    }
}