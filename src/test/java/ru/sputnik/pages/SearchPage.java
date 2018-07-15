package ru.sputnik.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://sputnik.ru")
public class SearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchInput;
    @FindBy(css = "button[type='submit']")
    WebElementFacade searchButton;

    public void search(String text) {
        searchInput.type(text);
        $("button[type='submit']").click();
    }

    public void inputToSearchField(String text) {
        searchInput.type(text);
    }

    public void clickOnInput() {
        searchButton.click();}

    public void clickOnSubmitButton() {
        searchButton.click();
    }
}
