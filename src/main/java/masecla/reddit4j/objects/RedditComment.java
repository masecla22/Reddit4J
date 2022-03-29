package masecla.reddit4j.objects;

import java.util.List;

public class RedditComment extends RedditThing {
    /**
     * who approved this comment. null if nobody or you are not a mod
     */
    String approved_by;

    /**
     * the account name of the poster
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
     * who removed this comment. null if nobody or you are not a mod
     */
    String banned_by;

    /**
     * the raw text. this is the unformatted text which includes the raw markup characters such as ** for bold. <, >, and & are escaped.
     */
    String body;

    /**
     * the formatted HTML text as displayed on reddit. For example, text that is emphasised by * will now have <em> tags wrapping it. Additionally, bullets and numbered lists will now be in HTML list format. NOTE: The HTML string will be escaped. You must unescape to get the raw HTML.
     */
    String body_html;

    /**
     * false if not edited, edit date in UTC epoch-seconds otherwise. NOTE: for some old edited comments on reddit.com, this will be set to true instead of edit date.
     */
    Object edited;

    /**
     * the number of times this comment received reddit gold
     */
    int gilded;

    /**
     * how the logged-in user has voted on the comment - True = upvoted, False = downvoted, null = no vote
     */
    boolean likes;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the author of the parent link
     */
    String link_author;

    /**
     * ID of the link this comment is in
     */
    String link_id;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the title of the parent link
     */
    String link_title;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the URL of the parent link
     */
    String link_url;

    /**
     * how many times this comment has been reported, null if not a mod
     */
    int num_reports;

    /**
     * ID of the thing this comment is a reply to, either the link or a comment in it
     */
    String parent_id;

    /**
     *	A list of replies to this comment
     */
    List<RedditThing> replies;

    /**
     * true if this post is saved by the logged in user
     */
    boolean saved;

    /**
     * the net-score of the comment
     */
    int score;

    /**
     * Whether the comment's score is currently hidden.
     */
    boolean score_hidden;

    /**
     * subreddit of thing excluding the /r/ prefix. "pics"
     */
    String subreddit;

    /**
     * the id of the subreddit in which the thing is located
     */
    String subreddit_id;

    /**
     * to allow determining whether they have been distinguished by moderators/admins. null = not distinguished. moderator = the green [M]. admin = the red [A]. special = various other special distinguishes http://redd.it/19ak1b
     */
    String distinguished;

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
}
