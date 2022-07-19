package com.github.masecla.objects.reddit;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class PreferenceSettings {
    @SerializedName("beta")
    private boolean beta;

    @SerializedName("default_theme_sr")
    private JsonElement defaultThemeSr;

    @SerializedName("threaded_messages")
    private boolean threadedMessages;

    @SerializedName("email_comment_reply")
    private boolean emailCommentReply;

    @SerializedName("private_feeds")
    private boolean privateFeeds;

    @SerializedName("activity_relevant_ads")
    private boolean activityRelevantAds;

    @SerializedName("email_messages")
    private boolean emailMessages;

    @SerializedName("profile_opt_out")
    private boolean profileOptOut;

    @SerializedName("video_autoplay")
    private boolean videoAutoplay;

    @SerializedName("email_private_message")
    private boolean emailPrivateMessage;

    @SerializedName(value = "g", alternate = "geopopular")
    private Geopopular geopopular;

    @SerializedName("show_link_flair")
    private boolean showLinkFlair;

    @SerializedName("show_trending")
    private boolean showTrending;

    @SerializedName("send_welcome_messages")
    private boolean sendWelcomeMessages;

    @SerializedName("country_code")
    private CountryCode countryCode;

    @SerializedName("design_beta")
    private boolean designBeta;

    @SerializedName("monitor_mentions")
    private boolean monitorMentions;

    @SerializedName("hide_downs")
    private boolean hideDowns;

    @SerializedName("clickgadget")
    private boolean clickgadget;

    @SerializedName("lang")
    private String lang;

    @SerializedName("ignore_suggested_sort")
    private boolean ignoreSuggestedSort;

    @SerializedName("show_presence")
    private boolean showPresence;

    @SerializedName("email_upvote_comment")
    private boolean emailUpvoteComment;

    @SerializedName("email_digests")
    private boolean emailDigests;

    @SerializedName("layout")
    private String layout;

    @SerializedName("num_comments")
    private JsonElement numComments;

    @SerializedName("feed_recommendations_enabled")
    private boolean feedRecommendationsEnabled;

    @SerializedName("label_nsfw")
    private boolean labelNsfw;

    @SerializedName("research")
    private boolean research;

    @SerializedName("use_global_defaults")
    private boolean useGlobalDefaults;

    @SerializedName("show_snoovatar")
    private boolean showSnoovatar;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("legacy_search")
    private boolean legacySearch;

    @SerializedName("live_orangereds")
    private boolean liveOrangereds;

    @SerializedName("highlight_controversial")
    private boolean highlightControversial;

    @SerializedName("no_profanity")
    private boolean noProfanity;

    @SerializedName("domain_details")
    private boolean domainDetails;

    @SerializedName("collapse_left_bar")
    private boolean collapseLeftBar;

    @SerializedName("email_community_discovery")
    private boolean emailCommunityDiscovery;

    @SerializedName("bad_comment_autocollapse")
    private BadCommentAutocollapse badCommentAutocollapse;

    @SerializedName("hide_ups")
    private boolean hideUps;

    @SerializedName("third_party_data_personalized_ads")
    private boolean thirdPartyDataPersonalizedAds;

    @SerializedName("email_chat_request")
    private boolean emailChatRequest;

    @SerializedName("allow_clicktracking")
    private boolean allowClicktracking;

    @SerializedName("hide_from_robots")
    private boolean hideFromRobots;

    @SerializedName("show_twitter")
    private boolean showTwitter;

    @SerializedName("compress")
    private boolean compress;

    @SerializedName("accept_pms")
    private AcceptPms acceptPms;

    @SerializedName("store_visits")
    private boolean storeVisits;

    @SerializedName("threaded_modmail")
    private boolean threadedModmail;

    @SerializedName("email_upvote_post")
    private boolean emailUpvotePost;

    @SerializedName("min_link_score")
    private JsonElement minLinkScore;

    @SerializedName("media_preview")
    private Media mediaPreview;

    @SerializedName("email_user_new_follower")
    private boolean emailUserNewFollower;

    @SerializedName("nightmode")
    private boolean nightmode;

    @SerializedName("enable_default_themes")
    private boolean enableDefaultThemes;

    @SerializedName("third_party_site_data_personalized_content")
    private boolean thirdPartySiteDataPersonalizedContent;

    @SerializedName("third_party_site_data_personalized_ads")
    private boolean thirdPartySiteDataPersonalizedAds;

    @SerializedName("survey_last_seen_time")
    private JsonElement surveyLastSeenTime;

    @SerializedName("show_stylesheets")
    private boolean showStylesheets;

    @SerializedName("enable_followers")
    private boolean enableFollowers;

    @SerializedName("email_new_user_welcome")
    private boolean emailNewUserWelcome;

    @SerializedName("public_votes")
    private boolean publicVotes;

    @SerializedName("email_post_reply")
    private boolean emailPostReply;

    @SerializedName("collapse_read_messages")
    private boolean collapseReadMessages;

    @SerializedName("show_flair")
    private boolean showFlair;

    @SerializedName("mark_messages_read")
    private boolean markMessagesRead;

    @SerializedName("search_include_over_18")
    private boolean searchIncludeOver18;

    @SerializedName("hide_ads")
    private boolean hideAds;

    @SerializedName("third_party_personalized_ads")
    private boolean thirdPartyPersonalizedAds;

    @SerializedName("email_username_mention")
    private boolean emailUsernameMention;

    @SerializedName("top_karma_subreddits")
    private boolean topKarmaSubreddits;

    @SerializedName("newwindow")
    private boolean newwindow;

    @SerializedName("numsites")
    private JsonElement numsites;

    @SerializedName("min_comment_score")
    private JsonElement minCommentScore;

    @SerializedName("send_crosspost_messages")
    private boolean sendCrosspostMessages;

    @SerializedName("media")
    private Media media;

    @SerializedName("public_server_seconds")
    private boolean publicServerSeconds;

    @SerializedName("show_gold_expiration")
    private boolean showGoldExpiration;

    @SerializedName("highlight_new_comments")
    private boolean highlightNewComments;

    @SerializedName("email_unsubscribe_all")
    private boolean emailUnsubscribeAll;

    @SerializedName("default_comment_sort")
    private DefaultCommentSort defaultCommentSort;

    @SerializedName("show_location_based_recommendations")
    private boolean showLocationBasedRecommendations;

    public boolean isBeta() {
        return beta;
    }

    public void setBeta(boolean beta) {
        this.beta = beta;
    }

    public JsonElement getDefaultThemeSr() {
        return defaultThemeSr;
    }

    public void setDefaultThemeSr(JsonElement defaultThemeSr) {
        this.defaultThemeSr = defaultThemeSr;
    }

    public boolean isThreadedMessages() {
        return threadedMessages;
    }

    public void setThreadedMessages(boolean threadedMessages) {
        this.threadedMessages = threadedMessages;
    }

    public boolean isEmailCommentReply() {
        return emailCommentReply;
    }

    public void setEmailCommentReply(boolean emailCommentReply) {
        this.emailCommentReply = emailCommentReply;
    }

    public boolean isPrivateFeeds() {
        return privateFeeds;
    }

    public void setPrivateFeeds(boolean privateFeeds) {
        this.privateFeeds = privateFeeds;
    }

    public boolean isActivityRelevantAds() {
        return activityRelevantAds;
    }

    public void setActivityRelevantAds(boolean activityRelevantAds) {
        this.activityRelevantAds = activityRelevantAds;
    }

    public boolean isEmailMessages() {
        return emailMessages;
    }

    public void setEmailMessages(boolean emailMessages) {
        this.emailMessages = emailMessages;
    }

    public boolean isProfileOptOut() {
        return profileOptOut;
    }

    public void setProfileOptOut(boolean profileOptOut) {
        this.profileOptOut = profileOptOut;
    }

    public boolean isVideoAutoplay() {
        return videoAutoplay;
    }

    public void setVideoAutoplay(boolean videoAutoplay) {
        this.videoAutoplay = videoAutoplay;
    }

    public boolean isEmailPrivateMessage() {
        return emailPrivateMessage;
    }

    public void setEmailPrivateMessage(boolean emailPrivateMessage) {
        this.emailPrivateMessage = emailPrivateMessage;
    }

    public Geopopular getGeopopular() {
        return geopopular;
    }

    public void setGeopopular(Geopopular geopopular) {
        this.geopopular = geopopular;
    }

    public boolean isShowLinkFlair() {
        return showLinkFlair;
    }

    public void setShowLinkFlair(boolean showLinkFlair) {
        this.showLinkFlair = showLinkFlair;
    }

    public boolean isShowTrending() {
        return showTrending;
    }

    public void setShowTrending(boolean showTrending) {
        this.showTrending = showTrending;
    }

    public boolean isSendWelcomeMessages() {
        return sendWelcomeMessages;
    }

    public void setSendWelcomeMessages(boolean sendWelcomeMessages) {
        this.sendWelcomeMessages = sendWelcomeMessages;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isDesignBeta() {
        return designBeta;
    }

    public void setDesignBeta(boolean designBeta) {
        this.designBeta = designBeta;
    }

    public boolean isMonitorMentions() {
        return monitorMentions;
    }

    public void setMonitorMentions(boolean monitorMentions) {
        this.monitorMentions = monitorMentions;
    }

    public boolean isHideDowns() {
        return hideDowns;
    }

    public void setHideDowns(boolean hideDowns) {
        this.hideDowns = hideDowns;
    }

    public boolean isClickgadget() {
        return clickgadget;
    }

    public void setClickgadget(boolean clickgadget) {
        this.clickgadget = clickgadget;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isIgnoreSuggestedSort() {
        return ignoreSuggestedSort;
    }

    public void setIgnoreSuggestedSort(boolean ignoreSuggestedSort) {
        this.ignoreSuggestedSort = ignoreSuggestedSort;
    }

    public boolean isShowPresence() {
        return showPresence;
    }

    public void setShowPresence(boolean showPresence) {
        this.showPresence = showPresence;
    }

    public boolean isEmailUpvoteComment() {
        return emailUpvoteComment;
    }

    public void setEmailUpvoteComment(boolean emailUpvoteComment) {
        this.emailUpvoteComment = emailUpvoteComment;
    }

    public boolean isEmailDigests() {
        return emailDigests;
    }

    public void setEmailDigests(boolean emailDigests) {
        this.emailDigests = emailDigests;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public JsonElement getNumComments() {
        return numComments;
    }

    public void setNumComments(JsonElement numComments) {
        this.numComments = numComments;
    }

    public boolean isFeedRecommendationsEnabled() {
        return feedRecommendationsEnabled;
    }

    public void setFeedRecommendationsEnabled(boolean feedRecommendationsEnabled) {
        this.feedRecommendationsEnabled = feedRecommendationsEnabled;
    }

    public boolean isLabelNsfw() {
        return labelNsfw;
    }

    public void setLabelNsfw(boolean labelNsfw) {
        this.labelNsfw = labelNsfw;
    }

    public boolean isResearch() {
        return research;
    }

    public void setResearch(boolean research) {
        this.research = research;
    }

    public boolean isUseGlobalDefaults() {
        return useGlobalDefaults;
    }

    public void setUseGlobalDefaults(boolean useGlobalDefaults) {
        this.useGlobalDefaults = useGlobalDefaults;
    }

    public boolean isShowSnoovatar() {
        return showSnoovatar;
    }

    public void setShowSnoovatar(boolean showSnoovatar) {
        this.showSnoovatar = showSnoovatar;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public boolean isLegacySearch() {
        return legacySearch;
    }

    public void setLegacySearch(boolean legacySearch) {
        this.legacySearch = legacySearch;
    }

    public boolean isLiveOrangereds() {
        return liveOrangereds;
    }

    public void setLiveOrangereds(boolean liveOrangereds) {
        this.liveOrangereds = liveOrangereds;
    }

    public boolean isHighlightControversial() {
        return highlightControversial;
    }

    public void setHighlightControversial(boolean highlightControversial) {
        this.highlightControversial = highlightControversial;
    }

    public boolean isNoProfanity() {
        return noProfanity;
    }

    public void setNoProfanity(boolean noProfanity) {
        this.noProfanity = noProfanity;
    }

    public boolean isDomainDetails() {
        return domainDetails;
    }

    public void setDomainDetails(boolean domainDetails) {
        this.domainDetails = domainDetails;
    }

    public boolean isCollapseLeftBar() {
        return collapseLeftBar;
    }

    public void setCollapseLeftBar(boolean collapseLeftBar) {
        this.collapseLeftBar = collapseLeftBar;
    }

    public boolean isEmailCommunityDiscovery() {
        return emailCommunityDiscovery;
    }

    public void setEmailCommunityDiscovery(boolean emailCommunityDiscovery) {
        this.emailCommunityDiscovery = emailCommunityDiscovery;
    }

    public BadCommentAutocollapse getBadCommentAutocollapse() {
        return badCommentAutocollapse;
    }

    public void setBadCommentAutocollapse(BadCommentAutocollapse badCommentAutocollapse) {
        this.badCommentAutocollapse = badCommentAutocollapse;
    }

    public boolean isHideUps() {
        return hideUps;
    }

    public void setHideUps(boolean hideUps) {
        this.hideUps = hideUps;
    }

    public boolean isThirdPartyDataPersonalizedAds() {
        return thirdPartyDataPersonalizedAds;
    }

    public void setThirdPartyDataPersonalizedAds(boolean thirdPartyDataPersonalizedAds) {
        this.thirdPartyDataPersonalizedAds = thirdPartyDataPersonalizedAds;
    }

    public boolean isEmailChatRequest() {
        return emailChatRequest;
    }

    public void setEmailChatRequest(boolean emailChatRequest) {
        this.emailChatRequest = emailChatRequest;
    }

    public boolean isAllowClicktracking() {
        return allowClicktracking;
    }

    public void setAllowClicktracking(boolean allowClicktracking) {
        this.allowClicktracking = allowClicktracking;
    }

    public boolean isHideFromRobots() {
        return hideFromRobots;
    }

    public void setHideFromRobots(boolean hideFromRobots) {
        this.hideFromRobots = hideFromRobots;
    }

    public boolean isShowTwitter() {
        return showTwitter;
    }

    public void setShowTwitter(boolean showTwitter) {
        this.showTwitter = showTwitter;
    }

    public boolean isCompress() {
        return compress;
    }

    public void setCompress(boolean compress) {
        this.compress = compress;
    }

    public AcceptPms getAcceptPms() {
        return acceptPms;
    }

    public void setAcceptPms(AcceptPms acceptPms) {
        this.acceptPms = acceptPms;
    }

    public boolean isStoreVisits() {
        return storeVisits;
    }

    public void setStoreVisits(boolean storeVisits) {
        this.storeVisits = storeVisits;
    }

    public boolean isThreadedModmail() {
        return threadedModmail;
    }

    public void setThreadedModmail(boolean threadedModmail) {
        this.threadedModmail = threadedModmail;
    }

    public boolean isEmailUpvotePost() {
        return emailUpvotePost;
    }

    public void setEmailUpvotePost(boolean emailUpvotePost) {
        this.emailUpvotePost = emailUpvotePost;
    }

    public JsonElement getMinLinkScore() {
        return minLinkScore;
    }

    public void setMinLinkScore(JsonElement minLinkScore) {
        this.minLinkScore = minLinkScore;
    }

    public Media getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(Media mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public boolean isEmailUserNewFollower() {
        return emailUserNewFollower;
    }

    public void setEmailUserNewFollower(boolean emailUserNewFollower) {
        this.emailUserNewFollower = emailUserNewFollower;
    }

    public boolean isNightmode() {
        return nightmode;
    }

    public void setNightmode(boolean nightmode) {
        this.nightmode = nightmode;
    }

    public boolean isEnableDefaultThemes() {
        return enableDefaultThemes;
    }

    public void setEnableDefaultThemes(boolean enableDefaultThemes) {
        this.enableDefaultThemes = enableDefaultThemes;
    }

    public boolean isThirdPartySiteDataPersonalizedContent() {
        return thirdPartySiteDataPersonalizedContent;
    }

    public void setThirdPartySiteDataPersonalizedContent(boolean thirdPartySiteDataPersonalizedContent) {
        this.thirdPartySiteDataPersonalizedContent = thirdPartySiteDataPersonalizedContent;
    }

    public boolean isThirdPartySiteDataPersonalizedAds() {
        return thirdPartySiteDataPersonalizedAds;
    }

    public void setThirdPartySiteDataPersonalizedAds(boolean thirdPartySiteDataPersonalizedAds) {
        this.thirdPartySiteDataPersonalizedAds = thirdPartySiteDataPersonalizedAds;
    }

    public JsonElement getSurveyLastSeenTime() {
        return surveyLastSeenTime;
    }

    public void setSurveyLastSeenTime(JsonElement surveyLastSeenTime) {
        this.surveyLastSeenTime = surveyLastSeenTime;
    }

    public boolean isShowStylesheets() {
        return showStylesheets;
    }

    public void setShowStylesheets(boolean showStylesheets) {
        this.showStylesheets = showStylesheets;
    }

    public boolean isEnableFollowers() {
        return enableFollowers;
    }

    public void setEnableFollowers(boolean enableFollowers) {
        this.enableFollowers = enableFollowers;
    }

    public boolean isEmailNewUserWelcome() {
        return emailNewUserWelcome;
    }

    public void setEmailNewUserWelcome(boolean emailNewUserWelcome) {
        this.emailNewUserWelcome = emailNewUserWelcome;
    }

    public boolean isPublicVotes() {
        return publicVotes;
    }

    public void setPublicVotes(boolean publicVotes) {
        this.publicVotes = publicVotes;
    }

    public boolean isEmailPostReply() {
        return emailPostReply;
    }

    public void setEmailPostReply(boolean emailPostReply) {
        this.emailPostReply = emailPostReply;
    }

    public boolean isCollapseReadMessages() {
        return collapseReadMessages;
    }

    public void setCollapseReadMessages(boolean collapseReadMessages) {
        this.collapseReadMessages = collapseReadMessages;
    }

    public boolean isShowFlair() {
        return showFlair;
    }

    public void setShowFlair(boolean showFlair) {
        this.showFlair = showFlair;
    }

    public boolean isMarkMessagesRead() {
        return markMessagesRead;
    }

    public void setMarkMessagesRead(boolean markMessagesRead) {
        this.markMessagesRead = markMessagesRead;
    }

    public boolean isSearchIncludeOver18() {
        return searchIncludeOver18;
    }

    public void setSearchIncludeOver18(boolean searchIncludeOver18) {
        this.searchIncludeOver18 = searchIncludeOver18;
    }

    public boolean isHideAds() {
        return hideAds;
    }

    public void setHideAds(boolean hideAds) {
        this.hideAds = hideAds;
    }

    public boolean isThirdPartyPersonalizedAds() {
        return thirdPartyPersonalizedAds;
    }

    public void setThirdPartyPersonalizedAds(boolean thirdPartyPersonalizedAds) {
        this.thirdPartyPersonalizedAds = thirdPartyPersonalizedAds;
    }

    public boolean isEmailUsernameMention() {
        return emailUsernameMention;
    }

    public void setEmailUsernameMention(boolean emailUsernameMention) {
        this.emailUsernameMention = emailUsernameMention;
    }

    public boolean isTopKarmaSubreddits() {
        return topKarmaSubreddits;
    }

    public void setTopKarmaSubreddits(boolean topKarmaSubreddits) {
        this.topKarmaSubreddits = topKarmaSubreddits;
    }

    public boolean isNewwindow() {
        return newwindow;
    }

    public void setNewwindow(boolean newwindow) {
        this.newwindow = newwindow;
    }

    public JsonElement getNumsites() {
        return numsites;
    }

    public void setNumsites(JsonElement numsites) {
        this.numsites = numsites;
    }

    public JsonElement getMinCommentScore() {
        return minCommentScore;
    }

    public void setMinCommentScore(JsonElement minCommentScore) {
        this.minCommentScore = minCommentScore;
    }

    public boolean isSendCrosspostMessages() {
        return sendCrosspostMessages;
    }

    public void setSendCrosspostMessages(boolean sendCrosspostMessages) {
        this.sendCrosspostMessages = sendCrosspostMessages;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public boolean isPublicServerSeconds() {
        return publicServerSeconds;
    }

    public void setPublicServerSeconds(boolean publicServerSeconds) {
        this.publicServerSeconds = publicServerSeconds;
    }

    public boolean isShowGoldExpiration() {
        return showGoldExpiration;
    }

    public void setShowGoldExpiration(boolean showGoldExpiration) {
        this.showGoldExpiration = showGoldExpiration;
    }

    public boolean isHighlightNewComments() {
        return highlightNewComments;
    }

    public void setHighlightNewComments(boolean highlightNewComments) {
        this.highlightNewComments = highlightNewComments;
    }

    public boolean isEmailUnsubscribeAll() {
        return emailUnsubscribeAll;
    }

    public void setEmailUnsubscribeAll(boolean emailUnsubscribeAll) {
        this.emailUnsubscribeAll = emailUnsubscribeAll;
    }

    public DefaultCommentSort getDefaultCommentSort() {
        return defaultCommentSort;
    }

    public void setDefaultCommentSort(DefaultCommentSort defaultCommentSort) {
        this.defaultCommentSort = defaultCommentSort;
    }

    public boolean isShowLocationBasedRecommendations() {
        return showLocationBasedRecommendations;
    }

    public void setShowLocationBasedRecommendations(boolean showLocationBasedRecommendations) {
        this.showLocationBasedRecommendations = showLocationBasedRecommendations;
    }

    @Override
    public String toString() {
        return "PreferenceSettings{" +
                "beta=" + beta +
                ", defaultThemeSr=" + defaultThemeSr +
                ", threadedMessages=" + threadedMessages +
                ", emailCommentReply=" + emailCommentReply +
                ", privateFeeds=" + privateFeeds +
                ", activityRelevantAds=" + activityRelevantAds +
                ", emailMessages=" + emailMessages +
                ", profileOptOut=" + profileOptOut +
                ", videoAutoplay=" + videoAutoplay +
                ", emailPrivateMessage=" + emailPrivateMessage +
                ", geopopular='" + geopopular + '\'' +
                ", showLinkFlair=" + showLinkFlair +
                ", showTrending=" + showTrending +
                ", sendWelcomeMessages=" + sendWelcomeMessages +
                ", countryCode='" + countryCode + '\'' +
                ", designBeta=" + designBeta +
                ", monitorMentions=" + monitorMentions +
                ", hideDowns=" + hideDowns +
                ", clickgadget=" + clickgadget +
                ", lang='" + lang + '\'' +
                ", ignoreSuggestedSort=" + ignoreSuggestedSort +
                ", showPresence=" + showPresence +
                ", emailUpvoteComment=" + emailUpvoteComment +
                ", emailDigests=" + emailDigests +
                ", layout='" + layout + '\'' +
                ", numComments=" + numComments +
                ", feedRecommendationsEnabled=" + feedRecommendationsEnabled +
                ", labelNsfw=" + labelNsfw +
                ", research=" + research +
                ", useGlobalDefaults=" + useGlobalDefaults +
                ", showSnoovatar=" + showSnoovatar +
                ", over18=" + over18 +
                ", legacySearch=" + legacySearch +
                ", liveOrangereds=" + liveOrangereds +
                ", highlightControversial=" + highlightControversial +
                ", noProfanity=" + noProfanity +
                ", domainDetails=" + domainDetails +
                ", collapseLeftBar=" + collapseLeftBar +
                ", emailCommunityDiscovery=" + emailCommunityDiscovery +
                ", badCommentAutocollapse='" + badCommentAutocollapse + '\'' +
                ", hideUps=" + hideUps +
                ", thirdPartyDataPersonalizedAds=" + thirdPartyDataPersonalizedAds +
                ", emailChatRequest=" + emailChatRequest +
                ", allowClicktracking=" + allowClicktracking +
                ", hideFromRobots=" + hideFromRobots +
                ", showTwitter=" + showTwitter +
                ", compress=" + compress +
                ", acceptPms='" + acceptPms + '\'' +
                ", storeVisits=" + storeVisits +
                ", threadedModmail=" + threadedModmail +
                ", emailUpvotePost=" + emailUpvotePost +
                ", minLinkScore=" + minLinkScore +
                ", mediaPreview='" + mediaPreview + '\'' +
                ", emailUserNewFollower=" + emailUserNewFollower +
                ", nightmode=" + nightmode +
                ", enableDefaultThemes=" + enableDefaultThemes +
                ", thirdPartySiteDataPersonalizedContent=" + thirdPartySiteDataPersonalizedContent +
                ", thirdPartySiteDataPersonalizedAds=" + thirdPartySiteDataPersonalizedAds +
                ", surveyLastSeenTime=" + surveyLastSeenTime +
                ", showStylesheets=" + showStylesheets +
                ", enableFollowers=" + enableFollowers +
                ", emailNewUserWelcome=" + emailNewUserWelcome +
                ", publicVotes=" + publicVotes +
                ", emailPostReply=" + emailPostReply +
                ", collapseReadMessages=" + collapseReadMessages +
                ", showFlair=" + showFlair +
                ", markMessagesRead=" + markMessagesRead +
                ", searchIncludeOver18=" + searchIncludeOver18 +
                ", hideAds=" + hideAds +
                ", thirdPartyPersonalizedAds=" + thirdPartyPersonalizedAds +
                ", emailUsernameMention=" + emailUsernameMention +
                ", topKarmaSubreddits=" + topKarmaSubreddits +
                ", newwindow=" + newwindow +
                ", numsites=" + numsites +
                ", minCommentScore=" + minCommentScore +
                ", sendCrosspostMessages=" + sendCrosspostMessages +
                ", media='" + media + '\'' +
                ", publicServerSeconds=" + publicServerSeconds +
                ", showGoldExpiration=" + showGoldExpiration +
                ", highlightNewComments=" + highlightNewComments +
                ", emailUnsubscribeAll=" + emailUnsubscribeAll +
                ", defaultCommentSort='" + defaultCommentSort + '\'' +
                ", showLocationBasedRecommendations=" + showLocationBasedRecommendations +
                '}';
    }

    public enum AcceptPms {
        @SerializedName("everyone") EVERYONE,
        @SerializedName("whitelisted") WHITELISTED
    }

    public enum BadCommentAutocollapse {
        @SerializedName("off") OFF,
        @SerializedName("low") LOW,
        @SerializedName("medium") MEDIUM,
        @SerializedName("high") HIGH
    }

    public enum CountryCode {
        @SerializedName("WF") WF,
        @SerializedName("JP") JP,
        @SerializedName("JM") JM,
        @SerializedName("JO") JO,
        @SerializedName("WS") WS,
        @SerializedName("JE") JE,
        @SerializedName("GW") GW,
        @SerializedName("GU") GU,
        @SerializedName("GT") GT,
        @SerializedName("GS") GS,
        @SerializedName("GR") GR,
        @SerializedName("GQ") GQ,
        @SerializedName("GP") GP,
        @SerializedName("GY") GY,
        @SerializedName("GG") GG,
        @SerializedName("GF") GF,
        @SerializedName("GE") GE,
        @SerializedName("GD") GD,
        @SerializedName("GB") GB,
        @SerializedName("GA") GA,
        @SerializedName("GN") GN,
        @SerializedName("GM") GM,
        @SerializedName("GL") GL,
        @SerializedName("GI") GI,
        @SerializedName("GH") GH,
        @SerializedName("PR") PR,
        @SerializedName("PS") PS,
        @SerializedName("PW") PW,
        @SerializedName("PT") PT,
        @SerializedName("PY") PY,
        @SerializedName("PA") PA,
        @SerializedName("PF") PF,
        @SerializedName("PG") PG,
        @SerializedName("PE") PE,
        @SerializedName("PK") PK,
        @SerializedName("PH") PH,
        @SerializedName("PN") PN,
        @SerializedName("PL") PL,
        @SerializedName("PM") PM,
        @SerializedName("ZM") ZM,
        @SerializedName("ZA") ZA,
        @SerializedName("ZZ") ZZ,
        @SerializedName("ZW") ZW,
        @SerializedName("ME") ME,
        @SerializedName("MD") MD,
        @SerializedName("MG") MG,
        @SerializedName("MF") MF,
        @SerializedName("MA") MA,
        @SerializedName("MC") MC,
        @SerializedName("MM") MM,
        @SerializedName("ML") ML,
        @SerializedName("MO") MO,
        @SerializedName("MN") MN,
        @SerializedName("MH") MH,
        @SerializedName("MK") MK,
        @SerializedName("MU") MU,
        @SerializedName("MT") MT,
        @SerializedName("MW") MW,
        @SerializedName("MV") MV,
        @SerializedName("MQ") MQ,
        @SerializedName("MP") MP,
        @SerializedName("MS") MS,
        @SerializedName("MR") MR,
        @SerializedName("MY") MY,
        @SerializedName("MX") MX,
        @SerializedName("MZ") MZ,
        @SerializedName("FR") FR,
        @SerializedName("FI") FI,
        @SerializedName("FJ") FJ,
        @SerializedName("FK") FK,
        @SerializedName("FM") FM,
        @SerializedName("FO") FO,
        @SerializedName("CK") CK,
        @SerializedName("CI") CI,
        @SerializedName("CH") CH,
        @SerializedName("CO") CO,
        @SerializedName("CN") CN,
        @SerializedName("CM") CM,
        @SerializedName("CL") CL,
        @SerializedName("CC") CC,
        @SerializedName("CA") CA,
        @SerializedName("CG") CG,
        @SerializedName("CF") CF,
        @SerializedName("CD") CD,
        @SerializedName("CZ") CZ,
        @SerializedName("CY") CY,
        @SerializedName("CX") CX,
        @SerializedName("CR") CR,
        @SerializedName("CW") CW,
        @SerializedName("CV") CV,
        @SerializedName("CU") CU,
        @SerializedName("SZ") SZ,
        @SerializedName("SY") SY,
        @SerializedName("SX") SX,
        @SerializedName("SS") SS,
        @SerializedName("SR") SR,
        @SerializedName("SV") SV,
        @SerializedName("ST") ST,
        @SerializedName("SK") SK,
        @SerializedName("SJ") SJ,
        @SerializedName("SI") SI,
        @SerializedName("SH") SH,
        @SerializedName("SO") SO,
        @SerializedName("SN") SN,
        @SerializedName("SM") SM,
        @SerializedName("SL") SL,
        @SerializedName("SC") SC,
        @SerializedName("SB") SB,
        @SerializedName("SA") SA,
        @SerializedName("SG") SG,
        @SerializedName("SE") SE,
        @SerializedName("SD") SD,
        @SerializedName("YE") YE,
        @SerializedName("YT") YT,
        @SerializedName("LB") LB,
        @SerializedName("LC") LC,
        @SerializedName("LA") LA,
        @SerializedName("LK") LK,
        @SerializedName("LI") LI,
        @SerializedName("LV") LV,
        @SerializedName("LT") LT,
        @SerializedName("LU") LU,
        @SerializedName("LR") LR,
        @SerializedName("LS") LS,
        @SerializedName("LY") LY,
        @SerializedName("VA") VA,
        @SerializedName("VC") VC,
        @SerializedName("VE") VE,
        @SerializedName("VG") VG,
        @SerializedName("IQ") IQ,
        @SerializedName("VI") VI,
        @SerializedName("IS") IS,
        @SerializedName("IR") IR,
        @SerializedName("IT") IT,
        @SerializedName("VN") VN,
        @SerializedName("IM") IM,
        @SerializedName("IL") IL,
        @SerializedName("IO") IO,
        @SerializedName("IN") IN,
        @SerializedName("IE") IE,
        @SerializedName("ID") ID,
        @SerializedName("BD") BD,
        @SerializedName("BE") BE,
        @SerializedName("BF") BF,
        @SerializedName("BG") BG,
        @SerializedName("BA") BA,
        @SerializedName("BB") BB,
        @SerializedName("BL") BL,
        @SerializedName("BM") BM,
        @SerializedName("BN") BN,
        @SerializedName("BO") BO,
        @SerializedName("BH") BH,
        @SerializedName("BI") BI,
        @SerializedName("BJ") BJ,
        @SerializedName("BT") BT,
        @SerializedName("BV") BV,
        @SerializedName("BW") BW,
        @SerializedName("BQ") BQ,
        @SerializedName("BR") BR,
        @SerializedName("BS") BS,
        @SerializedName("BY") BY,
        @SerializedName("BZ") BZ,
        @SerializedName("RU") RU,
        @SerializedName("RW") RW,
        @SerializedName("RS") RS,
        @SerializedName("RE") RE,
        @SerializedName("RO") RO,
        @SerializedName("OM") OM,
        @SerializedName("HR") HR,
        @SerializedName("HT") HT,
        @SerializedName("HU") HU,
        @SerializedName("HK") HK,
        @SerializedName("HN") HN,
        @SerializedName("HM") HM,
        @SerializedName("EH") EH,
        @SerializedName("EE") EE,
        @SerializedName("EG") EG,
        @SerializedName("EC") EC,
        @SerializedName("ET") ET,
        @SerializedName("ES") ES,
        @SerializedName("ER") ER,
        @SerializedName("UY") UY,
        @SerializedName("UZ") UZ,
        @SerializedName("US") US,
        @SerializedName("UM") UM,
        @SerializedName("UG") UG,
        @SerializedName("UA") UA,
        @SerializedName("VU") VU,
        @SerializedName("NI") NI,
        @SerializedName("NL") NL,
        @SerializedName("NO") NO,
        @SerializedName("NA") NA,
        @SerializedName("NC") NC,
        @SerializedName("NE") NE,
        @SerializedName("NF") NF,
        @SerializedName("NG") NG,
        @SerializedName("NZ") NZ,
        @SerializedName("NP") NP,
        @SerializedName("NR") NR,
        @SerializedName("NU") NU,
        @SerializedName("XK") XK,
        @SerializedName("XZ") XZ,
        @SerializedName("XX") XX,
        @SerializedName("KG") KG,
        @SerializedName("KE") KE,
        @SerializedName("KI") KI,
        @SerializedName("KH") KH,
        @SerializedName("KN") KN,
        @SerializedName("KM") KM,
        @SerializedName("KR") KR,
        @SerializedName("KP") KP,
        @SerializedName("KW") KW,
        @SerializedName("KZ") KZ,
        @SerializedName("KY") KY,
        @SerializedName("DO") DO,
        @SerializedName("DM") DM,
        @SerializedName("DJ") DJ,
        @SerializedName("DK") DK,
        @SerializedName("DE") DE,
        @SerializedName("DZ") DZ,
        @SerializedName("TZ") TZ,
        @SerializedName("TV") TV,
        @SerializedName("TW") TW,
        @SerializedName("TT") TT,
        @SerializedName("TR") TR,
        @SerializedName("TN") TN,
        @SerializedName("TO") TO,
        @SerializedName("TL") TL,
        @SerializedName("TM") TM,
        @SerializedName("TJ") TJ,
        @SerializedName("TK") TK,
        @SerializedName("TH") TH,
        @SerializedName("TF") TF,
        @SerializedName("TG") TG,
        @SerializedName("TD") TD,
        @SerializedName("TC") TC,
        @SerializedName("AE") AE,
        @SerializedName("AD") AD,
        @SerializedName("AG") AG,
        @SerializedName("AF") AF,
        @SerializedName("AI") AI,
        @SerializedName("AM") AM,
        @SerializedName("AL") AL,
        @SerializedName("AO") AO,
        @SerializedName("AN") AN,
        @SerializedName("AQ") AQ,
        @SerializedName("AS") AS,
        @SerializedName("AR") AR,
        @SerializedName("AU") AU,
        @SerializedName("AT") AT,
        @SerializedName("AW") AW,
        @SerializedName("AX") AX,
        @SerializedName("AZ") AZ,
        @SerializedName("QA") QA
    }

    public enum DefaultCommentSort {
        @SerializedName("confidence") CONFIDENCE,
        @SerializedName("top") TOP,
        @SerializedName("new") NEW,
        @SerializedName("controversial") CONTROVERSIAL,
        @SerializedName("old") OLD,
        @SerializedName("random") RANDOM,
        @SerializedName("qa") QA,
        @SerializedName("live") LIVE
    }

    public enum Geopopular {
        @SerializedName("GLOBAL") GLOBAL,
        @SerializedName("US") US,
        @SerializedName("AR") AR,
        @SerializedName("AU") AU,
        @SerializedName("BG") BG,
        @SerializedName("CA") CA,
        @SerializedName("CL") CL,
        @SerializedName("CO") CO,
        @SerializedName("HR") HR,
        @SerializedName("CZ") CZ,
        @SerializedName("FI") FI,
        @SerializedName("FR") FR,
        @SerializedName("DE") DE,
        @SerializedName("GR") GR,
        @SerializedName("HU") HU,
        @SerializedName("IS") IS,
        @SerializedName("IN") IN,
        @SerializedName("IE") IE,
        @SerializedName("IT") IT,
        @SerializedName("JP") JP,
        @SerializedName("MY") MY,
        @SerializedName("MX") MX,
        @SerializedName("NZ") NZ,
        @SerializedName("PH") PH,
        @SerializedName("PL") PL,
        @SerializedName("PT") PT,
        @SerializedName("PR") PR,
        @SerializedName("RO") RO,
        @SerializedName("RS") RS,
        @SerializedName("SG") SG,
        @SerializedName("ES") ES,
        @SerializedName("SE") SE,
        @SerializedName("TW") TW,
        @SerializedName("TH") TH,
        @SerializedName("TR") TR,
        @SerializedName("GB") GB,
        @SerializedName("US_WA") US_WA,
        @SerializedName("US_DE") US_DE,
        @SerializedName("US_DC") US_DC,
        @SerializedName("US_WI") US_WI,
        @SerializedName("US_WV") US_WV,
        @SerializedName("US_HI") US_HI,
        @SerializedName("US_FL") US_FL,
        @SerializedName("US_WY") US_WY,
        @SerializedName("US_NH") US_NH,
        @SerializedName("US_NJ") US_NJ,
        @SerializedName("US_NM") US_NM,
        @SerializedName("US_TX") US_TX,
        @SerializedName("US_LA") US_LA,
        @SerializedName("US_NC") US_NC,
        @SerializedName("US_ND") US_ND,
        @SerializedName("US_NE") US_NE,
        @SerializedName("US_TN") US_TN,
        @SerializedName("US_NY") US_NY,
        @SerializedName("US_PA") US_PA,
        @SerializedName("US_CA") US_CA,
        @SerializedName("US_NV") US_NV,
        @SerializedName("US_VA") US_VA,
        @SerializedName("US_CO") US_CO,
        @SerializedName("US_AK") US_AK,
        @SerializedName("US_AL") US_AL,
        @SerializedName("US_AR") US_AR,
        @SerializedName("US_VT") US_VT,
        @SerializedName("US_IL") US_IL,
        @SerializedName("US_GA") US_GA,
        @SerializedName("US_IN") US_IN,
        @SerializedName("US_IA") US_IA,
        @SerializedName("US_OK") US_OK,
        @SerializedName("US_AZ") US_AZ,
        @SerializedName("US_ID") US_ID,
        @SerializedName("US_CT") US_CT,
        @SerializedName("US_ME") US_ME,
        @SerializedName("US_MD") US_MD,
        @SerializedName("US_MA") US_MA,
        @SerializedName("US_OH") US_OH,
        @SerializedName("US_UT") US_UT,
        @SerializedName("US_MO") US_MO,
        @SerializedName("US_MN") US_MN,
        @SerializedName("US_MI") US_MI,
        @SerializedName("US_RI") US_RI,
        @SerializedName("US_KS") US_KS,
        @SerializedName("US_MT") US_MT,
        @SerializedName("US_MS") US_MS,
        @SerializedName("US_SC") US_SC,
        @SerializedName("US_KY") US_KY,
        @SerializedName("US_OR") US_OR,
        @SerializedName("US_SD") US_SD
    }

    public enum Media {
        @SerializedName("on") ON,
        @SerializedName("off") OFF,
        @SerializedName("subreddit") SUBREDDIT
    }
}
