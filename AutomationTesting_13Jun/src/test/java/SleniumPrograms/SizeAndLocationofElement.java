package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationofElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		
		//Location ---method1
		System.out.println("Location(x,y) "+logo.getLocation());
		System.out.println("Location(x) "+logo.getLocation().getX());
		System.out.println("Location(y) "+logo.getLocation().getY());
		
		//Location-method2
		System.out.println("Location(x) "+logo.getRect().getX());
		System.out.println("Location(y) "+logo.getRect().getY());
		
		
		
		//Size-->Method 1
		System.out.println("Size(Width,Height):"+logo.getSize());
		System.out.println("Size(Width):"+logo.getSize().getWidth());
		System.out.println("Size(Height):"+logo.getSize().getHeight());
	
		
		//Size-->Method 2
		System.out.println("Size(Width):"+logo.getRect().getDimension().getWidth());
		System.out.println("Size(Height):"+logo.getRect().getDimension().getHeight());
		
		driver.quit();


		
	}

}
