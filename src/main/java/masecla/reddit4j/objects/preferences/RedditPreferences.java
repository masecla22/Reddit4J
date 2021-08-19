package masecla.reddit4j.objects.preferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.RedditObject;
import masecla.reddit4j.objects.preferences.enums.BadCommentAutocollapse;
import masecla.reddit4j.objects.preferences.enums.CountryCode;
import masecla.reddit4j.objects.preferences.enums.DefaultCommentSort;
import masecla.reddit4j.objects.preferences.enums.Language;
import masecla.reddit4j.objects.preferences.enums.MediaStyle;
import masecla.reddit4j.objects.preferences.enums.PrivateMessagePolicy;

public class RedditPreferences extends RedditObject {
	private PrivateMessagePolicy accept_pms;
	private boolean activity_relevant_ads;
	private boolean allow_clicktracking;
	private BadCommentAutocollapse bad_comment_autocollapse;
	private boolean beta;
	private boolean clickgadget;
	private boolean collapse_left_bar;
	private boolean collapse_read_messages;
	private boolean compress;
	private CountryCode country_code;
	private DefaultCommentSort default_comment_sort;
	private boolean design_beta;
	private boolean domain_details;
	private boolean email_chat_request;
	private boolean email_comment_reply;
	private boolean email_community_discovery;
	private boolean email_digests;
	private boolean email_messages;
	private boolean email_post_reply;
	private boolean email_private_message;
	private boolean email_unsubscribe_all;
	private boolean email_upvote_comment;
	private boolean email_upvote_post;
	private boolean email_username_mention;
	private boolean email_user_new_follower;
	private boolean enable_default_themes;
	private boolean enable_followers;
	private boolean feed_recommendations_enabled;
	private boolean hide_ads;
	private boolean hide_downs;
	private boolean hide_from_robots;
	private boolean hide_ups;
	private boolean highlight_controversial;
	private boolean highlight_new_comments;
	private boolean ignore_suggested_sort;
	private boolean label_nsfw;
	private Language lang;
	private boolean legacy_search;
	private boolean live_orangereds;
	private boolean mark_messages_read;
	private MediaStyle media;
	private MediaStyle media_preview;
	private int min_comment_score;
	private int min_link_score;
	private boolean monitor_mentions;
	private boolean newwindow;
	private boolean nightmode;
	private boolean no_profanity;
	private int numsites;
	private int num_comments;
	private boolean over_18;
	private boolean private_feeds;
	private boolean profile_opt_out;
	private boolean public_server_seconds;
	private boolean public_votes;
	private boolean research;
	private boolean search_include_over_18;
	private boolean send_crosspost_messages;
	private boolean send_welcome_messages;
	private boolean show_flair;
	private boolean show_gold_expiration;
	private boolean show_link_flair;
	private boolean show_location_based_recommendations;
	private boolean show_presence;
	private boolean show_snoovatar;
	private boolean show_stylesheets;
	private boolean show_trending;
	private boolean show_twitter;
	private boolean store_visits;
	private long survey_last_seen_time;
	private boolean third_party_data_personalized_ads;
	private boolean third_party_personalized_ads;
	private boolean third_party_site_data_personalized_ads;
	private boolean third_party_site_data_personalized_content;
	private boolean threaded_messages;
	private boolean threaded_modmail;
	private boolean top_karma_subreddits;
	private boolean use_global_defaults;
	private boolean video_autoplay;

	private transient Reddit4J client;

	public PrivateMessagePolicy getPrivateMessagePolicy() {
		return accept_pms;
	}

	public PrivateMessagePolicy getAcceptMessages() {
		return accept_pms;
	}

	public boolean hasActivityRelevantAds() {
		return activity_relevant_ads;
	}

	public boolean doesAllowClickTracking() {
		return allow_clicktracking;
	}

	public BadCommentAutocollapse getBadCommentAutocollapse() {
		return bad_comment_autocollapse;
	}

	public boolean isBeta() {
		return beta;
	}

	public boolean isClickgadget() {
		return clickgadget;
	}

	public boolean doesCollapseLeftBar() {
		return collapse_left_bar;
	}

	public boolean doesCollapseReadMessages() {
		return collapse_read_messages;
	}

	public boolean isCompress() {
		return compress;
	}

	public CountryCode getCountryCode() {
		return country_code;
	}

	public DefaultCommentSort getDefaultCommentSort() {
		return default_comment_sort;
	}

	public boolean isDesignBeta() {
		return design_beta;
	}

	public boolean isDomainDetails() {
		return domain_details;
	}

	public boolean isEmailChatRequest() {
		return email_chat_request;
	}

	public boolean isEmailCommentReply() {
		return email_comment_reply;
	}

	public boolean isEmailCommunityDiscovery() {
		return email_community_discovery;
	}

	public boolean isEmailDigests() {
		return email_digests;
	}

	public boolean isEmailMessages() {
		return email_messages;
	}

	public boolean isEmailPostReply() {
		return email_post_reply;
	}

	public boolean isEmailPrivateMessage() {
		return email_private_message;
	}

	public boolean isEmailUnsubscribeAll() {
		return email_unsubscribe_all;
	}

	public boolean isEmailUpvoteComment() {
		return email_upvote_comment;
	}

	public boolean isEmailUpvotePost() {
		return email_upvote_post;
	}

	public boolean isEmailUsernameMention() {
		return email_username_mention;
	}

	public boolean isEmailUserNewFollower() {
		return email_user_new_follower;
	}

	public boolean hasEnableDefaultThemes() {
		return enable_default_themes;
	}

	public boolean hasEnableFollowers() {
		return enable_followers;
	}

	public boolean hasFeedRecommendationsEnabled() {
		return feed_recommendations_enabled;
	}

	public boolean doesHideAds() {
		return hide_ads;
	}

	public boolean doesHideDowns() {
		return hide_downs;
	}

	public boolean doesHideFromRobots() {
		return hide_from_robots;
	}

	public boolean doesHideUps() {
		return hide_ups;
	}

	public boolean doesHighlightControversial() {
		return highlight_controversial;
	}

	public boolean doesHighlightNewComments() {
		return highlight_new_comments;
	}

	public boolean doesIgnoreSuggestedSort() {
		return ignore_suggested_sort;
	}

	public boolean doesLabelNSFW() {
		return label_nsfw;
	}

	public Language getLanguage() {
		return lang;
	}

	public boolean usesLegacySearch() {
		return legacy_search;
	}

	public boolean isLiveOrangereds() {
		return live_orangereds;
	}

	public boolean doesMarkMessagesRead() {
		return mark_messages_read;
	}

	public MediaStyle getMediaStyle() {
		return media;
	}

	public MediaStyle getMediaPreviewStyle() {
		return media_preview;
	}

	public int getMinimumCommentScore() {
		return min_comment_score;
	}

	public int getMinimumLinkScore() {
		return min_link_score;
	}

	public boolean doesMonitorMentions() {
		return monitor_mentions;
	}

	public boolean isNewWindow() {
		return newwindow;
	}

	public boolean isNightMode() {
		return nightmode;
	}

	public boolean isNoProfanity() {
		return no_profanity;
	}

	public int getNumberOfSites() {
		return numsites;
	}

	public int getNumberOfComments() {
		return num_comments;
	}

	public boolean isOver18() {
		return over_18;
	}

	public boolean hasPrivateFeeds() {
		return private_feeds;
	}

	public boolean isProfileOptOut() {
		return profile_opt_out;
	}

	public boolean isPublicServerSeconds() {
		return public_server_seconds;
	}

	public boolean hasPublicVotes() {
		return public_votes;
	}

	public boolean doesResearch() {
		return research;
	}

	public boolean hasSearchIncludeOver18() {
		return search_include_over_18;
	}

	public boolean doesSendCrosspostMessages() {
		return send_crosspost_messages;
	}

	public boolean doesSendWelcomeMessages() {
		return send_welcome_messages;
	}

	public boolean doesShowFlair() {
		return show_flair;
	}

	public boolean doesShowGoldExpiration() {
		return show_gold_expiration;
	}

	public boolean doesShowLinkFlair() {
		return show_link_flair;
	}

	public boolean doesShowLocationBasedRecommendations() {
		return show_location_based_recommendations;
	}

	public boolean doesShowPresence() {
		return show_presence;
	}

	public boolean doesShowSnoovatar() {
		return show_snoovatar;
	}

	public boolean doesShowStylesheets() {
		return show_stylesheets;
	}

	public boolean doesShowTrending() {
		return show_trending;
	}

	public boolean doesShowTwitter() {
		return show_twitter;
	}

	public boolean hasStoreVisits() {
		return store_visits;
	}

	public long getSurveyLastSeenTime() {
		return survey_last_seen_time;
	}

	public boolean isThirdPartyDataPersonalizedAds() {
		return third_party_data_personalized_ads;
	}

	public boolean isThirdPartyPersonalizedAds() {
		return third_party_personalized_ads;
	}

	public boolean isThirdPartySiteDataPersonalizedAds() {
		return third_party_site_data_personalized_ads;
	}

	public boolean hasThirdPartySiteDataPersonalizedContent() {
		return third_party_site_data_personalized_content;
	}

	public boolean hasThreadedMessages() {
		return threaded_messages;
	}

	public boolean hasThreaded_modmail() {
		return threaded_modmail;
	}

	public boolean hasTopKarmaSubreddits() {
		return top_karma_subreddits;
	}

	public boolean doesUseGlobalDefaults() {
		return use_global_defaults;
	}

	public boolean doesVideoAutoplay() {
		return video_autoplay;
	}

	public Reddit4J getClient() {
		return client;
	}

	public void setClient(Reddit4J client) {
		this.client = client;
	}

	public Gson getGson() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(MediaStyle.class, MediaStyle.getAdapter());
		builder.registerTypeAdapter(PrivateMessagePolicy.class, PrivateMessagePolicy.getAdapter());
		builder.registerTypeAdapter(CountryCode.class, CountryCode.getAdapter());
		builder.registerTypeAdapter(Language.class, Language.getAdapter());
		builder.registerTypeAdapter(DefaultCommentSort.class, DefaultCommentSort.getAdapter());
		builder.registerTypeAdapter(BadCommentAutocollapse.class, BadCommentAutocollapse.getAdapter());
		Gson gson = builder.create();
		return gson;
	}

}
