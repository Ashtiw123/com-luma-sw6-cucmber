package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PantsPage extends Utilities {

    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;

    public void mouseHoverOnMenPantsProductNameOption() {
        log.info("Mouse Hover On Men Pants Product Name Option " + mouseHoverOnProductNameOption.toString());
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String size) {
        log.info("Mouse Hover On Product Name Cronus Yoga Pant And Click On Size Option " + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String colour) {
        log.info("mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption " + mouseHoverAndClickOnColourNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnColourNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        log.info("mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption " + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;

    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        log.info("youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText " + addedToYourShoppingCartMethodText.toString());
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }
}
