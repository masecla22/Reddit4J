package masecla.reddit4j.objects;

import lombok.Data;

@Data
public class RedditData<T> extends RedditThing {
    private String kind;
    private T data;
}
