package masecla.reddit4j.objects;

public enum Time {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    YEAR("year"),
    ALL("all");

    private final String value;

    Time(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
