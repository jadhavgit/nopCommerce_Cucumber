package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
	
    public LoginPage(WebDriver drivers){
		driver=drivers;
		PageFactory.initElements(drivers, this);
	}
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(xpath= "//a[text()='Logout']")
	WebElement linkLogout ;
	
	public void SetUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void SetPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	public void ClinkOnLogin() {
		btnLogin.click();
	}
	public void ClinkOnLogout() {
		linkLogout.click();
	}
	
	
}
