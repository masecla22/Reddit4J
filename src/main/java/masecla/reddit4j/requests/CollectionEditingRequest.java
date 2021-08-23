package masecla.reddit4j.requests;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.subreddit.SubredditCollection;
import masecla.reddit4j.objects.subreddit.enums.DisplayLayout;

public class CollectionEditingRequest {
	private String description = null;
	private DisplayLayout displayLayout = null;
	private String title = null;

	private SubredditCollection collection;
	private Reddit4J client;

	public CollectionEditingRequest(SubredditCollection collection, Reddit4J client) {
		super();
		this.collection = collection;
		this.client = client;
	}

	public CollectionEditingRequest description(String description) {
		if (description.length() > 500)
			throw new IllegalArgumentException("The description cannot be longer than 500 characters!");
		this.description = description;
		return this;
	}

	public CollectionEditingRequest displayLayout(DisplayLayout displayLayout) {
		this.displayLayout = displayLayout;
		return this;
	}

	public CollectionEditingRequest title(String title) {
		if (title.length() > 300)
			throw new IllegalArgumentException("The title cannot be longer than 300 characters!");
		this.title = title;
		return this;
	}

	public void execute() throws IllegalStateException {
		IllegalStateException exception = new IllegalStateException(
				"Errors happened while updating values! Check the exception #getSuppresed() for all the errors!");
		try {
			updateTitle();
		} catch (IOException | InterruptedException e) {
			exception.addSuppressed(e);
		}
		try {
			updateDescription();
		} catch (IOException | InterruptedException e) {
			exception.addSuppressed(e);
		}
		try {
			updateDisplayLayout();
		} catch (IOException | InterruptedException e) {
			exception.addSuppressed(e);
		}
		if (exception.getSuppressed().length != 0)
			throw exception;
	}

	private void updateTitle() throws IOException, InterruptedException {
		if (title == null)
			return;
		Connection conn = client.useEndpoint("/api/v1/collections/update_collection_title").method(Method.POST);
		conn.data("collection_id", this.collection.getCollectionId().toString());
		conn.data("title", title);
		this.client.getHttpClient().execute(conn);
	}

	private void updateDisplayLayout() throws IOException, InterruptedException {
		if (displayLayout == null)
			return;
		Connection conn = client.useEndpoint("/api/v1/collections/update_collection_display_layout")
				.method(Method.POST);
		conn.data("collection_id", this.collection.getCollectionId().toString());
		conn.data("display_layout", this.displayLayout.toString());
		this.client.getHttpClient().execute(conn);
	}

	private void updateDescription() throws IOException, InterruptedException {
		if (description == null)
			return;
		Connection conn = client.useEndpoint("/api/v1/collections/update_collection_description").method(Method.POST);
		conn.data("collection_id", this.collection.getCollectionId().toString());
		conn.data("description", description);
		this.client.getHttpClient().execute(conn);
	}
}
