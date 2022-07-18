package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Variants {
    @SerializedName("gif")
    private Variant gif;

    @SerializedName("mp4")
    private Variant mp4;
}
