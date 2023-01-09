package com.volvo.seleniumconcepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

// This class is to show how to handle ajax calls- using explicit waits
public class DifferentWaitsInSelenium {

    WebDriver driver;

    @SuppressWarnings("deprecation")
    @Test
    public void differentWaitsTypes() throws InterruptedException {

        // webdriver wait
        WebDriverWait wait = new WebDriverWait(driver, 130);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Contexts (0 of 3)']")));

        // or
        WebElement element = driver.findElement(By.xpath("//strong[text()='Contexts (0 of 3)']"));
        WebDriverWait wait2 = new WebDriverWait(driver, 130);
        wait2.until(ExpectedConditions.visibilityOf(element));

        // hard wait
        Thread.sleep(2000);

        // fluent wait
   
      //Declare and initialise a fluent wait
        FluentWait wait3 = new FluentWait(driver);
        //Specify the timout of the wait
        wait3.withTimeout(5000, TimeUnit.MILLISECONDS);
        //Sepcify polling time
        wait3.pollingEvery(250, TimeUnit.MILLISECONDS);
        //Specify what exceptions to ignore
        wait3.ignoring(NoSuchElementException.class);

        //This is how we specify the condition to wait on.
        //This is what we will explore more in this chapter
        wait3.until(ExpectedConditions.alertIsPresent());
       
        
     // pageload wait
 /*
  *  Sets the amount of time to wait for a page load to complete before throwing an error.
     * If the timeout is negative, page loads can be indefinite.

  * selenium should wait for the page to be loaded. If page load happens in 5 seconds then rest of the time
 will be ignored.*/
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        
        
        // implicit wait
/* 1. Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
 * 2. When searching for a single element, the driver should poll the page until the element has
      been found, or this timeout expires before throwing a NoSuchElementException
  3. When searching for multiple elements, the driver should poll the page until at least one element
     has been found or this timeout has expired.    */
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        // it will wait till the specified time for the webelement and if webelement is not found it will throw
        // NoSuchElementException

        
    }
}
