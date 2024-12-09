package pageObjects;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.configReader;
import webdriver.DriverFactory;

public class DataStructurePage {
	WebDriver driver;
	Properties prop;
	public DataStructurePage() {
//		this.driver = DriverFactory.getDriver();
//		PageFactory.initElements(driver, this);
//		configReader reader = new configReader();
//		prop = reader.init_prop();
		
		configReader reader = new configReader();
		prop = reader.init_prop();
		
		this.driver = DriverFactory.getDriver(prop.getProperty("browser"));
		PageFactory.initElements(driver, this);
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

//	 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	 @FindBy(xpath="/html/body/div/div")
	 WebElement tryEditorPage;
	 
	 @FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	    WebElement codeEditor;
	 
	 @FindBy(xpath="//form[@id='answer_form']/div/div/div[6]")
	    WebElement codeEditor_click;
	 
	 
	// @FindBy(xpath ="//*[@id=\"answer_form\"]/button")
    @FindBy(xpath ="//button[@type='button']")
	    WebElement runButton;

	 @FindBy(xpath= "//*[@id=\"output\"]")
	    WebElement outputConsole;
	 @FindBy(xpath="/html/body/div[2]/div/div[1]/div/a")
	 WebElement practiceQuestionsLink;
	 
	 @FindBy(xpath="/html")
	 WebElement practiceQuestionsPageTitle;
	 

	 

	
	
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
		
		codeEditor_click.click();
		
		

		//codeEditorTextarea.clear();
		codeEditor.sendKeys(code);
	}
//	public void clickRunButton() {
//		
//		runButton.click();
//
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
//
//	}
//	
	public void clickRunButton() {
	    try {
	        runButton.click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        wait.until(ExpectedConditions.alertIsPresent()); // Wait for the alert
	    } catch (Exception e) {
	        System.out.println("No alert present.");
	    }
	}

	
	public String getOutputText() {
		
	  return outputConsole.getText();
	}
	
	public String handlePopupError() {
	    try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText(); // Get the alert text
	        System.out.println("Alert text: " + alertText);
	        alert.accept(); // Accept the alert
	        return alertText;
	    } catch (NoAlertPresentException e) {
	        return "";
	    }
	}
	public void clickPracticeQuestionsLink() {
	 practiceQuestionsLink.click();
		
	}
	public boolean ispracticeQuestionPageDisplayed() {
		
		return practiceQuestionsPageTitle.isDisplayed();
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
