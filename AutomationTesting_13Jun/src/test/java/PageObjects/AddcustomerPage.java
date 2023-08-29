package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver ldriver;

	public AddcustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	//WebElement

	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	WebElement txtlnkCustomer_menu;

	@FindBy(xpath="//p[text()=' Customers']")
	WebElement txtlnkCustomer_menuitem;

	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement txtAddbtn;

	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='Password']")
	WebElement txtpassword;

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement textFirstName;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement textLastName;

	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	By txtcustomerRoles;

	@FindBy(xpath="//li[text()='Administrators']")
	By listitemAdmistratators;

	@FindBy(xpath="//li[text()='Forum Moderators']")
	WebElement listitemForumModerators;

	@FindBy(xpath="//li[text()='Guests']")
	By listitemGuests;

	@FindBy(xpath="//li[text()='Vendors']")
	By listitemvindors;

	@FindBy(xpath="//li[text()='Registered']")
	By listitemRegistered;

	@FindBy(xpath="//*[@id='VendorId']")
	WebElement drpmgrofvendor;

	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement rdMaleGender;

	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement rdFeMaleGender;

	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement txtDOB;

	@FindBy(xpath="//input[@id='Company']")
	WebElement txtCompanyName;

	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement txtAdminContact;

	@FindBy(xpath="//button[@name='save']")
	WebElement btnsave;
	
	//Page action methods
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickonCustomerMenu() {
		txtlnkCustomer_menu.click();
	}

	public void clickonCustomerMenuitem() {
		txtlnkCustomer_menuitem.click();
	}
	
	public void clickonAddnew() {
		txtAddbtn.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void setFirstName(String fname) {
		textFirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		textLastName.sendKeys(lname);
	}
	
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			rdMaleGender.click();
		}else if(gender.equals("Female")) {
			rdFeMaleGender.click();
		}else {
			rdFeMaleGender.click();
		}
		
	}
	public void setDob(String dob) {
		txtDOB.sendKeys(dob);
	}
	public void setComapnyName(String comname) {
		txtCompanyName.sendKeys(comname);
	}
	
	public void setAdminContent(String content) {
		txtAdminContact.sendKeys(content);
	}
	
	
public void setCustomerRoles(String role) throws InterruptedException 
	
	{	
		ldriver.findElement(txtcustomerRoles).click();
		
		WebElement listitem;
		
		Thread.sleep(5000);
		
		if(role.equals("Administrators")) {
			listitem = ldriver.findElement(listitemAdmistratators);
		}
		else if(role.equals("Guests")) {
			listitem = ldriver.findElement(listitemGuests);
		}
		else if(role.equals("Registered")) {
			listitem = ldriver.findElement(listitemRegistered);
		}
		else if(role.equals("Vendors")) {
			listitem = ldriver.findElement(listitemvindors);
		}
		else {
			listitem = ldriver.findElement(listitemGuests);
		}
		
//		listitem.click(); // if this is not working we can use Javascriptexecutor to click as following
//		
//		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", listitem);
		
		
	 }
	public void setManagerofVendor(String value) {
		Select sc=new Select(drpmgrofvendor);
		sc.selectByVisibleText(value);
	}
	
	
	public void ClickonSave() {
		btnsave.click();
	}
	
	
	
	
	


}
