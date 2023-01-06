package masecla.reddit4j.json.adapters;

import java.awt.Color;
import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class ColorAdapter extends TypeAdapter<Color> {

    @Override
    public void write(JsonWriter out, Color value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }

        int r = value.getRed();
        int g = value.getGreen();
        int b = value.getBlue();

        String hex = String.format("#%02x%02x%02x", r, g, b);
        out.value(hex);
    }

    @Override
    public Color read(JsonReader in) throws IOException {
        JsonToken token = in.peek();
        if (token.equals(JsonToken.NULL)) {
            in.nextNull();
            return null;
        } else if (token.equals(JsonToken.STRING)) {
            try {
                String colorStr = in.nextString();
                if (colorStr == null)
                    return null;
                return Color.decode(colorStr);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return null;
    }

}
