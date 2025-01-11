package pageObjects;

import java.sql.DriverManager;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.configReader;
import testRunner.CucumberTest;
import webdriver.DriverFactory;

public class HomePage {
	
	

	WebDriver driver;
	Properties prop;
	String URL; 
	String home;
     
	public HomePage() {
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
		}
	@FindBy(xpath = "//button[text()='Get Started']") WebElement getStarted;
	@FindBy (xpath = "//a[@href='data-structures-introduction']")WebElement getstarted_DS;
	@FindBy (xpath="//a[@href='array']")WebElement getstarted_Array;
	@FindBy (xpath="//a[@href='linked-list']")WebElement getstarted_LL;
	@FindBy (xpath="//a[@href='stack']")WebElement getstarted_stack;
	@FindBy (xpath="//a[@href='queue']")WebElement getstarted_queue;
	@FindBy (xpath="//a[@href='tree']")WebElement getstarted_tree;
	@FindBy (xpath="//a[@href='graph']")WebElement getstarted_graph;
	
	//webelement for user not logged in alert msg
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alertmsg;
	
	//webelements for dropdown
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropdown_DS;
	@FindBy (xpath="//a[text()='Arrays']")WebElement dropdown_array;
	@FindBy (xpath="//a[text()='Linked List']")WebElement dropdown_linkedlist;
	@FindBy (xpath="//a[text()='Stack']")WebElement dropdown_stack;
	@FindBy (xpath="//a[text()='Queue']")WebElement dropdown_queue;
	@FindBy (xpath="//a[text()='Tree']")WebElement dropdown_tree;
	@FindBy (xpath="//a[text()='Graph']")WebElement dropdown_graph;
	
	//Webelement for register
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	@FindBy (xpath="//a[@href='/login']")WebElement login;
	
	
	
	public void dsalgopage() {

		driver.get("https://dsportalapp.herokuapp.com/");

	}

	public void getStarted() {

		getStarted.click();

	}

  public void getstarted_DS() {
	 
	  getstarted_DS.click();
		
	}
//	public void getstarted_DS() {
//		
//		getstarted_DS.click();
//	}
	public String getPageTitle() {
		
		String title = driver.getTitle();
		return title;
	}

	public void homePg() {
		driver.get("https://dsportalapp.herokuapp.com/");
		getStarted.click();
	}

	public String alertmsg() {
		
	return alertmsg.getText();
	}
//	
//public boolean ismsgDisplayed() {
//	return alertmsg.isDisplayed();
//	}
	

	//dropdown options
	public void dropdown(String dropdown_DS_option) {

		dropdown_DS.click();
		switch (dropdown_DS_option) {
		
		case "Arrays":
			dropdown_array.click();
			break;
		
		case "Linkedlist":
			dropdown_linkedlist.click();
			break;
		
		case "Stack":
			dropdown_stack.click();
			break;
		
		case "Queue":
			dropdown_queue.click();
			break;
		
		case "Tree":
			dropdown_tree.click();
			break;
		
		case "Graph":
			dropdown_graph.click();
			break;
		}

	}

	public void getStartedForModule(String option) {
//	       homePg();
		getstarted_DS.click();
		
		switch(option) {
		case "Datastructures":
			getstarted_DS.click();
			break;
		case "Arrays":
			
			getstarted_Array.click();
			break;
		case "Linkedlist":
			
			getstarted_LL.click();
			break;
		case "Stack":
			
			getstarted_stack.click();
			break;
		case "Queue":
			
			getstarted_queue.click();
			break;
		case "Tree":
			
			getstarted_tree.click();
			break;
		case "Graph":
			
			getstarted_graph.click();
			break;
			
			default:
				break;
		}
		}
	
	
	
	
	//register page
	public void click_register() {
		register.click();
	}
	
//	public String reg_url() {
//		String regurl=driver.getCurrentUrl();
//		return regurl;
//		
//	}
	//login page
	public void click_login() {
		login.click();
	}
	
//	public String login_url() {
//		String loginurl=driver.getCurrentUrl();
//		return loginurl;
//		
//	}
	public boolean isloginbuttonpresent() {
		return login.isDisplayed();
	}
	public void navigatetohomepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");
		
	}

	public boolean isRegistrationPagedisplayed() {
		return register.isDisplayed();
	}
	
	

}


