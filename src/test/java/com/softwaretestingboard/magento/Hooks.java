package com.softwaretestingboard.magento;

import com.cucumber.listener.Reporter;
import com.softwaretestingboard.magento.browserfactory.ManageBrowser;
import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utility.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utilities {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }




    @After
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()){
                String screeShotPath = Utilities.getScreenshot(ManageBrowser.driver, scenario.getName().replace(" ", "_"));
                try {
                    Reporter.addScreenCaptureFromPath(screeShotPath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            closeBrowser();
    }


}
