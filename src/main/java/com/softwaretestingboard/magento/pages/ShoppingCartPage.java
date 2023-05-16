package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utilities {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;

    public String shoppingCartText() {
        Reporter.log("shoppingCartText " + shoppingCartTextMethod.toString());
        return getTextFromElement(shoppingCartTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;

    public String cronusPantText() {
        Reporter.log("cronusPantText " + pantTextMethod.toString());
        return getTextFromElement(pantTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;

    public String verifySizeText() {
        Reporter.log("verifySizeText " + sizeTextMethod.toString());
        return getTextFromElement(sizeTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;

    public String verifyColourOfPantText() {
        Reporter.log("verifyColourOfPantText " + colourTextMethod.toString());
        return getTextFromElement(colourTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;

    public void quantityUpdateText() {
        Reporter.log("quantityUpdateText " + qtyOption.toString());
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;

    public String verifyUpdatedPriceText() {
        Reporter.log("verifyUpdatedPriceText " + priceTextMethod.toString());
        return getTextFromElement(priceTextMethod);
    }
}
