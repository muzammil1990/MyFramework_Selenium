package com.volvo.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdowns {

    
    
    @Test
    public void handleDropdown(){
       
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        
        WebElement dropdownElement =driver.findElement(By.xpath(""));
        Select select= new Select(dropdownElement);
        select.selectByIndex(index);
        select.selectByValue(value);
        select.selectByVisibleText(text);
    }
}
