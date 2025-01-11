package pageObjects;

import java.util.Objects;
import java.util.Properties;
import Utilities.ExcelReader;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.configReader;
import testRunner.CucumberTest;

public class RegisterPage {
    WebDriver driver;
    Properties prop;
    ExcelReader excelReader;

    public RegisterPage() {
        this.driver = CucumberTest.getDriver();
        PageFactory.initElements(driver, this);
        configReader reader = new configReader();
        prop = reader.init_prop();

        // Initialize ExcelReader
        try {
            String filePath = System.getProperty("user.dir") + "/" + prop.getProperty("excelFilePath");
            excelReader = new ExcelReader(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load Excel file: " + e.getMessage(), e);
        }
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
	@FindBy(xpath = "//div[@class='alert alert-primary' and @role='alert']")
	private WebElement alertMessage;

	public void navigatetohomepage() {
		driver.get(prop.getProperty("testurl") + "/home");
	}

	public void register() {
		register.click();
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword1(String password1) {
		txt_password1.sendKeys(password1);
	}

	public void enterPassword2(String password2) {
		txt_password2.sendKeys(password2);
	}

	public Boolean isRegisterPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/register");
	}

	public boolean isUsernameFieldDisplayed() {
		return txt_username.isDisplayed();
	}

	public boolean isPassword1FieldDisplayed() {
		return txt_password1.isDisplayed();		
	}

	public boolean isPassword2FieldDisplayed() {
		return txt_password2.isDisplayed();
	}

	public Boolean isRegisterButtonDisplayed() {
		return register_btn.isDisplayed();
	}

	public void clickregisterBtn() {
		register_btn.click();
	}

	public String getAlertMessage() {
		String registerMessage = getRegisterMessage();
		if (!registerMessage.isBlank()) {
			return registerMessage;
		} 
			boolean userValidationErrorExists = isValidationError(txt_username);
			boolean password1validationErrorExists = isValidationError(txt_password1);
			boolean password2ValidationErrorExists = isValidationError(txt_password2);
			
		    if (userValidationErrorExists||password1validationErrorExists||password2ValidationErrorExists) {
		    	return "Please fill out this field.";
		    }
		    return "";
		}		
	
	public String getRegisterMessage() {
		String message = ""; // attempt to get text from the alert message
		try {
			message = alertMessage.getText();
		} catch (Exception e) {
		}
		return message;
	}

	public boolean isValidationError(WebElement element) {
		String error = "";
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			error = (String) jsExecutor.executeScript("return arguments[0].validationMessage;", element);
		} catch (Exception e) {
		}
		return !error.isBlank();

	}
	public String getCellData(String sheetName, int row, int col) {
        return excelReader.getCellData(sheetName, row, col);
    }
}
