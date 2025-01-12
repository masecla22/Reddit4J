package mascela.reddit4J.client;

import masecla.reddit4j.client.Reddit4J;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Reddit4JTest {
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
    @ValueSource(strings= {
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