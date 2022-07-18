package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Image extends Variant {
    @SerializedName("id")
    private String id;

    @SerializedName("variants")
    private Variants variants;
}
