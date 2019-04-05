package solution.kiryl.city.collection;

public class RangeException extends Exception {
    public RangeException() {
    }

    public RangeException(String message) {
        super(message);
    }

    public RangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RangeException(Throwable cause) {
        super(cause);
    }
}
