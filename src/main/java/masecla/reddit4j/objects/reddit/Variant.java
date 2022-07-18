package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Variant {
    @SerializedName("source")
    private Resolution source;

    @SerializedName("resolutions")
    private List<Resolution> resolutions;
}
