/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

    /**
     * This pg is to-
     * 1. count the no of elements present in webpage
     * 2. get the text of each link 
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); // to del all the cache from browser
        Thread.sleep(2000);
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //total no of links
        List<WebElement> totalLinks= driver.findElements(By.tagName("a"));
        
        //total no of inputbox in webpage
        List<WebElement> totalInputBox=driver.findElements(By.tagName("input")); //list =indexbased
        
        //total no of frames in page
        List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
        
//      to get the count in the list we have size method
        System.out.println("total no. of links of webpage:-  " + totalLinks.size());
        System.out.println("total no. of input/editbox of webpage:- " + totalInputBox.size());
        System.out.println("total no. of frames of webpage:- " + totalFrames.size());
        
//      to retrieve values or data in the list we have 'get' method.
//      Here we have to find text of all links
        for(int i=0; i<totalLinks.size(); i++){
           String actualWebElementText= totalLinks.get(i).getText();  // in list, at index 0 = webelement is stored and so on
           System.out.println(actualWebElementText);
        }
       
//        FROM PRISM PROJECT
        															// check xpath class for dom structure and common xpath
     /*   List<WebElement> options = driver.findElements(By.xpath("//div[@tabindex='-1' and @unselectable='on' and @role='gridcell' and @col-id='familyId']"));
        List<String> actualTextList = new ArrayList<String>();
        List<String> expectedTextList = new ArrayList<String>();
        expectedTextList.add("7IX");   
        expectedTextList.add("GSX");   based on the expected text in the list which matches the actual text (runtime) it will click that radio button or checkbox
        expectedTextList.add("YEX");

        for (WebElement option : options) {
            String text = option.getText();
            actualTextList.add(text);
        }

        Thread.sleep(2000);
        softAssert.assertEquals(actualTextList, expectedTextList);*/

        
     // After this concept read handle radiobuttons  
    }

}
