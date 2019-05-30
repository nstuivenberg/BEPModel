package nl.hu.bep.group4.bifi.exceptions;

public class GarbageDataException extends Exception {
	private static final long serialVersionUID = 8414485874778145723L;

	public GarbageDataException() {
		super();
	}

	public GarbageDataException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GarbageDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public GarbageDataException(String message) {
		super(message);
	}

	public GarbageDataException(Throwable cause) {
		super(cause);
	}

}
