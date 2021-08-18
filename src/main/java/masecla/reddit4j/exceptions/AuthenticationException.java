package masecla.reddit4j.exceptions;

public class AuthenticationException extends Exception {
	private static final long serialVersionUID = -678205627772591149L;

	private String reason;

	public AuthenticationException(String reason) {
		super();
		this.reason = reason;
	}

	public AuthenticationException() {
		super();
	}

	@Override
	public String getMessage() {
		return reason;
	}

	public String getReason() {
		return reason;
	}
}
