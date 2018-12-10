package co.com.bancolombia.certificacion.curiosity.school.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.curiosity.school.screenplay.utils.Constant.KEY_TEXT_TRANSLATE;

public class TheText
{


    public static Question<Boolean> isEqualTo(String targetTextExpected) {
        return actor -> compareTexts(actor, targetTextExpected);
    }

    private static Boolean compareTexts(Actor actor, String targetTextExpected) {
        String targetTextObtained = actor.recall(KEY_TEXT_TRANSLATE);
        return targetTextExpected.equalsIgnoreCase(targetTextObtained);
    }
}
