package masecla.reddit4j.objects.subreddit;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import lombok.Data;
import masecla.reddit4j.RedditUtils;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.exceptions.PermissionException;
import masecla.reddit4j.objects.KindObject;
import masecla.reddit4j.objects.RedditThing;
import masecla.reddit4j.objects.Sorting;
import masecla.reddit4j.objects.preferences.enums.Language;
import masecla.reddit4j.requests.CollectionCreationRequest;
import masecla.reddit4j.requests.SubredditPostListingEndpointRequest;

/**
 * Subreddit.
 * AKA t5
 */
@Data
@KindObject
public class RedditSubreddit extends RedditThing {
	@SerializedName("accept_followers")
	private boolean acceptFollowers;

	/**
	 * Accounts active in the last 15 minutes on the Subreddit.
	 * This number may be fuzzed.
	 */
	@SerializedName("accounts_active")
	private int accountsActive;

	/**
	 * If the accounts active is fuzzed to obscure the true number.
	 */
	@SerializedName("accounts_active_is_fuzzed")
	private boolean accountsActiveIsFuzzed;

	/**
	 * Duplicate of accounts_active.
	 * @see RedditSubreddit#accountsActive
	 */
	@SerializedName("active_user_count")
	private int activeUserCount;

	/**
	 * Advertising category the for the subreddit.
	 * E.g. "Automotive", "Games", "Sports", "Travel"
	 */
	@SerializedName("advertiser_category")
	private String advertiserCategory;

	/**
	 * Allow the subreddit to be shown to users through the discovery system.
	 * "Get recommended to individual redditors: Let Reddit recommend your community to people who have similar interests"
	 */
	@SerializedName("allow_discovery")
	private boolean allowDiscovery;

	/**
	 * If the Subreddit allows galleries.
	 * "Allow multiple images per post"
	 */
	@SerializedName("allow_galleries")
	private boolean allowGalleries;

	/**
	 * If the Subreddit allows images.
	 * "Allow image uploads and links to image hosting sites"
	 */
	@SerializedName("allow_images")
	private boolean allowImages;

	/**
	 * If the Subreddit allows polls.
	 * "Allow polls"
	 */
	@SerializedName("allow_polls")
	private boolean allowPolls;

	/**
	 * Allow predictions.
	 * "Allow predictions by mods in your community (only for public, SFW communities with 10k or more members)"
	 */
	@SerializedName("allow_predictions")
	private boolean allowPredictions;

	/**
	 * Unknown.
	 */
	@SerializedName("allow_talks")
	private boolean allowTalks;

	/**
	 * "Show up in high-traffic feeds. Allow your community to be in r/all, r/popular, and trending lists where it can be seen by the general Reddit population."
	 */
	@SerializedName("allow_top")
	private Boolean allowTop;

	@SerializedName("allow_predictions_tournament")
	private boolean allowPredictionsTournament;

	/**
	 * Unknown.
	 * Might be related to allowing animated GIFs
	 */
	@SerializedName("allow_videogifs")
	private boolean allowVideogifs;

	/**
	 * "allow video uploads"
	 */
	@SerializedName("allow_videos")
	private boolean allowVideos;

	/**
	 * "mark all posts in this subreddit as Original Content (OC) on the desktop redesign"
	 */
	@SerializedName("all_original_content")
	private boolean allOriginalContent;

	/**
	 * The color for the background banner, if set.
	 */
	@SerializedName("banner_background_color")
	private Color bannerBackgroundColor;

	/**
	 * The URL to the background banner image, if set.
	 */
	@SerializedName("banner_background_image")
	private String bannerBackgroundImage;

	/**
	 * The URL to the banner image, if set.
	 */
	@SerializedName("banner_img")
	private String bannerImg;

	/**
	 * The size of the banner image, if the banner image is set.
	 */
	@SerializedName("banner_size")
	private Dimension bannerSize;

	/**
	 * If the users can set the flair on their own links.
	 * Otherwise, it's a moderator action.
	 */
	@SerializedName("can_assign_link_flair")
	private boolean canAssignLinkFlair;

	/**
	 * If users are allowed to flair themselves.
	 * Otherwise, it's a moderator action.
	 */
	@SerializedName("can_assign_user_flair")
	private boolean canAssignUserFlair;

	/**
	 * The Community Awards Coin balance, visible to moderators of the Subreddit.
	 * Will appear as 0 if user is not a moderator of the Subreddit.
	 */
	private int coins;

	/**
	 * If the "Collapse deleted and removed comments" option is enabled on the Subreddit.
	 */
	@SerializedName("collapse_deleted_comments")
	private boolean collapseDeletedComments;

	/**
	 * If collections, a special aggregate kind of post, are enabled on the Subreddit.
	 */
	@SerializedName("collections_enabled")
	private boolean collectionsEnabled;

	/**
	 * "Minutes to hide comment scores"
	 */
	@SerializedName("comment_score_hide_mins")
	private int commentScoreHideMins;

	/**
	 * The URL to the community icon image, if set.
	 */
	@SerializedName("community_icon")
	private String communityIcon;

	/**
	 * Influences the "Continue in app / go back to r/popular" message
	 */
	@SerializedName("community_reviewed")
	private boolean communityReviewed;

	/**
	 * The time the Subreddit was created as a Unix timestamp.
	 */
	private long created;

	/**
	 * The time the Subreddit was created in UTC.
	 */
	@SerializedName("created_utc")
	private long createdUtc;

	/**
	 * Subreddit sidebar description.
	 * "shown in the sidebar of your subreddit. 10240 characters max."
	 */
	private String description;

	/**
	 * Subreddit sidebar description in HTML.
	 */
	@SerializedName("description_html")
	private String descriptionHtml;

	/**
	 * "Accepting new requests to post"
	 */
	@SerializedName("disable_contributor_requests")
	private boolean disableContributorRequests;

	/**
	 * The display name of the Subreddit.
	 */
	@SerializedName("display_name")
	private String displayName;

	/**
	 * The display name of the Subreddit, including the r/ prefix.
	 */
	@SerializedName("display_name_prefixed")
	private String displayNamePrefixed;

	/**
	 * "Enables emojis to be displayed at custom sizes for user flair in comments. Emojis will be displayed 16 x 16px everywhere else."
	 * Between 16px and 40px.
	 */
	@SerializedName("emojis_custom_size")
	private Dimension emojisCustomSize;

	/**
	 * If emojis are enabled in the Subreddit.
	 * "Allow emojis to be used in post and user flair within your community"
	 */
	@SerializedName("emojis_enabled")
	private boolean emojisEnabled;

	@SerializedName("event_posts_enabled")
	private boolean eventPostsEnabled;

	/**
	 * If free form reports are allowed, otherwise users pick from a list of reporting options.
	 * "Allow free-form reports by users"
	 */
	@SerializedName("free_form_reports")
	private boolean freeFormReports;

	/**
	 * If there are custom menu tabs in the sidebar of the new UI.
	 */
	@SerializedName("has_menu_widget")
	private boolean hasMenuWidget;

	/**
	 * URL to the header image.
	 * Replaces the default Snoo in the old web interface.
	 */
	@SerializedName("header_img")
	private String headerImg;

	/**
	 * The size of the header image.
	 */
	@SerializedName("header_size")
	private Dimension headerSize;

	/**
	 * Header image alt-text.
	 * "header mouseover text"
	 */
	@SerializedName("header_title")
	private String headerTitle;

	/**
	 * If advertisements have been hidden by the Admins for the Subreddit.
	 */
	@SerializedName("hide_ads")
	private boolean hideAds;

	/**
	 * Mobile icon URL.
	 */
	@SerializedName("icon_img")
	private String iconImg;

	/**
	 * Mobile icon size.
	 * Size of icon_img. Will be null if no icon_img.
	 */
	@SerializedName("icon_size")
	private Dimension iconSize;

	/**
	 * If crossposting is enabled.
	 * "Allow crossposting of posts"
	 * Null if user is not moderator.
	 */
	@SerializedName("is_crosspostable_subreddit")
	private Boolean isCrosspostableSubreddit;

	/**
	 * If the subreddit is using the new modmail interface.
	 * Current user must be a moderator of the Subreddit to view this property.
	 * Null if user is not moderator.
	 */
	@SerializedName("is_enrolled_in_new_modmail")
	private Boolean isEnrolledInNewModmail;

	/**
	 * The general color of the Subreddits theme.
	 * "Used as a thematic color for your subreddit on mobile"
	 */
	@SerializedName("key_color")
	private Color keyColor;

	/**
	 * The language set for the Subreddit.
	 * "Adding a location helps your community show up in seach results and recommendations and helps local redditors find it easier."
	 */
	private Language lang;

	@SerializedName("link_flair_enabled")
	private boolean linkFlairEnabled;

	/**
	 * The position of the link flair text.
	 * One of "left", "right" or empty
	 */
	@SerializedName("link_flair_position")
	private String linkFlairPosition;

	/**
	 * URL to the mobile banner image.
	 */
	@SerializedName("mobile_banner_image")
	private String mobileBannerImage;

	/**
	 * The fullname identifier of the subreddit.
	 * e.g. t5_3cb2g
	 */
	@SerializedName("name")
	private String fullName;

	/**
	 * Unknown.
	 */
	@SerializedName("notification_level")
	private String notificationLevel;

	/**
	 * "enable marking posts as Original Content (OC) on the desktop redesign"
	 */
	@SerializedName("original_content_tag_enabled")
	private boolean originalContentTagEnabled;

	/**
	 * "When your community is marked as an 18+ community, users must be flagged as 18+ in their user settings"
	 */
	private boolean over18;

	@SerializedName("prediction_leaderboard_entry_type")
	private String predictionLeaderboardEntryType;
	@SerializedName("primary_color")
	private Color primaryColor;

	/**
	 * Description of the Subreddit, in plaintext.
	 * "Appears in search results and social media links. 500 characters max."
	 * "This is how new members come to understand your community."
	 */
	@SerializedName("public_description")
	private String publicDescription;

	/**
	 * Description of the Subreddit, in HTML
	 */
	@SerializedName("public_description_html")
	private String publicDescriptionHtml;

	/**
	 * If this subreddit shows its traffic statistics to the public.
	 */
	@SerializedName("public_traffic")
	private boolean publicTraffic;

	/**
	 * If the Subreddit is quarantined.
	 */
	private boolean quarantine;

	@SerializedName("restrict_commenting")
	private boolean restrictCommenting;

	@SerializedName("restrict_posting")
	private boolean restrictPosting;

	/**
	 * "Show thumbnail images of content"
	 */
	@SerializedName("show_media")
	private boolean showMedia;

	/**
	 * "Expand media previews on comments pages"
	 */
	@SerializedName("show_media_preview")
	private boolean showMediaPreview;

	/**
	 * "enable marking posts as containing spoilers"
	 * "Enable spoiler tag. Media on posts with the spoiler tag are blurred"
	 */
	@SerializedName("spoilers_enabled")
	private boolean spoilersEnabled;

	/**
	 * Types of links that can be submitted.
	 * One of:
	 * - any "Any post type is allowed"
	 * - link "Only links to external sites are allowed"
	 * - self "Only text posts are allowed"
	 */
	@SerializedName("submission_type")
	private String submissionType;

	/**
	 * "Custom label for submit link button"
	 */
	@SerializedName("submit_link_label")
	private String submitLinkLabel;

	/**
	 * Submission text.
	 * "Text to show on submission page. 1024 characters max."
	 */
	@SerializedName("submit_text")
	private String submitText;

	/**
	 * Submission text, HTML version.
	 */
	@SerializedName("submit_text_html")
	private String submitTextHtml;

	/**
	 * Submit button text.
	 * "Custom label for submit text post button"
	 */
	@SerializedName("submit_text_label")
	private String submitTextLabel;

	/**
	 * The type of Subreddit.
	 * One of:
	 *  - public "Anyone can view, post, and comment to this community"
	 *  - restricted "Anyone can view this community, but only approved users can post"
	 *  - private "Only approved users can view and submit to this community"
	 *  - gold_restricted "Only reddit premium members can view and submit"
	 *  - archived.
	 */
	@SerializedName("subreddit_type")
	private String subredditType;

	/**
	 * The number of subscribers to the Subreddit.
	 */
	private int subscribers;

	/**
	 * The suggested sort order of the Subreddit.
	 * "all comment threads will use this sorting method by default"
	 */
	@SerializedName("suggested_comment_sort")
	private String suggestedCommentSort; // This might be a DefaultCommentSort, need more research

	/**
	 * The title of the Subreddit.
	 */
	private String title;

	/**
	 * The relative url of the Subreddit.
	 */
	private String url;

	@SerializedName("user_can_flair_in_sr")
	private boolean userCanFlairInSr;

	/**
	 * The color of the current user's flair background color in this Subreddit.
	 */
	@SerializedName("user_flair_background_color")
	private Color userFlairBackgroundColor; // Color

	@SerializedName("user_flair_css_class")
	private String userFlairCssClass;

	/**
	 * If user flair is enabled in the Subreddit.
	 */
	@SerializedName("user_flair_enabled_in_sr")
	private boolean userFlairEnabledInSr;

	@SerializedName("user_flair_position")
	private String userFlairPosition;

	@SerializedName("user_flair_richtext")
	private UserFlairRichText userFlairRichtext;

	/**
	 * User flair template.
	 */
	@SerializedName("user_flair_template_id")
	private String userFlairTemplateId;

	/**
	 * User flair text.
	 */
	@SerializedName("user_flair_text")
	private String userFlairText;

	/**
	 * User flair color.
	 * Either "dark" or "light"
	 */
	@SerializedName("user_flair_text_color")
	private String userFlairTextColor;

	/**
	 * User flair type.
	 */
	@SerializedName("user_flair_type")
	private String userFlairType;

	/**
	 * If the user has favorited the subreddit.
	 */
	@SerializedName("user_has_favorited")
	private boolean userHasFavorited;

	/**
	 * If the user is banned from the Subreddit.
	 */
	@SerializedName("user_is_banned")
	private boolean userIsBanned;

	/**
	 * If the user is an approved user of the Subreddit.
	 */
	@SerializedName("user_is_contributor")
	private boolean userIsContributor;

	/**
	 * If the user is a moderator of the Subreddit.
	 */
	@SerializedName("user_is_moderator")
	private boolean userIsModerator;

	/**
	 * If the user is muted in the Subreddit.
	 */
	@SerializedName("user_is_muted")
	private boolean userIsMuted;

	/**
	 * If the user is subscribed to the Subreddit.
	 */
	@SerializedName("user_is_subscriber")
	private boolean userIsSubscriber;

	/**
	 * If the current user has enabled their user flair to be displayed.
	 */
	@SerializedName("user_sr_flair_enabled")
	private boolean userSrFlairEnabled;

	/**
	 * If current user has enabled the Subreddit's Custom CSS / Community Theme
	 */
	@SerializedName("user_sr_theme_enabled")
	private boolean userSrThemeEnabled;

	/**
	 * Unknown.
	 */
	@SerializedName("videostream_links_count")
	private int videostreamLinksCount;

	/**
	 * Advertising whitelist status.
	 */
	@SerializedName("whitelist_status")
	private String whitelistStatus; // This will be replaced with an enum

	/**
	 * If the Subreddit Wiki is enabled.
	 */
	@SerializedName("wiki_enabled")
	private boolean wikiEnabled;

	/**
	 * Numeric Whitelist Status.
	 * @see #whitelistStatus
	 */
	private int wls;

	private transient Reddit4J client;

	public Reddit4J getClient() {
		return client;
	}

	public SubredditSettings getSettings() throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/" + this.displayNamePrefixed + "/about/edit");
		conn.ignoreHttpErrors(true);
		Response rsp = client.getHttpClient().execute(conn);
		if (rsp.statusCode() == 404) {
			throw new PermissionException("You cannot edit the settings for " + this.displayNamePrefixed + "!");
		}
		return RedditUtils.gson.fromJson(rsp.body(), SubredditSettings.class);
	}

	public List<SubredditCollection> getCollections() throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/api/v1/collections/subreddit_collections");
		conn.data("sr_fullname", this.getFullName());
		Response rsp = client.getHttpClient().execute(conn);
		Type type = TypeToken.getParameterized(List.class, SubredditCollection.class).getType();
		return RedditUtils.gson.fromJson(rsp.body(), type);
	}

	public SubredditCollection getCollection(UUID id, boolean includeLinks) throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/api/v1/collections/collection");
		conn.data("collection_id", id.toString()).data("include_links", includeLinks + "");
		Response rsp = client.getHttpClient().execute(conn);
		SubredditCollection result = RedditUtils.gson.fromJson(rsp.body(),
				SubredditCollection.class);
		result.setSubreddit(this);
		return result;
	}

	public SubredditCollection getCollection(UUID id) throws IOException, InterruptedException {
		return getCollection(id, true);
	}

	public void deleteCollection(UUID id) throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/api/v1/collections/delete_collection");
		conn.method(Method.POST);
		conn.data("collection_id", id.toString());
		Response rsp = client.getHttpClient().execute(conn);
		JsonArray array = JsonParser.parseString(rsp.body()).getAsJsonObject().getAsJsonObject("json")
				.getAsJsonArray("errors");
		if (array.size() != 0) {
			List<String> res = new ArrayList<>();
			array.forEach(c -> res.add(c.toString()));
			throw new IllegalStateException(String.join(", ", res));
		}
	}

	protected void setFollowCollection(UUID id, boolean follow) throws IOException, InterruptedException {
		Connection conn = client.useEndpoint("/api/v1/collections/follow_collection");
		conn = conn.method(Method.POST).ignoreHttpErrors(true);
		conn.data("collection_id", id.toString()).data("follow", follow + "");
		Response rsp = client.getHttpClient().execute(conn);
		if (rsp.statusCode() == 500) {
			throw new IllegalArgumentException("Collection " + id + " not found!");
		}
		JsonArray array = JsonParser.parseString(rsp.body()).getAsJsonObject().getAsJsonObject("json")
				.getAsJsonArray("errors");
		if (array.size() != 0) {
			List<String> res = new ArrayList<>();
			array.forEach(c -> res.add(c.toString()));
			throw new IllegalStateException(String.join(", ", res));
		}
	}

	public void followCollection(UUID id) throws IOException, InterruptedException {
		setFollowCollection(id, true);
	}

	public void unfollowCollection(UUID id) throws IOException, InterruptedException {
		setFollowCollection(id, false);
	}

	public CollectionCreationRequest createCollection() {
		return new CollectionCreationRequest(client, this);
	}

	public void setEmojisCustomSize(Dimension size) throws IOException, InterruptedException {
		Connection conn = this.client.useEndpoint("/api/v1/" + this.displayName + "/emoji_custom_size").method(Method.POST);
		if (size.width < 1 || size.width > 40)
			throw new IllegalArgumentException("Custom emoji width must be between 1 and 40!");
		if (size.height < 1 || size.height > 40)
			throw new IllegalArgumentException("Custom emoji height must be between 1 and 40!");

		conn.data("height", ((int) size.getHeight()) + "");
		conn.data("width", ((int) size.getWidth()) + "");
		this.emojisCustomSize = size;

		this.client.getHttpClient().execute(conn);
	}

	public List<SubredditEmoji> getSubredditEmojis() throws IOException, InterruptedException {
		Connection conn = this.client.useEndpoint("/api/v1/" + this.displayName + "/emojis/all");
		Response rsp = this.client.getHttpClient().execute(conn);
		JsonObject object = JsonParser.parseString(rsp.body()).getAsJsonObject();

		List<SubredditEmoji> subredditEmojis = new ArrayList<>();
		for (String emojiSetName : object.keySet()) {
			JsonObject emojiSet = object.getAsJsonObject(emojiSetName);
			boolean snoomojis = emojiSetName.equals("snoomojis");
			for (String currentName : emojiSet.keySet()) {
				SubredditEmoji currentEmoji = RedditUtils.gson.fromJson(emojiSet.getAsJsonObject(currentName),
						SubredditEmoji.class);
				currentEmoji.setSnoomoji(snoomojis);
				currentEmoji.setName(currentName);
				currentEmoji.setSubreddit(this);

				subredditEmojis.add(currentEmoji);
			}
		}
		return subredditEmojis;
	}

	/**
	 * https://www.reddit.com/dev/api/#GET_hot
	 */
	public SubredditPostListingEndpointRequest getHot() {
		return getListing(Sorting.HOT);
	}

	/**
	 * https://www.reddit.com/dev/api/#GET_new
	 */
	public SubredditPostListingEndpointRequest getNew() {
		return getListing(Sorting.NEW);
	}

	/**
	 * https://www.reddit.com/dev/api/#GET_rising
	 */
	public SubredditPostListingEndpointRequest getRising() {
		return getListing(Sorting.RISING);
	}

	/**
	 *
	 */
	public SubredditPostListingEndpointRequest getTop() {
		return getListing(Sorting.TOP);
	}

	/**
	 *
	 */
	public SubredditPostListingEndpointRequest getControversial() {
		return getListing(Sorting.CONTROVERSIAL);
	}


	/**
	 * https://www.reddit.com/dev/api/#GET_{sort}
	 */
	public SubredditPostListingEndpointRequest getListing(Sorting sorting) {
		return this.client.getSubredditPosts(this.displayName, sorting);
	}

	/**
	 * Subscribe to the subreddit
	 */
	public void subscribe() throws IOException, InterruptedException {
		this.client.subscribe(this.displayName);
	}

	/**
	 * Unsubscribe to the subreddit
	 */
	public void unsubscribe() throws IOException, InterruptedException {
		this.client.unsubscribe(this.displayName);
	}

	public void setClient(Reddit4J client) {
		this.client = client;
	}

	public int getNumericWhitelistStatus() {
		return wls;
	}
}
