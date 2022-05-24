package masecla.reddit4j.objects;

@KindObject
public class RedditTrophy extends RedditThing {
	private String icon_70;
	private long granted_at;
	private String url;
	private String icon_40;
	private String name;
	private String award_id;
	private String description;

	public String getIconHighResolutionURL() {
		return icon_70;
	}

	public long getGrantedAt() {
		return granted_at;
	}

	public String getUrl() {
		return url;
	}

	public String getIconLowResolutionURL() {
		return icon_40;
	}

	public String getName() {
		return name;
	}

	public String getAwardId() {
		return award_id;
	}

	public String getDescription() {
		return description;
	}

}
