package masecla.reddit4j.requests;

import lombok.Data;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.subreddit.SubredditCollection;
import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

import java.io.IOException;

import static masecla.reddit4j.Utils.Utility.handleErrors;

@Data
public class CollectionPostRequest {

    private final SubredditCollection collection;
    private final Reddit4J client;
    private String linkFullname;

    public CollectionPostRequest(SubredditCollection collection, Reddit4J client) {
        this(collection, client, null);
    }

    public CollectionPostRequest(SubredditCollection collection, Reddit4J client, String linkFullname) {
        super();
        this.collection = collection;
        this.client = client;
        this.linkFullname = linkFullname;
    }

    public void addPostToCollection() throws IOException, InterruptedException {
        Connection conn = client.useEndpoint("/api/v1/collections/add_post_to_collection")
                .method(Method.POST);
        conn.data("collection_id", this.collection.getCollectionId().toString());
        conn.data("link_fullname", this.linkFullname);
        Response rsp = client.getHttpClient().execute(conn);
        handleErrors(rsp);
    }

    public void removePostToCollection() throws IOException, InterruptedException {
        Connection conn = client.useEndpoint("/api/v1/collections/remove_post_to_collection")
                .method(Method.POST);
        conn.data("collection_id", this.collection.getCollectionId().toString());
        conn.data("link_fullname", this.linkFullname);
        Response rsp = client.getHttpClient().execute(conn);
        handleErrors(rsp);
    }
}
