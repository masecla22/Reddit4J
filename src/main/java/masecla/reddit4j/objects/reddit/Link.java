package masecla.reddit4j.objects.reddit;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Link {
    @SerializedName("approved_at_utc")
    private String approvedAtUtc; // TODO: 18.07.2022 what are the possible values?

    @SerializedName("subreddit")
    private String subreddit;

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

    @SerializedName("is_gallery")
    private boolean gallery;

    @SerializedName("title")
    private String title;

    @SerializedName("link_flair_richtext")
    private JsonArray linkFlairRichtext;

    @SerializedName("subreddit_name_prefixed")
    private String subredditNamePrefixed;

    @SerializedName("hidden")
    private boolean hidden;

    @SerializedName("pwls")
    private int pwls;

    @SerializedName("link_flair_css_class")
    private String linkFlairCssClass;

    @SerializedName("downs")
    private int downs;

    @SerializedName("thumbnail_height")
    private int thumbnail_height;

    @SerializedName("top_awarded_type")
    private String topAwardedType;

    @SerializedName("hide_score")
    private boolean hideScope;

    @SerializedName("name")
    private String name;

    @SerializedName("quarantine")
    private boolean quarantine;

    @SerializedName("link_flair_text_color")
    private String linkFlairTextColor;

    @SerializedName("upvote_ratio")
    private double upvoteRatio;

    @SerializedName("author_flair_background_color")
    private String authorFlairBackgroundColor;

    @SerializedName("subreddit_type")
    private String subredditType;

    @SerializedName("ups")
    private int ups;

    @SerializedName("total_awards_received")
    private int totalAwardsReceived;

    @SerializedName("media_embed")
    private JsonElement mediaEmbed; // TODO: 18.07.2022 what are the possible values?

    @SerializedName("thumbnail_width")
    private int thumbnailWidth;

    @SerializedName("author_flair_template_id")
    private String authorFlairTemplateId;

    @SerializedName("is_original_content")
    private boolean originalContent;

    @SerializedName("user_reports")
    private JsonArray userReports; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("secure_media")
    private Media secureMedia;

    @SerializedName("is_reddit_media_domain")
    private boolean redditMediaDomain;

    @SerializedName("is_meta")
    private boolean meta;

    @SerializedName("category")
    private String category;

    @SerializedName("secure_media_embed")
    private JsonElement secureMediaEmbed; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("link_flair_text")
    private String linkFlairText;

    @SerializedName("can_mod_post")
    private boolean canModPost;

    @SerializedName("score")
    private int score;

    @SerializedName("approved_by")
    private String approvedBy;

    @SerializedName("is_created_from_ads_ui")
    private boolean createdFromAdsUi;

    @SerializedName("author_premium")
    private String authorPremium;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("edited")
    private boolean edited;

    @SerializedName("author_flair_css_class")
    private String authorFlairCssClass;

    @SerializedName("author_flair_richtext")
    private JsonArray authorFlairRichtext; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("gildings")
    private JsonElement gildings; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("post_hint")
    private String postHint;

    @SerializedName("content_categories")
    private String contentCategories;

    @SerializedName("is_self")
    private boolean self;

    @SerializedName("mod_note")
    private String modNote;

    @SerializedName("created")
    private long created;

    @SerializedName("link_flair_type")
    private String linkFlairType;

    @SerializedName("wls")
    private int wls;

    @SerializedName("removed_by_category")
    private String removedByCategory;

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
    private String likes;

    @SerializedName("suggested_sort")
    private String suggestedSort;

    @SerializedName("banned_at_utc")
    private String bannedAtUtc;

    @SerializedName("url_overridden_by_dest")
    private String urlOverriddenByDest;

    @SerializedName("view_count")
    private String viewCount;

    @SerializedName("archived")
    private boolean archived;

    @SerializedName("no_follow")
    private boolean noFollow;

    @SerializedName("is_crosspostable")
    private boolean crosspostable;

    @SerializedName("pinned")
    private boolean pinned;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("preview")
    private Preview preview;

    @SerializedName("all_awardings")
    private JsonArray allAwardings;

    @SerializedName("awarders")
    private JsonArray awarders;

    @SerializedName("media_only")
    private boolean mediaOnly;

    @SerializedName("can_gild")
    private Boolean canGild;

    @SerializedName("spoiler")
    private boolean spoiler;

    @SerializedName("locked")
    private boolean locked;

    @SerializedName("author_flair_text")
    private String authorFlairText;

    @SerializedName("treatment_tags")
    private JsonArray treatmentTags;

    @SerializedName("visited")
    private boolean visited;

    @SerializedName("removed_by")
    private String removedBy;

    @SerializedName("num_reports")
    private String numReports;

    @SerializedName("distinguished")
    private String distinguished;

    @SerializedName("subreddit_id")
    private String subredditId;

    @SerializedName("author_is_blocked")
    private boolean authorBlocked;

    @SerializedName("mod_reason_by")
    private String modReasonBy;

    @SerializedName("removal_reason")
    private String removalReason;

    @SerializedName("link_flair_background_color")
    private String linkFlairBackgroundColor;

    @SerializedName("id")
    private String id;

    @SerializedName("is_robot_indexable")
    private boolean robotIndexable;

    @SerializedName("report_reasons")
    private String reportReasons;

    @SerializedName("author")
    private String author;

    @SerializedName("discussion_type")
    private String discussionType;

    @SerializedName("num_comments")
    private int numComments;

    @SerializedName("send_replies")
    private boolean sendReplies;

    @SerializedName("whitelist_status")
    private String whitelistStatus;

    @SerializedName("contest_mode")
    private boolean contestMode;

    @SerializedName("mod_reports")
    private JsonArray modReports;

    @SerializedName("author_patreon_flair")
    private boolean authorPatreonFlair;

    @SerializedName("author_flair_text_color")
    private String authorFlairTextColor;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("parent_whitelist_status")
    private String parentWhitelistStatus;

    @SerializedName("stickied")
    private boolean stickied;

    @SerializedName("url")
    private String url;

    @SerializedName("subreddit_subscribers")
    private int subredditSubscribers;

    @SerializedName("created_utc")
    private long createdUtc;

    @SerializedName("num_crossposts")
    private int numCrossposts;

    @SerializedName("media")
    private Media media;

    @SerializedName("is_video")
    private boolean video;

    @SerializedName("media_metadata")
    private Map<String, Metadata> mediaMetadata;

    @SerializedName("gallery_data")
    private GalleryData galleryData;
}
