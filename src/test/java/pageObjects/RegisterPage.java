package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.DriverFactory;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password1")
	WebElement txt_password1;
	@FindBy(id = "id_password2")
	WebElement txt_password2;
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;
	@FindBy(xpath = "//input[@type='submit' and @value='Register']")
	WebElement register_btn;
//	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert']")
//	WebElement alertMessage;
	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert' and normalize-space(.)='New Account Created. You are logged in as ninjasquad111']")
	WebElement alertMessage;

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword1(String password1) {
		txt_password1.sendKeys(password1);
	}

	public void enterPassword2(String password2) {
		txt_password1.sendKeys(password2);
	}

	public void navigatetohomepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	public void register() {
		register.click();
	}

	public void navigatetoregisterpage() {
		driver.get("https://dsportalapp.herokuapp.com/register");
	}

	public Boolean isRegisterPageDisplayed() {
		return true;
	}

	public boolean isUsernameFieldDisplayed() {
		return txt_username != null;
	}

	public boolean isPassword1FieldDisplayed() {
		return txt_password1 != null;
	}

	public boolean isPassword2FieldDisplayed() {
		return txt_password2 != null;
	}

	public Boolean isRegisterButtonDisplayed() {
		return register_btn != null;
	}

	public void clickregisterBtn() {
		register_btn.click();
	}

	public String getAlertMessage() {
		String registerMessage = getRegisterMessage();
		if (!registerMessage.isBlank()) {
			return registerMessage;
		} else {
			registerMessage = getValidationError(txt_username);
			if (!registerMessage.isBlank()) {
				return registerMessage;
			}
			return getValidationError(txt_password1);
		}
	}

	public String getRegisterMessage() {
		String message = ""; // attempt to get text from the alert message
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
