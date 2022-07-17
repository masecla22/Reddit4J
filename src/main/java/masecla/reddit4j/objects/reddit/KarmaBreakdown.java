package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;
import masecla.reddit4j.objects.RedditObject;

public class KarmaBreakdown extends RedditObject {
	@SerializedName("sr")
	private String sr;

	@SerializedName("comment_karma")
	private String commentKarma;

	@SerializedName("link_karma")
	private String linkKarma;
}
