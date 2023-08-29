package SleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();

		/*//FindElement ---->Return the single WebElement
		//1
		WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		searchbox.sendKeys("XYZ");

		//2
		WebElement ele=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
        System.out.println(ele.getText());

        //3
       WebElement seachbutton= driver.findElement(By.xpath("//button[text()='Login']"));
		 */
		//FindElements()---->Return multiple webElement
		//1
		//List<WebElement> searchbox=driver.findElements(By.xpath("//input[@id=\"small-searchterms\"]"));
		
		//2
		/*List<WebElement> links=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
        System.out.println(links.size());
		for(WebElement ele:links) {
			System.out.println(ele.getText());
		}*/
		
		
		 //3
	     List<WebElement> logo= driver.findElements(By.xpath("//img[contains(tittle,'Electronics']"));
		 System.out.println(logo.size());

		
		



	}

}
