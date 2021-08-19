package masecla.reddit4j.objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RedditObject {

	@Override
	public String toString() {
		return getGson().toJson(this);
	}
	
	public Gson getGson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson;
	}
}
