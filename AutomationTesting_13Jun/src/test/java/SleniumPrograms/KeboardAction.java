package SleniumPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeboardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		
		Actions at=new Actions(driver);
		at.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		at.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);

		at.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);

		at.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);

		at.sendKeys(Keys.F1).perform();
		Thread.sleep(3000);

		at.sendKeys(Keys.NUMPAD8).perform();
		Thread.sleep(3000);

		at.sendKeys(Keys.SHIFT).perform();
		Thread.sleep(3000);

		
	}

}
