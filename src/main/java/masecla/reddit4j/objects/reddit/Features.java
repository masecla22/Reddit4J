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
}
