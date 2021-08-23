package masecla.reddit4j.objects.adapters;

import java.io.IOException;
import java.util.UUID;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class UUIDAdapter extends TypeAdapter<UUID> {

	@Override
	public void write(JsonWriter out, UUID value) throws IOException {
		out.value(value.toString());
	}

	@Override
	public UUID read(JsonReader in) throws IOException {
		JsonToken token = in.peek();
		if (token.equals(JsonToken.NULL)) {
			in.nextNull();
			return null;
		} else if (token.equals(JsonToken.STRING)) {
			try {
				UUID result = UUID.fromString(in.nextString());
				return result;
			} catch (IOException e) {
				return null;
			}
		}
		return null;
	}

}
