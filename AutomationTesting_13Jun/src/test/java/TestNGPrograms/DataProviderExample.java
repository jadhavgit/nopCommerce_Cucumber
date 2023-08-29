package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	
	@Test(dataProvider="SearchDataSet")
	public void TestCasesSearch(String country, String mounment) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country+ " "+mounment);
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).submit();
		
	}
	
	@DataProvider(name="SearchDataSet")
	public Object[][] searchData(){
		Object[][] searchkeyword=new Object[3][2];
		searchkeyword[0][0]="India";
		searchkeyword[0][1]="Qutub Minar";
		
		searchkeyword[1][0]="Agra";
		searchkeyword[1][1]="Taj Mahal";
		
		searchkeyword[2][0]="Hyderabad";
		searchkeyword[2][1]="Charminar";
        
		return  searchkeyword;
        
		

		
	}
	

}
