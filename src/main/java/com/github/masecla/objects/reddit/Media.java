package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Media {
    @SerializedName("reddit_video")
    private RedditVideo redditVideo;

    @SerializedName("type")
    private String type;

    @SerializedName("oembed")
    private Oembed oembed;

    public static class Oembed {
        @SerializedName("provider_url")
        private String providerUrl;

        @SerializedName("version")
        private String version;

        @SerializedName("title")
        private String title;

        @SerializedName("type")
        private String type;

        @SerializedName("thumbnail_width")
        private int thumbnailWidth;

        @SerializedName("height")
        private int height;

        @SerializedName("width")
        private int width;

        @SerializedName("html")
        private String html;

        @SerializedName("author_name")
        private String authorName;

        @SerializedName("provider_name")
        private String providerName;

        @SerializedName("thumbnail_url")
        private String thumbnailUrl;

        @SerializedName("thumbnail_height")
        private int thumbnailHeight;

        @SerializedName("author_url")
        private String authorUrl;

        public String getProviderUrl() {
            return providerUrl;
        }

        public void setProviderUrl(String providerUrl) {
            this.providerUrl = providerUrl;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getThumbnailWidth() {
            return thumbnailWidth;
        }

        public void setThumbnailWidth(int thumbnailWidth) {
            this.thumbnailWidth = thumbnailWidth;
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

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getProviderName() {
            return providerName;
        }

        public void setProviderName(String providerName) {
            this.providerName = providerName;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }

        public int getThumbnailHeight() {
            return thumbnailHeight;
        }

        public void setThumbnailHeight(int thumbnailHeight) {
            this.thumbnailHeight = thumbnailHeight;
        }

        public String getAuthorUrl() {
            return authorUrl;
        }

        public void setAuthorUrl(String authorUrl) {
            this.authorUrl = authorUrl;
        }

        @Override
        public String toString() {
            return "Oembed{" +
                    "providerUrl='" + providerUrl + '\'' +
                    ", version='" + version + '\'' +
                    ", title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", thumbnailWidth=" + thumbnailWidth +
                    ", height=" + height +
                    ", width=" + width +
                    ", html='" + html + '\'' +
                    ", authorName='" + authorName + '\'' +
                    ", providerName='" + providerName + '\'' +
                    ", thumbnailUrl='" + thumbnailUrl + '\'' +
                    ", thumbnailHeight=" + thumbnailHeight +
                    ", authorUrl='" + authorUrl + '\'' +
                    '}';
        }
    }

    public RedditVideo getRedditVideo() {
        return redditVideo;
    }

    public void setRedditVideo(RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Oembed getOembed() {
        return oembed;
    }

    public void setOembed(Oembed oembed) {
        this.oembed = oembed;
    }

    @Override
    public String toString() {
        return "Media{" +
                "redditVideo=" + redditVideo +
                ", type='" + type + '\'' +
                ", oembed=" + oembed +
                '}';
    }
}
