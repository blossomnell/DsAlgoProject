package pageObjects;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.configReader;
import webdriver.DriverFactory;

public class StackPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	public StackPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}
	  
	@FindBy(xpath = "//a[@href='data-structures-introduction' and text()='Get Started']")
		WebElement getStartedButton;
	@FindBy(xpath = "//html/body/div[2]/h4")
	WebElement stackTitle;
	 @FindBy(xpath = "//a[@href='operations-in-stack']")
	    WebElement operationsInStackLink;

	 @FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Operations in Stack']")
	     WebElement operationsInStackPageTitle;
//	 @FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	 @FindBy(xpath="//a[contains(@href, '/tryEditor')]")
	     WebElement tryHereButton;
	 @FindBy(xpath = "/html/body/div/div")
     WebElement tryEditorPage;
	 @FindBy(xpath = "/html/body/div[2]/ul[2]/a")
     WebElement ImplementationLink;
	 @FindBy(xpath="/html/body/div[2]/div/div[2]/strong/p")
	 WebElement implementationPage;
	 @FindBy(xpath = "/html/body/div[2]/ul[3]/a")
     WebElement ApplicationLink;
	 @FindBy(xpath="/html/body/div[2]/div/div[2]/strong/p")
	 WebElement ApplicationPage; 
	 @FindBy(xpath ="/html/body/div[2]/div/div[1]/div/a")
	 WebElement practiceQuestionLink;
	 @FindBy(xpath ="/html/body")
	 WebElement practicePage;
	 
	 
	 
	
	 

	public void clickGetStarted() {

		getStartedButton.click();
		
	}
	
	
    public boolean isStackPageDisplayed() {
		
		return stackTitle.isDisplayed();
	}


	public void navigateToStackpage() {
		driver.get(prop.getProperty("testurl") + "/stack");
		
	}


	public void clickOperationsInStackLink() {
		
		 operationsInStackLink.click();
	}


	public boolean isOperationsInStackPageDisplayed() {
		
		 return operationsInStackPageTitle.isDisplayed();	
		 }


	public void navigateOperationsInStackPage() {
		driver.get(prop.getProperty("testurl") + "/stack/operations-in-stack");
		
	}


	public void scrollDownAndClickTryHere() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", tryHereButton);
//	        wait.until(ExpectedConditions.elementToBeClickable(tryHereButton));
	         tryHereButton.click();
		
	}


	public boolean isTryEditorPageDisplayed() {
		
		return tryEditorPage.isDisplayed();
	}


	public void navigateToTryEditorPage() {
		driver.get(prop.getProperty("testurl") + "/tryEditor");
		
		
	}


	public void clickImplementationLink() {
		ImplementationLink.click();
		
	}


	public boolean isImplementationPageDisplayed() {
		return implementationPage.isDisplayed();
	}


	public void navigateToImplementationPage() {
		driver.get(prop.getProperty("testurl") + "/stack/implementation");
		
		
	}
    public void clickApplicationLink() {
    	ApplicationLink.click();
		
		
	}
	public boolean isApplicationPageDisplayed() {
		
		return ApplicationPage.isDisplayed();
	}


	public void navigateToApplicationPage() {
		driver.get(prop.getProperty("testurl") + "/stack/stack-applications");
		
		
	}


	public void clickPracticeQuestionsLink() {
		practiceQuestionLink.click();		
	}


	public boolean isPracticePageDisplayed() {
		
		return practicePage.isDisplayed();
	}
	


	
}
