package SerenityCucumberSelenideJunit5.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class BasePage extends PageObject {

    WebElementFacade pageHeader = $("div.main-header");

}
