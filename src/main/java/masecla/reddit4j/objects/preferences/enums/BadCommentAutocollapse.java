package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum BadCommentAutocollapse {
	OFF, LOW, MEDIUM, HIGH;

	public static TypeAdapter<BadCommentAutocollapse> getAdapter() {
		return new TypeAdapter<BadCommentAutocollapse>() {

			@Override
			public void write(JsonWriter out, BadCommentAutocollapse value) throws IOException {
				out.value(value.toString().toLowerCase());
			}

			@Override
			public BadCommentAutocollapse read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return BadCommentAutocollapse.valueOf(in.nextString().toUpperCase());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
