package screenshotOnlyForFailedTestCaseUsingListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

import junit.framework.Assert;

//this class is under test

@Listeners(CustomListener.class)
public class Screenshot_TC extends Base {

    @BeforeMethod
    public void setUp() {
        intialiseDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testScreenShotConcept() {
        Assert.assertEquals(false, true);
    }

}
