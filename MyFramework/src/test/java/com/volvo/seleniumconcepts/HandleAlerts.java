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
import org.testng.annotations.Test;

/**
 * interface TargetLocator extends Alert
 * 
 * TargetLocator and Alert both are interface.
 * 
 * interface Alert provides four methods 1. void dismiss()= click on 'Cancel' button of the alert. syntax = driver.switchTo().alert().dismiss();
 * 
 * 2. void accept()= to click on the 'Ok' button of the alert. syntax= driver.switchTo().alert().accept();
 * 
 * 3. String getText()= to capture the message present on the alert window. syntax= driver.switchTo().alert().getText();
 * 
 * 4. void sendKeys(String stringToSend)= to send some data to the alert box. syntax= driver.switchTo().alert().sendKeys("Text");
 * 
 * ---------------------------------------------------------- 
 * 
 * Alert is an interface. It has 4 methods;
 * 
 * public interface Alert { 
 * 
 * void dismiss();
 * 
 * void accept();
 * 
 * String getText();
 * 
 * void sendKeys(String keysToSend); }
 */

public class HandleAlerts {

    @Test
    public void testAlertConcept() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Alert
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement signIn = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signIn.click();

        Alert alert = driver.switchTo().alert(); // return alert object so saved in alert Interface reference
                                                 // we must switch from desktop page to alert window
        
        Thread.sleep(2000);
        System.out.println(alert.getText() + "\n"); //gets the text present on the alert/pop up window
        Thread.sleep(2000);

        alert.accept(); // to click on the 'Ok' button
        // alert.dismiss();
        driver.quit();

    }
}
