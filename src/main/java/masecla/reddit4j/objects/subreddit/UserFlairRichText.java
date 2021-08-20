package masecla.reddit4j.objects.subreddit;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import masecla.reddit4j.objects.RedditObject;

public class UserFlairRichText extends RedditObject {
	private String e;
	private String t;

	public String getElement() {
		return e;
	}

	public String getText() {
		return t;
	}

	public static TypeAdapter<UserFlairRichText> getAdapter() {
		return new TypeAdapter<UserFlairRichText>() {
			@Override
			public void write(JsonWriter out, UserFlairRichText value) throws IOException {
				// Brackets added are purely cosmetic, so it makes more sense
				out.beginArray().beginObject();
				{
					out.name("e").value(value.e);
					out.name("t").value(value.t);
				}
				out.endObject().endArray();
			}

			@Override
			public UserFlairRichText read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				if (token.equals(JsonToken.NULL)) {
					in.nextNull();
					return null;
				}
				UserFlairRichText result = new UserFlairRichText();
				in.beginArray();
				JsonToken beginObject = in.peek();
				if (beginObject.equals(JsonToken.BEGIN_OBJECT)) {
					in.beginObject();

					while (in.hasNext()) {
						String name = in.nextName();
						if (name.equals("e"))
							result.e = in.nextString();
						if (name.equals("t"))
							result.t = in.nextString();
					}

					in.endObject();
				} else {
					result = null;
				}
				in.endArray();
				return result;
			}
		};
	}
}
