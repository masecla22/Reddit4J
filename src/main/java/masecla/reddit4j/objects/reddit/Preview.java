package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Preview {
    @SerializedName("images")
    private List<Image> images;

    @SerializedName("enabled")
    private boolean enabled;
}
