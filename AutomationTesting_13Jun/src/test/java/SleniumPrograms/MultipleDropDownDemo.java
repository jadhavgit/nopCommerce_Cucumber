package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDownDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByIndex(3);
		Select year=new Select(driver.findElement(By.id("yearbox")));
		year.selectByIndex(5);
		Select month=new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
		month.selectByIndex(5);
		Select day=new Select(driver.findElement(By.id("daybox")));
		day.selectByIndex(5);
		/*Select s=new Select(year);
		s.selectByIndex(13);*/
		
	}

}
