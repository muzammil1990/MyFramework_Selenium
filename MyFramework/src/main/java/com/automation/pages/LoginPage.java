package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*This class is used to store all locators and methods of login page
 * 
 *  */

public class LoginPage {

    WebDriver driver;

    // to initialise the page object webelements we use webdriver interface
    //ldriver comes from test case
    public LoginPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(how = How.ID, using = "email")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Log In'][@aria-label='aria-label']")
    WebElement logIN;

    // Action as per test case which is to be performed i.e. login to facebook

    public void loginToFacebook(String userName, String passWord) {

        username.sendKeys(userName);
        password.sendKeys(passWord);
        logIN.click();
    }

}
