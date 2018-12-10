package co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.builder;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.interactions.Select;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBuilder {
    private String language;


    public SelectBuilder(String language) {
        this.language = language;
    }

    public Performable into(Target target) {
        return instrumented(Select.class, language, target);
    }

}
