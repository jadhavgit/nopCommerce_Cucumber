package SleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggesionDropDown {

	public static void main(String[] args) {
         
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role=\"option\"]//div[1]/span"));
		System.out.println("Size of Auto Suggesions:"+list.size());
		
		for(WebElement listitem:list) {
			
			if(listitem.getText().contains("oracle")) {
				listitem.click();
				break;
				
			}
			
		}
		
	  	
		
		
	    
	}

}
