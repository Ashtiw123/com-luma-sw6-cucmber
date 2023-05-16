package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenSteps {

        @Given("^I hover on the Men menu option$")
        public void iHoverOnTheMenMenuOption() {
            new HomePage().mouseHoverOnMenMenuTab();
        }

    @When("^I hover on the Bottoms option$")
    public void iHoverOnTheBottomsOption() {
            new PantsPage().mouseHoverOnMenPantsProductNameOption();
    }

    @And("^I click the Pants option$")
    public void iClickThePantsOption() {
            new HomePage().setPantsOption();
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on size \"([^\"]*)\"\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnSize(String size) {
            new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(size);

    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on the colour Black\\.$")
    public String iHoverOnTheCronusYogaPantAndClickOnTheColourBlack(String colour) {
            new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption("colour");
            return colour;
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on the colour \"([^\"]*)\"\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnTheColour(String colour){
       new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(colour);
    }

    @And("^I hover on the 'Cronus Yoga Pant' and click on the ‘Add To Cart’ Button\\.$")
    public void iHoverOnTheCronusYogaPantAndClickOnTheAddToCartButton() {
            new PantsPage().mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption();
    }

    @Then("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String add)  {
            new PantsPage().youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText();

    }

    @And("^I should see the title \"([^\"]*)\"$")
    public void iShouldSeeTheTitle(String arg0)  {
        new PantsPage().youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText();
    }

    @And("^I should see the product name \"([^\"]*)\"$")
    public void iShouldSeeTheProductName(String trouser) {
        new ShoppingCartPage().verifyColourOfPantText();
    }

    @And("^I should see the size as \"([^\"]*)\"$")
    public void iShouldSeeTheSizeAs(String size)  {
            new ShoppingCartPage().verifySizeText();

    }

    @And("^I should see the colour as \"([^\"]*)\"$")
    public void iShouldSeeTheColourAs(String colour) {
        new ShoppingCartPage().verifyColourOfPantText();
    }
}

