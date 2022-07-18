package masecla.reddit4j.factories;

import java.io.IOException;

@FunctionalInterface
public interface AuthorizationFactory {
    String get() throws IOException;
}
