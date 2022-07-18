package com.github.masecla.objects.reddit;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Link {
    @SerializedName("approved_at_utc")
    private String approvedAtUtc; // TODO: 18.07.2022 what are the possible values?

    @SerializedName("subreddit")
    private String subreddit;

    @SerializedName("selftext")
    private String selftext;

    @SerializedName("author_fullname")
    private String authorFullname;

    @SerializedName("saved")
    private boolean saved;

    @SerializedName("mod_reason_title")
    private String modReasonTitle;

    @SerializedName("gilded")
    private int gilded;

    @SerializedName("clicked")
    private boolean clicked;

    @SerializedName("is_gallery")
    private boolean gallery;

    @SerializedName("title")
    private String title;

    @SerializedName("link_flair_richtext")
    private JsonArray linkFlairRichtext;

    @SerializedName("subreddit_name_prefixed")
    private String subredditNamePrefixed;

    @SerializedName("hidden")
    private boolean hidden;

    @SerializedName("pwls")
    private int pwls;

    @SerializedName("link_flair_css_class")
    private String linkFlairCssClass;

    @SerializedName("downs")
    private int downs;

    @SerializedName("thumbnail_height")
    private int thumbnail_height;

    @SerializedName("top_awarded_type")
    private String topAwardedType;

    @SerializedName("hide_score")
    private boolean hideScope;

    @SerializedName("name")
    private String name;

    @SerializedName("quarantine")
    private boolean quarantine;

    @SerializedName("link_flair_text_color")
    private String linkFlairTextColor;

    @SerializedName("upvote_ratio")
    private double upvoteRatio;

    @SerializedName("author_flair_background_color")
    private String authorFlairBackgroundColor;

    @SerializedName("subreddit_type")
    private String subredditType;

    @SerializedName("ups")
    private int ups;

    @SerializedName("total_awards_received")
    private int totalAwardsReceived;

    @SerializedName("media_embed")
    private JsonElement mediaEmbed; // TODO: 18.07.2022 what are the possible values?

    @SerializedName("thumbnail_width")
    private int thumbnailWidth;

    @SerializedName("author_flair_template_id")
    private String authorFlairTemplateId;

    @SerializedName("is_original_content")
    private boolean originalContent;

    @SerializedName("user_reports")
    private JsonArray userReports; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("secure_media")
    private Media secureMedia;

    @SerializedName("is_reddit_media_domain")
    private boolean redditMediaDomain;

    @SerializedName("is_meta")
    private boolean meta;

    @SerializedName("category")
    private String category;

    @SerializedName("secure_media_embed")
    private JsonElement secureMediaEmbed; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("link_flair_text")
    private String linkFlairText;

    @SerializedName("can_mod_post")
    private boolean canModPost;

    @SerializedName("score")
    private int score;

    @SerializedName("approved_by")
    private String approvedBy;

    @SerializedName("is_created_from_ads_ui")
    private boolean createdFromAdsUi;

    @SerializedName("author_premium")
    private String authorPremium;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("edited")
    private boolean edited;

    @SerializedName("author_flair_css_class")
    private String authorFlairCssClass;

    @SerializedName("author_flair_richtext")
    private JsonArray authorFlairRichtext; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("gildings")
    private JsonElement gildings; // TODO: 18.07.2022 What are the possible values?

    @SerializedName("post_hint")
    private String postHint;

    @SerializedName("content_categories")
    private String contentCategories;

    @SerializedName("is_self")
    private boolean self;

    @SerializedName("mod_note")
    private String modNote;

    @SerializedName("created")
    private long created;

    @SerializedName("link_flair_type")
    private String linkFlairType;

    @SerializedName("wls")
    private int wls;

    @SerializedName("removed_by_category")
    private String removedByCategory;

    @SerializedName("banned_by")
    private String bannedBy;

    @SerializedName("author_flair_type")
    private String authorFlairType;

    @SerializedName("domain")
    private String domain;

    @SerializedName("allow_live_comments")
    private boolean allowLiveComments;

    @SerializedName("selftext_html")
    private String selftextHtml;

    @SerializedName("likes")
    private String likes;

    @SerializedName("suggested_sort")
    private String suggestedSort;

    @SerializedName("banned_at_utc")
    private String bannedAtUtc;

    @SerializedName("url_overridden_by_dest")
    private String urlOverriddenByDest;

    @SerializedName("view_count")
    private String viewCount;

    @SerializedName("archived")
    private boolean archived;

    @SerializedName("no_follow")
    private boolean noFollow;

    @SerializedName("is_crosspostable")
    private boolean crosspostable;

    @SerializedName("pinned")
    private boolean pinned;

    @SerializedName("over_18")
    private boolean over18;

    @SerializedName("preview")
    private Preview preview;

    @SerializedName("all_awardings")
    private JsonArray allAwardings;

    @SerializedName("awarders")
    private JsonArray awarders;

    @SerializedName("media_only")
    private boolean mediaOnly;

    @SerializedName("can_gild")
    private Boolean canGild;

    @SerializedName("spoiler")
    private boolean spoiler;

    @SerializedName("locked")
    private boolean locked;

    @SerializedName("author_flair_text")
    private String authorFlairText;

    @SerializedName("treatment_tags")
    private JsonArray treatmentTags;

    @SerializedName("visited")
    private boolean visited;

    @SerializedName("removed_by")
    private String removedBy;

    @SerializedName("num_reports")
    private String numReports;

    @SerializedName("distinguished")
    private String distinguished;

    @SerializedName("subreddit_id")
    private String subredditId;

    @SerializedName("author_is_blocked")
    private boolean authorBlocked;

    @SerializedName("mod_reason_by")
    private String modReasonBy;

    @SerializedName("removal_reason")
    private String removalReason;

    @SerializedName("link_flair_background_color")
    private String linkFlairBackgroundColor;

    @SerializedName("id")
    private String id;

    @SerializedName("is_robot_indexable")
    private boolean robotIndexable;

    @SerializedName("report_reasons")
    private String reportReasons;

    @SerializedName("author")
    private String author;

    @SerializedName("discussion_type")
    private String discussionType;

    @SerializedName("num_comments")
    private int numComments;

    @SerializedName("send_replies")
    private boolean sendReplies;

    @SerializedName("whitelist_status")
    private String whitelistStatus;

    @SerializedName("contest_mode")
    private boolean contestMode;

    @SerializedName("mod_reports")
    private JsonArray modReports;

    @SerializedName("author_patreon_flair")
    private boolean authorPatreonFlair;

    @SerializedName("author_flair_text_color")
    private String authorFlairTextColor;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("parent_whitelist_status")
    private String parentWhitelistStatus;

    @SerializedName("stickied")
    private boolean stickied;

    @SerializedName("url")
    private String url;

    @SerializedName("subreddit_subscribers")
    private int subredditSubscribers;

    @SerializedName("created_utc")
    private long createdUtc;

    @SerializedName("num_crossposts")
    private int numCrossposts;

    @SerializedName("media")
    private Media media;

    @SerializedName("is_video")
    private boolean video;

    @SerializedName("media_metadata")
    private Map<String, Metadata> mediaMetadata;

    @SerializedName("gallery_data")
    private GalleryData galleryData;

    public String getApprovedAtUtc() {
        return approvedAtUtc;
    }

    public void setApprovedAtUtc(String approvedAtUtc) {
        this.approvedAtUtc = approvedAtUtc;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getAuthorFullname() {
        return authorFullname;
    }

    public void setAuthorFullname(String authorFullname) {
        this.authorFullname = authorFullname;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public String getModReasonTitle() {
        return modReasonTitle;
    }

    public void setModReasonTitle(String modReasonTitle) {
        this.modReasonTitle = modReasonTitle;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isGallery() {
        return gallery;
    }

    public void setGallery(boolean gallery) {
        this.gallery = gallery;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JsonArray getLinkFlairRichtext() {
        return linkFlairRichtext;
    }

    public void setLinkFlairRichtext(JsonArray linkFlairRichtext) {
        this.linkFlairRichtext = linkFlairRichtext;
    }

    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public int getPwls() {
        return pwls;
    }

    public void setPwls(int pwls) {
        this.pwls = pwls;
    }

    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public int getThumbnail_height() {
        return thumbnail_height;
    }

    public void setThumbnail_height(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
    }

    public String getTopAwardedType() {
        return topAwardedType;
    }

    public void setTopAwardedType(String topAwardedType) {
        this.topAwardedType = topAwardedType;
    }

    public boolean isHideScope() {
        return hideScope;
    }

    public void setHideScope(boolean hideScope) {
        this.hideScope = hideScope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getLinkFlairTextColor() {
        return linkFlairTextColor;
    }

    public void setLinkFlairTextColor(String linkFlairTextColor) {
        this.linkFlairTextColor = linkFlairTextColor;
    }

    public double getUpvoteRatio() {
        return upvoteRatio;
    }

    public void setUpvoteRatio(double upvoteRatio) {
        this.upvoteRatio = upvoteRatio;
    }

    public String getAuthorFlairBackgroundColor() {
        return authorFlairBackgroundColor;
    }

    public void setAuthorFlairBackgroundColor(String authorFlairBackgroundColor) {
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public int getTotalAwardsReceived() {
        return totalAwardsReceived;
    }

    public void setTotalAwardsReceived(int totalAwardsReceived) {
        this.totalAwardsReceived = totalAwardsReceived;
    }

    public JsonElement getMediaEmbed() {
        return mediaEmbed;
    }

    public void setMediaEmbed(JsonElement mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public String getAuthorFlairTemplateId() {
        return authorFlairTemplateId;
    }

    public void setAuthorFlairTemplateId(String authorFlairTemplateId) {
        this.authorFlairTemplateId = authorFlairTemplateId;
    }

    public boolean isOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(boolean originalContent) {
        this.originalContent = originalContent;
    }

    public JsonArray getUserReports() {
        return userReports;
    }

    public void setUserReports(JsonArray userReports) {
        this.userReports = userReports;
    }

    public Media getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(Media secureMedia) {
        this.secureMedia = secureMedia;
    }

    public boolean isRedditMediaDomain() {
        return redditMediaDomain;
    }

    public void setRedditMediaDomain(boolean redditMediaDomain) {
        this.redditMediaDomain = redditMediaDomain;
    }

    public boolean isMeta() {
        return meta;
    }

    public void setMeta(boolean meta) {
        this.meta = meta;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public JsonElement getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public void setSecureMediaEmbed(JsonElement secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    public String getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public boolean isCanModPost() {
        return canModPost;
    }

    public void setCanModPost(boolean canModPost) {
        this.canModPost = canModPost;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public boolean isCreatedFromAdsUi() {
        return createdFromAdsUi;
    }

    public void setCreatedFromAdsUi(boolean createdFromAdsUi) {
        this.createdFromAdsUi = createdFromAdsUi;
    }

    public String getAuthorPremium() {
        return authorPremium;
    }

    public void setAuthorPremium(String authorPremium) {
        this.authorPremium = authorPremium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public JsonArray getAuthorFlairRichtext() {
        return authorFlairRichtext;
    }

    public void setAuthorFlairRichtext(JsonArray authorFlairRichtext) {
        this.authorFlairRichtext = authorFlairRichtext;
    }

    public JsonElement getGildings() {
        return gildings;
    }

    public void setGildings(JsonElement gildings) {
        this.gildings = gildings;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public String getContentCategories() {
        return contentCategories;
    }

    public void setContentCategories(String contentCategories) {
        this.contentCategories = contentCategories;
    }

    public boolean isSelf() {
        return self;
    }

    public void setSelf(boolean self) {
        this.self = self;
    }

    public String getModNote() {
        return modNote;
    }

    public void setModNote(String modNote) {
        this.modNote = modNote;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getLinkFlairType() {
        return linkFlairType;
    }

    public void setLinkFlairType(String linkFlairType) {
        this.linkFlairType = linkFlairType;
    }

    public int getWls() {
        return wls;
    }

    public void setWls(int wls) {
        this.wls = wls;
    }

    public String getRemovedByCategory() {
        return removedByCategory;
    }

    public void setRemovedByCategory(String removedByCategory) {
        this.removedByCategory = removedByCategory;
    }

    public String getBannedBy() {
        return bannedBy;
    }

    public void setBannedBy(String bannedBy) {
        this.bannedBy = bannedBy;
    }

    public String getAuthorFlairType() {
        return authorFlairType;
    }

    public void setAuthorFlairType(String authorFlairType) {
        this.authorFlairType = authorFlairType;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean isAllowLiveComments() {
        return allowLiveComments;
    }

    public void setAllowLiveComments(boolean allowLiveComments) {
        this.allowLiveComments = allowLiveComments;
    }

    public String getSelftextHtml() {
        return selftextHtml;
    }

    public void setSelftextHtml(String selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(String suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public String getBannedAtUtc() {
        return bannedAtUtc;
    }

    public void setBannedAtUtc(String bannedAtUtc) {
        this.bannedAtUtc = bannedAtUtc;
    }

    public String getUrlOverriddenByDest() {
        return urlOverriddenByDest;
    }

    public void setUrlOverriddenByDest(String urlOverriddenByDest) {
        this.urlOverriddenByDest = urlOverriddenByDest;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isNoFollow() {
        return noFollow;
    }

    public void setNoFollow(boolean noFollow) {
        this.noFollow = noFollow;
    }

    public boolean isCrosspostable() {
        return crosspostable;
    }

    public void setCrosspostable(boolean crosspostable) {
        this.crosspostable = crosspostable;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public JsonArray getAllAwardings() {
        return allAwardings;
    }

    public void setAllAwardings(JsonArray allAwardings) {
        this.allAwardings = allAwardings;
    }

    public JsonArray getAwarders() {
        return awarders;
    }

    public void setAwarders(JsonArray awarders) {
        this.awarders = awarders;
    }

    public boolean isMediaOnly() {
        return mediaOnly;
    }

    public void setMediaOnly(boolean mediaOnly) {
        this.mediaOnly = mediaOnly;
    }

    public Boolean getCanGild() {
        return canGild;
    }

    public void setCanGild(Boolean canGild) {
        this.canGild = canGild;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(String authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public JsonArray getTreatmentTags() {
        return treatmentTags;
    }

    public void setTreatmentTags(JsonArray treatmentTags) {
        this.treatmentTags = treatmentTags;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(String removedBy) {
        this.removedBy = removedBy;
    }

    public String getNumReports() {
        return numReports;
    }

    public void setNumReports(String numReports) {
        this.numReports = numReports;
    }

    public String getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(String distinguished) {
        this.distinguished = distinguished;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public boolean isAuthorBlocked() {
        return authorBlocked;
    }

    public void setAuthorBlocked(boolean authorBlocked) {
        this.authorBlocked = authorBlocked;
    }

    public String getModReasonBy() {
        return modReasonBy;
    }

    public void setModReasonBy(String modReasonBy) {
        this.modReasonBy = modReasonBy;
    }

    public String getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(String removalReason) {
        this.removalReason = removalReason;
    }

    public String getLinkFlairBackgroundColor() {
        return linkFlairBackgroundColor;
    }

    public void setLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
        this.linkFlairBackgroundColor = linkFlairBackgroundColor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isRobotIndexable() {
        return robotIndexable;
    }

    public void setRobotIndexable(boolean robotIndexable) {
        this.robotIndexable = robotIndexable;
    }

    public String getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(String reportReasons) {
        this.reportReasons = reportReasons;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDiscussionType() {
        return discussionType;
    }

    public void setDiscussionType(String discussionType) {
        this.discussionType = discussionType;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public boolean isSendReplies() {
        return sendReplies;
    }

    public void setSendReplies(boolean sendReplies) {
        this.sendReplies = sendReplies;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public boolean isContestMode() {
        return contestMode;
    }

    public void setContestMode(boolean contestMode) {
        this.contestMode = contestMode;
    }

    public JsonArray getModReports() {
        return modReports;
    }

    public void setModReports(JsonArray modReports) {
        this.modReports = modReports;
    }

    public boolean isAuthorPatreonFlair() {
        return authorPatreonFlair;
    }

    public void setAuthorPatreonFlair(boolean authorPatreonFlair) {
        this.authorPatreonFlair = authorPatreonFlair;
    }

    public String getAuthorFlairTextColor() {
        return authorFlairTextColor;
    }

    public void setAuthorFlairTextColor(String authorFlairTextColor) {
        this.authorFlairTextColor = authorFlairTextColor;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    public boolean isStickied() {
        return stickied;
    }

    public void setStickied(boolean stickied) {
        this.stickied = stickied;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSubredditSubscribers() {
        return subredditSubscribers;
    }

    public void setSubredditSubscribers(int subredditSubscribers) {
        this.subredditSubscribers = subredditSubscribers;
    }

    public long getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(long createdUtc) {
        this.createdUtc = createdUtc;
    }

    public int getNumCrossposts() {
        return numCrossposts;
    }

    public void setNumCrossposts(int numCrossposts) {
        this.numCrossposts = numCrossposts;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public Map<String, Metadata> getMediaMetadata() {
        return mediaMetadata;
    }

    public void setMediaMetadata(Map<String, Metadata> mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
    }

    public GalleryData getGalleryData() {
        return galleryData;
    }

    public void setGalleryData(GalleryData galleryData) {
        this.galleryData = galleryData;
    }

    @Override
    public String toString() {
        return "Link{" +
                "approvedAtUtc='" + approvedAtUtc + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", selftext='" + selftext + '\'' +
                ", authorFullname='" + authorFullname + '\'' +
                ", saved=" + saved +
                ", modReasonTitle='" + modReasonTitle + '\'' +
                ", gilded=" + gilded +
                ", clicked=" + clicked +
                ", gallery=" + gallery +
                ", title='" + title + '\'' +
                ", linkFlairRichtext=" + linkFlairRichtext +
                ", subredditNamePrefixed='" + subredditNamePrefixed + '\'' +
                ", hidden=" + hidden +
                ", pwls=" + pwls +
                ", linkFlairCssClass='" + linkFlairCssClass + '\'' +
                ", downs=" + downs +
                ", thumbnail_height=" + thumbnail_height +
                ", topAwardedType='" + topAwardedType + '\'' +
                ", hideScope=" + hideScope +
                ", name='" + name + '\'' +
                ", quarantine=" + quarantine +
                ", linkFlairTextColor='" + linkFlairTextColor + '\'' +
                ", upvoteRatio=" + upvoteRatio +
                ", authorFlairBackgroundColor='" + authorFlairBackgroundColor + '\'' +
                ", subredditType='" + subredditType + '\'' +
                ", ups=" + ups +
                ", totalAwardsReceived=" + totalAwardsReceived +
                ", mediaEmbed=" + mediaEmbed +
                ", thumbnailWidth=" + thumbnailWidth +
                ", authorFlairTemplateId='" + authorFlairTemplateId + '\'' +
                ", originalContent=" + originalContent +
                ", userReports=" + userReports +
                ", secureMedia=" + secureMedia +
                ", redditMediaDomain=" + redditMediaDomain +
                ", meta=" + meta +
                ", category='" + category + '\'' +
                ", secureMediaEmbed=" + secureMediaEmbed +
                ", linkFlairText='" + linkFlairText + '\'' +
                ", canModPost=" + canModPost +
                ", score=" + score +
                ", approvedBy='" + approvedBy + '\'' +
                ", createdFromAdsUi=" + createdFromAdsUi +
                ", authorPremium='" + authorPremium + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", edited=" + edited +
                ", authorFlairCssClass='" + authorFlairCssClass + '\'' +
                ", authorFlairRichtext=" + authorFlairRichtext +
                ", gildings=" + gildings +
                ", postHint='" + postHint + '\'' +
                ", contentCategories='" + contentCategories + '\'' +
                ", self=" + self +
                ", modNote='" + modNote + '\'' +
                ", created=" + created +
                ", linkFlairType='" + linkFlairType + '\'' +
                ", wls=" + wls +
                ", removedByCategory='" + removedByCategory + '\'' +
                ", bannedBy='" + bannedBy + '\'' +
                ", authorFlairType='" + authorFlairType + '\'' +
                ", domain='" + domain + '\'' +
                ", allowLiveComments=" + allowLiveComments +
                ", selftextHtml='" + selftextHtml + '\'' +
                ", likes='" + likes + '\'' +
                ", suggestedSort='" + suggestedSort + '\'' +
                ", bannedAtUtc='" + bannedAtUtc + '\'' +
                ", urlOverriddenByDest='" + urlOverriddenByDest + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", archived=" + archived +
                ", noFollow=" + noFollow +
                ", crosspostable=" + crosspostable +
                ", pinned=" + pinned +
                ", over18=" + over18 +
                ", preview=" + preview +
                ", allAwardings=" + allAwardings +
                ", awarders=" + awarders +
                ", mediaOnly=" + mediaOnly +
                ", canGild=" + canGild +
                ", spoiler=" + spoiler +
                ", locked=" + locked +
                ", authorFlairText='" + authorFlairText + '\'' +
                ", treatmentTags=" + treatmentTags +
                ", visited=" + visited +
                ", removedBy='" + removedBy + '\'' +
                ", numReports='" + numReports + '\'' +
                ", distinguished='" + distinguished + '\'' +
                ", subredditId='" + subredditId + '\'' +
                ", authorBlocked=" + authorBlocked +
                ", modReasonBy='" + modReasonBy + '\'' +
                ", removalReason='" + removalReason + '\'' +
                ", linkFlairBackgroundColor='" + linkFlairBackgroundColor + '\'' +
                ", id='" + id + '\'' +
                ", robotIndexable=" + robotIndexable +
                ", reportReasons='" + reportReasons + '\'' +
                ", author='" + author + '\'' +
                ", discussionType='" + discussionType + '\'' +
                ", numComments=" + numComments +
                ", sendReplies=" + sendReplies +
                ", whitelistStatus='" + whitelistStatus + '\'' +
                ", contestMode=" + contestMode +
                ", modReports=" + modReports +
                ", authorPatreonFlair=" + authorPatreonFlair +
                ", authorFlairTextColor='" + authorFlairTextColor + '\'' +
                ", permalink='" + permalink + '\'' +
                ", parentWhitelistStatus='" + parentWhitelistStatus + '\'' +
                ", stickied=" + stickied +
                ", url='" + url + '\'' +
                ", subredditSubscribers=" + subredditSubscribers +
                ", createdUtc=" + createdUtc +
                ", numCrossposts=" + numCrossposts +
                ", media=" + media +
                ", video=" + video +
                ", mediaMetadata=" + mediaMetadata +
                ", galleryData=" + galleryData +
                '}';
    }
}
