package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.DriverFactory;

public class LinkedListPage {
	WebDriver driver;
	
	public LinkedListPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password")
	WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit'and @value='Login']")
	WebElement login_btn;
	@FindBy(xpath = "//a[@href='/login' and text()='Sign in']")
	WebElement signin_btn;
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement getstarted_btn;
	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction_btn;
	
	public void navigatetohomepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");	
	}

	public void signin() {
		signin_btn.click();		
	}

	public void clickloginBtn() {
		login_btn.click();		
	}

	public void navigatetologinpage() {
		driver.get("https://dsportalapp.herokuapp.com/login");		
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);	
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);		
	}

	public void getstarted() {
		getstarted_btn.click();	
	}

	public void navigatetolinkedlistpage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");		
	}

	public boolean isLinkedListPageDisplayed() {
		return true;
	}

	public void navigatetointroductionpage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");	
	}

	public boolean isIntroductionPageDisplayed() {
		return true;
	}

	public void Introduction() {
		introduction_btn.click();
		
	}

}
