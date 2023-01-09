/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * handle the calendar by using java script
 */

public class HandleCalendar {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.spicejet.com/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement calendarDate = driver.findElement(By.xpath(""));
        String dateValue = "Fri, 1 Oct 2021";
        HandleCalendar.selectDateByJS(driver, calendarDate, dateValue);
    }

    public static void selectDateByJS(WebDriver driver, WebElement calendarDate, String dateValue) {

        JavascriptExecutor jse = ((JavascriptExecutor) driver);

        jse.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", calendarDate);
    }

}
