package SleniumPrograms;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		//chrome
		
		/*HashMap preference =new HashMap();
		preference.put("download.default_directory",location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preference);*/
		
		//Edge
		
		HashMap preference =new HashMap();
		preference.put("download.default_directory",location);
		
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preference);
		

		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	}

}
