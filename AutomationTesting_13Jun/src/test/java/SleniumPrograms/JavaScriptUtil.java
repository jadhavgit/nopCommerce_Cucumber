package SleniumPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	//Drawing border & take Screenshot
	public static void drawBorderByJS(WebElement element ,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}

	public static void clickElementByJS(WebElement element ,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}

	public static void generatingAlertByJS(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('" +message+ "')");
	}
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}	
	public static void ScrollPageDownByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}	
	public static void ScrollPageUpByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}	
	public static void zoompageByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='150%'");
	}	
	public static void flashByJS(WebElement element ,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor =element.getCssValue("backgroundColor");
		for(int i=0; i<50; i++) {
			changeColorByJS("#000000",element,driver);//1
			changeColorByJS("bgcolor",element,driver);//2

		}
	}	
	
	public static void changeColorByJS(String color,WebElement element ,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = ' " +color +"' ",element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
	}	





}
