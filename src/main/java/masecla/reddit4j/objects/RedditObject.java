package masecla.reddit4j.objects;

import masecla.reddit4j.RedditUtils;

public class RedditObject {

    @Override
    public String toString() {
        return RedditUtils.gson.toJson(this);
    }
}
