package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGPrograms.ListenerClass.class)
public class ListenerDemo {
   
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver =new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		//Loctaor for email
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		//Loctaor for password
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		//Loctaor for login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
  
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		driver.quit();
	}
	
	@Test
	public void testFail() {
		System.out.println("Test case fail");
		Assert.assertTrue(false);
  	}
	@Test
	public void testPass() {
		System.out.println("Test case pass");
		Assert.assertTrue(true);
  	}
	
	@Test
	public void testSkipped() {
		System.out.println("Test case Skip");
		throw new SkipException("Skip on Exception.............");
  	}
	

	
}
