package com.github.masecla.objects.reddit;

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

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public List<Thing<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Thing<T>> children) {
        this.children = children;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public String getGeoFilter() {
        return geoFilter;
    }

    public void setGeoFilter(String geoFilter) {
        this.geoFilter = geoFilter;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", modhash='" + modhash + '\'' +
                ", children=" + children +
                ", dist=" + dist +
                ", geoFilter='" + geoFilter + '\'' +
                '}';
    }
}
