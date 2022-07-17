package masecla.reddit4j.objects.app;

import java.util.Base64;

public interface RedditApp {
    String getClientId();
    String getClientSecret();

    default String getAuthorization() {
        String authorization = getClientId() + ":" + getClientSecret();
        return "Basic " + Base64.getEncoder().encodeToString(authorization.getBytes());
    }
}
