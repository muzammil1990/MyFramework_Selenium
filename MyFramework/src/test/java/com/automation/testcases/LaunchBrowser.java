package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//       system is class and set property is a method of system class and it is static in nature SO classname.methodname 
        
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProjectLisa\\SelniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lisaprism-qa.ocp.got.volvo.net/prism/spec/getiv");
    String pageTitle =      driver.getTitle();
    System.out.println(pageTitle);
      
    }

}
