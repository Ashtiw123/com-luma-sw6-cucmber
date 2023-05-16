package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BagsPage extends Utilities {

    private static final Logger log = LogManager.getLogger(BagsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;

    public void clickOnDuffleBagOption() {
        Reporter.log("clickODuffleBagOption " + duffleBagOption.toString());
        clickOnElement(duffleBagOption);
    }
}
