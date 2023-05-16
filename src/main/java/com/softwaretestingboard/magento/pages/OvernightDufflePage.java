package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDufflePage extends Utilities {

    private static final Logger log = LogManager.getLogger(OvernightDufflePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;

    public String verifyOvernightDuffleText() {
        log.info("verifyOvernightDuffleText " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;

    public void quantitySpaceOption() {
        Reporter.log("quantitySpaceOption " + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//button[@title='Search']")
    WebElement mouseHoverAndClickOnAddToCartOption;

    public void clickOnAddToCartButtonDuffleBag() {
        log.info("mouseHoverOnAddToCartOption " + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;
    public void clickOnShoppingCartButtonOption() {
       log.info("clickOnShoppingCartButtonOption " + shopCartOption.toString());
        clickOnElement(shopCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;
    public String verifyQuantityText() {
   log.info("verifyQuantityText " + qtyText.toString());
        return getTextFromElement(qtyText);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;
    public String verifyProductPrice() {
        log.info("verifyProductPrice " + priceText.toString());
        return getTextFromElement(priceText);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;

    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
       log.info("verifyYouAddedOvernightDuffleToYourShoppingCartText " + youAddedText.toString());
        return getTextFromElement(youAddedText);
    }
}
