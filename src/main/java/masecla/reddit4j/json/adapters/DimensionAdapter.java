package masecla.reddit4j.json.adapters;

import java.awt.Dimension;
import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class DimensionAdapter extends TypeAdapter<Dimension> {

    @Override
    public void write(JsonWriter out, Dimension value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.beginArray();
        out.value(value.getWidth());
        out.value(value.getHeight());
        out.endArray();
    }

    @Override
    public Dimension read(JsonReader in) throws IOException {
        JsonToken next = in.peek();
        if (next.equals(JsonToken.NULL)) {
            in.nextNull();
            return null;
        }
        int w, h;
        in.beginArray();
        w = in.nextInt();
        h = in.nextInt();
        in.endArray();
        return new Dimension(w, h);
    }

}
