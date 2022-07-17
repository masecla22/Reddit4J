package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

// TODO: 17.07.2022 What is the correct name of this class?
public class Experiment {
    @SerializedName("owner")
    private String owner;

    @SerializedName("variant")
    private String variant;

    @SerializedName("experiment_id")
    private int experimentId;
}
