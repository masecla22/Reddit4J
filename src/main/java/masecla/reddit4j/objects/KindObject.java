package masecla.reddit4j.objects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import masecla.reddit4j.json.RedditDataTypeAdapterFactory;


/**
 * Automatically treat the annotated class as a {@link RedditData} object. This allows the object to be deserialized by
 * {@link RedditDataTypeAdapterFactory}.
 *
 * @see RedditDataTypeAdapterFactory
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KindObject {
}
