package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("media_id")
    private String mediaId;

    @SerializedName("id")
    private int id;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mediaId='" + mediaId + '\'' +
                ", id=" + id +
                '}';
    }
}
