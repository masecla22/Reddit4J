package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Features {
    @SerializedName("mod_service_mute_writes")
    private boolean modServiceMuteWrites;

    @SerializedName("promoted_trend_blanks")
    private boolean promotedTrendBlanks;

    @SerializedName("show_amp_link")
    private boolean showAmpLink;

    @SerializedName("top_content_email_digest_v2")
    private Experiment topContentEmailDigestV2;

    @SerializedName("chat")
    private boolean chat;

    @SerializedName("is_email_permission_required")
    private boolean emailPermissionRequired;

    @SerializedName("mod_awards")
    private boolean modAwards;

    @SerializedName("expensive_coins_package")
    private boolean expensive_coins_package;

    @SerializedName("mweb_xpromo_revamp_v2")
    private Experiment mwebXpromoRevampV2;

    @SerializedName("awards_on_streams")
    private boolean awardsOnStreams;

    @SerializedName("mweb_xpromo_modal_listing_click_daily_dismissible_ios")
    private boolean mwebXpromoModalListingClickDailyDismissibleIos;

    @SerializedName("chat_subreddit")
    private boolean chatSubreddit;

    @SerializedName("cookie_consent_banner")
    private boolean cookieConsentBanner;

    @SerializedName("modlog_copyright_removal")
    private boolean modlogCopyrightRemoval;

    @SerializedName("show_nps_survey")
    private boolean showNpsSurvey;

    @SerializedName("do_not_track")
    private boolean doNotTrack;

    @SerializedName("mod_service_mute_reads")
    private boolean modServiceMuteReads;

    @SerializedName("chat_user_settings")
    private boolean chatUserSetings;

    @SerializedName("use_pref_account_deployment")
    private boolean usePrefAccountDeployment;

    @SerializedName("mweb_xpromo_interstitial_comments_ios")
    private boolean mwebXpromoInterstitialCommentsIos;

    @SerializedName("noreferrer_to_noopener")
    private boolean noreferrerToNoopener;

    @SerializedName("premium_subscriptions_table")
    private boolean premiumSubscriptionsTable;

    @SerializedName("mweb_xpromo_interstitial_comments_android")
    private boolean mwebXpromoInterstitialCommentsAndroid;

    @SerializedName("crowd_control_for_post")
    private boolean crowdControlForPost;

    @SerializedName("mweb_nsfw_xpromo")
    private Experiment mwebNsfwXpromo;

    @SerializedName("chat_group_rollout")
    private boolean chatGroupRollout;

    @SerializedName("resized_styles_images")
    private boolean resizedStylesImages;

    @SerializedName("spez_modal")
    private boolean spezModal;

    @SerializedName("mweb_xpromo_modal_listing_click_daily_dismissible_android")
    private boolean mwebXpromoModalListingClickDailyDismissibleAndroid;

    public boolean isModServiceMuteWrites() {
        return modServiceMuteWrites;
    }

    public void setModServiceMuteWrites(boolean modServiceMuteWrites) {
        this.modServiceMuteWrites = modServiceMuteWrites;
    }

    public boolean isPromotedTrendBlanks() {
        return promotedTrendBlanks;
    }

    public void setPromotedTrendBlanks(boolean promotedTrendBlanks) {
        this.promotedTrendBlanks = promotedTrendBlanks;
    }

    public boolean isShowAmpLink() {
        return showAmpLink;
    }

    public void setShowAmpLink(boolean showAmpLink) {
        this.showAmpLink = showAmpLink;
    }

    public Experiment getTopContentEmailDigestV2() {
        return topContentEmailDigestV2;
    }

    public void setTopContentEmailDigestV2(Experiment topContentEmailDigestV2) {
        this.topContentEmailDigestV2 = topContentEmailDigestV2;
    }

    public boolean isChat() {
        return chat;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public boolean isEmailPermissionRequired() {
        return emailPermissionRequired;
    }

    public void setEmailPermissionRequired(boolean emailPermissionRequired) {
        this.emailPermissionRequired = emailPermissionRequired;
    }

    public boolean isModAwards() {
        return modAwards;
    }

    public void setModAwards(boolean modAwards) {
        this.modAwards = modAwards;
    }

    public boolean isExpensive_coins_package() {
        return expensive_coins_package;
    }

    public void setExpensive_coins_package(boolean expensive_coins_package) {
        this.expensive_coins_package = expensive_coins_package;
    }

    public Experiment getMwebXpromoRevampV2() {
        return mwebXpromoRevampV2;
    }

    public void setMwebXpromoRevampV2(Experiment mwebXpromoRevampV2) {
        this.mwebXpromoRevampV2 = mwebXpromoRevampV2;
    }

    public boolean isAwardsOnStreams() {
        return awardsOnStreams;
    }

    public void setAwardsOnStreams(boolean awardsOnStreams) {
        this.awardsOnStreams = awardsOnStreams;
    }

    public boolean isMwebXpromoModalListingClickDailyDismissibleIos() {
        return mwebXpromoModalListingClickDailyDismissibleIos;
    }

    public void setMwebXpromoModalListingClickDailyDismissibleIos(boolean mwebXpromoModalListingClickDailyDismissibleIos) {
        this.mwebXpromoModalListingClickDailyDismissibleIos = mwebXpromoModalListingClickDailyDismissibleIos;
    }

    public boolean isChatSubreddit() {
        return chatSubreddit;
    }

    public void setChatSubreddit(boolean chatSubreddit) {
        this.chatSubreddit = chatSubreddit;
    }

    public boolean isCookieConsentBanner() {
        return cookieConsentBanner;
    }

    public void setCookieConsentBanner(boolean cookieConsentBanner) {
        this.cookieConsentBanner = cookieConsentBanner;
    }

    public boolean isModlogCopyrightRemoval() {
        return modlogCopyrightRemoval;
    }

    public void setModlogCopyrightRemoval(boolean modlogCopyrightRemoval) {
        this.modlogCopyrightRemoval = modlogCopyrightRemoval;
    }

    public boolean isShowNpsSurvey() {
        return showNpsSurvey;
    }

    public void setShowNpsSurvey(boolean showNpsSurvey) {
        this.showNpsSurvey = showNpsSurvey;
    }

    public boolean isDoNotTrack() {
        return doNotTrack;
    }

    public void setDoNotTrack(boolean doNotTrack) {
        this.doNotTrack = doNotTrack;
    }

    public boolean isModServiceMuteReads() {
        return modServiceMuteReads;
    }

    public void setModServiceMuteReads(boolean modServiceMuteReads) {
        this.modServiceMuteReads = modServiceMuteReads;
    }

    public boolean isChatUserSetings() {
        return chatUserSetings;
    }

    public void setChatUserSetings(boolean chatUserSetings) {
        this.chatUserSetings = chatUserSetings;
    }

    public boolean isUsePrefAccountDeployment() {
        return usePrefAccountDeployment;
    }

    public void setUsePrefAccountDeployment(boolean usePrefAccountDeployment) {
        this.usePrefAccountDeployment = usePrefAccountDeployment;
    }

    public boolean isMwebXpromoInterstitialCommentsIos() {
        return mwebXpromoInterstitialCommentsIos;
    }

    public void setMwebXpromoInterstitialCommentsIos(boolean mwebXpromoInterstitialCommentsIos) {
        this.mwebXpromoInterstitialCommentsIos = mwebXpromoInterstitialCommentsIos;
    }

    public boolean isNoreferrerToNoopener() {
        return noreferrerToNoopener;
    }

    public void setNoreferrerToNoopener(boolean noreferrerToNoopener) {
        this.noreferrerToNoopener = noreferrerToNoopener;
    }

    public boolean isPremiumSubscriptionsTable() {
        return premiumSubscriptionsTable;
    }

    public void setPremiumSubscriptionsTable(boolean premiumSubscriptionsTable) {
        this.premiumSubscriptionsTable = premiumSubscriptionsTable;
    }

    public boolean isMwebXpromoInterstitialCommentsAndroid() {
        return mwebXpromoInterstitialCommentsAndroid;
    }

    public void setMwebXpromoInterstitialCommentsAndroid(boolean mwebXpromoInterstitialCommentsAndroid) {
        this.mwebXpromoInterstitialCommentsAndroid = mwebXpromoInterstitialCommentsAndroid;
    }

    public boolean isCrowdControlForPost() {
        return crowdControlForPost;
    }

    public void setCrowdControlForPost(boolean crowdControlForPost) {
        this.crowdControlForPost = crowdControlForPost;
    }

    public Experiment getMwebNsfwXpromo() {
        return mwebNsfwXpromo;
    }

    public void setMwebNsfwXpromo(Experiment mwebNsfwXpromo) {
        this.mwebNsfwXpromo = mwebNsfwXpromo;
    }

    public boolean isChatGroupRollout() {
        return chatGroupRollout;
    }

    public void setChatGroupRollout(boolean chatGroupRollout) {
        this.chatGroupRollout = chatGroupRollout;
    }

    public boolean isResizedStylesImages() {
        return resizedStylesImages;
    }

    public void setResizedStylesImages(boolean resizedStylesImages) {
        this.resizedStylesImages = resizedStylesImages;
    }

    public boolean isSpezModal() {
        return spezModal;
    }

    public void setSpezModal(boolean spezModal) {
        this.spezModal = spezModal;
    }

    public boolean isMwebXpromoModalListingClickDailyDismissibleAndroid() {
        return mwebXpromoModalListingClickDailyDismissibleAndroid;
    }

    public void setMwebXpromoModalListingClickDailyDismissibleAndroid(boolean mwebXpromoModalListingClickDailyDismissibleAndroid) {
        this.mwebXpromoModalListingClickDailyDismissibleAndroid = mwebXpromoModalListingClickDailyDismissibleAndroid;
    }

    @Override
    public String toString() {
        return "Features{" +
                "modServiceMuteWrites=" + modServiceMuteWrites +
                ", promotedTrendBlanks=" + promotedTrendBlanks +
                ", showAmpLink=" + showAmpLink +
                ", topContentEmailDigestV2=" + topContentEmailDigestV2 +
                ", chat=" + chat +
                ", emailPermissionRequired=" + emailPermissionRequired +
                ", modAwards=" + modAwards +
                ", expensive_coins_package=" + expensive_coins_package +
                ", mwebXpromoRevampV2=" + mwebXpromoRevampV2 +
                ", awardsOnStreams=" + awardsOnStreams +
                ", mwebXpromoModalListingClickDailyDismissibleIos=" + mwebXpromoModalListingClickDailyDismissibleIos +
                ", chatSubreddit=" + chatSubreddit +
                ", cookieConsentBanner=" + cookieConsentBanner +
                ", modlogCopyrightRemoval=" + modlogCopyrightRemoval +
                ", showNpsSurvey=" + showNpsSurvey +
                ", doNotTrack=" + doNotTrack +
                ", modServiceMuteReads=" + modServiceMuteReads +
                ", chatUserSetings=" + chatUserSetings +
                ", usePrefAccountDeployment=" + usePrefAccountDeployment +
                ", mwebXpromoInterstitialCommentsIos=" + mwebXpromoInterstitialCommentsIos +
                ", noreferrerToNoopener=" + noreferrerToNoopener +
                ", premiumSubscriptionsTable=" + premiumSubscriptionsTable +
                ", mwebXpromoInterstitialCommentsAndroid=" + mwebXpromoInterstitialCommentsAndroid +
                ", crowdControlForPost=" + crowdControlForPost +
                ", mwebNsfwXpromo=" + mwebNsfwXpromo +
                ", chatGroupRollout=" + chatGroupRollout +
                ", resizedStylesImages=" + resizedStylesImages +
                ", spezModal=" + spezModal +
                ", mwebXpromoModalListingClickDailyDismissibleAndroid=" + mwebXpromoModalListingClickDailyDismissibleAndroid +
                '}';
    }
}
