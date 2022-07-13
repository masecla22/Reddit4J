package masecla.reddit4j.objects.adapters;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import masecla.reddit4j.objects.RedditComment;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;

import java.io.IOException;

public class RedditCommentRepliesAdapter extends TypeAdapter<RedditData<RedditListing<RedditData<RedditComment>>>> {
    @Override
    public void write(JsonWriter out, RedditData<RedditListing<RedditData<RedditComment>>> value) throws IOException {
        System.out.println("Write");
    }

    @Override
    public RedditData<RedditListing<RedditData<RedditComment>>> read(JsonReader in) throws IOException {
        if (in.peek().name().equals("STRING")) {
            in.nextString(); // Ignore;
            return null;
        } else if (in.peek().name().equals("BEGIN_OBJECT")) {
            TypeToken<?> ttDataComment = TypeToken.getParameterized(RedditData.class, RedditComment.class);
            TypeToken<?> ttListing = TypeToken.getParameterized(RedditListing.class, ttDataComment.getType());
            TypeToken<?> ttData = TypeToken.getParameterized(RedditData.class, ttListing.getType());
            return new Gson().fromJson(in, ttData.getType());
        } else {
            // Unknown (Log error?)
            return null;
        }
    }
}