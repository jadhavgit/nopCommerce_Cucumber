package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountDemo {

	@Test(invocationCount=3)
	public void testMethod() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	//username
	WebElement username=driver.findElement(By.id("user-name"));
	username.clear();
	username.sendKeys("standard_user");
	
	//password
	WebElement password=driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("secret_sauce");
	
	//Login
	driver.findElement(By.id("login-button")).click();
	driver.quit();
}
}