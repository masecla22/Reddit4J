package masecla.reddit4j.objects.subreddit;

import java.awt.Color;

import com.google.gson.Gson;

import masecla.reddit4j.objects.RedditObject;
import masecla.reddit4j.objects.preferences.enums.Language;

public class SubredditSettings extends RedditObject {
	private boolean default_set; // true
	private int toxicity_threshold_chat_level; // 1
	private int crowd_control_chat_level; // 1
	private boolean disable_contributor_requests; // false
	private String public_description; // "This is the official subreddit of the Mattcraft server"
	private String subreddit_id; // "t5_3mvuu"
	private boolean allow_images; // true
	private boolean free_form_reports; // true
	private String domain; // null
	private boolean show_media; // true
	private int wiki_edit_age; // 0
	private String submit_text; // "This is the official subreddit of the Mattcraft server"
	private boolean allow_polls; // true
	private String title; // "mattcraft"
	private boolean collapse_deleted_comments; // false
	private String wikimode; // "disabled"
	private boolean over_18; // false
	private boolean allow_videos; // true
	private boolean spoilers_enabled; // true
	private boolean new_pinned_post_pns_enabled; // true
	private boolean crowd_control_mode; // false
	private boolean welcome_message_enabled; // false
	private String welcome_message_text; // null
	private String suggested_comment_sort; // Could be DefaultCommentSort
	private boolean restrict_posting; // true
	private boolean original_content_tag_enabled; // false
	private String description; // "This is the official subreddit of the Mattcraft server"
	private String submit_link_label; // null
	private boolean allow_galleries; // true
	private boolean allow_post_crossposts; // true
	private String spam_comments; // "low"
	private boolean public_traffic; // false
	private boolean restrict_commenting; // false
	private int crowd_control_level; // 0
	private String submit_text_label; // null
	private boolean all_original_content; // false
	private String spam_selfposts; // "high"
	private Color key_color;
	private Language language; // "en"
	private int wiki_edit_karma; // 100
	private boolean hide_ads; // false
	private int prediction_leaderboard_entry_type; // 1
	private String header_hover_text;
	private boolean allow_chat_post_creation; // false
	private boolean allow_discovery; // true
	private boolean accept_followers; // true
	private boolean exclude_banned_modqueue; // false
	private boolean allow_predictions_tournament; // false
	private boolean show_media_preview; // true
	private int comment_score_hide_mins; // 0
	private String subreddit_type; // "public"
	private String spam_links; // "high"
	private boolean allow_predictions; // false
	private boolean user_flair_pns_enabled; // true
	private String content_options; // "any"

	@Override
	public Gson getGson() {
		return new RedditSubreddit().getGson();
	}

	public boolean isDefaultSet() {
		return default_set;
	}

	public int getToxicityThresholdChatLevel() {
		return toxicity_threshold_chat_level;
	}

	public int getCrowdControlChatLevel() {
		return crowd_control_chat_level;
	}

	public boolean doesDisableContributorRequests() {
		return disable_contributor_requests;
	}

	public String getPublicDescription() {
		return public_description;
	}

	public String getSubredditId() {
		return subreddit_id;
	}

	public boolean doesAllowImages() {
		return allow_images;
	}

	public boolean isFreeFormReports() {
		return free_form_reports;
	}

	public String getDomain() {
		return domain;
	}

	public boolean doesShowMedia() {
		return show_media;
	}

	public int getWikiEditAge() {
		return wiki_edit_age;
	}

	public String getSubmitText() {
		return submit_text;
	}

	public boolean doesAllowPolls() {
		return allow_polls;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCollapseDeletedComments() {
		return collapse_deleted_comments;
	}

	public String getWikiMode() {
		return wikimode;
	}

	public boolean isOver18() {
		return over_18;
	}

	public boolean isAllowVideos() {
		return allow_videos;
	}

	public boolean isSpoilersEnabled() {
		return spoilers_enabled;
	}

	public boolean isNewPinnedPostPnsEnabled() {
		return new_pinned_post_pns_enabled;
	}

	public boolean isCrowdControlMode() {
		return crowd_control_mode;
	}

	public boolean isWelcomeMessageEnabled() {
		return welcome_message_enabled;
	}

	public String getWelcomeMessageText() {
		return welcome_message_text;
	}

	public String getSuggestedCommentSort() {
		return suggested_comment_sort;
	}

	public boolean doesRestrictPosting() {
		return restrict_posting;
	}

	public boolean isOriginalContentTagEnabled() {
		return original_content_tag_enabled;
	}

	public String getDescription() {
		return description;
	}

	public String getSubmitLinkLabel() {
		return submit_link_label;
	}

	public boolean doesAllowGalleries() {
		return allow_galleries;
	}

	public boolean doesAllowPostCrossposts() {
		return allow_post_crossposts;
	}

	public String getSpamComments() {
		return spam_comments;
	}

	public boolean isPublicTraffic() {
		return public_traffic;
	}

	public boolean doesRestrictCommenting() {
		return restrict_commenting;
	}

	public int getCrowdControlLevel() {
		return crowd_control_level;
	}

	public String getSubmitTextLabel() {
		return submit_text_label;
	}

	public boolean isAllOriginalContent() {
		return all_original_content;
	}

	public String getSpamSelfPosts() {
		return spam_selfposts;
	}

	public Color getKeyColor() {
		return key_color;
	}

	public Language getLanguage() {
		return language;
	}

	public int getWikiEditKarma() {
		return wiki_edit_karma;
	}

	public boolean doesHideAds() {
		return hide_ads;
	}

	public int getPredictionLeaderboardEntryType() {
		return prediction_leaderboard_entry_type;
	}

	public String getHeaderHoverText() {
		return header_hover_text;
	}

	public boolean doesAllowChatPostCreation() {
		return allow_chat_post_creation;
	}

	public boolean doesAllowDiscovery() {
		return allow_discovery;
	}

	public boolean doesAcceptFollowers() {
		return accept_followers;
	}

	public boolean doesExcludeBannedModQueue() {
		return exclude_banned_modqueue;
	}

	public boolean doesAllowPredictionsTournament() {
		return allow_predictions_tournament;
	}

	public boolean doesShowMediaPreview() {
		return show_media_preview;
	}

	public int getCommentScoreHideMins() {
		return comment_score_hide_mins;
	}

	public String getSubredditType() {
		return subreddit_type;
	}

	public String getSpamLinks() {
		return spam_links;
	}

	public boolean doesAllowPredictions() {
		return allow_predictions;
	}

	public boolean areUserFlairPnsEnabled() {
		return user_flair_pns_enabled;
	}

	public String getContentOptions() {
		return content_options;
	}

}
