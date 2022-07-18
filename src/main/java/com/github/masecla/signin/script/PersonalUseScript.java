package com.github.masecla.signin.script;

import com.github.masecla.signin.RedditApp;

import java.util.Base64;

public class PersonalUseScript implements RedditApp {
    private final String clientId;
    private final String clientSecret;

    public PersonalUseScript(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public String toString() {
        String authorization = getClientId() + ":" + getClientSecret();
        return "Basic " + Base64.getEncoder().encodeToString(authorization.getBytes());
    }
}
