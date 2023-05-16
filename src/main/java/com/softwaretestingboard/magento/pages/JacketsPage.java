package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class JacketsPage extends Utilities {

    private static final Logger log = LogManager.getLogger(JacketsPage.class.getName());

    public JacketsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;
    public void productSortByProductName(String product) {
       log.info("Products Sort By Product Name " + sortProductNameInDropDownOption.toString());
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    WebElement sortInAlphabetical;
    public void sortInAlphabeticalOrder(){
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
            jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
            List<String> jacketsNameListAfter = new ArrayList<>();
            for (WebElement value1 : jacketsElementsList) {
                jacketsNameListAfter.add(value1.getText());
            }
            // Sort the before name list into Ascending Order
            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
            // Verify the products name display in alphabetical order
            Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
        }
    }
}
