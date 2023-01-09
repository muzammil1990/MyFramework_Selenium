/**
 * 
 */
package com.learnautomation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * to launch browser
 */
public class BaseClassPractice {

    WebDriver driver;

    ReadPropertiesFile rpf = new ReadPropertiesFile();
    String configPath = "./resources/Drivers/chromedriver.exe";

    public WebDriver getDriver() {

        String browserName = rpf.readDataFromPropertiesFile(configPath, "browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.ie.driver", ".\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

}
