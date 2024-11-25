package pageObjects;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.configReader;
import webdriver.DriverFactory;

public class DataStructurePage {
	WebDriver driver;
	Properties prop;
	public DataStructurePage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}
	
	 @FindBy(xpath = "//a[@href='data-structures-introduction' and text()='Get Started']")
	WebElement getStartedButton;
	@FindBy(xpath = "//h4[text()='Data Structures-Introduction']")
	WebElement pageTitle;
	 @FindBy(xpath = "//a[@href='time-complexity' and text()='Time Complexity']")
	     WebElement timeComplexityLink;
	 @FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Time Complexity']")
	     WebElement timeComplexityHeading;
	 @FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	 WebElement tryHereButton;

	 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	 WebElement tryEditorPage;
	 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	    WebElement codeEditor;

	 @FindBy(xpath ="//*[@id=\"answer_form\"]/button")
	    WebElement runButton;

	 @FindBy(xpath= "//*[@id=\"output\"]")
	    WebElement outputConsole;

	 

	
	
	public void clickGetStarted() {
		 getStartedButton.click();
		
	}
	public boolean isIntroductionPageDisplayed() {
		
		return pageTitle.isDisplayed() && pageTitle.getText().contains("Data Structures");
	}
	public void navigatetoDatastructurePage() {
		driver.get(prop.getProperty("testurl") + "/data-structures-introduction");
		
	}
	public void clickTimeComplexityLink() {
        timeComplexityLink.click();
    }
	public boolean isTimeComplexityPageDisplayed() {
		
	 return timeComplexityHeading.isDisplayed();
	}
	public void navigatetoTimeComplexityPage() {
		driver.get(prop.getProperty("testurl") + "/data-structures-introduction/time-complexity");
		
		
	}
	public void clickTryhereButton() {
		tryHereButton.click();
		
		
	}
	public boolean isTryEditorPageDisplayed() {
		
		return tryEditorPage.isDisplayed();
	}
	public void navigatetoTryEditorPage() {
		driver.get(prop.getProperty("testurl") + "/tryEditor");
		
	}
	public void enterCode(String code) {
		 codeEditor.clear();
	        codeEditor.sendKeys(code);
		
	}
	public void clickRunButton() {
		runButton.click();
		
	}
	public String getOutputText() {
		
	  return outputConsole.getText();
	}
	public String handlePopupError() {
		 Alert alert = driver.switchTo().alert(); // Switch to popup alert
	        String alertText = alert.getText();
	        alert.accept(); // Click the OK button
	        return alertText;
	}
	
	
	
	
//	@FindBy(id = "id_username")
//	WebElement txt_username;
//	@FindBy(id = "id_password")
//	WebElement txt_password;
//	@FindBy(xpath = "//input[@type='submit'and @value='Login']")
//	WebElement login_btn;
//
//	public void navigatetologinpage() {
//		driver.get("https://dsportalapp.herokuapp.com/login");
//		
//	}
//
//	public void enterUsername(String username) {
//		txt_username.sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//		txt_password.sendKeys(password);
//	}
//
//	public void clickloginBtn() {
//		login_btn.click();
//		
//	}
//	
	
}
