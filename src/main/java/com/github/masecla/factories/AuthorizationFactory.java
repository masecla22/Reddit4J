package com.github.masecla.factories;

import java.io.IOException;

@FunctionalInterface
public interface AuthorizationFactory {
    String get() throws IOException;
}
