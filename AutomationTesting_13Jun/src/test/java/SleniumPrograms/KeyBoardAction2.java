package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

		WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));

		input1.sendKeys("Welcome to selenium");

		Actions act=new Actions(driver);

		//CTRL +A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//CTRL +c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//Tab-Shift to input2 box
		act.sendKeys(Keys.TAB);
		act.perform();

		//CTRL +v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Compare texts
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text copied");
			
		}else {
			System.out.println("Text not copied");
		}
		
	}

}
