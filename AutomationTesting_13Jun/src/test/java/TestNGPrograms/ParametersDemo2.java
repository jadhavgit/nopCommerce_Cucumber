package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersDemo2 {

	@Parameters("keyword")
	@Test
	public void search(String sdata) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(sdata);
		driver.quit();
	}
	
}
