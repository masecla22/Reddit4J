package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum PrivateMessagePolicy {
	EVERYONE, WHITELISTED;

	public static TypeAdapter<PrivateMessagePolicy> getAdapter() {
		return new TypeAdapter<PrivateMessagePolicy>() {

			@Override
			public void write(JsonWriter out, PrivateMessagePolicy value) throws IOException {
				out.value(value.toString().toLowerCase());
			}

			@Override
			public PrivateMessagePolicy read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return PrivateMessagePolicy.valueOf(in.nextString().toUpperCase());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
