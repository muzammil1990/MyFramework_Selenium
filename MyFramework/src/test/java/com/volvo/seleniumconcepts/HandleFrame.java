package com.volvo.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleFrame {

    @Test
    public void testFrameConcept() {

        System.setProperty("webdriver.gecko.driver", ".\\resources\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/guru99home/");

        // count the no of frames in the window/page
        int count = driver.findElements(By.tagName("iframe")).size();
        System.out.println(count);

        // one type out of 3 types to identify frame and switch to
        WebElement frameElement = driver.findElement(By.xpath(""));
        driver.switchTo().frame(frameElement);
        driver.switchTo().defaultContent();

        // driver.switchTo().frame(int index); // by int index
        // driver.switchTo().frame(nameOrId); // by string
// once switchTo().Frame, post that we must do switchTo().defaultContent();
    }
}
