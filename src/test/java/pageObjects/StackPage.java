package pageObjects;

import java.util.Properties;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.configReader;
import testRunner.CucumberTest;
import webdriver.DriverFactory;

public class StackPage {

	WebDriver driver;
	WebDriverWait wait;
	Properties prop;

	public StackPage() {

		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}

	@FindBy(xpath = "//a[@href='stack' and text()='Get Started']")
	WebElement getStartedButton;

	@FindBy(xpath = "//html/body/div[2]/h4")
	// @FindBy(xpath = "//h4[@class='bg-secondary text-white' and text()='Stack']")
	WebElement stackTitle;

	@FindBy(xpath = "//a[@href='operations-in-stack']")
	WebElement operationsInStackLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Operations in Stack']")
	WebElement operationsInStackPageTitle;

//	 @FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	@FindBy(xpath = "//a[contains(@href, '/tryEditor')]")
	WebElement tryHereButton;

	@FindBy(xpath = "/html/body/div/div")
	WebElement tryEditorPage;

	@FindBy(xpath = "//a[@href='implementation' and text()='Implementation']")
	WebElement ImplementationLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Implementation']")
	WebElement implementationPage;

	@FindBy(xpath = "//a[@href='stack-applications' and text()='Applications']")
	WebElement ApplicationLink;

	@FindBy(xpath = "//p[@class='bg-secondary text-white' and text()='Applications']")
	WebElement ApplicationPage;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/a")
	// @FindBy(xpath="//a[@href='/stack/practice' and text()='Practice Questions']")
	WebElement practiceQuestionLink;

	@FindBy(xpath = "//a[@class='navbar-brand' and text()='NumpyNinja']")
	WebElement practicePage;

	public void clickGetStarted() {

		getStartedButton.click();

	}

	public boolean isStackPageDisplayed() {

		return stackTitle.isDisplayed();
	}

	public void clickOperationsInStackLink() {

		operationsInStackLink.click();
	}

	public boolean isOperationsInStackPageDisplayed() {

		return operationsInStackPageTitle.isDisplayed();
	}

	public void scrollDownAndClickTryHere() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", tryHereButton);

		tryHereButton.click();

	}

	public boolean isTryEditorPageDisplayed() {

		return tryEditorPage.isDisplayed();
	}

	public void clickImplementationLink() {
		ImplementationLink.click();

	}

	public boolean isImplementationPageDisplayed() {
		return implementationPage.isDisplayed();
	}

	public void clickApplicationLink() {
		ApplicationLink.click();

	}

	public boolean isApplicationPageDisplayed() {

		return ApplicationPage.isDisplayed();
	}

	public void clickPracticeQuestionsLink() {
		practiceQuestionLink.click();
	}

	public boolean isPracticePageDisplayed() {

		return practicePage.isDisplayed();
	}

}
