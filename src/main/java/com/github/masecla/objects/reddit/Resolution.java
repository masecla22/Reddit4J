package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Resolution {
    @SerializedName(value = "url", alternate = "u")
    private String url;

    @SerializedName(value = "width", alternate = "x")
    private int width;

    @SerializedName(value = "height", alternate = "y")
    private int height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
