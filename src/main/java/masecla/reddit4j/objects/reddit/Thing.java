package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Thing<T> {
    @SerializedName("kind")
    private Kind kind;

    @SerializedName("data")
    private T data;
}
