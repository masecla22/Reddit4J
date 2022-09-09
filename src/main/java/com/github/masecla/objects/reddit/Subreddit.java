package com.github.masecla.objects.reddit;

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

    public boolean isDefaultSet() {
        return defaultSet;
    }

    public void setDefaultSet(boolean defaultSet) {
        this.defaultSet = defaultSet;
    }

    public boolean isUserContributor() {
        return userContributor;
    }

    public void setUserContributor(boolean userContributor) {
        this.userContributor = userContributor;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public boolean isRestrictPosting() {
        return restrictPosting;
    }

    public void setRestrictPosting(boolean restrictPosting) {
        this.restrictPosting = restrictPosting;
    }

    public boolean isUserBanned() {
        return userBanned;
    }

    public void setUserBanned(boolean userBanned) {
        this.userBanned = userBanned;
    }

    public boolean isFreeFromReports() {
        return freeFromReports;
    }

    public void setFreeFromReports(boolean freeFromReports) {
        this.freeFromReports = freeFromReports;
    }

    public String getCommunityIcon() {
        return communityIcon;
    }

    public void setCommunityIcon(String communityIcon) {
        this.communityIcon = communityIcon;
    }

    public boolean isShowMedia() {
        return showMedia;
    }

    public void setShowMedia(boolean showMedia) {
        this.showMedia = showMedia;
    }

    public String getIconColor() {
        return iconColor;
    }

    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    public String getUserIsMuted() {
        return userIsMuted;
    }

    public void setUserIsMuted(String userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public List<String> getPreviousNames() {
        return previousNames;
    }

    public void setPreviousNames(List<String> previousNames) {
        this.previousNames = previousNames;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<JsonElement> getAllowedMediaInComments() {
        return allowedMediaInComments;
    }

    public void setAllowedMediaInComments(List<JsonElement> allowedMediaInComments) {
        this.allowedMediaInComments = allowedMediaInComments;
    }

    public String getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public void setSubmitLinkLabel(String submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    public String getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(String headerSize) {
        this.headerSize = headerSize;
    }

    public boolean isRestrictCommenting() {
        return restrictCommenting;
    }

    public void setRestrictCommenting(boolean restrictCommenting) {
        this.restrictCommenting = restrictCommenting;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public void setSubmitTextLabel(String submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    public boolean isDefaultIcon() {
        return defaultIcon;
    }

    public void setDefaultIcon(boolean defaultIcon) {
        this.defaultIcon = defaultIcon;
    }

    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    public void setLinkFlairPosition(String linkFlairPosition) {
        this.linkFlairPosition = linkFlairPosition;
    }

    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    public void setDisplayNamePrefixed(String displayNamePrefixed) {
        this.displayNamePrefixed = displayNamePrefixed;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultBanner() {
        return defaultBanner;
    }

    public void setDefaultBanner(boolean defaultBanner) {
        this.defaultBanner = defaultBanner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(String bannerSize) {
        this.bannerSize = bannerSize;
    }

    public boolean isUserModerator() {
        return userModerator;
    }

    public void setUserModerator(boolean userModerator) {
        this.userModerator = userModerator;
    }

    public boolean isAcceptFollowers() {
        return acceptFollowers;
    }

    public void setAcceptFollowers(boolean acceptFollowers) {
        this.acceptFollowers = acceptFollowers;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public boolean isLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public void setLinkFlairEnabled(boolean linkFlairEnabled) {
        this.linkFlairEnabled = linkFlairEnabled;
    }

    public boolean isDisableContributorRequests() {
        return disableContributorRequests;
    }

    public void setDisableContributorRequests(boolean disableContributorRequests) {
        this.disableContributorRequests = disableContributorRequests;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public boolean isUserSubscriber() {
        return userSubscriber;
    }

    public void setUserSubscriber(boolean userSubscriber) {
        this.userSubscriber = userSubscriber;
    }

    @Override
    public String toString() {
        return "Subreddit{" +
                "defaultSet=" + defaultSet +
                ", userContributor=" + userContributor +
                ", bannerImg='" + bannerImg + '\'' +
                ", restrictPosting=" + restrictPosting +
                ", userBanned=" + userBanned +
                ", freeFromReports=" + freeFromReports +
                ", communityIcon='" + communityIcon + '\'' +
                ", showMedia=" + showMedia +
                ", iconColor='" + iconColor + '\'' +
                ", userIsMuted='" + userIsMuted + '\'' +
                ", displayName='" + displayName + '\'' +
                ", headerImg='" + headerImg + '\'' +
                ", title='" + title + '\'' +
                ", coins=" + coins +
                ", previousNames=" + previousNames +
                ", over18=" + over18 +
                ", iconSize=" + iconSize +
                ", primaryColor='" + primaryColor + '\'' +
                ", iconImg='" + iconImg + '\'' +
                ", description='" + description + '\'' +
                ", allowedMediaInComments=" + allowedMediaInComments +
                ", submitLinkLabel='" + submitLinkLabel + '\'' +
                ", headerSize='" + headerSize + '\'' +
                ", restrictCommenting=" + restrictCommenting +
                ", subscribers=" + subscribers +
                ", submitTextLabel='" + submitTextLabel + '\'' +
                ", defaultIcon=" + defaultIcon +
                ", linkFlairPosition='" + linkFlairPosition + '\'' +
                ", displayNamePrefixed='" + displayNamePrefixed + '\'' +
                ", keyColor='" + keyColor + '\'' +
                ", name='" + name + '\'' +
                ", defaultBanner=" + defaultBanner +
                ", url='" + url + '\'' +
                ", quarantine=" + quarantine +
                ", bannerSize='" + bannerSize + '\'' +
                ", userModerator=" + userModerator +
                ", acceptFollowers=" + acceptFollowers +
                ", publicDescription='" + publicDescription + '\'' +
                ", linkFlairEnabled=" + linkFlairEnabled +
                ", disableContributorRequests=" + disableContributorRequests +
                ", subredditType='" + subredditType + '\'' +
                ", userSubscriber=" + userSubscriber +
                '}';
    }
}
