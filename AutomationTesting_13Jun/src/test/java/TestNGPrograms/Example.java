package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	
	@Test
	public void execute_Web_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://ultimateqa.com/dummy-automation-websites");
		
		driver.close();
	}

}
