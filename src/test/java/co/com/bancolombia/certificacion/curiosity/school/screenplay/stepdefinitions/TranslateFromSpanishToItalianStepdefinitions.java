package co.com.bancolombia.certificacion.curiosity.school.screenplay.stepdefinitions;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.exceptions.GoogleTranslateException;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.questions.TheText;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks.Navegate;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.bancolombia.certificacion.curiosity.school.screenplay.exceptions.GoogleTranslateException.FAILED_TRANSLATION;
import static co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface.Option.GOOGLE_TRANSLATE_IN_ENGLISH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TranslateFromSpanishToItalianStepdefinitions {

    private static final String ACTOR = "DAVID";

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I enter the google translate app$")
    public void iEnterTheGoogleTranslateApp() {
        theActorCalled(ACTOR).wasAbleTo(Navegate.to(GOOGLE_TRANSLATE_IN_ENGLISH));
    }


    @When("^I translated from \"([^\"]*)\" to \"([^\"]*)\" the text \"([^\"]*)\"$")
    public void iTranslatedFromSpanishToItalianTheText(String sourceLanguage, String targetLanguage, String textToTranslate) {
        theActorInTheSpotlight().attemptsTo(
                Translate.theText(textToTranslate).from(sourceLanguage).to(targetLanguage)
        );
    }

    @Then("^I should see the translation \"([^\"]*)\"$")
    public void iShouldSeeTheTranslationAsa(String translatedText) {
        theActorInTheSpotlight().should(
                seeThat("the text was translated correctly", TheText.isEqualTo(translatedText))
                        .orComplainWith(GoogleTranslateException.class, FAILED_TRANSLATION)
        );

    }
}
