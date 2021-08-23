package masecla.reddit4j.objects.subreddit;

import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import masecla.reddit4j.objects.RedditObject;
import masecla.reddit4j.objects.adapters.UUIDAdapter;

public class SubredditCollection extends RedditObject {
	private String author_id;
	private String author_name;
	private UUID collection_id;
	private long created_at_utc;
	private String description;
	private String display_layout;
	private long last_update_utc;
	private String[] link_ids;
	private String permalink;
	private String subreddit_id;
	private String title;

	@Override
	public Gson getGson() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(UUID.class, new UUIDAdapter());
		return builder.create();
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

	public long getCreatedAtUTC() {
		return created_at_utc;
	}

	public String getDescription() {
		return description;
	}

	public String getDisplayLayout() {
		return display_layout;
	}

	public long getLastUpdatedUTC() {
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
