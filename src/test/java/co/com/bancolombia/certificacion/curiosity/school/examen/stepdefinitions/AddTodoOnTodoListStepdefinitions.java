package co.com.bancolombia.certificacion.curiosity.school.examen.stepdefinitions;

import co.com.bancolombia.certificacion.curiosity.school.examen.exceptions.TodoMvcException;
import co.com.bancolombia.certificacion.curiosity.school.examen.questions.TheNewTodo;
import co.com.bancolombia.certificacion.curiosity.school.examen.tasks.Add;
import co.com.bancolombia.certificacion.curiosity.school.examen.tasks.Navegate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.bancolombia.certificacion.curiosity.school.examen.exceptions.TodoMvcException.FAILED_ADD_NEW_TODO;
import static co.com.bancolombia.certificacion.curiosity.school.examen.userinterfaces.Option.TODOMVC_APP;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddTodoOnTodoListStepdefinitions {

    private static final String ACTOR = "DAVID";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^I enter the todomvc app$")
    public void iEnterTheTodomvcApp() {
        theActorCalled(ACTOR).wasAbleTo(Navegate.to(TODOMVC_APP));
    }


    @When("^I added my to-do \"([^\"]*)\"$")
    public void iAddedMyToDo(String task) {
        theActorInTheSpotlight().attemptsTo(
                Add.theNewTodo(task)
        );
    }

    @Then("^I should see my new to-do on to-do list$")
    public void iShouldSeeMyNewToDoOnToDoList() {
        theActorInTheSpotlight().should(
                seeThat("the new to-do was added correctly", TheNewTodo.isOnTodoList())
                        .orComplainWith(TodoMvcException.class, FAILED_ADD_NEW_TODO)
        );
    }
}
