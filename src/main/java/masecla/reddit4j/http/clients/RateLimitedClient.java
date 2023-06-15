package masecla.reddit4j.http.clients;

import java.io.IOException;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import masecla.reddit4j.http.GenericHttpClient;

public class RateLimitedClient extends GenericHttpClient {

	/**
	 * This is the maximum amount of requests per minute a client is allowed to do.
	 * This is according to the https://github.com/reddit-archive/reddit/wiki/API
	 */
	protected static final int RATE_LIMIT_MINUTE = 60;

	public RateLimitedClient() {
		super();
		this.requestCount = new AtomicInteger(0);
		this.batchStart = new AtomicLong(Instant.now().getEpochSecond());
	}

	@Override
	public Response execute(Connection connection) throws IOException, InterruptedException {
		int secondsToWait = getSecondsUntilNextRequest();
		if (secondsToWait == 0) {
			this.requestCount.incrementAndGet();
			return connection.execute();
		}
		Thread.sleep(secondsToWait * 1000);
		return execute(connection);
	}

	private AtomicInteger requestCount;
	private AtomicLong batchStart;

	private int getSecondsUntilNextRequest() {
		// Check if we are still within the current minute.
		// If not, we can start a new batch
		if (Instant.now().getEpochSecond() - batchStart.get() > 60) {
			requestCount.set(0);
			batchStart.set(Instant.now().getEpochSecond());
			return 0;
		}

		// We still have space to do requests
		if (requestCount.get() < RATE_LIMIT_MINUTE) {
			return 0;
		}

		// The amount of requests this batch is too much, wait until next batch (and one
		// extra second to be sure)
		return 61 - (int) (Instant.now().getEpochSecond() - batchStart.get());
	}

}
