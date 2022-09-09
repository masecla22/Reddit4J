package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class RedditVideo {
    @SerializedName("bitrate_kbps")
    private int bitrateKbps;

    @SerializedName("fallback_url")
    private String  fallbackUrl;

    @SerializedName("height")
    private int height;

    @SerializedName("width")
    private int width;

    @SerializedName("scrubber_media_url")
    private String scrubberMediaUrl;

    @SerializedName("dash_url")
    private String  dashUrl;

    @SerializedName("duration")
    private int duration;

    @SerializedName("hls_url")
    private String  hlsUrl;

    @SerializedName("is_gif")
    private boolean gif;

    @SerializedName("transcoding_status")
    private String transcodingStatus;

    public int getBitrateKbps() {
        return bitrateKbps;
    }

    public void setBitrateKbps(int bitrateKbps) {
        this.bitrateKbps = bitrateKbps;
    }

    public String getFallbackUrl() {
        return fallbackUrl;
    }

    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getScrubberMediaUrl() {
        return scrubberMediaUrl;
    }

    public void setScrubberMediaUrl(String scrubberMediaUrl) {
        this.scrubberMediaUrl = scrubberMediaUrl;
    }

    public String getDashUrl() {
        return dashUrl;
    }

    public void setDashUrl(String dashUrl) {
        this.dashUrl = dashUrl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getHlsUrl() {
        return hlsUrl;
    }

    public void setHlsUrl(String hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    public boolean isGif() {
        return gif;
    }

    public void setGif(boolean gif) {
        this.gif = gif;
    }

    public String getTranscodingStatus() {
        return transcodingStatus;
    }

    public void setTranscodingStatus(String transcodingStatus) {
        this.transcodingStatus = transcodingStatus;
    }

    @Override
    public String toString() {
        return "RedditVideo{" +
                "bitrateKbps=" + bitrateKbps +
                ", fallbackUrl='" + fallbackUrl + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", scrubberMediaUrl='" + scrubberMediaUrl + '\'' +
                ", dashUrl='" + dashUrl + '\'' +
                ", duration=" + duration +
                ", hlsUrl='" + hlsUrl + '\'' +
                ", gif=" + gif +
                ", transcodingStatus='" + transcodingStatus + '\'' +
                '}';
    }
}
