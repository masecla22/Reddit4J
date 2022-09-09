package com.github.masecla.objects.reddit;

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

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public boolean isSeenLayoutSwitch() {
        return seenLayoutSwitch;
    }

    public void setSeenLayoutSwitch(boolean seenLayoutSwitch) {
        this.seenLayoutSwitch = seenLayoutSwitch;
    }

    public boolean isHasVisitedNewProfile() {
        return hasVisitedNewProfile;
    }

    public void setHasVisitedNewProfile(boolean hasVisitedNewProfile) {
        this.hasVisitedNewProfile = hasVisitedNewProfile;
    }

    public boolean isPrefNoProfanity() {
        return prefNoProfanity;
    }

    public void setPrefNoProfanity(boolean prefNoProfanity) {
        this.prefNoProfanity = prefNoProfanity;
    }

    public boolean isHasExternalAccount() {
        return hasExternalAccount;
    }

    public void setHasExternalAccount(boolean hasExternalAccount) {
        this.hasExternalAccount = hasExternalAccount;
    }

    public String getPrefGeoPopular() {
        return prefGeoPopular;
    }

    public void setPrefGeoPopular(String prefGeoPopular) {
        this.prefGeoPopular = prefGeoPopular;
    }

    public boolean isSeenRedesignModal() {
        return seenRedesignModal;
    }

    public void setSeenRedesignModal(boolean seenRedesignModal) {
        this.seenRedesignModal = seenRedesignModal;
    }

    public boolean isPrefShowTrending() {
        return prefShowTrending;
    }

    public void setPrefShowTrending(boolean prefShowTrending) {
        this.prefShowTrending = prefShowTrending;
    }

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }

    public boolean isPrefShowPresence() {
        return prefShowPresence;
    }

    public void setPrefShowPresence(boolean prefShowPresence) {
        this.prefShowPresence = prefShowPresence;
    }

    public String getSnoovatarImg() {
        return snoovatarImg;
    }

    public void setSnoovatarImg(String snoovatarImg) {
        this.snoovatarImg = snoovatarImg;
    }

    public List<Integer> getSnoovatarSize() {
        return snoovatarSize;
    }

    public void setSnoovatarSize(List<Integer> snoovatarSize) {
        this.snoovatarSize = snoovatarSize;
    }

    public String getGoldExpiration() {
        return goldExpiration;
    }

    public void setGoldExpiration(String goldExpiration) {
        this.goldExpiration = goldExpiration;
    }

    public boolean isHasGoldSubscription() {
        return hasGoldSubscription;
    }

    public void setHasGoldSubscription(boolean hasGoldSubscription) {
        this.hasGoldSubscription = hasGoldSubscription;
    }

    public boolean isSponsor() {
        return sponsor;
    }

    public void setSponsor(boolean sponsor) {
        this.sponsor = sponsor;
    }

    public int getNumFriend() {
        return numFriend;
    }

    public void setNumFriend(int numFriend) {
        this.numFriend = numFriend;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public boolean isCanEditName() {
        return canEditName;
    }

    public void setCanEditName(boolean canEditName) {
        this.canEditName = canEditName;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isNewModmailExists() {
        return newModmailExists;
    }

    public void setNewModmailExists(boolean newModmailExists) {
        this.newModmailExists = newModmailExists;
    }

    public boolean isPrefAutoplay() {
        return prefAutoplay;
    }

    public void setPrefAutoplay(boolean prefAutoplay) {
        this.prefAutoplay = prefAutoplay;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String getHasPaypalSubscription() {
        return hasPaypalSubscription;
    }

    public void setHasPaypalSubscription(String hasPaypalSubscription) {
        this.hasPaypalSubscription = hasPaypalSubscription;
    }

    public boolean isHasSubscribedToPremium() {
        return hasSubscribedToPremium;
    }

    public void setHasSubscribedToPremium(boolean hasSubscribedToPremium) {
        this.hasSubscribedToPremium = hasSubscribedToPremium;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHasStripeSubscription() {
        return hasStripeSubscription;
    }

    public void setHasStripeSubscription(boolean hasStripeSubscription) {
        this.hasStripeSubscription = hasStripeSubscription;
    }

    public String getOauthClientId() {
        return oauthClientId;
    }

    public void setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    public boolean isCanCreateSubreddit() {
        return canCreateSubreddit;
    }

    public void setCanCreateSubreddit(boolean canCreateSubreddit) {
        this.canCreateSubreddit = canCreateSubreddit;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public boolean isMod() {
        return mod;
    }

    public void setMod(boolean mod) {
        this.mod = mod;
    }

    public int getAwarderKarma() {
        return awarderKarma;
    }

    public void setAwarderKarma(int awarderKarma) {
        this.awarderKarma = awarderKarma;
    }

    public String getSuspensionExpirationUtc() {
        return suspensionExpirationUtc;
    }

    public void setSuspensionExpirationUtc(String suspensionExpirationUtc) {
        this.suspensionExpirationUtc = suspensionExpirationUtc;
    }

    public boolean isHasVerifiedEmail() {
        return hasVerifiedEmail;
    }

    public void setHasVerifiedEmail(boolean hasVerifiedEmail) {
        this.hasVerifiedEmail = hasVerifiedEmail;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public boolean isPrefVideoAutoPlay() {
        return prefVideoAutoPlay;
    }

    public void setPrefVideoAutoPlay(boolean prefVideoAutoPlay) {
        this.prefVideoAutoPlay = prefVideoAutoPlay;
    }

    public boolean isInChat() {
        return inChat;
    }

    public void setInChat(boolean inChat) {
        this.inChat = inChat;
    }

    public boolean isHasAndroidSubscription() {
        return hasAndroidSubscription;
    }

    public void setHasAndroidSubscription(boolean hasAndroidSubscription) {
        this.hasAndroidSubscription = hasAndroidSubscription;
    }

    public boolean isInRedesignBeta() {
        return inRedesignBeta;
    }

    public void setInRedesignBeta(boolean inRedesignBeta) {
        this.inRedesignBeta = inRedesignBeta;
    }

    public boolean isIconImg() {
        return iconImg;
    }

    public void setIconImg(boolean iconImg) {
        this.iconImg = iconImg;
    }

    public boolean isHasModMail() {
        return hasModMail;
    }

    public void setHasModMail(boolean hasModMail) {
        this.hasModMail = hasModMail;
    }

    public boolean isPrefNightmode() {
        return prefNightmode;
    }

    public void setPrefNightmode(boolean prefNightmode) {
        this.prefNightmode = prefNightmode;
    }

    public int getAwardeeKarma() {
        return awardeeKarma;
    }

    public void setAwardeeKarma(int awardeeKarma) {
        this.awardeeKarma = awardeeKarma;
    }

    public boolean isHideFromRobots() {
        return hideFromRobots;
    }

    public void setHideFromRobots(boolean hideFromRobots) {
        this.hideFromRobots = hideFromRobots;
    }

    public boolean isPasswordSet() {
        return passwordSet;
    }

    public void setPasswordSet(boolean passwordSet) {
        this.passwordSet = passwordSet;
    }

    public int getLinkKarma() {
        return linkKarma;
    }

    public void setLinkKarma(int linkKarma) {
        this.linkKarma = linkKarma;
    }

    public boolean isForcePasswordReset() {
        return forcePasswordReset;
    }

    public void setForcePasswordReset(boolean forcePasswordReset) {
        this.forcePasswordReset = forcePasswordReset;
    }

    public int getTotalKarma() {
        return totalKarma;
    }

    public void setTotalKarma(int totalKarma) {
        this.totalKarma = totalKarma;
    }

    public boolean isSeenGibeAwardTooltip() {
        return seenGibeAwardTooltip;
    }

    public void setSeenGibeAwardTooltip(boolean seenGibeAwardTooltip) {
        this.seenGibeAwardTooltip = seenGibeAwardTooltip;
    }

    public int getInboxCount() {
        return inboxCount;
    }

    public void setInboxCount(int inboxCount) {
        this.inboxCount = inboxCount;
    }

    public boolean isSeenPremiumAdblockModal() {
        return seenPremiumAdblockModal;
    }

    public void setSeenPremiumAdblockModal(boolean seenPremiumAdblockModal) {
        this.seenPremiumAdblockModal = seenPremiumAdblockModal;
    }

    public boolean isPrefTopKarmaSubreddits() {
        return prefTopKarmaSubreddits;
    }

    public void setPrefTopKarmaSubreddits(boolean prefTopKarmaSubreddits) {
        this.prefTopKarmaSubreddits = prefTopKarmaSubreddits;
    }

    public boolean isHasMail() {
        return hasMail;
    }

    public void setHasMail(boolean hasMail) {
        this.hasMail = hasMail;
    }

    public boolean isPrefShowSnoovatar() {
        return prefShowSnoovatar;
    }

    public void setPrefShowSnoovatar(boolean prefShowSnoovatar) {
        this.prefShowSnoovatar = prefShowSnoovatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrefClickgadget() {
        return prefClickgadget;
    }

    public void setPrefClickgadget(int prefClickgadget) {
        this.prefClickgadget = prefClickgadget;
    }

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }

    public int getGoldCreddits() {
        return goldCreddits;
    }

    public void setGoldCreddits(int goldCreddits) {
        this.goldCreddits = goldCreddits;
    }

    public double getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(double createdUtc) {
        this.createdUtc = createdUtc;
    }

    public boolean isHasIosSubscription() {
        return hasIosSubscription;
    }

    public void setHasIosSubscription(boolean hasIosSubscription) {
        this.hasIosSubscription = hasIosSubscription;
    }

    public boolean isPrefShowTwitter() {
        return prefShowTwitter;
    }

    public void setPrefShowTwitter(boolean prefShowTwitter) {
        this.prefShowTwitter = prefShowTwitter;
    }

    public boolean isInBeta() {
        return inBeta;
    }

    public void setInBeta(boolean inBeta) {
        this.inBeta = inBeta;
    }

    public int getCommentKarma() {
        return commentKarma;
    }

    public void setCommentKarma(int commentKarma) {
        this.commentKarma = commentKarma;
    }

    public boolean isAcceptFollowers() {
        return acceptFollowers;
    }

    public void setAcceptFollowers(boolean acceptFollowers) {
        this.acceptFollowers = acceptFollowers;
    }

    public boolean isHasSubscribed() {
        return hasSubscribed;
    }

    public void setHasSubscribed(boolean hasSubscribed) {
        this.hasSubscribed = hasSubscribed;
    }

    public List<String> getLinkedIdentities() {
        return linkedIdentities;
    }

    public void setLinkedIdentities(List<String> linkedIdentities) {
        this.linkedIdentities = linkedIdentities;
    }

    public boolean isSeenSubredditChatFtux() {
        return seenSubredditChatFtux;
    }

    public void setSeenSubredditChatFtux(boolean seenSubredditChatFtux) {
        this.seenSubredditChatFtux = seenSubredditChatFtux;
    }

    @Override
    public String toString() {
        return "User{" +
                "employee=" + employee +
                ", seenLayoutSwitch=" + seenLayoutSwitch +
                ", hasVisitedNewProfile=" + hasVisitedNewProfile +
                ", prefNoProfanity=" + prefNoProfanity +
                ", hasExternalAccount=" + hasExternalAccount +
                ", prefGeoPopular='" + prefGeoPopular + '\'' +
                ", seenRedesignModal=" + seenRedesignModal +
                ", prefShowTrending=" + prefShowTrending +
                ", subreddit=" + subreddit +
                ", prefShowPresence=" + prefShowPresence +
                ", snoovatarImg='" + snoovatarImg + '\'' +
                ", snoovatarSize=" + snoovatarSize +
                ", goldExpiration='" + goldExpiration + '\'' +
                ", hasGoldSubscription=" + hasGoldSubscription +
                ", sponsor=" + sponsor +
                ", numFriend=" + numFriend +
                ", features=" + features +
                ", canEditName=" + canEditName +
                ", verified=" + verified +
                ", newModmailExists=" + newModmailExists +
                ", prefAutoplay=" + prefAutoplay +
                ", coins=" + coins +
                ", hasPaypalSubscription='" + hasPaypalSubscription + '\'' +
                ", hasSubscribedToPremium=" + hasSubscribedToPremium +
                ", id='" + id + '\'' +
                ", hasStripeSubscription=" + hasStripeSubscription +
                ", oauthClientId='" + oauthClientId + '\'' +
                ", canCreateSubreddit=" + canCreateSubreddit +
                ", over18=" + over18 +
                ", gold=" + gold +
                ", mod=" + mod +
                ", awarderKarma=" + awarderKarma +
                ", suspensionExpirationUtc='" + suspensionExpirationUtc + '\'' +
                ", hasVerifiedEmail=" + hasVerifiedEmail +
                ", suspended=" + suspended +
                ", prefVideoAutoPlay=" + prefVideoAutoPlay +
                ", inChat=" + inChat +
                ", hasAndroidSubscription=" + hasAndroidSubscription +
                ", inRedesignBeta=" + inRedesignBeta +
                ", iconImg=" + iconImg +
                ", hasModMail=" + hasModMail +
                ", prefNightmode=" + prefNightmode +
                ", awardeeKarma=" + awardeeKarma +
                ", hideFromRobots=" + hideFromRobots +
                ", passwordSet=" + passwordSet +
                ", linkKarma=" + linkKarma +
                ", forcePasswordReset=" + forcePasswordReset +
                ", totalKarma=" + totalKarma +
                ", seenGibeAwardTooltip=" + seenGibeAwardTooltip +
                ", inboxCount=" + inboxCount +
                ", seenPremiumAdblockModal=" + seenPremiumAdblockModal +
                ", prefTopKarmaSubreddits=" + prefTopKarmaSubreddits +
                ", hasMail=" + hasMail +
                ", prefShowSnoovatar=" + prefShowSnoovatar +
                ", name='" + name + '\'' +
                ", prefClickgadget=" + prefClickgadget +
                ", created=" + created +
                ", goldCreddits=" + goldCreddits +
                ", createdUtc=" + createdUtc +
                ", hasIosSubscription=" + hasIosSubscription +
                ", prefShowTwitter=" + prefShowTwitter +
                ", inBeta=" + inBeta +
                ", commentKarma=" + commentKarma +
                ", acceptFollowers=" + acceptFollowers +
                ", hasSubscribed=" + hasSubscribed +
                ", linkedIdentities=" + linkedIdentities +
                ", seenSubredditChatFtux=" + seenSubredditChatFtux +
                '}';
    }
}
