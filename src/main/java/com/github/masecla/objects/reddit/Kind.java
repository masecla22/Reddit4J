package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public enum Kind {
    @SerializedName("KarmaList") KARMA_LIST,
    @SerializedName("t3") LINK,
    @SerializedName("Listing") LISTING
}
