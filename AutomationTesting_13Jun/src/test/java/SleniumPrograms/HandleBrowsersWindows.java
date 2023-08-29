package SleniumPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowsersWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//getwindowHandle();
		//String windowId=driver.getWindowHandle();
		//System.out.println(windowId);//158A886B515F323B61E135A15197F9EB
                                     //8BEEB44B7C51950505DA55048DAE9694
		
		//getWindowHandles();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//first method -iterator()
		Set<String> windowIds=driver.getWindowHandles();
		/*Iterator<String> it=windowIds.iterator();
		
		String parentWindowID=it.next();
		String childwindowID=it.next();

		System.out.println("Parent window ID"+parentWindowID);
		System.out.println("Child window ID"+childwindowID);*/
		
		//using list/Arraylist
		
		List<String> windowIdsList=new ArrayList(windowIds);
		String parentWindowID=windowIdsList.get(0);
		String childwindowID=windowIdsList.get(1);

		System.out.println("Parent window ID:"+parentWindowID);
		System.out.println("Child window ID:"+childwindowID);
		
		//How to switch window ID's switching
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title :"+driver.getTitle());
		
		driver.switchTo().window(childwindowID);
		System.out.println("child window title :"+driver.getTitle());
		
		

		
		
		
	}

}
