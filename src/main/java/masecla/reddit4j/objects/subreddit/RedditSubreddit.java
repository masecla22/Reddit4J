package masecla.reddit4j.objects.subreddit;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.PermissionException;
import masecla.reddit4j.objects.RedditThing;
import masecla.reddit4j.objects.adapters.ColorAdapter;
import masecla.reddit4j.objects.adapters.DimensionAdapter;
import masecla.reddit4j.objects.preferences.enums.Language;

public class RedditSubreddit extends RedditThing {
	private boolean accept_followers;
	private int accounts_active;
	private boolean accounts_active_is_fuzzed;
	private int active_user_count;
	private String advertiser_category;
	private boolean allow_discovery;
	private boolean allow_galleries;
	private boolean allow_images;
	private boolean allow_polls;
	private boolean allow_predictions;
	private boolean allow_predictions_tournament;
	private boolean allow_videogifs;
	private boolean allow_videos;
	private boolean all_original_content;
	private Color banner_background_color;
	private String banner_background_image;
	private String banner_img;
	private Dimension banner_size;
	private boolean can_assign_link_flair;
	private boolean can_assign_user_flair;
	private int coins;
	private boolean collapse_deleted_comments;
	private boolean collections_enabled;
	private int comment_score_hide_mins;
	private String community_icon;
	private boolean community_reviewed;
	private long created;
	private long created_utc;
	private String description;
	private String description_html;
	private boolean disable_contributor_requests;
	private String display_name;
	private String display_name_prefixed;
	private Dimension emojis_custom_size;
	private boolean emojis_enabled;
	private boolean event_posts_enabled;
	private boolean free_form_reports;
	private boolean has_menu_widget;
	private String header_img;
	private Dimension header_size;
	private String header_title;
	private boolean hide_ads;
	private String icon_img;
	private Dimension icon_size;
	private boolean is_crosspostable_subreddit;
	private boolean is_enrolled_in_new_modmail;
	private Color key_color;
	private Language lang;
	private boolean link_flair_enabled;
	private String link_flair_position;
	private String mobile_banner_image;
	private String name;
	private String notification_level;
	private boolean original_content_tag_enabled;
	private boolean over18;
	private String prediction_leaderboard_entry_type;
	private Color primary_color;
	private String public_description;
	private String public_description_html;
	private boolean public_traffic;
	private boolean quarantine;
	private boolean restrict_commenting;
	private boolean restrict_posting;
	private boolean show_media;
	private boolean show_media_preview;
	private boolean spoilers_enabled;
	private String submission_type;
	private String submit_link_label;
	private String submit_text;
	private String submit_text_html;
	private String submit_text_label;
	private String subreddit_type;
	private int subscribers;
	private String suggested_comment_sort; // This might be a DefaultCommentSort, need more research
	private String title;
	private String url;
	private boolean user_can_flair_in_sr;
	private Color user_flair_background_color; // Color
	private String user_flair_css_class;
	private boolean user_flair_enabled_in_sr;
	private String user_flair_position;
	private UserFlairRichText user_flair_richtext;
	private String user_flair_template_id;
	private String user_flair_text;
	private String user_flair_text_color; // This is "dark" or "light"
	private String user_flair_type;
	private boolean user_has_favorited;
	private boolean user_is_banned;
	private boolean user_is_contributor;
	private boolean user_is_moderator;
	private boolean user_is_muted;
	private boolean user_is_subscriber;
	private boolean user_sr_flair_enabled;
	private boolean user_sr_theme_enabled;
	private int videostream_links_count;
	private String whitelist_status; // This will be replaced with an enum
	private boolean wiki_enabled;
	private int wls;

	private transient Reddit4J client;

	@Override
	public Gson getGson() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Language.class, Language.getAdapter());
		builder.registerTypeAdapter(UserFlairRichText.class, UserFlairRichText.getAdapter());
		builder.registerTypeAdapter(Color.class, new ColorAdapter());
		builder.registerTypeAdapter(Dimension.class, new DimensionAdapter());
		return builder.create();
	}

	public SubredditSettings getSettings() throws IOException, InterruptedException, PermissionException {
		Connection conn = Jsoup.connect(Reddit4J.OAUTH_URL() + "/" + display_name_prefixed + "/about/edit");
		conn = client.authorize(conn).ignoreHttpErrors(true);
		Response rsp = client.getHttpClient().execute(conn);
		if (rsp.statusCode() == 404) {
			throw new PermissionException("You cannot edit the settings for " + display_name_prefixed + "!");
		}
		Gson gson = this.getGson();
		return gson.fromJson(rsp.body(), SubredditSettings.class);
	}

	public void setClient(Reddit4J client) {
		this.client = client;
	}

	public boolean doesAcceptFollowers() {
		return accept_followers;
	}

	public int getAccountsActive() {
		return accounts_active;
	}

	public boolean areAccountsActiveFuzzed() {
		return accounts_active_is_fuzzed;
	}

	public int getActiveUserCount() {
		return active_user_count;
	}

	public String getAdvertiserCategory() {
		return advertiser_category;
	}

	public boolean doesAllowDiscovery() {
		return allow_discovery;
	}

	public boolean doesAllowGalleries() {
		return allow_galleries;
	}

	public boolean doesAllowImages() {
		return allow_images;
	}

	public boolean doesAllowPolls() {
		return allow_polls;
	}

	public boolean doesAllowPredictions() {
		return allow_predictions;
	}

	public boolean doesAllowPredictionsTournament() {
		return allow_predictions_tournament;
	}

	public boolean doesAllowVideoGIFs() {
		return allow_videogifs;
	}

	public boolean doesAllowVideos() {
		return allow_videos;
	}

	public boolean isAllOriginalContent() {
		return all_original_content;
	}

	public Color getBannerBackgroundColor() {
		return banner_background_color;
	}

	public String getBannerBackgroundImage() {
		return banner_background_image;
	}

	public String getBannerImg() {
		return banner_img;
	}

	public Dimension getBannerSize() {
		return banner_size;
	}

	public boolean canAssignLinkFlair() {
		return can_assign_link_flair;
	}

	public boolean canAssignUserFlair() {
		return can_assign_user_flair;
	}

	public int getCoins() {
		return coins;
	}

	public boolean isCollapseDeletedComments() {
		return collapse_deleted_comments;
	}

	public boolean isCollectionsEnabled() {
		return collections_enabled;
	}

	public int getCommentScoreHideMins() {
		return comment_score_hide_mins;
	}

	public String getCommunityIcon() {
		return community_icon;
	}

	public boolean isCommunityReviewed() {
		return community_reviewed;
	}

	public long getCreated() {
		return created;
	}

	public long getCreatedUTC() {
		return created_utc;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptionHTML() {
		return description_html;
	}

	public boolean doesDisableContributorRequests() {
		return disable_contributor_requests;
	}

	public String getDisplayName() {
		return display_name;
	}

	public String getDisplayNamePrefixed() {
		return display_name_prefixed;
	}

	public Dimension getEmojisCustomSize() {
		return emojis_custom_size;
	}

	public boolean hasEmojisEnabled() {
		return emojis_enabled;
	}

	public boolean hasEventPostsEnabled() {
		return event_posts_enabled;
	}

	public boolean hasFreeFormReports() {
		return free_form_reports;
	}

	public boolean hasMenuWidget() {
		return has_menu_widget;
	}

	public String getHeaderImage() {
		return header_img;
	}

	public Dimension getHeaderSize() {
		return header_size;
	}

	public String getHeaderTitle() {
		return header_title;
	}

	public boolean doesHideAds() {
		return hide_ads;
	}

	public String getIconImage() {
		return icon_img;
	}

	public Dimension getIconSize() {
		return icon_size;
	}

	public boolean isCrosspostableSubreddit() {
		return is_crosspostable_subreddit;
	}

	public boolean isEnrolledInNewModmail() {
		return is_enrolled_in_new_modmail;
	}

	public Color getKeyColor() {
		return key_color;
	}

	public Language getLang() {
		return lang;
	}

	public boolean isLinkFlairEnabled() {
		return link_flair_enabled;
	}

	public String getLinkFlairPosition() {
		return link_flair_position;
	}

	public String getMobileBannerImage() {
		return mobile_banner_image;
	}

	public String getFullName() {
		return name;
	}

	public String getNotificationLevel() {
		return notification_level;
	}

	public boolean isOriginalContentTag_Enabled() {
		return original_content_tag_enabled;
	}

	public boolean isOver18() {
		return over18;
	}

	public String getPredictionLeaderboardEntryType() {
		return prediction_leaderboard_entry_type;
	}

	public Color getPrimaryColor() {
		return primary_color;
	}

	public String getPublicDescription() {
		return public_description;
	}

	public String getPublicDescriptionHtml() {
		return public_description_html;
	}

	public boolean isPublicTraffic() {
		return public_traffic;
	}

	public boolean isQuarantine() {
		return quarantine;
	}

	public boolean isRestrictCommenting() {
		return restrict_commenting;
	}

	public boolean isRestrictPosting() {
		return restrict_posting;
	}

	public boolean doesShowMedia() {
		return show_media;
	}

	public boolean doesShowMediaPreview() {
		return show_media_preview;
	}

	public boolean hasSpoilersEnabled() {
		return spoilers_enabled;
	}

	public String getSubmissionType() {
		return submission_type;
	}

	public String getSubmitLinkLabel() {
		return submit_link_label;
	}

	public String getSubmitText() {
		return submit_text;
	}

	public String getSubmitTextHtml() {
		return submit_text_html;
	}

	public String getSubmitTextLabel() {
		return submit_text_label;
	}

	public String getSubredditType() {
		return subreddit_type;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public String getSuggestedCommentSort() {
		return suggested_comment_sort;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public boolean canUserFlairInSubreddit() {
		return user_can_flair_in_sr;
	}

	public Color getUserFlairBackgroundColor() {
		return user_flair_background_color;
	}

	public String getUserFlairCSSClass() {
		return user_flair_css_class;
	}

	public boolean isUserFlairEnabledInSubreddit() {
		return user_flair_enabled_in_sr;
	}

	public String getUserFlairPosition() {
		return user_flair_position;
	}

	public Object getUserFlairRichtext() {
		return user_flair_richtext;
	}

	public String getUserFlairTemplateId() {
		return user_flair_template_id;
	}

	public String getUserFlairText() {
		return user_flair_text;
	}

	public String getUserFlairTextColor() {
		return user_flair_text_color;
	}

	public String getUserFlairType() {
		return user_flair_type;
	}

	public boolean hasUserFavorited() {
		return user_has_favorited;
	}

	public boolean isUserBanned() {
		return user_is_banned;
	}

	public boolean isUserContributor() {
		return user_is_contributor;
	}

	public boolean isUserModerator() {
		return user_is_moderator;
	}

	public boolean isUserMuted() {
		return user_is_muted;
	}

	public boolean isUserSubscriber() {
		return user_is_subscriber;
	}

	public boolean isUserSubredditFlairEnabled() {
		return user_sr_flair_enabled;
	}

	public boolean isUserSubredditThemeEnabled() {
		return user_sr_theme_enabled;
	}

	public int getVideostreamLinksCount() {
		return videostream_links_count;
	}

	public String getWhitelistStatus() {
		return whitelist_status;
	}

	public boolean isWikiEnabled() {
		return wiki_enabled;
	}

	public int getNumericWhitelistStatus() {
		return wls;
	}
}
