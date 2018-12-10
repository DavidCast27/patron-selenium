package co.com.bancolombia.certificacion.curiosity.school.examen.exceptions;

import com.sun.xml.internal.bind.v2.TODO;

public class TodoMvcException extends AssertionError {

    public static final String FAILED_ADD_NEW_TODO = "FAILED ADD NEW TODO";


    public TodoMvcException(String message) {
        super(message);
    }

    public TodoMvcException(String message, Throwable cause) {
        super(message, cause);
    }
}
