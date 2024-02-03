package SerenityCucumberSelenideJunit5.utils;

import net.serenitybdd.core.pages.PageObject;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

public class WebUtils extends PageObject {

    public static String getCurrentUrl() {
        return getWebdriverManager().getWebdriver().getCurrentUrl();
    }

}
