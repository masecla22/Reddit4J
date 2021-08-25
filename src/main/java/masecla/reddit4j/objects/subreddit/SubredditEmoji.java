package masecla.reddit4j.objects.subreddit;

public class SubredditEmoji {
	private String url;
	private boolean mod_flair_only;
	private boolean post_flair_allowed;
	private boolean user_flair_allowed;
	private String created_by;

	private boolean snoomoji;
	private String name;

	public boolean isSnoomoji() {
		return snoomoji;
	}

	protected void setSnoomoji(boolean snoomoji) {
		this.snoomoji = snoomoji;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getURL() {
		return url;
	}

	public String getCreatedBy() {
		return created_by;
	}

	public boolean isModFlairOnly() {
		return mod_flair_only;
	}

	public boolean isPostFlairAllowed() {
		return post_flair_allowed;
	}

	public boolean isUserFlairAllowed() {
		return user_flair_allowed;
	}
}
