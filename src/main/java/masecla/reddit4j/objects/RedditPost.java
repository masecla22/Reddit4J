package masecla.reddit4j.objects;

import masecla.reddit4j.client.Reddit4J;

import java.io.IOException;
import java.util.List;

/**
 * T3
 */
public class RedditPost extends RedditThing implements RedditPostActions {

    Reddit4J client;

    String name;

    /**
     * the account name of the poster. null if this is a promotional link
     */
    String author;

    /**
     * the CSS class of the author's flair. subreddit specific
     */
    String author_flair_css_class;

    /**
     * the text of the author's flair. subreddit specific
     */
    String author_flair_text;

    /**
     * probably always returns false
     */
    boolean clicked;

    /**
     * the domain of this link. Self posts will be self.<subreddit> while other examples include en.wikipedia.org and s3.amazon.com
     */
    String domain;

    /**
     * true if the post is hidden by the logged in user. false if not logged in or not hidden.
     */
    boolean hidden;

    /**
     * true if this link is a selfpost
     */
    boolean is_self;

    /**
     * how the logged-in user has voted on the link - True = upvoted, False = downvoted, null = no vote
     */
    Boolean likes;

    /**
     * the CSS class of the link's flair.
     */
    String link_flair_css_class;

    /**
     * the text of the link's flair.
     */
    String link_flair_text;

    /**
     * whether the link is locked (closed to new comments) or not.
     */
    boolean locked;

    /**
     * Used for streaming video. Detailed information about the video and it's origins are placed here
     */
    Object media;

    /**
     * Used for streaming video. Technical embed specific information is found here.
     */
    Object media_embed;

    /**
     * the number of comments that belong to this link. includes removed comments.
     */
    int num_comments;

    /**
     * true if the post is tagged as NSFW. False if otherwise
     */
    boolean over_18;

    /**
     * relative URL of the permanent link for this link
     */
    String permalink;

    /**
     * true if this post is saved by the logged in user
     */
    boolean saved;

    /**
     * the net-score of the link. note: A submission's score is simply the number of upvotes minus the number of downvotes. If five users like the submission and three users don't it will have a score of 2. Please note that the vote numbers are not "real" numbers, they have been "fuzzed" to prevent spam bots etc. So taking the above example, if five users upvoted the submission, and three users downvote it, the upvote/downvote numbers may say 23 upvotes and 21 downvotes, or 12 upvotes, and 10 downvotes. The points score is correct, but the vote totals are "fuzzed".
     */
    int score;

    /**
     * the raw text. this is the unformatted text which includes the raw markup characters such as ** for bold. <, >, and & are escaped. Empty if not present.
     */
    String selftext;

    /**
     * the formatted escaped HTML text. this is the HTML formatted version of the marked up text. Items that are boldened by ** or *** will now have <em> or *** tags on them. Additionally, bullets and numbered lists will now be in HTML list format. NOTE: The HTML string will be escaped. You must unescape to get the raw HTML. Null if not present.
     */
    String selftext_html;

    /**
     * subreddit of thing excluding the /r/ prefix. "pics"
     */
    String subreddit;

    /**
     * the id of the subreddit in which the thing is located
     */
    String subreddit_id;

    /**
     * full URL to the thumbnail for this link; "self" if this is a self post; "image" if this is a link to an image but has no thumbnail; "default" if a thumbnail is not available
     */
    String thumbnail;

    /**
     * the title of the link. may contain newlines for some reason
     */
    String title;

    /**
     * the link of this post. the permalink if this is a self-post
     */
    String url;

    /**
     * Indicates if link has been edited. Will be the edit timestamp if the link has been edited and return false otherwise. https://github.com/reddit/reddit/issues/581
     */
    //long edited;

    /**
     * to allow determining whether they have been distinguished by moderators/admins. null = not distinguished. moderator = the green [M]. admin = the red [A]. special = various other special distinguishes http://bit.ly/ZYI47B
     */
    String distinguished;

    /**
     * true if the post is set as the sticky in its subreddit.
     */
    boolean stickied;


    String author_fullname;
    String modReasonTitle;
    int gilded;
    List<Object> linkFlairRichtext;
    String subredditNamePrefixed;
    int pwls;

    /**
     * The number of upvotes. (includes own).
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    int ups;

    /**
     * The number of downvotes. (includes own).
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    int downs;

    /**
     * true if thing is liked by the user, false if thing is disliked, null if the user has not voted or you are not logged in.
     * Certain languages such as Java may need to use a boolean wrapper that supports null assignment.
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    Boolean liked;

    /**
     * The time of creation in local epoch-second format. ex: 1331042771.0
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#created-implementation
     */
    long created;

    /**
     * The time of creation in UTC epoch-second format. Note that neither of these ever have a non-zero fraction.
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#created-implementation
     */
    long created_utc;

    @Override
    public void upvote() throws IOException, InterruptedException {
        this.client.upvote(this.name);
    }

    @Override
    public void downvote() throws IOException, InterruptedException {
        this.client.downvote(this.name);
    }

    @Override
    public void delete() throws IOException, InterruptedException {
        this.client.delete(this.name);
    }

    public void setClient(Reddit4J client) {
        this.client = client;
    }
}
