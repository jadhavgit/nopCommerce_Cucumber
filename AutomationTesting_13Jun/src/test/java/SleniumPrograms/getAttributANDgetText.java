package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttributANDgetText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();

		WebElement email=driver.findElement(By.id("Email"));
		//email.clear();
		//email.sendKeys("admin@yourstore.com");
		
		//capturing text from inputbox
		System.out.println("Result from getAttribute() method: "+email.getAttribute("value"));
		System.out.println("Result from getText() method: "+email.getText());

		//Login button
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		
		System.out.println(button.getText());
		
		String title=driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
		System.out.println(title);
	
	}

}
