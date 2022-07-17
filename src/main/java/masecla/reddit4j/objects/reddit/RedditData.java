package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RedditData<T> {
    @SerializedName("kind")
    private Kind kind;

    @SerializedName("data")
    private List<T> data;
}
