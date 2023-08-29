package SleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		//Syntax
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(Script, args);
		
		//flash
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		JavaScriptUtil.flashByJS(logo, driver);
		//JavaScriptUtil.changeColorByJS(null, logo, driver);
		//Drawing border & take Screenshot
		/*WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		JavaScriptUtil.drawBorderByJS(logo,driver);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\ScreenShot\\Borderlogo.png");
		FileUtils.copyFile(src, trg);
				
		
		//Getting title of the page
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);*/
		
		
		//Click action
		//WebElement link=driver.findElement(By.xpath("//a[text()='Register']"));
		//JavaScriptUtil.clickElementByJS(link, driver);
		
		
		//Generate alert
		//JavaScriptUtil.generatingAlertByJS(driver,"This is my Alert");

		
		//Refreshing the page
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Scrolling Page down
		//JavaScriptUtil.ScrollPageDownByJS(driver);
		//Scrolling Page up 
		//JavaScriptUtil.ScrollPageUpByJS(driver);
		
		//Zoome page
		//JavaScriptUtil.zoompageByJS(driver);
		
	}

}
