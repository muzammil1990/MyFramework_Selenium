/**
 * 
 */
package com.volvo.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This class is only to call the Selenium WebDriverCmd class to test the selenium concepts
 */
public class CallSeleniumWebDriver extends SeleniumWebdriverCmd {

    WebDriver driver;

    @BeforeClass
    public void getDriver() {
        driver = initialiseChromeDriver();

    }

    @Test
    public static void getSeleniumWebdriverCmdClass() throws InterruptedException  {
        
        SeleniumWebdriverCmd swc= new SeleniumWebdriverCmd();
       swc.openBrowser();
        swc.openBrowser2();
        swc.sendUserInputs();
        swc.clearUserInput();
        swc.getTextDataOverWebelement();
        swc.clickOperation();
        swc.dragAndDropElements();
        
    }

}
