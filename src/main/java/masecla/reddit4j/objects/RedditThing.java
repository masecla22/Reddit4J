package masecla.reddit4j.objects;

/**
 * This class represents a "thing" on reddit. Such as an account, a post, and
 * other things.
 *
 * t1 - Comment
 * t2 - User Account
 * t3 - Post / Link
 * t4 - Message
 * t5 - Subreddit
 * t6 - Award
 * t8 - Promoted Links / Self Serve Ads
 *
 * @author Matt
 */
public abstract class RedditThing extends RedditObject {
	private String id;

	public void setId(String id) {
		id = id.toLowerCase();
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
