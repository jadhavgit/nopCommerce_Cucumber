package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//By ID
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("abc123");

		//By name
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("abc123");
		
		//By class name
		//driver.findElement(By.className("inputtext")).sendKeys("abc@gmail.com");
		
		//By Tag Name
		//driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		
		//By linktext
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//By partiallinktext
        driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
