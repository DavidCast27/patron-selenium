package co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.builder;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.Find;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindLanguageBuilder {


    private final String text;
    private Target target;

    public FindLanguageBuilder(String text) {
        this.text = text;
    }

    public FindLanguageBuilder on(Target target) {
        this.target = target;
        return this;
    }

    public Performable andThenClick() {
        return instrumented(Find.class, this.text, this.target);
    }
}
