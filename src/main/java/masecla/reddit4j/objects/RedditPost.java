package masecla.reddit4j.objects;

import java.util.List;

/**
 * T3
 */
public class RedditPost extends RedditThing {
    String subreddit;
    String selftext;
    String authorFullname;
    boolean saved;
    String modReasonTitle;
    int gilded;
    boolean clicked;
    String title;
    List<Object> linkFlairRichtext;
    String subredditNamePrefixed;
    boolean hidden;
    int pwls;
}
