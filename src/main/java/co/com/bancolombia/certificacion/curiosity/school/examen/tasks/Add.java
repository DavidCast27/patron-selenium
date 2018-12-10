package co.com.bancolombia.certificacion.curiosity.school.examen.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces.ToDoPage.NEW_TODO;
import static co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces.ToDoPage.TODO_LIST;
import static co.com.bancolombia.certificacion.curiosity.school.examen.utils.Constant.KEY_TEXT_NEW_TODO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add implements Task {

    private String newTodo;


    public Add(String newTodo) {
        this.newTodo = newTodo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(newTodo).into(NEW_TODO),
                Hit.the(Keys.ENTER).into(NEW_TODO)
        );
        actor.remember(KEY_TEXT_NEW_TODO,newTodo);
    }

    public static Performable theNewTodo( String newTodo){
        return instrumented(Add.class,newTodo);
    }
}
