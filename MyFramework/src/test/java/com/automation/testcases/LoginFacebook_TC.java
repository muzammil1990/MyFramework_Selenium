package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.learnautomation.utility.LaunchBrowser;

public class LoginFacebook_TC {

    WebDriver driver;

    @Test
    public void Login() {

        driver = LaunchBrowser.launchApplication(driver, "Chrome", "https://www.fb.com/");
        System.out.println(driver.getTitle());
        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        lp.loginToFacebook("muzifire@gmail.com", "loveyoudad143#");
    }

}
