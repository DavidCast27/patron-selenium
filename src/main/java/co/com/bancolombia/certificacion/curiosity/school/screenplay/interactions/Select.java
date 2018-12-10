package co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.builder.SelectBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface.TranslatePage.ITEM_SELECTED;

public class Select implements Interaction {

    String language;
    Target TargetText;


    public Select(String language, Target TargetText) {
        this.language = language;
        this.TargetText = TargetText;

    }

    public static SelectBuilder theLanguage(String language) {
        return new SelectBuilder(language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(language).into(TargetText),
                Find.the(language).on(ITEM_SELECTED).andThenClick()
        );
    }
}
