package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrapandDropImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1=driver.findElement(By.xpath("//li[1]"));
		WebElement item2=driver.findElement(By.xpath("//li[2]"));
		WebElement item3=driver.findElement(By.xpath("//li[3]"));
		WebElement item4=driver.findElement(By.xpath("//li[4]"));
		
		WebElement trsh =driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions at=new Actions(driver);
		at.dragAndDrop(item1, trsh).perform();
		at.dragAndDrop(item2, trsh).perform();
		at.dragAndDrop(item3, trsh).perform();
		at.dragAndDrop(item4, trsh).perform();
	}

}
