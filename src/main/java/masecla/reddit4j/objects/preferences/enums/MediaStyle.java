package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum MediaStyle {
	ON, OFF, SUBREDDIT;

	public static TypeAdapter<MediaStyle> getAdapter() {
		return new TypeAdapter<MediaStyle>() {

			@Override
			public void write(JsonWriter out, MediaStyle value) throws IOException {
				out.value(value.toString().toLowerCase());
			}

			@Override
			public MediaStyle read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return MediaStyle.valueOf(in.nextString().toUpperCase());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
