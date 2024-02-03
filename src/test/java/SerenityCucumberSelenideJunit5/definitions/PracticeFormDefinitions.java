package SerenityCucumberSelenideJunit5.definitions;
import SerenityCucumberSelenideJunit5.pages.BasePage;
import SerenityCucumberSelenideJunit5.pages.HomePage;
import SerenityCucumberSelenideJunit5.pages.LeftNavBarComponent;
import SerenityCucumberSelenideJunit5.pages.PracticeFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeFormDefinitions {

    @Steps HomePage
            homePage;
    @Steps LeftNavBarComponent leftNavBarComponent;
    @Steps PracticeFormPage practiceFormPage;
    @Steps BasePage basePage;

    @Given("User is on Home page")
    public void userOpensHomepage() {
        homePage.open();
    }

    @When("User selects {string} card")
    public void userSelectsCardOnHomepage(String cardTitle) {
        homePage.selectPageCard(cardTitle);
    }

    @And("User selects {string} option from {string} nav dropdown")
    public void userSelectsOptionFromNavDropdown(String optionName, String dropdownName) {
        leftNavBarComponent.expandDropdown(dropdownName);
        leftNavBarComponent.selectFromDropdown((WebElement) leftNavBarComponent.getNavExpandedDropdownMenu(), optionName);
    }

    @Then("User lands on {string} page")
    public void userLandsOnPage(String pageTitle) {
        assertThat(basePage.getPageHeader().getText()).containsIgnoringCase(pageTitle);
    }
}
