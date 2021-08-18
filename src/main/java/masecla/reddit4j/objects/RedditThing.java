package masecla.reddit4j.objects;

/**
 * This class represents a "thing" on reddit. Such as an account, a post, and
 * other things.
 * 
 * @author Matt
 */
public class RedditThing extends RedditObject {
	private String id;

	public void setId(String id) {
		id = id.toLowerCase();
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
