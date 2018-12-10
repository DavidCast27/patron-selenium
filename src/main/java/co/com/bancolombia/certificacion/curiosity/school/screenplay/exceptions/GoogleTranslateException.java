package co.com.bancolombia.certificacion.curiosity.school.screenplay.exceptions;

public class GoogleTranslateException extends AssertionError{

    public static final String FAILED_TRANSLATION = "Failed translation";

    public GoogleTranslateException(String message) {
        super(message);
    }

    public GoogleTranslateException(String message, Throwable cause) {
        super(message, cause);
    }
}
