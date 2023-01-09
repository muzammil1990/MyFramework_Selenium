/**
 * 
 */
package com.volvo.dataprovider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import domain.company.utility.Utilities;

/**
 * this class is used to register in ebay
 */
public class Amazon_TC {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.amazon.in");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @DataProvider()
    public Iterator<Object[]> getTestData() throws EncryptedDocumentException, IOException {
        ArrayList<Object[]> testData = Utilities.readDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "getTestData")
    public void signInUser(String email) {

        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).sendKeys(email);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
