package auth.exception;

public class InvalidUserRegistrationException extends RuntimeException {
    public InvalidUserRegistrationException(String message) {
        super(message);
    }
}
