package masecla.reddit4j.objects.subreddit;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import masecla.reddit4j.objects.RedditNameable;
import masecla.reddit4j.objects.RedditThing;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class RedditSearch extends RedditThing implements RedditNameable {
    @SerializedName("approved_at_utc")
    private Object approvedAtUtc;
    /**
     * usually is a string, reporting the name of the subreddit but when type param is set to "user", this attribute is a complex object.
     */
    @SerializedName("subreddit")
    private Object subreddit;

    @SerializedName("selftext")
    private String selftext;

    @SerializedName("author_fullname")
    private String authorFullname;

    @SerializedName("saved")
    private boolean saved;

    @SerializedName("mod_reason_title")
    private String modReasonTitle;

    @SerializedName("gilded")
    private int gilded;

    @SerializedName("clicked")
    private boolean clicked;

    @SerializedName("title")
    private String title;

    @SerializedName("link_flair_richtext")
    private List<Object> linkFlairRichtext;

    @SerializedName("subreddit_name_prefixed")
    private String subredditNamePrefixed;

    @SerializedName("hidden")
    private boolean hidden;

    @SerializedName("pwls")
    private int pwls;

    @SerializedName("link_flair_css_class")
    private Object linkFlairCssClass;

    @SerializedName("downs")
    private int downs;

    @SerializedName("thumbnail_height")
    private Object thumbnailHeight;

    @SerializedName("top_awarded_type")
    private Object topAwardedType;

    @SerializedName("hide_score")
    private boolean hideScore;

    /**
     * the fullname identifier of this search result
     */
    @SerializedName("name")
    private String name;

    @SerializedName("quarantine")
    private boolean quarantine;

    @SerializedName("link_flair_text_color")
    private String linkFlairTextColor;

    @SerializedName("upvote_ratio")
    private double upvoteRatio;

    @SerializedName("author_flair_background_color")
    private Object authorFlairBackgroundColor;

    @SerializedName("subreddit_type")
    private String subredditType;

    @SerializedName("ups")
    private int ups;

    @SerializedName("total_awards_received")
    private int totalAwardsReceived;

    @SerializedName("media_embed")
    private Map<String, Object> mediaEmbed;

    @SerializedName("thumbnail_width")
    private Object thumbnailWidth;

    @SerializedName("author_flair_template_id")
    private Object authorFlairTemplateId;

    @SerializedName("is_original_content")
    private boolean isOriginalContent;

    @SerializedName("user_reports")
    private List<Object> userReports;

    @SerializedName("secure_media")
    private Object secureMedia;

    @SerializedName("is_reddit_media_domain")
    private boolean isRedditMediaDomain;

    @SerializedName("is_meta")
    private boolean isMeta;

    @SerializedName("category")
    private String category;

    @SerializedName("secure_media_embed")
    private Map<String, Object> secureMediaEmbed;

    @SerializedName("link_flair_text")
    private Object linkFlairText;

    @SerializedName("can_mod_post")
    private boolean canModPost;

    @SerializedName("score")
    private int score;

    @SerializedName("approved_by")
    private String approvedBy;

    @SerializedName("is_created_from_ads_ui")
    private boolean isCreatedFromAdsUi;

    @SerializedName("author_premium")
    private boolean authorPremium;

    @SerializedName("thumbnail")
    private String thumbnail;

    /**
     * false if not edited, edit date in UTC epoch-seconds otherwise. NOTE: for some old edited comments on reddit.com, this will be set to true instead of edit date.
     */
    @SerializedName("edited")
    private Object edited;

    @SerializedName("author_flair_css_class")
    private Object authorFlairCssClass;

    @SerializedName("author_flair_richtext")
    private List<Object> authorFlairRichtext;

    @SerializedName("gildings")
    private Map<String, Integer> gildings;

    @SerializedName("content_categories")
    private Object contentCategories;

    @SerializedName("is_self")
    private boolean isSelf;

    @SerializedName("mod_note")
    private Object modNote;

    @SerializedName("created")
    private long created;

    @SerializedName("link_flair_type")
    private String linkFlairType;

    @SerializedName("wls")
    private int wls;

    @SerializedName("removed_by_category")
    private Object removedByCategory;

    @SerializedName("banned_by")
    private String bannedBy;

    @SerializedName("author_flair_type")
    private String authorFlairType;

    @SerializedName("domain")
    private String domain;

    @SerializedName("allow_live_comments")
    private boolean allowLiveComments;

    @SerializedName("selftext_html")
    private String selftextHtml;

    @SerializedName("likes")
    private Object likes;

    @SerializedName("suggested_sort")
    private Object suggestedSort;

    @SerializedName("banned_at_utc")
    private Object bannedAtUtc;

    @SerializedName("view_count")
    private Object viewCount;

    @SerializedName("archived")
    private boolean archived;

    @SerializedName("no_follow")
    private boolean noFollow;

    @SerializedName("is_crosspostable")
    private boolean isCrosspostable;

    @SerializedName("pinned")
    private boolean pinned;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("all_awardings")
    private List<Object> allAwardings;

    @SerializedName("awarders")
    private List<Object> awarders;

    @SerializedName("media_only")
    private boolean mediaOnly;

    @SerializedName("can_gild")
    private boolean canGild;

    @SerializedName("spoiler")
    private boolean spoiler;

    @SerializedName("locked")
    private boolean locked;

    @SerializedName("author_flair_text")
    private Object authorFlairText;

    @SerializedName("treatment_tags")
    private List<Object> treatmentTags;

    @SerializedName("visited")
    private boolean visited;

    @SerializedName("removed_by")
    private Object removedBy;

    @SerializedName("num_reports")
    private Object numReports;

    @SerializedName("distinguished")
    private Object distinguished;

    @SerializedName("subreddit_id")
    private String subredditId;

    @SerializedName("author_is_blocked")
    private boolean authorIsBlocked;

    @SerializedName("mod_reason_by")
    private Object modReasonBy;

    @SerializedName("removal_reason")
    private Object removalReason;

    @SerializedName("link_flair_background_color")
    private String linkFlairBackgroundColor;

    @SerializedName("is_robot_indexable")
    private boolean isRobotIndexable;

    @SerializedName("report_reasons")
    private Object reportReasons;

    @SerializedName("author")
    private String author;

    @SerializedName("discussion_type")
    private Object discussionType;

    @SerializedName("num_comments")
    private int numComments;

    @SerializedName("send_replies")
    private boolean sendReplies;

    @SerializedName("contest_mode")
    private boolean contestMode;

    @SerializedName("mod_reports")
    private List<Object> modReports;

    @SerializedName("author_patreon_flair")
    private boolean authorPatreonFlair;

    @SerializedName("author_flair_text_color")
    private Object authorFlairTextColor;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("stickied")
    private boolean stickied;

    @SerializedName("url")
    private String url;

    @SerializedName("subreddit_subscribers")
    private int subredditSubscribers;

    @SerializedName("created_utc")
    private double createdUtc;

    @SerializedName("num_crossposts")
    private int numCrossposts;

    @SerializedName("media")
    private Object media;

    @SerializedName("is_video")
    private boolean isVideo;
}
