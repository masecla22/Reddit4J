package masecla.reddit4j.objects;

public enum Type {
    SR("sr"),
    LINK("link"),
    USER("user");

    private final String value;

    Type(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

