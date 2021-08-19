package masecla.reddit4j.requests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;

import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.objects.preferences.RedditPreferences;
import masecla.reddit4j.objects.preferences.enums.BadCommentAutocollapse;
import masecla.reddit4j.objects.preferences.enums.CountryCode;
import masecla.reddit4j.objects.preferences.enums.DefaultCommentSort;
import masecla.reddit4j.objects.preferences.enums.Language;
import masecla.reddit4j.objects.preferences.enums.MediaStyle;
import masecla.reddit4j.objects.preferences.enums.PrivateMessagePolicy;

public class RedditPreferencesUpdateRequest {
	private Map<String, Object> modifiedValues = new HashMap<>();

	private Reddit4J client;

	public RedditPreferencesUpdateRequest(Reddit4J client) {
		super();
		this.client = client;
	}

	public void execute() throws IOException, InterruptedException {
		Connection conn = client.authorize(Jsoup.connect(Reddit4J.OAUTH_URL() + "/api/v1/me/prefs"))
				.method(Method.PATCH).ignoreHttpErrors(true).data("raw_json", "1");
		String jsonSent = new RedditPreferences().getGson().toJson(modifiedValues);
		conn.data("json", jsonSent);
		client.getHttpClient().execute(conn);
	}

	public RedditPreferencesUpdateRequest setPrivateMessagePolicy(PrivateMessagePolicy policy) {
		modifiedValues.put("accept_pms", policy.toString().toLowerCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setBadCommentAutocollapse(BadCommentAutocollapse badCommentAutocollapse) {
		modifiedValues.put("bad_comment_autocollapse", badCommentAutocollapse.toString().toLowerCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setCountryCode(CountryCode countryCode) {
		modifiedValues.put("country_code", countryCode.getCode().toUpperCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setDefaultCommentSort(DefaultCommentSort defaultCommentSort) {
		modifiedValues.put("default_comment_sort", defaultCommentSort.toString().toLowerCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setMediaStyle(MediaStyle style) {
		modifiedValues.put("media", style.toString().toLowerCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setMediaPreviewStyle(MediaStyle style) {
		modifiedValues.put("media_preview", style.toString().toLowerCase());
		return this;
	}

	public RedditPreferencesUpdateRequest setLanguage(Language language) {
		modifiedValues.put("lang", language.getCode());
		return this;
	}

	public RedditPreferencesUpdateRequest setSurveyLastSeenTime(long time) {
		modifiedValues.put("survey_last_seen_time", time);
		return this;
	}

	public RedditPreferencesUpdateRequest setNumberOfSites(int numberOfSites) {
		if (numberOfSites < 1 || numberOfSites > 100)
			throw new IllegalArgumentException("numberOfSites must be between 1 and 100!");
		modifiedValues.put("numsites", numberOfSites);
		return this;
	}

	public RedditPreferencesUpdateRequest setNumberOfComments(int numberOfComments) {
		if (numberOfComments < 1 || numberOfComments > 500)
			throw new IllegalArgumentException("numberOfComments must be between 1 and 500!");
		modifiedValues.put("num_comments", numberOfComments);
		return this;
	}

	public RedditPreferencesUpdateRequest setMinimumCommentScore(int minimumCommentScore) {
		if (minimumCommentScore < -100 || minimumCommentScore > 100)
			throw new IllegalArgumentException("minimumCommentScore must be between -100 and 100!");
		modifiedValues.put("min_comment_score", minimumCommentScore);
		return this;
	}

	public RedditPreferencesUpdateRequest setMinimumLinkScore(int minimumLinkScore) {
		if (minimumLinkScore < -100 || minimumLinkScore > 100)
			throw new IllegalArgumentException("minimumLinkScore must be between -100 and 100!");
		modifiedValues.put("min_link_score", minimumLinkScore);
		return this;
	}

	public RedditPreferencesUpdateRequest setActivityRelevantAds(boolean activityRelevantAds) {
		modifiedValues.put("activity_relevant_ads", activityRelevantAds);
		return this;
	}

	public RedditPreferencesUpdateRequest setAllowClicktracking(boolean allowClicktracking) {
		modifiedValues.put("allow_clicktracking", allowClicktracking);
		return this;
	}

	public RedditPreferencesUpdateRequest setBeta(boolean beta) {
		modifiedValues.put("beta", beta);
		return this;
	}

	public RedditPreferencesUpdateRequest setClickgadget(boolean clickgadget) {
		modifiedValues.put("clickgadget", clickgadget);
		return this;
	}

	public RedditPreferencesUpdateRequest setCollapseReadMessages(boolean collapseReadMessages) {
		modifiedValues.put("collapse_read_messages", collapseReadMessages);
		return this;
	}

	public RedditPreferencesUpdateRequest setCompress(boolean compress) {
		modifiedValues.put("compress", compress);
		return this;
	}

	public RedditPreferencesUpdateRequest setCredditAutorenew(boolean credditAutorenew) {
		modifiedValues.put("creddit_autorenew", credditAutorenew);
		return this;
	}

	public RedditPreferencesUpdateRequest setDomainDetails(boolean domainDetails) {
		modifiedValues.put("domain_details", domainDetails);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailChatRequest(boolean emailChatRequest) {
		modifiedValues.put("email_chat_request", emailChatRequest);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailCommentReply(boolean emailCommentReply) {
		modifiedValues.put("email_comment_reply", emailCommentReply);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailCommunityDiscovery(boolean emailCommunityDiscovery) {
		modifiedValues.put("email_community_discovery", emailCommunityDiscovery);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailDigests(boolean emailDigests) {
		modifiedValues.put("email_digests", emailDigests);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailMessages(boolean emailMessages) {
		modifiedValues.put("email_messages", emailMessages);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailPostReply(boolean emailPostReply) {
		modifiedValues.put("email_post_reply", emailPostReply);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailPrivateMessage(boolean emailPrivateMessage) {
		modifiedValues.put("email_private_message", emailPrivateMessage);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailUnsubscribeAll(boolean emailUnsubscribeAll) {
		modifiedValues.put("email_unsubscribe_all", emailUnsubscribeAll);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailUpvoteComment(boolean emailUpvoteComment) {
		modifiedValues.put("email_upvote_comment", emailUpvoteComment);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailUpvotePost(boolean emailUpvotePost) {
		modifiedValues.put("email_upvote_post", emailUpvotePost);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailUserNewFollower(boolean emailUserNewFollower) {
		modifiedValues.put("email_user_new_follower", emailUserNewFollower);
		return this;
	}

	public RedditPreferencesUpdateRequest setEmailUsernameMention(boolean emailUsernameMention) {
		modifiedValues.put("email_username_mention", emailUsernameMention);
		return this;
	}

	public RedditPreferencesUpdateRequest setEnableDefaultThemes(boolean enableDefaultThemes) {
		modifiedValues.put("enable_default_themes", enableDefaultThemes);
		return this;
	}

	public RedditPreferencesUpdateRequest setEnableFollowers(boolean enableFollowers) {
		modifiedValues.put("enable_followers", enableFollowers);
		return this;
	}

	public RedditPreferencesUpdateRequest setFeedRecommendationsEnabled(boolean feedRecommendationsEnabled) {
		modifiedValues.put("feed_recommendations_enabled", feedRecommendationsEnabled);
		return this;
	}

	public RedditPreferencesUpdateRequest setHideAds(boolean hideAds) {
		modifiedValues.put("hide_ads", hideAds);
		return this;
	}

	public RedditPreferencesUpdateRequest setHideDowns(boolean hideDowns) {
		modifiedValues.put("hide_downs", hideDowns);
		return this;
	}

	public RedditPreferencesUpdateRequest setHideFromRobots(boolean hideFromRobots) {
		modifiedValues.put("hide_from_robots", hideFromRobots);
		return this;
	}

	public RedditPreferencesUpdateRequest setHideUps(boolean hideUps) {
		modifiedValues.put("hide_ups", hideUps);
		return this;
	}

	public RedditPreferencesUpdateRequest setHighlightControversial(boolean highlightControversial) {
		modifiedValues.put("highlight_controversial", highlightControversial);
		return this;
	}

	public RedditPreferencesUpdateRequest setHighlightNewComments(boolean highlightNewComments) {
		modifiedValues.put("highlight_new_comments", highlightNewComments);
		return this;
	}

	public RedditPreferencesUpdateRequest setIgnoreSuggestedSort(boolean ignoreSuggestedSort) {
		modifiedValues.put("ignore_suggested_sort", ignoreSuggestedSort);
		return this;
	}

	public RedditPreferencesUpdateRequest setInRedesignBeta(boolean inRedesignBeta) {
		modifiedValues.put("in_redesign_beta", inRedesignBeta);
		return this;
	}

	public RedditPreferencesUpdateRequest setLabelNsfw(boolean labelNsfw) {
		modifiedValues.put("label_nsfw", labelNsfw);
		return this;
	}

	public RedditPreferencesUpdateRequest setLegacySearch(boolean legacySearch) {
		modifiedValues.put("legacy_search", legacySearch);
		return this;
	}

	public RedditPreferencesUpdateRequest setLiveOrangereds(boolean liveOrangereds) {
		modifiedValues.put("live_orangereds", liveOrangereds);
		return this;
	}

	public RedditPreferencesUpdateRequest setMarkMessagesRead(boolean markMessagesRead) {
		modifiedValues.put("mark_messages_read", markMessagesRead);
		return this;
	}

	public RedditPreferencesUpdateRequest setMonitorMentions(boolean monitorMentions) {
		modifiedValues.put("monitor_mentions", monitorMentions);
		return this;
	}

	public RedditPreferencesUpdateRequest setNewwindow(boolean newwindow) {
		modifiedValues.put("newwindow", newwindow);
		return this;
	}

	public RedditPreferencesUpdateRequest setNightmode(boolean nightmode) {
		modifiedValues.put("nightmode", nightmode);
		return this;
	}

	public RedditPreferencesUpdateRequest setNoProfanity(boolean noProfanity) {
		modifiedValues.put("no_profanity", noProfanity);
		return this;
	}

	public RedditPreferencesUpdateRequest setOrganic(boolean organic) {
		modifiedValues.put("organic", organic);
		return this;
	}

	public RedditPreferencesUpdateRequest setOver18(boolean over18) {
		modifiedValues.put("over_18", over18);
		return this;
	}

	public RedditPreferencesUpdateRequest setPrivateFeeds(boolean privateFeeds) {
		modifiedValues.put("private_feeds", privateFeeds);
		return this;
	}

	public RedditPreferencesUpdateRequest setProfileOptOut(boolean profileOptOut) {
		modifiedValues.put("profile_opt_out", profileOptOut);
		return this;
	}

	public RedditPreferencesUpdateRequest setPublicVotes(boolean publicVotes) {
		modifiedValues.put("public_votes", publicVotes);
		return this;
	}

	public RedditPreferencesUpdateRequest setResearch(boolean research) {
		modifiedValues.put("research", research);
		return this;
	}

	public RedditPreferencesUpdateRequest setSearchIncludeOver18(boolean searchIncludeOver18) {
		modifiedValues.put("search_include_over_18", searchIncludeOver18);
		return this;
	}

	public RedditPreferencesUpdateRequest setSendCrosspostMessages(boolean sendCrosspostMessages) {
		modifiedValues.put("send_crosspost_messages", sendCrosspostMessages);
		return this;
	}

	public RedditPreferencesUpdateRequest setSendWelcomeMessages(boolean sendWelcomeMessages) {
		modifiedValues.put("send_welcome_messages", sendWelcomeMessages);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowFlair(boolean showFlair) {
		modifiedValues.put("show_flair", showFlair);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowGoldExpiration(boolean showGoldExpiration) {
		modifiedValues.put("show_gold_expiration", showGoldExpiration);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowLinkFlair(boolean showLinkFlair) {
		modifiedValues.put("show_link_flair", showLinkFlair);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowLocationBasedRecommendations(
			boolean showLocationBasedRecommendations) {
		modifiedValues.put("show_location_based_recommendations", showLocationBasedRecommendations);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowPresence(boolean showPresence) {
		modifiedValues.put("show_presence", showPresence);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowPromote(boolean showPromote) {
		modifiedValues.put("show_promote", showPromote);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowStylesheets(boolean showStylesheets) {
		modifiedValues.put("show_stylesheets", showStylesheets);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowTrending(boolean showTrending) {
		modifiedValues.put("show_trending", showTrending);
		return this;
	}

	public RedditPreferencesUpdateRequest setShowTwitter(boolean showTwitter) {
		modifiedValues.put("show_twitter", showTwitter);
		return this;
	}

	public RedditPreferencesUpdateRequest setStoreVisits(boolean storeVisits) {
		modifiedValues.put("store_visits", storeVisits);
		return this;
	}

	public RedditPreferencesUpdateRequest setThirdPartyDataPersonalizedAds(boolean thirdPartyDataPersonalizedAds) {
		modifiedValues.put("third_party_data_personalized_ads", thirdPartyDataPersonalizedAds);
		return this;
	}

	public RedditPreferencesUpdateRequest setThirdPartyPersonalizedAds(boolean thirdPartyPersonalizedAds) {
		modifiedValues.put("third_party_personalized_ads", thirdPartyPersonalizedAds);
		return this;
	}

	public RedditPreferencesUpdateRequest setThirdPartySiteDataPersonalizedAds(
			boolean thirdPartySiteDataPersonalizedAds) {
		modifiedValues.put("third_party_site_data_personalized_ads", thirdPartySiteDataPersonalizedAds);
		return this;
	}

	public RedditPreferencesUpdateRequest setThirdPartySiteDataPersonalizedContent(
			boolean thirdPartySiteDataPersonalizedContent) {
		modifiedValues.put("third_party_site_data_personalized_content", thirdPartySiteDataPersonalizedContent);
		return this;
	}

	public RedditPreferencesUpdateRequest setThreadedMessages(boolean threadedMessages) {
		modifiedValues.put("threaded_messages", threadedMessages);
		return this;
	}

	public RedditPreferencesUpdateRequest setThreadedModmail(boolean threadedModmail) {
		modifiedValues.put("threaded_modmail", threadedModmail);
		return this;
	}

	public RedditPreferencesUpdateRequest setTopKarmaSubreddits(boolean topKarmaSubreddits) {
		modifiedValues.put("top_karma_subreddits", topKarmaSubreddits);
		return this;
	}

	public RedditPreferencesUpdateRequest setUseGlobalDefaults(boolean useGlobalDefaults) {
		modifiedValues.put("use_global_defaults", useGlobalDefaults);
		return this;
	}

	public RedditPreferencesUpdateRequest setVideoAutoplay(boolean videoAutoplay) {
		modifiedValues.put("video_autoplay", videoAutoplay);
		return this;
	}
}
