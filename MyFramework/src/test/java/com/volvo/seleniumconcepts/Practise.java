/**
 * 
 */
package com.volvo.seleniumconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * to test random concepts
 */
public class Practise {
	@SuppressWarnings("deprecation")
	@Test
	public void testcase() throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		File file = new File("location");
		FileInputStream fis = new FileInputStream(file);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data + " ");
			}

			System.out.println();
		}

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		totalLinks.size();

		List<WebElement> totalInputBox = driver.findElements(By.tagName("input"));
		totalInputBox.size();

		for (int i = 0; i < totalLinks.size(); i++) {
			String webElementText = totalLinks.get(i).getText();
			System.out.println(webElementText);
		}

	}

}
