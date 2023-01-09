/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 */
public class HandleFileUploadPopUP {

    @Test
    public void uploadFiles() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://html.com/input-type-file/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        

        WebElement dontAllow = driver.findElement(By.xpath("//div[@class='pm-footer']/a[1]"));
        dontAllow.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='file' and @name='fileupload']")).sendKeys("C:\\Users\\A247622\\Desktop\\Holiday List 2020.pdf");
        //@type=file  tagname must be present
//        driver.findElement(By.xpath("//input[@type='file' and @name='fileupload']")).sendKeys("./resources/Files/Holiday List 2020.pdf");
        
        
    }

}
