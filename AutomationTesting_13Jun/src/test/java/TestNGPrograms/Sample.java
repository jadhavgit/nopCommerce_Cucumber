package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;
	
	@BeforeMethod
	public void startup() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loging() {
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	


}
