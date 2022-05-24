package masecla.reddit4j.objects.subreddit;

import java.io.IOException;
import java.util.UUID;

import masecla.reddit4j.objects.RedditObject;
import masecla.reddit4j.objects.subreddit.enums.DisplayLayout;
import masecla.reddit4j.requests.CollectionEditingRequest;

public class SubredditCollection extends RedditObject {
	private String author_id;
	private String author_name;
	private UUID collection_id;
	private double created_at_utc;
	private String description;
	private DisplayLayout display_layout;
	private double last_update_utc;
	private String[] link_ids;
	private String permalink;
	private String subreddit_id;
	private String title;

	private transient RedditSubreddit subreddit;

	protected void setSubreddit(RedditSubreddit subreddit) {
		this.subreddit = subreddit;
	}

	public CollectionEditingRequest update() {
		return new CollectionEditingRequest(this, subreddit.getClient());
	}

	public void delete() throws IOException, InterruptedException {
		subreddit.deleteCollection(collection_id);
	}

	public void follow() throws IOException, InterruptedException {
		subreddit.followCollection(collection_id);
	}

	public void unfollow() throws IOException, InterruptedException {
		subreddit.unfollowCollection(collection_id);
	}

	public String getAuthorId() {
		return author_id;
	}

	public String getAuthorName() {
		return author_name;
	}

	public UUID getCollectionId() {
		return collection_id;
	}

	public double getCreatedAtUTC() {
		return created_at_utc;
	}

	public String getDescription() {
		return description;
	}

	public DisplayLayout getDisplayLayout() {
		return display_layout;
	}

	public double getLastUpdatedUTC() {
		return last_update_utc;
	}

	public String[] getLinkIds() {
		return link_ids;
	}

	public String getPermalink() {
		return permalink;
	}

	public String getSubredditFullName() {
		return subreddit_id;
	}

	public String getTitle() {
		return title;
	}

}
