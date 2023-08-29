package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoctorsDemo3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Absolute xpath
		//WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]//img"));
		//System.out.println(ele.getSize());
		
		//Relative xpath
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Admin");
	}

}
