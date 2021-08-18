package masecla.reddit4j.client;

public class UserAgentBuilder {
	private String appname;
	private String version;
	private String author;

	public UserAgentBuilder appname(String appname) {
		this.appname = appname;
		return this;
	}

	public UserAgentBuilder author(String author) {
		this.author = author;
		return this;
	}

	public UserAgentBuilder version(String version) {
		this.version = version;
		return this;
	}

	public String build() {
		return appname + "/" + version + " by " + author;
	}
}
