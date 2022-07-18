package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public enum Kind {
    @SerializedName("KarmaList") KARMA_LIST,
    @SerializedName("t3") LINK,
    @SerializedName("Listing") LISTING
}
