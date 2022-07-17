package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Listing<T> {
    /**
     * The fullname of the listing that follows before this page. null if there is no previous page.
     */
    @SerializedName("before")
    private String before;

    /**
     * The fullname of the listing that follows after this page. null if there is no next page.
     */
    @SerializedName("after")
    private String after;

    @SerializedName("modhash")
    private String modhash;

    /**
     * A list of {@link Thing}s that this Listing wraps.
     */
    @SerializedName("children")
    private List<Thing<T>> children;

    @SerializedName("dist")
    private int dist;

    @SerializedName("geo_filter")
    private String geoFilter;
}
