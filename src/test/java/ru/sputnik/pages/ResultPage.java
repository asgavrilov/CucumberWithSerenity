package ru.sputnik.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {
    @FindBy(css = "div.b-result-list")
    WebElementFacade results;

    @FindBy(css = "div.b-result-title>a>b")
    WebElementFacade resultElement;


    public boolean resultsAreDisplayed() {
        results.waitUntilVisible();

        return results.isDisplayed();
    }

    public boolean titleHasResult(String resultText) {

        return resultElement.getText().toLowerCase().contains(resultText);


        // return $("div.b-result-title>a>b").waitUntilVisible().isDisplayed();

    }


}
