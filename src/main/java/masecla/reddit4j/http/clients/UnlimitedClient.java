package masecla.reddit4j.http.clients;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import masecla.reddit4j.http.GenericHttpClient;

/**
 * This implementation of {@link GenericHttpClient} is completely unlimited and
 * will disregard everything in sight!
 * 
 * @deprecated - To discourage users from using it!
 * @author Matt
 */
@Deprecated
public class UnlimitedClient extends GenericHttpClient {

	@Override
	public Response execute(Connection connection) throws IOException, InterruptedException {
		return connection.execute();
	}

}
