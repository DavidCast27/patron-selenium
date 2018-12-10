package co.com.bancolombia.certificacion.curiosity.school.screenplay.userinterface;

import co.com.bancolombia.certificacion.curiosity.school.screenplay.utils.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class TranslatePage {

    private TranslatePage() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }

    public static final Target OPEN_SOURCE_LANGUAGE_LIST = Target.the("source language list").located(By.className("tlid-open-source-language-list"));
    public static final Target SOURCE_SEARCH_BOX = Target.the("list search box").located(By.xpath("//*[@id=\"sl_list-search-box\"]"));

    public static final Target OPEN_TARGET_LANGUAGE_LIST = Target.the("target language list").located(By.className("tlid-open-target-language-list"));
    public static final Target TARGET_SEARCH_BOX = Target.the("list search box").located(By.xpath("//*[@id=\"tl_list-search-box\"]"));



    public static final Target ITEM_SELECTED = Target.the("language list item language name").located(By.className("language_list_item_language_name"));

    public static final Target SOURCE_TEXT = Target.the("source text").located(By.id("source"));
    public static final Target TARGET_TEXT = Target.the("target text").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div/span[1]/span"));











}







