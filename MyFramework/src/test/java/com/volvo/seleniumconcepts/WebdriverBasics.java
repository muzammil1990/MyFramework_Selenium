package com.volvo.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class is to show the basics of webdriver like launch the browser, opening URL, title of page,
 *  current URL of page, to view the page source, close the browser
 */
public class WebdriverBasics {

    static WebDriver driver;

    @Test
    public void webdriverBasicsConcepts() throws InterruptedException {
/*
        System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();               // This launches/opens the browser
        driver.get("https://www.flipkart.com/");    // opens the url

        Thread.sleep(5000);*/

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();                        // This launches/opens the browser
        driver.navigate().to("https://www.flipkart.com/");  // launch/opens the url

        Thread.sleep(4000);
        /*
         * webdriver is an interface; navigate().to() and get() are the method declaration already done in webdriver interface. RemoteWebDriver() class is a class which
         * implements(Create Method body) of these methods of Interface.
         */

        // to get the title of the page
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        
        
        //Validation- to verify whether the title of the page is correct
        if(titleOfPage.equalsIgnoreCase("google")){
            System.out.println("title is correct");
        }
        
        else{
            System.out.println("incorrect title");
        }
        
        System.out.println(driver.getCurrentUrl()); // to get the current url which is loaded.
        
        System.out.println("\n");
        
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);
        
        driver.quit();  // to close the browser and every associated windows
        
//        System.out.println(driver.getPageSource());
    }
 }
