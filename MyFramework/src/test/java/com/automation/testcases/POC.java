package com.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//me
public class POC {

    
    @Test
    public void getPOC(){
        
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProjectLisa\\SelniumDrivers\\chromedriver.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://lisaprism-qa.ocp.got.volvo.net/prism/spec/getiv");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        WebElement vehicleproductclass= driver.findElement(By.xpath("//select[@id='vechiclePc']"));
        Select vpc = new Select(vehicleproductclass);
        vpc.selectByIndex(1);
        
        
        
    }
}
