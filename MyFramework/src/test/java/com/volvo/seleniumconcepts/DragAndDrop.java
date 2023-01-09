/**
 * 
 */
package com.volvo.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * this is to show working of drag n drop using Action class in WebDriver
 * 
 * test case scenario ------------------ 1. Invoke Firefox Browser 
 * 2. Open URL: https://www.testandquiz.com/selenium/testing.html 
 * 3. Drag and Drop the
 * JavaTpoint icon on the textbox
 */
public class DragAndDrop {

    @Test
    public void testDragNDrop_Concept() throws InterruptedException{
        
        System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // upcasting concept; launches the browser
        
//      driver.get("https://www.testandquiz.com/selenium/testing.html");
        driver.navigate().to("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
                                        
        driver.switchTo().frame(0);
                                                
        Actions act= new Actions(driver);
        
        
        WebElement from= driver.findElement(By.id("draggable"));
        WebElement to= driver.findElement(By.id("droppable"));
        Thread.sleep(3000);
        
        act.clickAndHold().moveToElement(to).release().build().perform();
        
//        act.dragAndDrop(from, to).build().perform();
        act.clickAndHold(from).moveToElement(to).release().build().perform();  //Generates all action so far, which are ready to be performed
        
        
    }
}