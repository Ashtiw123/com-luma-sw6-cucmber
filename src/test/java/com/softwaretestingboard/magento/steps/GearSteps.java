package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearSteps {
    @Given("^I hover on the Gear menu option$")
    public void iHoverOnTheGearMenuOption() {
        new HomePage().mouseHoverOnGearMenuOption();
    }

    @When("^I click the Bags option$")
    public void iClickTheBagsOption() {
        new HomePage().mouseHoverOnGearMenuAndClicksOnBagsOption();
    }

    @And("^I click the product named 'Overnight Duffle'$")
    public void iClickTheProductNamedOvernightDuffle() {
        new BagsPage().clickOnDuffleBagOption();
    }

    @Then("^I should see the text of bag \"([^\"]*)\"$")
    public void iShouldSeeTheTextOfBag(String bag)  {
        new HomePage().verifyOvernightDuffleTextMethod();
    }

    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int Qty) {
        new OvernightDufflePage().quantitySpaceOption();
    }

    @And("^I click on the 'Add to Cart' button duffle bag$")
    public void iClickOnTheAddToCartButton() {
        new OvernightDufflePage().clickOnAddToCartButtonDuffleBag();
    }

    @And("^I click on the 'shopping cart' link in the message$")
    public void iClickOnTheShoppingCartLinkInTheMessage() {
        new OvernightDufflePage().clickOnShoppingCartButtonOption();
    }

    @And("^The quantity should be \"([^\"]*)\"$")
    public void theQuantityShouldBe(String qty)  {
        new OvernightDufflePage().verifyQuantityText();

    }

    @And("^The product price should be \"([^\"]*)\"$")
    public void theProductPriceShouldBe(String txt)  {
       new OvernightDufflePage().verifyProductPrice();
    }

    @And("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String arg0)  {
       new ShoppingCartPage().quantityUpdateText();
    }

    @And("^I click on the 'Update Shopping Cart' button$")
    public void iClickOnTheUpdateShoppingCartButton() {
        new OvernightDufflePage().clickOnShoppingCartButtonOption();
    }

    @Then("^the product price should be \"([^\"]*)\"$")
    public void theProductPriceShouldBe()  {
        new ShoppingCartPage().verifyUpdatedPriceText();

    }
}
