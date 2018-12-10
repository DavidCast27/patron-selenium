package co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces;

import co.com.bancolombia.certificacion.curiosity.school.examen.utils.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToDoPage {

    private ToDoPage() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }

    public static final Target NEW_TODO = Target.the("new to-do").located(By.className("new-todo"));

    public static final Target TODO_LIST = Target.the("todo-list").located(By.className("todo-list"));

}







