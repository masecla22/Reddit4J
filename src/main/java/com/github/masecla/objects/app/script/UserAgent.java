package com.github.masecla.objects.app.script;

public class UserAgent {
    private final String appName;

    private final String version;

    private final String redditUsername;

    public UserAgent(String appName, String version, String redditUsername) {
        this.appName = appName;
        this.version = version;
        this.redditUsername = redditUsername;
    }

    @Override
    public String toString() {
        return "java:" + appName + ":" + version + " (by /u/" + redditUsername + ")";
    }
}
