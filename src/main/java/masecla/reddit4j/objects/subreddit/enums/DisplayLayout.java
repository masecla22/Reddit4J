package masecla.reddit4j.objects.subreddit.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum DisplayLayout {
	TIMELINE, GALLERY;

	public static TypeAdapter<DisplayLayout> getAdapter() {
		return new TypeAdapter<DisplayLayout>() {

			@Override
			public void write(JsonWriter out, DisplayLayout value) throws IOException {
				out.value(value.toString().toLowerCase());
			}

			@Override
			public DisplayLayout read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return DisplayLayout.valueOf(in.nextString().toUpperCase());
					else if (token.equals(JsonToken.NULL)) {
						in.nextNull();
						return null;
					}
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
