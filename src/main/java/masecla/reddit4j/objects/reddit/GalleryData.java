package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryData {
    @SerializedName("items")
    private List<Item> items;
}
