package co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface.Option;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegate implements Task {

    private final Option opcion;

    public Navegate(Option opcion) {
        this.opcion = opcion;
    }

    @Override
    @Step("{0} navega a la opción #opcion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(opcion.url())
        );
    }

    public static Performable to(Option option) {
        return instrumented(Navegate.class, option);
    }
}
