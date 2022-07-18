package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class RedditVideo {
    @SerializedName("bitrate_kbps")
    private int bitrateKbps;

    @SerializedName("fallback_url")
    private String  fallbackUrl;

    @SerializedName("height")
    private int height;

    @SerializedName("width")
    private int width;

    @SerializedName("scrubber_media_url")
    private String scrubberMediaUrl;

    @SerializedName("dash_url")
    private String  dashUrl;

    @SerializedName("duration")
    private int duration;

    @SerializedName("hls_url")
    private String  hlsUrl;

    @SerializedName("is_gif")
    private boolean gif;

    @SerializedName("transcoding_status")
    private String transcodingStatus;
}
