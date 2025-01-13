package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ExcelReader;
import Utilities.configReader;
import testRunner.CucumberTest;
//import webdriver.DriverFactory;

public class DataStructurePage {
	WebDriver driver;
	Properties prop;
	ExcelReader excelReader;

	public DataStructurePage() {
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();

		// Initialize the ExcelReader with the file path from the properties
		String filePath = System.getProperty("user.dir") + "/" + prop.getProperty("excelFilePath");
		try {
			excelReader = new ExcelReader(filePath);
		} catch (IOException e) {
			throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
		}
	}

	// Method to fetch data from Excel
	public String getExcelData(String sheetName, int row, int column) {
		String data = excelReader.getCellData(sheetName, row, column);
		if (data == null || data.isEmpty()) {
			throw new IllegalArgumentException("Data fetched from Excel is empty or null.");
		}
		return data;
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
	@FindBy(xpath = "/html/body/div/div")
	WebElement tryEditorPage;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement codeEditor;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
//	 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	WebElement codeEditor_click;

	// @FindBy(xpath ="//*[@id=\"answer_form\"]/button")
	@FindBy(xpath = "//button[@type='button']")
	WebElement runButton;

	@FindBy(xpath = "//*[@id=\"output\"]")
	WebElement outputConsole;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/a")
	WebElement practiceQuestionsLink;

	@FindBy(xpath = "/html")
	WebElement practiceQuestionsPageTitle;

	public void clickGetStarted() {
		getStartedButton.click();

	}

	public boolean isIntroductionPageDisplayed() {

		return pageTitle.isDisplayed() && pageTitle.getText().contains("Data Structures");
	}

	public void clickTimeComplexityLink() {
		timeComplexityLink.click();
	}

	public boolean isTimeComplexityPageDisplayed() {

		return timeComplexityHeading.isDisplayed();
	}

	public void clickTryhereButton() {
		tryHereButton.click();

	}

	public boolean isTryEditorPageDisplayed() {

		return tryEditorPage.isDisplayed();
	}

	public void enterCode(String code) {

		codeEditor_click.click();

		// codeEditorTextarea.clear();
		codeEditor.sendKeys(code);
	}

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


}

