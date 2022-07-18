package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Media {
    @SerializedName("reddit_video")
    private RedditVideo redditVideo;

    public RedditVideo getRedditVideo() {
        return redditVideo;
    }

    public void setRedditVideo(RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
    }

    @Override
    public String toString() {
        return "Media{" +
                "redditVideo=" + redditVideo +
                '}';
    }
}
