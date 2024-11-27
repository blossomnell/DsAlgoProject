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
	@FindBy(xpath = "a[@href-'/tryEditor']")
	WebElement tryhere_btn;
	@FindBy(xpath = "//div[@class = 'CodeMirror cm-s-default']")
	WebElement txt_code;
	@FindBy(xpath = "//button[text()='Run']")
    WebElement run_btn;

	public void navigatetohomepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");		
	}

	public void signin() {
		signin_btn.click();		
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

	public void clickloginBtn() {
		login_btn.click();		
	}

	public void clickgetstartedBtn() {
		getstarted_btn.click();	
	}
	
	public void navigatetolinkedlistpage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");		
	}

	public boolean isLinkedListPageDisplayed() {
		return true;
	}

	public void Introduction() {
		introduction_btn.click();	
	}

	public boolean isIntroductionPageDisplayed() {
		return true;
	}

	public void navigatetointroductionpage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");		
	}

	public void Tryhere() {
		tryhere_btn.click();	
	}

	public boolean isTryEditorPageDisplayed() {
		return true;
	}

	public void navigatetotryeditorpage() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");		
	}
 	
	public boolean isRunButtonDisplayed() {
		return run_btn != null;
	}
	
	public void enterCode(String code) {
		txt_code.sendKeys(code);		
	}

	public void clicksrunBtn() {
		run_btn.click();		
	}
	
	public String getAlertMessage() {
	    
		return null;
	}

	


	}
	
	


	
	
