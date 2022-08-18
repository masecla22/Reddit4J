package masecla.reddit4j.objects.adapters;

import java.io.IOException;
import java.util.List;

import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import masecla.reddit4j.RedditUtils;
import masecla.reddit4j.objects.RedditComment;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;

public class RedditCommentRepliesAdapter extends TypeAdapter<List<RedditComment>> {
    @Override
    public void write(JsonWriter out, List<RedditComment> value) throws IOException {
    }

    @Override
    public List<RedditComment> read(JsonReader in) throws IOException {
        if (in.peek().name().equals("STRING")) {
            in.nextString(); // Ignore;
            return null;
        } else if (in.peek().name().equals("BEGIN_OBJECT")) {
            TypeToken<?> ttDataComment = TypeToken.getParameterized(RedditData.class, RedditComment.class);
            TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, ttDataComment.getType());
            RedditListing<RedditComment> listing = RedditUtils.gson.fromJson(in, ttListing.getType());
            return listing.getChildren();
        } else {
            // Unknown (Log error?)
            return null;
        }
    }
}