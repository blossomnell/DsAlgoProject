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

		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}

	@FindBy(xpath = "//a[@href='queue' and text()='Get Started']")
	WebElement getStartedButton;

	@FindBy(xpath = "/html/body/div[2]/h4")
	WebElement QueuePageTitle;

	@FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	WebElement tryHereButton;

	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement ImplementationOfQueueInPythonLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation of Queue in Python']")
	WebElement ImplementationOfQueueInPythonPageTitle;

	@FindBy(xpath = "//a[contains(text(),'Implementation using collections.deque')]")
	WebElement ImplementationUsingCollectionsDequeLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation using collections.deque']")
	WebElement ImplementationUsingCollectionsDequePageTitle;

	@FindBy(xpath = "//a[@href='Implementation-array' and @class='list-group-item' and text()='Implementation using array']")
	WebElement ImplementationUsingArrayLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation using array']")
	WebElement ImplementationUsingArrayPageTitle;

	@FindBy(xpath = "//a[@href='QueueOp' and @class='list-group-item' and text()='Queue Operations']")
	WebElement QueueOperationsLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Queue Operations']")
	WebElement QueueOperationsTitle;

	public void clickGetStarted() {
		getStartedButton.click();
	}

	public boolean isQueuePageDisplayed() {

		return QueuePageTitle.isDisplayed();
	}

	public void clickImplementationOfQueueInPythonLink() {
		ImplementationOfQueueInPythonLink.click();
	}

	public boolean isImplementationOfQueueInPythonPageDisplayed() {
		return ImplementationOfQueueInPythonPageTitle.isDisplayed();
	}

	public boolean isImplementationUsingCollectionDequePageDispayed() {

		return ImplementationUsingCollectionsDequePageTitle.isDisplayed();
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

	public void clickQueueOperationsLink() {
		QueueOperationsLink.click();

	}

	public boolean isQueueOperationsPageDispayed() {

		return QueueOperationsTitle.isDisplayed();
	}

	public void clickTryhereButton() {
		tryHereButton.click();

	}

}
