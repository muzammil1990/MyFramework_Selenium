package com.volvo.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//This class is to show the working of moveToElement,
///use snapdeal


public class MouseMovement {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       Actions act= new Actions(driver);
        
//      action class has 3 more methods 
      /*
        act.moveToElement(WebElement target);
        act.clickAndHold();
        act.release(WebElement target);
        
    syntax: act.moveToElement(WebElement target).build().perform()
            Thread.sleep(2000)
            driver.findElement(By.linktext("submenu element")).click();
   
    SCENARIO:
     This above method is used when there is MENU and SUBMENU present. And we have to navigate
     to MENU first so that SUBMENU will be displayed.
      */
    }
}
