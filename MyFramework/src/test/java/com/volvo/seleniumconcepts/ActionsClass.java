/**
 * 
 */
package com.volvo.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * what actions an Action class can perform.
 */
public class ActionsClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
//     1.   Drag and Drop= act.dragAndDrop(from, to).build().perform();
//     2.   clickAndHold()
//     3.   mouse movement: act.moveToElement(WebElement target).build().perform()
//          driver.findElement(By.linktext("submenu element")).click();
      
//       4. release()
        
//       5. doubleClick()
          // upcasting concept; launches the browser
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.doubleClick(elementLocator).perform();
        
//        6. pause()=  public Actions pause(long pause)
        
//        7. tick()=   public Actions tick(Action action)
        
        //8: rightClick()
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("ID"));
        action.contextClick(element).perform();
        
       
    }

}
