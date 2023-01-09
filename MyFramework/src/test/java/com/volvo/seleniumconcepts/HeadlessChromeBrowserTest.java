/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * To make google chrome as headless browser and test
 */
public class HeadlessChromeBrowserTest {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");

        //two mandatory things to make chrome browser headless
        //1. Chrome version should be greater than 59 on mac and greater than 60 on windows
        //2. window-size=1400,800
        
        ChromeOptions options = new ChromeOptions(); //chromeOptions= class
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); // to del all the cache from browser

        driver.get("https://www.amazon.in/"); // to open the application URL
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("muzammilchoudhury@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("@loveyoudad143#");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

    }

}
