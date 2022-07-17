package masecla.reddit4j.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("is_employee")
    private boolean employee;

    @SerializedName("seen_layout_switch")
    private boolean seenLayoutSwitch;

    @SerializedName("has_visited_new_profile")
    private boolean hasVisitedNewProfile;

    @SerializedName("pref_no_profanity")
    private boolean prefNoProfanity;

    @SerializedName("has_external_account")
    private boolean hasExternalAccount;

    @SerializedName("pref_geopopular")
    private String prefGeoPopular; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("seen_redesign_modal")
    private boolean seenRedesignModal;

    @SerializedName("pref_show_trending")
    private boolean prefShowTrending;

    @SerializedName("subreddit")
    private Subreddit subreddit;

    @SerializedName("pref_show_presence")
    private boolean prefShowPresence;

    @SerializedName("snoovatar_img")
    private String snoovatarImg;

    @SerializedName("snoovatar_size")
    private List<Integer> snoovatarSize;

    @SerializedName("gold_expiration")
    private String goldExpiration; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("has_gold_subscription")
    private boolean hasGoldSubscription;

    @SerializedName("is_sponsor")
    private boolean sponsor;

    @SerializedName("num_friends")
    private int numFriend;

    @SerializedName("features")
    private Features features;

    @SerializedName("can_edit_name")
    private boolean canEditName;

    @SerializedName("verified")
    private boolean verified;

    @SerializedName("new_modmail_exists")
    private boolean newModmailExists;

    @SerializedName("pref_autoplay")
    private boolean prefAutoplay;

    @SerializedName("coins")
    private int coins;

    @SerializedName("has_paypal_subscription")
    private String hasPaypalSubscription;

    @SerializedName("has_subscribed_to_premium")
    private boolean hasSubscribedToPremium;

    @SerializedName("id")
    private String id;

    @SerializedName("has_stripe_subscription")
    private boolean hasStripeSubscription;

    @SerializedName("oauth_client_id")
    private String oauthClientId;

    @SerializedName("can_create_subreddit")
    private boolean canCreateSubreddit;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("is_gold")
    private boolean gold;

    @SerializedName("is_mod")
    private boolean mod;

    @SerializedName("awarder_karma")
    private int awarderKarma;

    @SerializedName("suspension_expiration_utc")
    private String suspensionExpirationUtc; // TODO: 17.07.2022 What are the possible values?

    @SerializedName("has_verified_email")
    private boolean hasVerifiedEmail;

    @SerializedName("is_suspended")
    private boolean suspended;

    @SerializedName("pref_video_autoplay")
    private boolean prefVideoAutoPlay;

    @SerializedName("in_chat")
    private boolean inChat;

    @SerializedName("has_android_subscription")
    private boolean hasAndroidSubscription;

    @SerializedName("in_redesign_beta")
    private boolean inRedesignBeta;

    @SerializedName("icon_img")
    private boolean iconImg;

    @SerializedName("has_mod_mail")
    private boolean hasModMail;

    @SerializedName("pref_nightmode")
    private boolean prefNightmode;

    @SerializedName("awardee_karma")
    private int awardeeKarma;

    @SerializedName("hide_from_robots")
    private boolean hideFromRobots;

    @SerializedName("password_set")
    private boolean passwordSet;

    @SerializedName("link_karma")
    private int linkKarma;

    @SerializedName("force_password_reset")
    private boolean forcePasswordReset;

    @SerializedName("total_karma")
    private int totalKarma;

    @SerializedName("seen_give_award_tooltip")
    private boolean seenGibeAwardTooltip;

    @SerializedName("inbox_count")
    private int inboxCount;

    @SerializedName("seen_premium_adblock_modal")
    private boolean seenPremiumAdblockModal;

    @SerializedName("pref_top_karma_subreddits")
    private boolean prefTopKarmaSubreddits;

    @SerializedName("has_mail")
    private boolean hasMail;

    @SerializedName("pref_show_snoovatar")
    private boolean prefShowSnoovatar;

    @SerializedName("name")
    private String name;

    @SerializedName("pref_clickgadget")
    private int prefClickgadget;

    @SerializedName("created")
    private double created;

    @SerializedName("gold_creddits")
    private int goldCreddits;

    @SerializedName("created_utc")
    private double createdUtc;

    @SerializedName("has_ios_subscription")
    private boolean hasIosSubscription;

    @SerializedName("pref_show_twitter")
    private boolean prefShowTwitter;

    @SerializedName("in_beta")
    private boolean inBeta;

    @SerializedName("comment_karma")
    private int commentKarma;

    @SerializedName("accept_followers")
    private boolean acceptFollowers;

    @SerializedName("has_subscribed")
    private boolean hasSubscribed;

    @SerializedName("linked_identities")
    private List<String> linkedIdentities;

    @SerializedName("seen_subreddit_chat_ftux")
    private boolean seenSubredditChatFtux;
}
