package co.com.bancolombia.certificacion.curiosity.school.examen.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces.ToDoPage.TODO_LIST;
import static co.com.bancolombia.certificacion.curiosity.school.examen.utils.Constant.KEY_TEXT_NEW_TODO;

public class TheNewTodo {


    public static Question<Boolean> isOnTodoList() {
        return actor -> compareTexts(actor);
    }

    private static Boolean compareTexts(Actor actor) {

        String newTodo = actor.recall(KEY_TEXT_NEW_TODO);

        List<WebElementFacade> data = TODO_LIST.resolveAllFor(actor);
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).getText().equalsIgnoreCase(newTodo)){
                return true;
            }
        }
        return false;
    }
}
