package com.github.masecla.requests;

import com.github.masecla.objects.reddit.PreferenceSettings;
import com.google.gson.Gson;

public class SetMyPreferences extends PatchRedditRequest<PreferenceSettings> {
    private final Gson gson = new Gson();

    public SetMyPreferences(String url, RequestPreprocessor requestPreprocessor, Class<PreferenceSettings> preferenceSettingsClass) {
        super(url, requestPreprocessor, preferenceSettingsClass);
    }

    public SetMyPreferences setPreferences(PreferenceSettings preferences) {
        setBody(gson.toJson(preferences));
        return this;
    }
}
