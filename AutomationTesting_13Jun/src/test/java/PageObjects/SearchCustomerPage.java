package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {

	public WebDriver fdriver;
	public SearchCustomerPage(WebDriver driver) {
		fdriver=driver;
		PageFactory.initElements(fdriver, this);
		
	}
	
	@FindBy(how=How.XPATH , using="//div[@class='search-text']")
	@CacheLookup
	WebElement Searchbtnhower;
	
	@FindBy(how=How.ID , using="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.ID , using="SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(how=How.ID , using="SearchLastName")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(how=How.ID , using="search-customers")
	@CacheLookup
	WebElement btnSearch;
	
    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
    WebElement table;
	
	@FindBy(how=How.XPATH , using="//table[@id='customers-grid']//tbody/tr")
	@CacheLookup
	List<WebElement> tableRows;
	
	@FindBy(how=How.XPATH , using="//table[@id='customers-grid']//tbody/tr/td")
	@CacheLookup
	List<WebElement> tableColumns;
	


    public void clickSearchbtnhower() {
    	Searchbtnhower.click();
    }
    
    public void setEmail(String email) {
    	txtEmail.clear();
    	txtEmail.sendKeys(email);
    }

    public void setFirstName(String fname) {
        txtFirstName.clear();
        txtFirstName.sendKeys(fname);
    }

    public void setLastName(String lname) {

        txtLastName.clear();
        txtLastName.sendKeys(lname);
    }

    public void clickSearch() {
        btnSearch.click();

    }
    
    public int getNoOfRows() {
    	return (tableRows.size());
    }
    
    public int getNoOfColumns() {
    	return (tableColumns.size());
    }
    
    
    public boolean searchCustomerByEmail(String email) {
    	boolean flag = false;
    	
    	for(int i=1;i<=getNoOfRows();i++) {
    		String emailid = fdriver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[2]")).getText();
    		System.out.println(emailid);
    		if(emailid.equalsIgnoreCase(email)) {
    			flag=true;
    			break;
    		}
    	}
    	
    	return flag;
    
    	
    }
    
    public boolean searchCustomerByName(String name) {
    	boolean flag = false;
    	
    	for(int i=1;i<=getNoOfRows();i++) {
    		String Name = fdriver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[3]")).getText();
    		System.out.println(Name);
    		if(Name.equalsIgnoreCase(name)) {
    			flag=true;
    			break;
    		}
    	}
    	
    	return flag;
    	
    	
    }

}

