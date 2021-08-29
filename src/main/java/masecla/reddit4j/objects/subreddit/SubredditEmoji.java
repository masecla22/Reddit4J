package masecla.reddit4j.objects.subreddit;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

import masecla.reddit4j.exceptions.PermissionException;
import masecla.reddit4j.objects.RedditObject;

public class SubredditEmoji extends RedditObject {
	private String url;
	private boolean mod_flair_only;
	private boolean post_flair_allowed;
	private boolean user_flair_allowed;
	private String created_by;

	private boolean snoomoji;
	private String name;
	private RedditSubreddit subreddit;

	public boolean isSnoomoji() {
		return snoomoji;
	}

	protected void setSnoomoji(boolean snoomoji) {
		this.snoomoji = snoomoji;
	}

	protected void setSubreddit(RedditSubreddit subreddit) {
		this.subreddit = subreddit;
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

	public void delete() throws IOException, InterruptedException {
		Connection conn = subreddit.getClient()
				.useEndpoint("/api/v1/" + this.subreddit.getDisplayName() + "/emoji/" + this.name);
		conn.method(Method.DELETE).ignoreHttpErrors(true);
		Response rsp = this.subreddit.getClient().getHttpClient().execute(conn);
		if (rsp.statusCode() == 403)
			throw new PermissionException("You cannot delete that emoji!");
	}
}
