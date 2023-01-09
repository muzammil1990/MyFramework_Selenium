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
import org.testng.annotations.Test;

/**
 * This class teaches the scrolling the webpage by 4 ways - 
 * Scenario 1: To scroll down the web page by pixel. 
 * Scenario 2: To scroll down the web page by the visibility of the element.
 * Scenario 3: To scroll down the web page at the bottom of the page. 
 * Scenario 4: Horizontal scroll on the web page.
 * 
 */
// all tested code below
public class FirstConcept_ScrollingWebPage {

    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @Test // To scroll down the web page by pixel.
    public void scrollingByPixel() throws InterruptedException {

        WebDriver driver = initializeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(2000);

        // scrolling by pixel
        JavascriptExecutor je = (JavascriptExecutor) driver; // downcasted way, as per selenium webdriver architecture- javascript interface is implemented by
                                                             // remotewebdriver inherited by Browser drivers
        // je.executeScript("scroll(0,400)"); //both scripts are right

        je.executeScript("window.scrollBy(0,400)");
        Thread.sleep(5000);
        driver.quit();

        /*
         * Javascript method ScrollBy() scrolls the web page to the specific number of pixels. Syntax: executeScript("window.scrollBy(x-pixels,y-pixels)")
         * 
         * x-pixels is the number at x-axis, it moves to the left if number is positive and it move to the right if number is negative. y-pixels is the number
         * at y-axis, it moves to the down if number is positive and it move to the up if number is negative . ;
         */

    }

    // this method scrolls the page until the mentioned element is in full view.  = scrollIntoView() method
    @Test
    public void scrollingByVisibilityOfElement() {

        WebDriver driver = initializeDriver();

        WebElement element = driver.findElement(By.xpath(""));
        JavascriptExecutor je = (JavascriptExecutor) driver; // downcasting from webdriver to javascript executor. so that jse can execute javascript from
                                                             // selenium
        je.executeScript("arguments[0].scrollIntoView(true);", element);

        /*
         * je.executeScript("arguments[0].scrollIntoView(true);", element);
         * 
         * scrollIntoView() scrolls the page until the mentioned element is in full view : "arguments[0]" means first index of page starting at 0. Try with 1,
         * 2, 3 if u come across scenario Whereas an " Element " is the WebElement on the web page.
         */

    }

    // this method scrolls to bottom of the web page. = window.scrollTo() method
    @Test
    public void scrollToBottomOfPage() throws InterruptedException {

        WebDriver driver = initializeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(2000);

        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        /*
         * Javascript method scrollTo() scroll the till the end of the page "document.body.scrollHeight" returns the complete height of the body i.e web .
         */

        Thread.sleep(5000);
        driver.quit();
    }

}
