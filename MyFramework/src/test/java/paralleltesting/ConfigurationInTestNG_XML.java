package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfigurationInTestNG_XML {
	
	
	
	
	@Test
	public void test1() {
		System.out.println(1+" : "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "/Users/tarsingh10/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test2() {
		System.out.println(2+" : "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "/Users/tarsingh10/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
	}
	
	
	/*!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
	 
	<suite name = "Parallel Testing Suite">
	
	   <test name = "Parallel Tests" parallel = "methods" thread-count = "2">
	   
	      <classes>
	         <class name = "ParallelTest" />
	      </classes>
	   </test>
	</suite>
	*/


}
