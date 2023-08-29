package SleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationExamples {

	public static void main(String[] args) {
		// launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		//Open URL
		driver.get("https://admin-demo.nopcommerce.com/");//demo nop
		//driver.get("https://www.amazon.com/");//amazon
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();//demo
		driver.navigate().forward();//amazon
		driver.navigate().refresh();//amazon

	}

}
