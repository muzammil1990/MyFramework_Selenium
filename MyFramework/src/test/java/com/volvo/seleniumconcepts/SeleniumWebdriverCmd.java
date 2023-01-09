/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 */

public class SeleniumWebdriverCmd {

    static WebDriver driver;

    public static WebDriver initialiseChromeDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://javatpoint.com/selenium-tutorial");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    // these method is to open browser
    public void openBrowser() throws InterruptedException {
        driver.navigate().to("https://javatpoint.com/selenium-tutorial");
        Thread.sleep(2000);
    }

    public void openBrowser2() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(2000);
    }

    // Locating forms and sending user inputs: sendKeys()
    public void sendUserInputs() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("volvo");
        Thread.sleep(2000);
    }

    // to clear user entered value/input: clear()
    public void clearUserInput() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).clear();
        Thread.sleep(2000);
    }

    //to fetch the text value from the webelement: getText()
    public void getTextDataOverWebelement() {
        String textValue = driver.findElement(By.xpath("//h1[text()='Selenium Tutorial']")).getText();
        System.out.println(textValue + "\n\n");

    }
    
    public void clickOperation(){
        driver.findElement(By.xpath("//input[@name='q']")).click();
        
    }
    
   /* Navigating backward in browser history
        driver.navigate().back();
    
    
    Navigating forward in browser history
    driver.navigate().forward();  
    
    
    Refresh/ Reload a web page
    driver.navigate().refresh();
    driver.get(driver.getCurrentUrl());
    
    Closing the current browser/tab
    driver.close();
    
    
     Closing Browser and all other windows associated with the driver
    driver.quit();
    
      
      Moving between Windows
        driver.switchTo().window("windowName");
        
          
      Moving between Frames - 3 ways
        driver.switchTo().frame(int );
        driver.switchTo().frame(String);
        driver.switchTo().frame(WebElement); 
        
            
      
 */ 
    
   
}
