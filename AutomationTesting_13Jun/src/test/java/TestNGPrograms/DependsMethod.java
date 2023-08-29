package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsMethod {

	@Test(dependsOnMethods= {"LaunchBrowser"})
	void LoginPage() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://ultimateqa.com/dummy-automation-websites");
		driver.close();
	}
	@Test
	void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
	}
}
