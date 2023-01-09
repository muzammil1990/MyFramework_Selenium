package com.volvo.seleniumconcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleSendkeys {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
//        sendKeys concept
//     To send the text in inputbox/textbox without using sendKeys();   
       
     JavascriptExecutor JS = (JavascriptExecutor) driver;
     // Enter username
     JS.executeScript("document.getElementById('User').value='Abha_Rathour'");
     // Enter password
     JS.executeScript("document.getElementById('Password').value='password123'");
        
        
      //Press Keys in Selenium – ENTER, TAB, SPACE, CONTROL, ARROW, FUNCTION Keys 
        
         WebElement textbox = driver.findElement(By.id("idOfElement"));
        textbox.sendKeys(Keys.ENTER); 
        
//        Keys= is an enum.
       /* Keyboard’s Key  Keys enum’s value
        Arrow Key – Down                         Keys.ARROW_DOWN
        Arrow Key – Up                           Keys.ARROW_UP
        Arrow Key – Left                         Keys.ARROW_LEFT
        Arrow Key – Right                        Keys.ARROW_RIGHT
        Backspace                                Keys.BACK_SPACE
        Ctrl Key                                 Keys.CONTROL
        Alt key                                  Keys.ALT
        DELETE                                   Keys.DELETE
        Enter Key                                Keys.ENTER
        Shift Key                                Keys.SHIFT
        Spacebar                                 Keys.SPACE
        Tab Key                                  Keys.TAB
        Equals Key                               Keys.EQUALS
        Esc Key                                  Keys.ESCAPE
        Home Key                                 Keys.HOME
        Insert Key                               Keys.INSERT
        PgUp Key                                 Keys.PAGE_UP
        PgDn Key                                 Keys.PAGE_DOWN
        Function Key F1                         Keys.F1
        Function Key F2                         Keys.F2
        Function Key F3                         Keys.F3
        Function Key F4                         Keys.F4
        Function Key F5                         Keys.F5
        Function Key F6                         Keys.F6
        Function Key F7                         Keys.F7
        Function Key F8                         Keys.F8
        Function Key F9                         Keys.F9
        Function Key F10                        Keys.F10
        Function Key F11                        Keys.F11
        Function Key F12                        Keys.F12*/
        
    }
}
