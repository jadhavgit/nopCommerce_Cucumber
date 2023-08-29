package SleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
		//Launch Browser
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driverchrome =new ChromeDriver();
		driverchrome.get("https://admin-demo.nopcommerce.com");
	
		//FireFox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driverfirefox=new FirefoxDriver();
		driverfirefox.get("https://www.amazon.com");
		
		//Edge
		WebDriverManager.edgedriver().setup();
		WebDriver driveredge=new EdgeDriver();
		driveredge.get("https://www.flipkart.com");
		
		
	}

}
