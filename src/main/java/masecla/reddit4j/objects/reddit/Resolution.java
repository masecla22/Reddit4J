package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Resolution {
    @SerializedName(value = "url", alternate = "u")
    private String url;

    @SerializedName(value = "width", alternate = "x")
    private int width;

    @SerializedName(value = "height", alternate = "y")
    private int height;
}
