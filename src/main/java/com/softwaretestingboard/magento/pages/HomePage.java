package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utilities {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;

    public void mouseHoverOnWomenMenuTab() {
    log.info("Mouse Hover On Women Menu Tab " + WomenMenuOption.toString());
    waitUntilVisibilityOfElementLocated(By.xpath("//span[contains(text(),'Women')]"),5);
        mouseHoverToElement(WomenMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;
    public void mouseHoverOnWomenTopMenuOption() {
        log.info("Mouse Hover On Women Top Menu Option " + mouseHoverOnTopMenuOption.toString());
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;

    public void clickJacketsOption() {
        log.info("Set Jackets Option " + jacketsOption.toString());
        clickOnElement(jacketsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;

    public void mouseHoverOnMenMenuTab() {
        log.info("Mouse Hover On Men Menu Tab " + menMenuOption.toString());
        waitUntilVisibilityOfElementLocated(By.xpath("//span[normalize-space()='Men']"),5);
        mouseHoverToElement(menMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;
    public void mouseHoverOnMenBottomsMenuOption() {
        log.info("Mouse Hover On Men Bottoms Menu Option " + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;

    public void setPantsOption() {
        log.info("Click on Pants Option " + pantsOption.toString());
        clickOnElement(pantsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;

    public void clickOnShoppingCartOption() {
        log.info("clickOnShoppingCartOption " + shoppingCartOption.toString());
        clickOnElement(shoppingCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;

    public void mouseHoverOnGearMenuOption() {
        log.info("mouseHoverOnGearMenuOption " + mouseHoverOnGearOption.toString());
        waitForElementWithFluentWait(By.xpath("//span[normalize-space()='Gear']"),5,5);
        mouseHoverToElement(mouseHoverOnGearOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-25']")
    WebElement mouseHoverGearAndClickOption;

    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        log.info("mouseHoverOnGearMenuAndClicksOnBagsOption " + mouseHoverGearAndClickOption.toString());
        clickOnElement(mouseHoverGearAndClickOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;

    public void clickOnShoppingCartLinkOption() {
        log.info("clickOnShoppingCartLinkOption " + cartOption.toString());
        clickOnElement(cartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;

    public String verifyOvernightDuffleTextMethod() {
        log.info("verifyOvernightDuffleTextMethod " + nightDuffleText.toString());
        return getTextFromElement(nightDuffleText);
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
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;

    public void clickOnShoppingCartButtonOption() {
        log.info("clickOnShoppingCartButtonOption " + shopCartOption.toString());
        clickOnElement(shopCartOption);
    }
}