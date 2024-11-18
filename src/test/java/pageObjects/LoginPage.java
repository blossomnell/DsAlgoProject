package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.DriverFactory;

public class LoginPage {

	WebDriver driver;

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	public LoginPage() {
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
	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert']")
	private WebElement alertMessage;

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
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	public void signin() {
		signin_btn.click();
	}

	public void navigatetologinpage() {
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	public Boolean isLoginPageDisplayed() {
		return true;
	}

	public Boolean isUsernameFieldDisplayed() {
		return txt_username != null;
	}

	public Boolean isPasswordFieldDisplayed() {
		return txt_password != null;
	}

	public Boolean isLoginButtonDisplayed() {
		return login_btn != null;
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
		String message = "";

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

}
