package SleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//Alert window with ok button

		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();*/

		//Alert window with ok & cancel button
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept(); //close alert by using ok button
		//driver.switchTo().alert().dismiss(); //close alert by using cancel button

		//Alert window with input box ,capture text from alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println("The message displayed on alert :"+alert.getText());

		alert.sendKeys("Welcome");
		alert.accept();



	}

}
