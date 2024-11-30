package pageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.configReader;
import webdriver.DriverFactory;

public class QueuePage {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	public QueuePage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}
	@FindBy(xpath = "//a[@href='queue' and text()='Get Started']")
	 WebElement getStartedButton;
	@FindBy(xpath = "/html/body/div[2]/h4")
      WebElement QueuePageTitle;
	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	 WebElement ImplementationOfQueueInPythonLink;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p")
	 WebElement ImplementationOfQueueInPythonPageTitle;
	
//	@FindBy(xpath = "//p[text()='Implementation using collections.deque']")
	@FindBy(xpath = "//a[contains(text(),'Implementation using collections.deque')]")	
	 WebElement ImplementationUsingCollectionsDequeLink;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p")
	 WebElement ImplementationUsingCollectionsDequePageTitle;
	
	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	 WebElement ImplementationUsingArrayLink ;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p")
	 WebElement ImplementationUsingArrayPageTitle ;
	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	 WebElement QueueOperationsLink;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p")
	 WebElement QueueOperationsTitle;
	
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

}
