package co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.exceptions.SearchElementException;
import co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.builder.FindLanguageBuilder;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Optional;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Find implements Interaction {

    private final String text;
    private Target target;

    public Find(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( WaitUntil.the(target, isPresent()));


        Optional<WebElementFacade> foundTarget = target.resolveAllFor(actor).stream().filter(
                language -> language.getText().contains(text)).findFirst();
        if(foundTarget.isPresent()) {
            foundTarget.get().click();
        } else {
            throw new SearchElementException(text);
        }
    }

    public static FindLanguageBuilder the(String text) {
        return new FindLanguageBuilder(text);
    }
}

