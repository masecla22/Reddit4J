package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Preview {
    @SerializedName("images")
    private List<Image> images;

    @SerializedName("reddit_video_preview")
    private RedditVideo redditVideoPreview;

    @SerializedName("enabled")
    private boolean enabled;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public RedditVideo getRedditVideoPreview() {
        return redditVideoPreview;
    }

    public void setRedditVideoPreview(RedditVideo redditVideoPreview) {
        this.redditVideoPreview = redditVideoPreview;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Preview{" +
                "images=" + images +
                ", redditVideoPreview=" + redditVideoPreview +
                ", enabled=" + enabled +
                '}';
    }
}
