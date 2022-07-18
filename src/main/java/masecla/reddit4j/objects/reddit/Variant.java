package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Variant {
    @SerializedName("source")
    private Resolution source;

    @SerializedName("resolutions")
    private List<Resolution> resolutions;

    public Resolution getSource() {
        return source;
    }

    public void setSource(Resolution source) {
        this.source = source;
    }

    public List<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "source=" + source +
                ", resolutions=" + resolutions +
                '}';
    }
}
