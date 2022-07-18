package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("media_id")
    private String mediaId;

    @SerializedName("id")
    private int id;
}
