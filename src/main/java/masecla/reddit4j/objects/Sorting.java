package masecla.reddit4j.objects;

public enum Sorting {
    HOT("hot"),
    NEW("new"),
    RISING("rising"),
    CONTROVERSIAL("controversial"),
    TOP("top");

    private final String value;

    Sorting(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
