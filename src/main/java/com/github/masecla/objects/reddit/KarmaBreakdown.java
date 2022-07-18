package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class KarmaBreakdown {
	@SerializedName("sr")
	private String sr;

	@SerializedName("comment_karma")
	private String commentKarma;

	@SerializedName("link_karma")
	private String linkKarma;

	public String getSr() {
		return sr;
	}

	public void setSr(String sr) {
		this.sr = sr;
	}

	public String getCommentKarma() {
		return commentKarma;
	}

	public void setCommentKarma(String commentKarma) {
		this.commentKarma = commentKarma;
	}

	public String getLinkKarma() {
		return linkKarma;
	}

	public void setLinkKarma(String linkKarma) {
		this.linkKarma = linkKarma;
	}

	@Override
	public String toString() {
		return "KarmaBreakdown{" +
				"sr='" + sr + '\'' +
				", commentKarma='" + commentKarma + '\'' +
				", linkKarma='" + linkKarma + '\'' +
				'}';
	}
}
