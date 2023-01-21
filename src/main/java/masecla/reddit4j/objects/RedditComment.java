package masecla.reddit4j.objects;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import masecla.reddit4j.objects.adapters.RedditCommentRepliesAdapter;

@Data
public class RedditComment extends RedditThing implements RedditNameable {

    /**
     * the fullname identifier of this comment
     */
    private String name;

    /**
     * who approved this comment. null if nobody or you are not a mod
     */
    @SerializedName("approved_by")
	private String approvedBy;

    /**
     * the account name of the poster
     */
    private String author;

    /**
     * the CSS class of the author's flair. subreddit specific
     */
    @SerializedName("author_flair_css_class")
	private String authorFlairCssClass;

    /**
     * the text of the author's flair. subreddit specific
     */
    @SerializedName("author_flair_text")
	private String authorFlairText;

    /**
     * who removed this comment. null if nobody or you are not a mod
     */
    @SerializedName("banned_by")
	private String bannedBy;

    /**
     * the raw text. this is the unformatted text which includes the raw markup characters such as ** for bold. <, >, and & are escaped.
     */
    private String body;

    /**
     * the formatted HTML text as displayed on reddit. For example, text that is emphasised by * will now have <em> tags wrapping it. Additionally, bullets and numbered lists will now be in HTML list format. NOTE: The HTML string will be escaped. You must unescape to get the raw HTML.
     */
    @SerializedName("body_html")
	private String bodyHtml;

    /**
     * false if not edited, edit date in UTC epoch-seconds otherwise. NOTE: for some old edited comments on reddit.com, this will be set to true instead of edit date.
     */
    private Object edited;

    /**
     * the number of times this comment received reddit gold
     */
    private int gilded;

    /**
     * how the logged-in user has voted on the comment - True = upvoted, False = downvoted, null = no vote
     */
    private boolean likes;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the author of the parent link
     */
    @SerializedName("link_author")
	private String linkAuthor;

    /**
     * ID of the link this comment is in
     */
    @SerializedName("link_id")
	private String linkId;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the title of the parent link
     */
    @SerializedName("link_title")
	private String linkTitle;

    /**
     * present if the comment is being displayed outside its thread (user pages, /r/subreddit/comments/.json, etc.). Contains the URL of the parent link
     */
    @SerializedName("link_url")
	private String linkUrl;

    /**
     * how many times this comment has been reported, null if not a mod
     */
    @SerializedName("num_reports")
	private int numReports;

    /**
     * ID of the thing this comment is a reply to, either the link or a comment in it
     */
    @SerializedName("parent_id")
	private String parentId;

    /**
     *	A list of replies to this comment
     */
    @JsonAdapter(RedditCommentRepliesAdapter.class)
    private RedditData<RedditListing<RedditData<RedditComment>>> replies;

    /**
     * true if this post is saved by the logged in user
     */
    private boolean saved;

    /**
     * the net-score of the comment
     */
    private int score;

    /**
     * Whether the comment's score is currently hidden.
     */
    @SerializedName("score_hidden")
	private boolean scoreHidden;

    /**
     * subreddit of thing excluding the /r/ prefix. "pics"
     */
    private String subreddit;

    /**
     * the id of the subreddit in which the thing is located
     */
    @SerializedName("subreddit_id")
	private String subredditId;

    /**
     * to allow determining whether they have been distinguished by moderators/admins. null = not distinguished. moderator = the green [M]. admin = the red [A]. special = various other special distinguishes http://redd.it/19ak1b
     */
    private String distinguished;

    /**
     * The number of upvotes. (includes own).
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    private int ups;

    /**
     * The number of downvotes. (includes own).
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    private int downs;

    /**
     * true if thing is liked by the user, false if thing is disliked, null if the user has not voted or you are not logged in.
     * Certain languages such as Java may need to use a boolean wrapper that supports null assignment.
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#votable-implementation
     */
    private Boolean liked;

    /**
     * The time of creation in local epoch-second format. ex: 1331042771.0
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#created-implementation
     */
    private long created;

    /**
     * The time of creation in UTC epoch-second format. Note that neither of these ever have a non-zero fraction.
     *
     * https://github.com/reddit-archive/reddit/wiki/JSON#created-implementation
     */
    @SerializedName("created_utc")
	private long createdUtc;
}
