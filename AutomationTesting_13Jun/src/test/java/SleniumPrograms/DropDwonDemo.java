package SleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwonDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement dropskill=driver.findElement(By.id("Skills"));
		
		Select dropskills=new Select(dropskill);
		//dropskills.selectByVisibleText("C++");
		//dropskills.selectByValue("HTML");
		//dropskills.selectByIndex(12);
		
		//Selecting option from dropdown without using Methods
		
		List<WebElement>alloptions=dropskills.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals("C++")) {
				option.click();
				break;
				
			}
		}
		
		

	}

}
