package masecla.reddit4j.objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RedditObject {

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
}
