package co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.Find;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks.builder.TranslateBuilder;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.utils.Constant;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface.TranslatePage.*;
import static co.com.bancolombia.certificacion.curiosity.school.screenplay.utils.Constant.KEY_TEXT_TRANSLATE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Translate implements Task {

    String sourceLanguage;
    String targetLanguage;
    String text;

    public Translate(String text, String sourceLanguage, String targetLanguage ) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(text).into(SOURCE_TEXT),
                WaitUntil.the(TARGET_TEXT, isPresent())
        );
        WebElementFacade webElement = TARGET_TEXT.resolveFor(actor);
        String targetText = webElement.getText();
        actor.remember(KEY_TEXT_TRANSLATE, targetText);


        actor.attemptsTo(Click.on(OPEN_SOURCE_LANGUAGE_LIST));
        List<WebElementFacade> data = ITEM_SELECTED.resolveAllFor(actor);
        for (int i = 0; i < data.size(); i++) {

            System.out.println(data.get(i).isPresent());
            System.out.println(data.get(i).getText());
            System.out.println(data.get(i).getValue());
            if(data.get(i).getText().equalsIgnoreCase(sourceLanguage)){
                System.out.println("lo encontro");
                data.get(i).waitUntilClickable();
                data.get(i).click();
                break;
            }
        }
    }

    public static TranslateBuilder theText(String text){
        return new TranslateBuilder(text);
    }
}
