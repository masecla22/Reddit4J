package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class KarmaBreakdown {
	@SerializedName("sr")
	private String sr;

	@SerializedName("comment_karma")
	private String commentKarma;

	@SerializedName("link_karma")
	private String linkKarma;
}
