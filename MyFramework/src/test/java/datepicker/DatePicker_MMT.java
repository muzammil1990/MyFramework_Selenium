package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_MMT {

	public static void main(String[] args) {
		
		
		
		String expectedMonth= "March 2019";
		String expectedDay="20";
		
		System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.net/hotels");
		
		//click on checkin
		driver.findElement(By.xpath("//input[@name='checkin']")).click();
		
		
		
		
	}
}
