package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hard_AssertionDemo {

	@Test
	public void testMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println("Verify title........");
		String expectedTitle="Automation Testing Practice1";
		String atualTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle, atualTitle, "Title is verify");
		
		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		//Hard Assert
		Assert.assertTrue(icon.isDisplayed());
		//Assert.assertFalse(icon.isDisplayed());
		
		
		//verify  the search button
		System.out.println("Verifying presence of wikipedia-search-button");
		WebElement searchbutton=driver.findElement(By.className("wikipedia-icon"));//class="wikipedia-search-input"
		//Hard Assert
		Assert.assertTrue(searchbutton.isDisplayed());
		
		driver.close();

	}
	
	
}

