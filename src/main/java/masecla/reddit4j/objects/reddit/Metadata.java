package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Metadata {
    @SerializedName("status")
    private String status;

    @SerializedName("e")
    private String e;

    @SerializedName("m")
    private String m;

    @SerializedName("p")
    private List<Resolution> p;

    @SerializedName("s")
    private Resolution s;

    @SerializedName("id")
    private String id;
}
