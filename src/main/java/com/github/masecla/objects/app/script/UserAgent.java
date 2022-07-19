package com.github.masecla.objects.app.script;

public class UserAgent {
    private final String appName;
    private final String author;
    private final String version;

    public UserAgent(String appName, String author, String version) {
        this.appName = appName;
        this.author = author;
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return appName + "/" + version + " by " + author;
    }
}
