/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * this pg is show the working of takescreen shot .
 */
public class HandleScreenshot {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
        HandleScreenshot.takeScreenShot("Youtube_Page");

    }

    public static void takeScreenShot(String fileName) throws IOException {
        // 1. take screenshot and store it as a file format
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // driver typecasted or converted to takescreenshot(interface)

        // 2. now copy the screenshot to desired location using copyfile method
        FileUtils.copyFile(file, new File("./resources/Screenshots/" + fileName + ".jpg"));
        driver.get(driver.getCurrentUrl()); //refresh
        
    }

}
