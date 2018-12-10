package co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks.builder;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.tasks.Translate;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TranslateBuilder {

    String sourceLanguage;
    String text;

    public TranslateBuilder(String text) {
        this.text = text;
    }

    public TranslateBuilder from(String sourceLanguage){
        this.sourceLanguage = sourceLanguage;
        return this;
    }

    public Translate to(String targetLanguage){
        return instrumented(Translate.class, text, sourceLanguage, targetLanguage);
    }
}
