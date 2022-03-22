package masecla.reddit4j.objects;

public class RedditData<T> extends RedditThing {
    private String kind;
    private T data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
