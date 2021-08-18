package masecla.reddit4j.objects;

public class RedditProfile extends RedditThing {
	private long comment_karma;
	private double created;
	private double created_utc;
	private boolean has_mail;
	private boolean has_mod_mail;
	private boolean has_verified_email;
	private boolean is_gold;
	private boolean is_mod;
	private long link_karma;
	private String name;
	private boolean over_18;

	public long getCommentKarma() {
		return comment_karma;
	}

	public long getCreated() {
		return (long) created;
	}

	public long getCreatedUTC() {
		return (long) created_utc;
	}

	public boolean hasMail() {
		return has_mail;
	}

	public boolean hasModMail() {
		return has_mod_mail;
	}

	public boolean hasVerifiedEmail() {
		return has_verified_email;
	}

	public boolean isGold() {
		return is_gold;
	}

	public boolean isMod() {
		return is_mod;
	}

	public long getLinkKarma() {
		return link_karma;
	}

	public String getName() {
		return name;
	}

	public boolean isOver18() {
		return over_18;
	}
}
