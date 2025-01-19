package masecla.reddit4j.Utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.jsoup.Connection.Response;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static void handleErrors(Response rsp) throws IllegalStateException {
        JsonArray errors = JsonParser.parseString(rsp.body())
                .getAsJsonObject().getAsJsonObject("json").getAsJsonArray("errors");
        if (!errors.isEmpty()) {
            List<String> errorMessages = new ArrayList<>();
            errors.forEach(error -> errorMessages.add(error.toString()));
            throw new IllegalStateException(String.join(", ", errorMessages));
        }
    }
}
