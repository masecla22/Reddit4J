package com.github.masecla.requests;

import org.apache.hc.client5.http.fluent.Request;

import java.io.IOException;

@FunctionalInterface
public interface RequestPreprocessor {
    Request preprocess(Request request) throws IOException;
}
