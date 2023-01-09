package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendTextWithoutSendkeys {

    public static void main(String[] args) {

       WebDriver fdriver = new FirefoxDriver();
        // sendKeys concept
        // To send the text in inputbox/textbox without using sendKeys();

        JavascriptExecutor JS = (JavascriptExecutor) fdriver;
        // Enter username
        JS.executeScript("document.getElementById('User').value='Abha'");
        // Enter password
        JS.executeScript("document.getElementById('Password').value='123'");

        // or
        
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // URL launch
        driver.get("https://www.tutorialspoint.com/index.htm");
        // JavaScript Executor to enter text
        JavascriptExecutor j = (JavascriptExecutor) driver;
                                                    
                                                    //id
        j.executeScript("document.getElementById('gsc-i-id1').value='Selenium'");
        
        WebElement l = driver.findElement(By.id("gsc-i-id1"));
        String s = l.getAttribute("value"); //attribute name itself is = value
        System.out.println("Value entered is: " + s); //output= selenium

    }

}
