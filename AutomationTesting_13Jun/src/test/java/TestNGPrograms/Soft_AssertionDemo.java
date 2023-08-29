package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soft_AssertionDemo {
 
	@Test
	public void testMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		SoftAssert softVerify =new SoftAssert();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println("Verify title........");
		String expectedTitle="Automation Testing Practice1";
		String atualTitle=driver.getTitle();
		//softAssert
		softVerify.assertEquals(expectedTitle, atualTitle, "Title is verify");
		
		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		
		//softAssert
     	softVerify.assertTrue(icon.isDisplayed());

		
		//verify  the search button
		System.out.println("Verifying presence of wikipedia-search-button");
		WebElement searchbutton=driver.findElement(By.className("wikipedia-search-input"));
		//softAssert
		softVerify.assertTrue(searchbutton.isDisplayed());
		
		
		driver.close();
		
		//report all failure meassage
		softVerify.assertAll();
		
		
}
}
