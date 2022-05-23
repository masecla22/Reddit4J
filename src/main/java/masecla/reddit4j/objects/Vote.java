package masecla.reddit4j.objects;

public enum Vote {
    UP(1),
    DOWN(-1),
    CLEAR(0);

    private final int value;

    Vote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
