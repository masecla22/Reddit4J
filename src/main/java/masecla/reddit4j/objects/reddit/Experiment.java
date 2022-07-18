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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public int getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }

    @Override
    public String toString() {
        return "Experiment{" +
                "owner='" + owner + '\'' +
                ", variant='" + variant + '\'' +
                ", experimentId=" + experimentId +
                '}';
    }
}
