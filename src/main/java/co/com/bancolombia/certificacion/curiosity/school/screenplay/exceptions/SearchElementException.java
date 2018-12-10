package co.com.bancolombia.certificacion.curiosity.school.screenplay.exceptions;

import java.text.MessageFormat;

public class SearchElementException extends AssertionError {

    public SearchElementException(String itemID) {
        super(MessageFormat.format("The {0} element was not found", itemID));
    }

    public SearchElementException(String message, Throwable cause) {
        super(message, cause);
    }
}
