package co.com.bancolombia.certificacion.curiosity.school.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/translate_from_spanish_to_italian.feature",
        glue = "co.com.bancolombia.certificacion.curiosity.school.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class TranslateFromSpanishToItalianRunner {

}
