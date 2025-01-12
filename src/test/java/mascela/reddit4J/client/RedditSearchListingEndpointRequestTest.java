package mascela.reddit4J.client;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.requests.RedditSearchListingEndpointRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RedditSearchListingEndpointRequestTest {

    private RedditSearchListingEndpointRequest request;

    @BeforeEach
    void setUp() {
        Reddit4J client = new TestReddit4J();
        client.setUserAgent("userAgent");
        request = new RedditSearchListingEndpointRequest("/search", client);
    }

    // Test implementation of Reddit4J
    private static class TestReddit4J extends Reddit4J {
        @Override
        public void ensureConnection() {
            // Do nothing for test
        }
    }

    @Test
    void testSubmit_WithConnection_InvalidCategoryLength() {
        request.setQuery("valid query");
        request.setCategory("toolong");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> request.submit());
        assertEquals("Category must be no longer than 5 characters", exception.getMessage());
    }

    @Test
    void testSubmit_WithConnection_NullQuery() {
        request.setQuery(null);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> request.submit());
        assertEquals("The query string to look for must be not null", exception.getMessage());
    }
}


