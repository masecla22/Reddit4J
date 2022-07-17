package masecla.reddit4j.objects.app;

public class PersonalUseScript implements RedditApp {
    private final String clientId;
    private final String clientSecret;

    public PersonalUseScript(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }
}
