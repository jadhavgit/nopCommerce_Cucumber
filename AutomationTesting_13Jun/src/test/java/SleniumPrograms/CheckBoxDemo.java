package SleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//Select specific check box
		//driver.findElement(By.xpath("//input[@id=\"monday\"]"));
		//driver.findElement(By.id("monday")).click();
		
		//Select all the check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,'day')]"));
		System.out.println("Total no. of check boxes: "+checkboxes.size());
		
		//using for loop
		/*for(int i=0;i<=checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		
		//for each loop
		/*for(WebElement chbox:checkboxes) {
			chbox.click();
			
		}*/
		
		//Select multiple check boxes by choice
		/*for(WebElement chbox:checkboxes) {
			String checkboxname=chbox.getAttribute("id");
			if(checkboxname.equals("monday")|| checkboxname.equals("sunday")){
				chbox.click();
			}
			
		}*/
		
		
		//Select last 2 check boxes
		
		int totalcheckboxes=checkboxes.size();//7
		
		/*for(int i=totalcheckboxes-3;i<totalcheckboxes;i++) {//i=7-2 =5
			checkboxes.get(i).click();
		}*/
		
		//Select first 2 check boxes
		for(int i=0;i<totalcheckboxes;i++) {
			if(i<3) {
			checkboxes.get(i).click();
			}
		}

		
		
	}

}
