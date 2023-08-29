package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageObjects.AddcustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step extends BaseClass {
	@Before
	public void setup() throws IOException {
		logger=Logger.getLogger("nopCommerce");//Added logger)
		PropertyConfigurator.configure("log4j.properties");//Added logger

		//Reading Properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);

		//WebDriverManager.edgedriver().setup();
		String br=configProp.getProperty("browser");
		if(br.equals("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("fifrefox")) {
			//System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		else if(br.equals("edge")) {
			//System.setProperty("webdriver.edge.driver", configProp.getProperty("edgepath"));
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.manage().window().maximize();	
		}


		logger.info("*************Launching Browser**************");
	}


	@Given("User Launch chrome Browser")
	public void user_launch_chrome_browser() {

		lp=new LoginPage(driver);

	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		logger.info("*************Opening URL**************");

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		logger.info("*************Login Details**************");

		lp.SetUserName(email);
		lp.SetPassword(password);
	}
	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
		logger.info("*************Click on Login**************");

		lp.ClinkOnLogin();
		Thread.sleep(5000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("*************Login Passed**************");

			Assert.assertTrue(false);
		}
		else {
			logger.info("*************Login Failed**************");

			Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(5000);
	}
	@When("User Click on Log Out link")
	public void user_click_on_log_out_link() {
		logger.info("*************Click on Logout**************");

		lp.ClinkOnLogout();
	}

	@Then("close browser")
	public void close_browser() {
		logger.info("*************Closing Browser**************");

		driver.quit();
	}


	//Customer feature step definitions...............
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		logger.info("*************Customer can view Dashboard**************");

		addCust = new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@Then("Click on Customer Menu")
	public void click_on_customer_menu() throws InterruptedException {
		logger.info("*************Clicking on Customer menu**************");

		Thread.sleep(5000);
		addCust.clickonCustomerMenu();

	}
	@Then("Click on Customer Menu Item")
	public void click_on_customer_menu_item() throws InterruptedException {
		logger.info("*************Clicking on Customer menuItem**************");

		Thread.sleep(2000);
		addCust.clickonCustomerMenuitem();
	}
	@Then("Click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		logger.info("*************Adding new Customer**************");

		Thread.sleep(2000);
		addCust.clickonAddnew();
		Thread.sleep(2000);
	}
	@Then("User can view Add new customer Page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());

	}
	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		logger.info("*************Providing Customer Details**************");

		String email = randomString() + "@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");
		// Registered - default
		// The customer cannot be in both 'Guests' and 'Registered' customer roles
		// Add the customer to 'Guests' or 'Registered' customer role

		//addCust.setCustomerRoles("Guests");
		Thread.sleep(3000);
		addCust.setManagerofVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Rajat");
		addCust.setLastName("Joshi");
		addCust.setDob("7/05/1998"); // Format: D/MM/YYYY
		addCust.setComapnyName("teamart");
		addCust.setAdminContent("This is for testing.........");

	}
	@When("Click on Save button")
	public void click_on_save_button() {
		logger.info("*************Saving Customer Data**************");

		addCust.ClickonSave();
	}
	@Then("User can view confirmation Message {string}")
	public void user_can_view_confirmation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully."));

	}


	//Steps for searchig Customer by emailid
	@Then("Enter customer email")
	public void enter_customer_email() {
		logger.info("*************Searching Customer By Email ID**************");

		searchCust = new SearchCustomerPage(driver);
		searchCust.setEmail("admin@yourStore.com");
	}

	@When("click search button")
	public void click_search_button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(5000);
	}

	@Then("User should found Email in the search table")
	public void user_should_found_email_in_the_search_table() {

		boolean status = searchCust.searchCustomerByEmail("admin@yourStore.com");
		Assert.assertEquals(true, status); 
	}



	// Steps for searching Customer by using FirstName and LastName

	@Then("Enter customer FirstName")
	public void enter_customer_first_name() {
		logger.info("*************Searching Customer By Name**************");

		searchCust = new SearchCustomerPage(driver);
		searchCust.setFirstName("John");

	}
	@Then("Enter customer LastName")
	public void enter_customer_last_name() {
		searchCust.setLastName("Smith");

	}
	@Then("User should found Name in the search table")
	public void user_should_found_name_in_the_search_table() {
		boolean status = searchCust.searchCustomerByName("John Smith");
		Assert.assertEquals(true, status); 

	}

}
