package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Variants {
    @SerializedName("gif")
    private Variant gif;

    @SerializedName("mp4")
    private Variant mp4;

    public Variant getGif() {
        return gif;
    }

    public void setGif(Variant gif) {
        this.gif = gif;
    }

    public Variant getMp4() {
        return mp4;
    }

    public void setMp4(Variant mp4) {
        this.mp4 = mp4;
    }

    @Override
    public String toString() {
        return "Variants{" +
                "gif=" + gif +
                ", mp4=" + mp4 +
                '}';
    }
}
