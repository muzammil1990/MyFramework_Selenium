/**
 * 
 */
package com.volvo.seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * there are 8 locators in selenium to locate or find the webelements present in the webpage.
 * 
 * driver.get("https://the-internet.herokuapp.com/");
 */
public class LocatorConcept {

    @Test
    public void locatorsInSelenium() {
        /*  
         * id ---------------- priority=1 
         * name ---------------- priority=3 
         * 
         * tagName
         * className------------- not recommended. priority=4
         * 
         * linktext-------------- only for links 
         * partialLinkText------- not recommended to use
         * 
         * css selector---------- priority=2
         * xpath ---- ----- ---- priority=2
         */
//===================================================================================
        
  /* scenario:  
   * dynamic element 
   *  input tagname  
         id = test123
         id = test456
        id = test236
        
        use regular expression xpath
        driver.findElement(By.xpath("//input[contains(@id,'test')] "))
        
        or
        
        driver.findElement(By.xpath("//input[starts-with(@id, 'test')]"))
        
        */
           
        
   /* scenario:  
         * dynamic element 
         * 
         *  input tagname 
         *  id= 1234_test_t
         *  id= 2341_test_t
         *  id=4527_test_t
         *  
         *  
         *  By.xpath("// input[ends-with(@id, 'test_t')]")
         *  
         *  or
         *  
         *  By.xpath(" //input[contains(@id,'test_t')] ")
         *  
        */
        
        
        // for links: Custom xpaths
//        By.xpath("//a[contains(text(),'can write partial text')]");
        
    }
}
