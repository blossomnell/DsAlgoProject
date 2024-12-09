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

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	public LoginPage() {

		configReader reader = new configReader();
		prop = reader.init_prop();
		
		this.driver = DriverFactory.getDriver(prop.getProperty("browser"));
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
	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert']")
	private WebElement alertMessage;
	@FindBy(xpath = "//a[//a[@href='/logout' and text()='Sign out']]")
	WebElement signout_btn;
	@FindBy(xpath = "/div[@class='alert alert-primary' and @role='alert']")
	WebElement loggedoutMessage;

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
		driver.get(prop.getProperty("testurl") + "/home");
	}

	public void signin() {
		signin_btn.click();
	}

	public void navigatetologinpage() {
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
//getLoginMessage(): This seems to retrieve a general login-related message, like a message displayed after a login attempt, for example, "Incorrect username or password." If this message is not blank, it is returned.
//getValidationError(txt_username): This checks for a validation error on the txt_username field (e.g., if the username is missing or invalid). If the error message is not blank, it returns that message.
//getValidationError(txt_password): If neither of the previous checks return a message, the method checks for a validation error on the txt_password field (e.g., if the password is invalid or missing).
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
		return signout_btn != null;
	}
	public void clicksignoutBtn() {
		signout_btn.click();
	}
	public boolean isLoggedOutMessageDisplayed() {
		return true;
	}
}
