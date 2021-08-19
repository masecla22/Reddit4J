package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum DefaultCommentSort {
	CONFIDENCE, TOP, NEW, CONTROVERSIAL, OLD, RANDOM, QA, LIVE;
	
	public static TypeAdapter<DefaultCommentSort> getAdapter() {
		return new TypeAdapter<DefaultCommentSort>() {

			@Override
			public void write(JsonWriter out, DefaultCommentSort value) throws IOException {
				out.value(value.toString().toLowerCase());
			}

			@Override
			public DefaultCommentSort read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return DefaultCommentSort.valueOf(in.nextString().toUpperCase());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
