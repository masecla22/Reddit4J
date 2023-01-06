package masecla.reddit4j.json;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import masecla.reddit4j.objects.KindObject;
import masecla.reddit4j.objects.RedditComment;
import masecla.reddit4j.objects.RedditData;
import masecla.reddit4j.objects.RedditListing;
import masecla.reddit4j.objects.RedditPost;
import masecla.reddit4j.objects.RedditProfile;
import masecla.reddit4j.objects.subreddit.RedditSubreddit;

/**
 * A Gson TypeAdapterFactory to use {@link RedditDataJsonAdapter} for deserializing {@link RedditData} json objects.
 * <p>
 * This TypeAdapterFactory can be automatically used by adding the {@link KindObject} annotation to a class that should
 * be deserialized like a {@link RedditData}.
 *
 * Since a class might not always be a {@link RedditData} object, field
 * specific deserializing can be handled by adding the {@link JsonAdapter} annotation and using the
 * {@link RedditDataTypeAdapterFactory.Annotation} factory.
 *
 * Deserializing a class as a {@link RedditData} in only certain scenarios can be handled by creating a
 * {@link TypeToken} for the class and passing it to the called fromJson {@link Gson#fromJson(String, Type)}.
 *
 * @see RedditData
 * @see RedditDataJsonAdapter
 * @see Annotation
 * @see KindObject
 */
@SuppressWarnings("unchecked")
public class RedditDataTypeAdapterFactory implements TypeAdapterFactory {

    public static final Map<String, Class<?>> REGISTRY = new HashMap<>();
    public static final Map<Class<?>, String> REGISTRY_REVERSE;

    static {
        REGISTRY.put("t1", RedditComment.class);
        REGISTRY.put("t2", RedditProfile.class);
        REGISTRY.put("t3", RedditPost.class);
        //t4 = message
        REGISTRY.put("t5", RedditSubreddit.class);
        //t6 = award
        REGISTRY.put("Listing", RedditListing.class);
        // KarmaList is a special case.

        REGISTRY_REVERSE = REGISTRY.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if (type.getType() instanceof ParameterizedType && type.getRawType().equals(RedditData.class)) {
            ParameterizedType parameterizedType = (ParameterizedType) type.getType();
            TypeToken<?> paramType = TypeToken.get(parameterizedType.getActualTypeArguments()[0]);
            RedditDataJsonAdapter<?> adapter =
                    new RedditDataJsonAdapter<>(gson, this, paramType);
            return (TypeAdapter<T>) adapter;
        } else if (type.getRawType().isAnnotationPresent(KindObject.class)) {
            RedditDataJsonAdapter<?> adapter =
                    new RedditDataJsonAdapter<>(gson, this, type);
            return (TypeAdapter<T>) adapter;
        }
        return null;
    }

    /**
     * A Gson TypeAdapterFactory to create a {@link RedditDataJsonAdapter} for a {@link RedditData} json object.
     * This factory is only required if the data class being encapsulated is not marked with {@link KindObject}.
     * <p>
     * Gson provides no way to get annotations for fields inside a class, requiring the use of a {@link JsonAdapter}
     * annotation and this factory instead of the {@link KindObject} annotation.
     * <p>
     * See {@link RedditDataTypeAdapterFactory} for a factory that works with {@link KindObject} annotated classes.
     *
     * @see RedditDataJsonAdapter
     * @see ListAdapter
     */
    public static class Annotation implements TypeAdapterFactory {

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (type.getRawType().isAssignableFrom(List.class)) {
                ParameterizedType parameterizedType = (ParameterizedType) type.getType();
                ListAdapter<?> adapter = new ListAdapter<>(gson,
                        TypeToken.get(parameterizedType.getActualTypeArguments()[0]));
                return (TypeAdapter<T>) adapter;
            }
            RedditDataJsonAdapter<?> adapter = new RedditDataJsonAdapter<>(gson, this, type);
            return (TypeAdapter<T>) adapter;
        }
    }

    /**
     * Type Adapter for a {@link List} containing {@link RedditData} objects.
     * <p>
     * This class assumes that the data is encapsulated like the following:
     * <pre>
     * "field":[
     *   {
     *     "kind": "kind",
     *     "data": { ... }
     *   },
     *   {
     *     "kind": "kind",
     *     "data": { ... }
     *   }
     * ]
     * </pre>
     */
    private static class ListAdapter<T> extends TypeAdapter<List<T>> {

        private final TypeAdapter<T> adapter;

        public ListAdapter(Gson gson, TypeToken<T> paramType) {
            this.adapter = new RedditDataJsonAdapter<>(gson, null, paramType);
        }

        @Override
        public void write(JsonWriter out, List<T> value) throws IOException {
            out.beginArray();
            for (T item : value) {
                adapter.write(out, item);
            }
            out.endArray();
        }

        @Override
        public List<T> read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.BEGIN_ARRAY) {
                in.beginArray();
                List<Object> list = new ArrayList<>();
                while (in.hasNext()) {
                    list.add(adapter.read(in));
                }
                in.endArray();
                return (List<T>) list;
            }
            return null;
        }
    }
}