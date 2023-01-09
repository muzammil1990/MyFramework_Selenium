/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Navigations {

    /**
     * This pg is to simulate 
     * 1. back and forward navigation in the webpage
     * 2. refresh the browsers
     * 
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException  {

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); // to del all the cache from browser

        /* get() and navigate.to() both are used to launch the URL but 
         * if you want to switch to some diff URL
        or some external url then we make use navigate.to()= has browser history which helps you to navigate */
        
        driver.get("https://www.flipkart.com/"); //to open the application URL
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://www.amazon.in/"); //to open the external URL
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        
        driver.navigate().forward();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        
        driver.navigate().refresh();
        
        Thread.sleep(5000);
        driver.quit();
    }

}
