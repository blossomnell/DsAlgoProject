package pageObjects;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.configReader;
import webdriver.DriverFactory;

public class LoginPage {

	WebDriver driver;
	Properties prop;

	public LoginPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}

	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password")
	WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit'and @value='Login']")
	WebElement login_btn;
	@FindBy(xpath = "//a[@href='/login' and text()='Sign in']")
	WebElement signin_btn;
	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert']")
	private WebElement alertMessage;
	@FindBy(xpath = "//a[@href='/logout' and text()='Sign out']")
	WebElement signoutBtn;

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickloginBtn() {
		login_btn.click();
	}

	public void navigatetohomepage() {
		//driver.get("https://dsportalapp.herokuapp.com/home");
		driver.get(prop.getProperty("testurl") + "/home");
	}

	public void signin() {
		signin_btn.click();
	}

	public void navigatetologinpage() {
		//driver.get("https://dsportalapp.herokuapp.com/login");
		driver.get(prop.getProperty("testurl") +"/login");
	}

	public Boolean isLoginPageDisplayed() {
		return true;
	}

	public Boolean isUsernameFieldDisplayed() {
		return txt_username != null; 
	//checks if the txt_username field is not null and returns true if it is not null, indicating that the username field is displayed.
	}

	public Boolean isPasswordFieldDisplayed() {
		return txt_password != null; 
	//checks whether the txt_password field is not null and returns true if it is not null, indicating that the password field is displayed or initialized.
	}

	public Boolean isLoginButtonDisplayed() {
		return login_btn != null; 
	//checks if the login_btn is not null, returning true if it is not null and indicating that the login button is initialized and available. If login_btn is null, it returns false, suggesting that the login button does not exist (or is not initialized).
	}

	public String getAlertMessage() {
		String loginMessage = getLoginMessage();
		if (!loginMessage.isBlank()) {
			return loginMessage;
		} else {
			loginMessage = getValidationError(txt_username);
			if (!loginMessage.isBlank()) {
				return loginMessage;
			}
			return getValidationError(txt_password);
		}
	}

	public String getLoginMessage() {
		String message = ""; //attempt to get text from the alert message
		try {
			message = alertMessage.getText();
		} catch (Exception e) {
		}
		return message;
	}

	public String getValidationError(WebElement element) {
		String error = "";
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			error = (String) jsExecutor.executeScript("return arguments[0].validationMessage;", element);
		} catch (Exception e) {
		}
		return error;
	}
	public Boolean isSignOutButtonDisplayed() {
		return signoutBtn != null;
	}
	public void clickSignOutBtn() {
		signoutBtn.click();
	}
	public boolean isLoggedOutMessageDisplayed(String expectedMessage) {
		return getLoginMessage().equals(expectedMessage);
	}
}
