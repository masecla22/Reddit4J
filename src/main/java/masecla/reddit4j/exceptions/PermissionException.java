package masecla.reddit4j.exceptions;

public class PermissionException extends RuntimeException {
	private static final long serialVersionUID = 9028708704636178559L;

	private String reason;

	public PermissionException(String reason) {
		super();
		this.reason = reason;
	}

	public PermissionException() {
	}

	public String getReason() {
		return reason;
	}

	@Override
	public String getMessage() {
		return reason;
	}
}
