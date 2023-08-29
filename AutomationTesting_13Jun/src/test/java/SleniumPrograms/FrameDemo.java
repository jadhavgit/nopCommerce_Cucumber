package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();

		//1st frame
		//driver.switchTo().frame("packageListFrame");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		//2nd frame
		//driver.switchTo().frame("packageFrame");
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();//go back to the main page
		
		//3rd frame
		//driver.switchTo().frame("classFrame");
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[text()='Help']")).click();

		
	}

}
