package session.exception;

public class ChinkoNotFoundException extends Exception {
    public ChinkoNotFoundException() {
    }

    public ChinkoNotFoundException(String message) {
        super(message);
    }

    public ChinkoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChinkoNotFoundException(Throwable cause) {
        super(cause);
    }
}
