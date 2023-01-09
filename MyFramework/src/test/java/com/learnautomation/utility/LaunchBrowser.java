package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static WebDriver launchApplication(WebDriver driver, String browserName, String url) {

        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else {
            System.out.println("We do not support this browser");
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public void quitBrowser(WebDriver driver) {
        driver.quit();
    }
}
