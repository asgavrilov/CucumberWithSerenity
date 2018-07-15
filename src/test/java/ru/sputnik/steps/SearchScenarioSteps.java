package ru.sputnik.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.sputnik.pages.ResultPage;
import ru.sputnik.pages.SearchPage;

import static junit.framework.TestCase.assertTrue;

public class SearchScenarioSteps {

    SearchPage searchPage;
    ResultPage resultPage;

    @Given("^open site")
    public void givenOpenSite() {
        searchPage.open();
    }

    @Given("^click input")
    public void givenClickOnInput() {
        searchPage.clickOnInput();
    }

    @When("^enter '(.*)'")
    public void whenEnter(String text) {
        searchPage.inputToSearchField(text);
    }

    @When("^press Find")
    public void whenPressFind() {
        searchPage.clickOnSubmitButton();
    }

    @Then("^results are returned")
    public void thenResultsAreReturned() {
        assertTrue(resultPage.resultsAreDisplayed());
    }

    @Then("^'(.*)' should be in the results list")
    public void thenItemShouldBePresent(String Item) {


        assertTrue(resultPage.titleHasResult(Item));

    }
}

