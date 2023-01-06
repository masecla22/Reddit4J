package masecla.reddit4j.json;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import masecla.reddit4j.objects.RedditData;

/**
 * Type Adapter for {@link RedditData} json data that will handle deserializing and returning the value of
 * {@link RedditData#getData()}.
 * <p>
 * This class assumes that the data is encapsulated like the following:
 * <pre>
 * {
 *   "kind": "kind",
 *   "data": { ... }
 * }
 * </pre>
 */
public class RedditDataJsonAdapter<T> extends TypeAdapter<T> {

    private final TypeAdapter<String> kindAdapter;
    private final TypeAdapter<T> dataAdapter;

    public RedditDataJsonAdapter(Gson gson, TypeAdapterFactory skipPast, TypeToken<T> dataTypeToken) {
        this.kindAdapter = gson.getAdapter(String.class);
        if (skipPast != null) {
            this.dataAdapter = gson.getDelegateAdapter(skipPast, dataTypeToken);
        } else {
            this.dataAdapter = gson.getAdapter(dataTypeToken);
        }
    }

    @Override
    public void write(JsonWriter out, T value) throws IOException {
        out.beginObject();
        out.name("kind").value(RedditDataTypeAdapterFactory.REGISTRY_REVERSE.get(value.getClass()));
        out.name("data");
        dataAdapter.write(out, value);
        out.endObject();
    }

    @Override
    public T read(JsonReader in) throws IOException {
        in.beginObject();
        RedditData<T> data = new RedditData<>();
        while (in.hasNext()) {
            String name = in.nextName();
            if (name.equals("kind")) {
                data.setKind(kindAdapter.read(in));
            } else if (name.equals("data")) {
                data.setData(dataAdapter.read(in));
            } else {
                in.skipValue();
            }
        }
        in.endObject();
        return data.getData();
    }
}