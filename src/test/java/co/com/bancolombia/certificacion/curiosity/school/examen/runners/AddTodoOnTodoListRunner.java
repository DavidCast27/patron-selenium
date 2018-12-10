package co.com.bancolombia.certificacion.curiosity.school.examen.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/examen/features/add_todo_on_todo_list.feature",
        glue = "co.com.bancolombia.certificacion.curiosity.school.examen.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AddTodoOnTodoListRunner {

}
