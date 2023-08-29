package SleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameInner {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
    
    driver.switchTo().frame("iframeResult");
    driver.switchTo().frame(0);
    
    System.out.println("Text prsent inside the inner frame: "+driver.findElement(By.xpath("//h1")).getText());

    driver.switchTo().parentFrame();
    String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
    System.out.println("Text parent int outer frame: "+text);
    
    
	
	
	}
}