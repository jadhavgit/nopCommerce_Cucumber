package SleniumPrograms;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//How to capture cookies from browser
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies: "+cookies.size());
		
		//How to print cookies from browser
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+" :  "+ cookie.getValue());
		}
		
		//How to add cookie to the browser
		Cookie cookieobje=new Cookie("Mycookie123","123456");
		driver.manage().addCookie(cookieobje);
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies after adding : "+cookies.size()); //6
		
		
		//How to delete specific cookie from the browser
		//driver.manage().deleteCookie(cookieobje);
		driver.manage().deleteCookieNamed("Mycookie123");

		cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies after adding : "+cookies.size()); //5
		
		
		//How to delete all cookie from the browser
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies after adding : "+cookies.size()); //0
		
		
		driver.quit();
		
		
	}

}
