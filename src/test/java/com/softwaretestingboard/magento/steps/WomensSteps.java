package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomensSteps {
    @Given("^I hover on the Women menu option$")
    public void iHoverOnTheWomenMenuOption() {
        new HomePage().mouseHoverOnWomenMenuTab();
    }

    @And("^I hover on the Tops option$")
    public void iHoverOnTheTopsOption() {
        new HomePage().mouseHoverOnWomenTopMenuOption();
    }

    @And("^I click the Jackets option$")
    public void iClickTheJacketsOption() {
        new HomePage().clickJacketsOption();

    }

    @When("^I select the filter to sort by \"([^\"]*)\"$")
    public void iSelectTheFilterToSortBy(String jacket) {
        new JacketsPage().productSortByProductName(jacket);

    }

    @Then("^I should see the products name display in alphabetical order$")
    public void iShouldSeeTheProductsNameDisplayInAlphabeticalOrder() {
        new JacketsPage().sortInAlphabeticalOrder();
    }

    @Then("^I should see the products price display in ascending order$")
    public void iShouldSeeTheProductsPriceDisplayInAscendingOrder() {

    }
}
