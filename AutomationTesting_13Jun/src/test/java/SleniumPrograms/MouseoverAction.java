package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseoverAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions at=new Actions(driver);
		at.moveToElement(desktop).moveToElement(mac).click().perform();
		

	}

}
