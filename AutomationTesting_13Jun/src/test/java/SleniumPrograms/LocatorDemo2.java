package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		//CSSSelector Tag & ID
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
		//or
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		

		//CSSSelector Tag & class
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc@gmail.com");
		
		//or
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");

		
		
		//CSSSelector Tag & Attribute
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("abc@gmail.com");
		
		//or
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc@gmail.com");
	
		
		//CSSSelector Tag class & Attribute
		driver.findElement(By.cssSelector("input.inputtext[type='text']")).sendKeys("abc@gmail.com");
	
	
	}

}
