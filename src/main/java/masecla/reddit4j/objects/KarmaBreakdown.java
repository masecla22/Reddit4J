package masecla.reddit4j.objects;

public class KarmaBreakdown extends RedditObject {
	private String sr;
	private String comment_karma;
	private String link_karma;

	public KarmaBreakdown(String sr, String comment_karma, String link_karma) {
		super();
		this.sr = sr;
		this.comment_karma = comment_karma;
		this.link_karma = link_karma;
	}

	public String getSubreddit() {
		return sr;
	}

	public String getCommentKarma() {
		return comment_karma;
	}

	public String getLinkKarma() {
		return link_karma;
	}

}
