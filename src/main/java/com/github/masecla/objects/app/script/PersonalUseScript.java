package com.github.masecla.objects.app.script;

import java.util.Base64;

public class PersonalUseScript {
    private final String clientId;
    private final String clientSecret;

    public PersonalUseScript(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public String toString() {
        String authorization = getClientId() + ":" + getClientSecret();
        return "Basic " + Base64.getEncoder().encodeToString(authorization.getBytes());
    }
}
