package com.github.masecla.config;

import com.github.masecla.factories.RedditRequestFactory;

@FunctionalInterface
public interface RedditClientConfig {
    RedditRequestFactory getRedditRequestFactory();
}
