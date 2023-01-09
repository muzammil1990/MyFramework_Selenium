/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 */
public class HandleRadioButton {

    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @Test
    public void testRadioButtonConcept() throws InterruptedException {
        WebDriver driver = initializeDriver(); // calling the non static method
        driver.get("C:\\Users\\A247622\\Desktop\\radiobutton.html");
//        driver.get(".\\resources\\Testdata\\radiobutton.html");
        Thread.sleep(3000);

        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(radio.size());

       
         /** WebElement element = driver.findElement(By.id("SubmitButton"));
             String attValue = element.getAttribute("id"); //This will return value of the attribute =  "SubmitButton"
         * System.out.println(attValue);*/
         

        for (WebElement element : radio) {
            String actualText= element.getText();
//            or
            String actualtext = element.getAttribute("value"); // this will return value or text of the attribute, here attribute is value 
           
//getAttribute()= used when in dom structure any attribute does not have value.
//            that attribute gets the value when user enters some data in runtime and
            //in DOM structure that specific attribute gets updated with user's given value.
            //this is when we want to fetch the user's value we use getAttribute()
            
            System.out.println(actualtext);
            
            if (actualtext.equalsIgnoreCase("Watermelon"))
                element.click();

            else if (actualtext.equalsIgnoreCase("Potato"))
                element.click();

       }
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Tomato']")).click();
    }
}
