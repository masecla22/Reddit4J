package masecla.reddit4j.objects.reddit;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Subreddit {
    @SerializedName("default_set")
    private boolean defaultSet;

    @SerializedName("user_is_contributor")
    private boolean userContributor;

    @SerializedName("banner_img")
    private String bannerImg;

    @SerializedName("restrict_posting")
    private boolean restrictPosting;

    @SerializedName("user_is_banned")
    private boolean userBanned;

    @SerializedName("free_form_reports")
    private boolean freeFromReports;

    @SerializedName("community_icon")
    private String communityIcon;

    @SerializedName("show_media")
    private boolean showMedia;

    @SerializedName("icon_color")
    private String iconColor;

    @SerializedName("user_is_muted")
    private String userIsMuted; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("header_img")
    private String headerImg;

    @SerializedName("title")
    private String title;

    @SerializedName("coins")
    private int coins;

    @SerializedName("previous_names")
    private List<String> previousNames;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("icon_size")
    private List<Integer> iconSize;

    @SerializedName("primary_color")
    private String primaryColor;

    @SerializedName("icon_img")
    private String iconImg;

    @SerializedName("description")
    private String description;

    @SerializedName("allowed_media_in_comments")
    private List<JsonElement> allowedMediaInComments; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("submit_link_label")
    private String submitLinkLabel;

    @SerializedName("header_size")
    private String headerSize; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("restrict_commenting")
    private boolean restrictCommenting;

    @SerializedName("subscribers")
    private int subscribers;

    @SerializedName("submit_text_label")
    private String submitTextLabel;

    @SerializedName("is_default_icon")
    private boolean defaultIcon;

    @SerializedName("link_flair_position")
    private String linkFlairPosition;

    @SerializedName("display_name_prefixed")
    private String displayNamePrefixed;

    @SerializedName("key_color")
    private String keyColor;

    @SerializedName("name")
    private String name;

    @SerializedName("is_default_banner")
    private boolean defaultBanner;

    @SerializedName("url")
    private String url;

    @SerializedName("quarantine")
    private boolean quarantine;

    @SerializedName("banner_size")
    private String bannerSize; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("user_is_moderator")
    private boolean userModerator;

    @SerializedName("accept_followers")
    private boolean acceptFollowers;

    @SerializedName("public_description")
    private String publicDescription;

    @SerializedName("link_flair_enabled")
    private boolean linkFlairEnabled;

    @SerializedName("disable_contributor_requests")
    private boolean disableContributorRequests;

    @SerializedName("subreddit_type")
    private String subredditType; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("user_is_subscriber")
    private boolean userSubscriber;
}
