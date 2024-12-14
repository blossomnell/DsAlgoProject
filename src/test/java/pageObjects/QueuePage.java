package pageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.configReader;
import testRunner.CucumberTest;
import webdriver.DriverFactory;

public class QueuePage {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	public QueuePage() {
//		this.driver = DriverFactory.getDriver();
//		PageFactory.initElements(driver, this);
//		configReader reader = new configReader();
//		prop = reader.init_prop();
		
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}
	@FindBy(xpath = "//a[@href='queue' and text()='Get Started']")
	 WebElement getStartedButton;
	
	@FindBy(xpath = "/html/body/div[2]/h4")
      WebElement QueuePageTitle;

	@FindBy(xpath = "//a[@href='implementation-lists']")
	 WebElement ImplementationOfQueueInPythonLink;

	 @FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation of Queue in Python']")
	 WebElement ImplementationOfQueueInPythonPageTitle;
	
    @FindBy(xpath = "//a[contains(text(),'Implementation using collections.deque')]")	
	 WebElement ImplementationUsingCollectionsDequeLink;
	
	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation using collections.deque']")
	 WebElement ImplementationUsingCollectionsDequePageTitle;
	 
	@FindBy(xpath = "//a[@href='Implementation-array' and @class='list-group-item' and text()='Implementation using array']")
	 WebElement ImplementationUsingArrayLink ;
	 
	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation using array']")
	 WebElement ImplementationUsingArrayPageTitle ;
	 
	@FindBy(xpath = "//a[@href='QueueOp' and @class='list-group-item' and text()='Queue Operations']")
	 WebElement QueueOperationsLink;
	 
	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Queue Operations']")
	 WebElement QueueOperationsTitle;
	
//	 @FindBy(xpath="//a[@href='/queue/practice' and text()='Practice Questions']")
//	 WebElement practiceQuestionLink;
//	 
//	 @FindBy(xpath ="//a[@class='navbar-brand' and text()='NumpyNinja']")
//	 WebElement practicePage;
	
//	@FindBy(xpath = "")
//	private WebElement ;
	


	public void clickGetStarted() {
		getStartedButton.click();		
	}

	public boolean isQueuePageDisplayed() {
		
		return QueuePageTitle.isDisplayed();
	}

	public void navigateToQueuepage() {
		driver.get(prop.getProperty("testurl") + "/queue");
		
	}

	public void clickImplementationOfQueueInPythonLink() {
		ImplementationOfQueueInPythonLink.click();
	}

	public boolean isImplementationOfQueueInPythonPageDisplayed() {
		return ImplementationOfQueueInPythonPageTitle.isDisplayed();
	}

	public void navigateToImplementationOfQueueInPython() {
		driver.get(prop.getProperty("testurl") + "/queue/implementation-lists");		
	}

	public void navigateToTryEditorPage() {
		driver.get(prop.getProperty("testurl") + "/tryEditor");		
	}

	public void navigateToImplementationUsingCollectionsDequePage() {
		driver.get(prop.getProperty("testurl") + "/queue/implementation-collections");		
	}

	public boolean isImplementationUsingCollectionDequePageDispayed() {
	
		return  ImplementationUsingCollectionsDequePageTitle.isDisplayed() ;
	}

	public void clickImplementationUsingCollectionsDequeLink() {
		 ImplementationUsingCollectionsDequeLink.click();		
	}

	public void clickImplementationUsingarrayLink() {
		ImplementationUsingArrayLink.click();
		
	}

	public boolean isImplementationUsingArrayPageDispayed() {
		
		return ImplementationUsingArrayPageTitle.isDisplayed();
	}

	public void navigateToImplementationUsingArrayPage() {
		driver.get(prop.getProperty("testurl") + "/queue/Implementation-array");		
	}

	public void clickQueueOperationsLink() {
		QueueOperationsLink.click();
		
	}

	public boolean isQueueOperationsPageDispayed() {
		
		return QueueOperationsTitle.isDisplayed();
	}

	public void operationsInQueuePage() {
		driver.get(prop.getProperty("testurl") + "/queue/QueueOp");
		
	}

//	public void clickPracticeQuestionsLink() {
//		practiceQuestionLink.click();	
//		
//	}
//
//	public boolean isPracticePageDisplayed() {
//		
//		return practicePage.isDisplayed();
//	}

}
