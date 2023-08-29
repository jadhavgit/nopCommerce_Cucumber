package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {
	WebDriver driver;
	 @Test
	 void loginTest() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		  WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		  Assert.assertTrue(logo.isDisplayed());
		  Thread.sleep(3000);	  
	 
	 }
	 
	 @Test
	 void homePageTitle() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		 Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
		  Thread.sleep(3000);	  

	 }
	 @AfterMethod
	 void teardown() {
		 driver.quit();
	 }
	
	
	
}
