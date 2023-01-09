package com.volvo.seleniumconcepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowSize {

	public static void main(String[] args) {
		
		 WebDriver driver = new FirefoxDriver();
		//To maximize the window

		   driver.manage().window().maximize();

		//To set the window size

		  Dimension d = new Dimension(400,600); // increase or decrease the size

		  driver.manage().window().setSize(d);
	}
}

