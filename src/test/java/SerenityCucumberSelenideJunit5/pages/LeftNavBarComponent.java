package SerenityCucumberSelenideJunit5.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class LeftNavBarComponent extends PageObject {

    ListOfWebElementFacades navDropdowns = $$("div.left-pannel .element-group");
    By navExpandedDropdownMenu = $("div[class^='element-list collapse show']");
    //ListOfWebElementFacades navDropdownOptions = navExpandedDropdownMenu.thenFindAll("li");

    private WebElementFacade filteredDropdown(String dropdownName) {
        return navDropdowns.stream().filter(title -> title.containsText(dropdownName)).findFirst().orElseThrow();
    }
    public LeftNavBarComponent expandDropdown(String dropdownName) {
        WebElementFacade targetDropdown = filteredDropdown(dropdownName);
        if (!targetDropdown.containsElements(navExpandedDropdownMenu))
            targetDropdown.click();
        return this;
    }
}
