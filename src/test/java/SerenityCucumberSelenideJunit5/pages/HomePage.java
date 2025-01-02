package SerenityCucumberSelenideJunit5.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(value = "https://demoqa.com/")
public class HomePage extends PageObject {

    @FindBy(css = "header img") WebElementFacade headerImage;
    ListOfWebElementFacades pageCardTitles =  $$("div.category-cards .card h5");


    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(headerImage).waitUntilVisible();
    }
    // Filter out cards by title -> return first -> click
    @Step("Select {cardName} page card")
    public void selectPageCard(String cardName) {
        pageCardTitles.stream().filter(title -> title.containsText(cardName)).findFirst().orElseThrow().click();
    }
}
