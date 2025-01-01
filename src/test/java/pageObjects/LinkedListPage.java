package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.configReader;
import testRunner.CucumberTest;

import java.util.Objects;
import java.util.Properties;

public class LinkedListPage {
	WebDriver driver;
	Properties prop;
	
	public LinkedListPage() {
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
	}
	
	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password")
	WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit'and @value='Login']")
	WebElement login_btn;
	@FindBy(xpath = "//a[@href='/login' and text()='Sign in']")
	WebElement signin_btn;
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement getstarted_btn;
	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction_btn;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere_btn;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	 WebElement txt_code;	 
	@FindBy(xpath = "//button[text()='Run']")
    WebElement run_btn;	
	@FindBy(xpath = "//pre[@id='output']")
	WebElement output_text;
	@FindBy(xpath = "//a[@href='creating-linked-list']")
	WebElement creatinglinkedlist_btn;
	@FindBy(xpath = "//a[@href='types-of-linked-list']")
	WebElement typesoflinkedlist_btn;
	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
	WebElement implementlinkedlistinpython_btn;
	@FindBy(xpath = "//a[@href='traversal']")
	WebElement traversal_btn;
	@FindBy(xpath = "//a[@href='insertion-in-linked-list']")
	WebElement insertion_btn;
	@FindBy(xpath = "//a[@href='deletion-in-linked-list']")
	WebElement deletion_btn;
	@FindBy(xpath = "//a[@href='/linked-list/practice']")
	WebElement practicequestions_btn;
	@FindBy(xpath = "//a[@href='/logout' and text()='Sign out']")
	WebElement signoutBtn;
		
	public void navigatetohomepage() {
		driver.get(prop.getProperty("testurl") + "/home");		
	}	
	
	public void clickgetstartedBtn() {
		getstarted_btn.click();	
	}
	
	public boolean isLinkedListPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/");
	}
	
	public void Introduction() {
		introduction_btn.click();	
	}

	public boolean isIntroductionPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/introduction/");
	}

	public void Tryhere() {
		tryhere_btn.click();	
	}
 	
	public boolean isTryEditorPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/tryEditor");
	}
	
	public boolean isRunButtonDisplayed() {
		if(run_btn==null)
			return false;
		else 
			return true;
	}

	public void enterCode(String code) {
		txt_code.sendKeys(code);		
	}

	public void clicksrunBtn() {
		run_btn.click();		
	}

	public String getOutputTextFromTryEditorPage() {
		return output_text.getText();
	}

	public void CreatingLinkedList() {
		creatinglinkedlist_btn.click();
	}

	public boolean isCreatingLinkedListPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/creating-linked-list/");	
	}
	
	public void TypesofLinkedList() {
		typesoflinkedlist_btn.click();	
	}

	public boolean isTypesofLinkedListPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/types-of-linked-list/");
	}
	
	public void ImplementLinkedListinPython() {
		implementlinkedlistinpython_btn.click();	
	}
	
	public boolean isImplementLinkedListinPythonPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/implement-linked-list-in-python/");
	}

	public void Traversal() {
		traversal_btn.click();		
	}
	
	public boolean isTraversalPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/traversal/");	
	}
	
	public void Insertion() {
		insertion_btn.click();	
	}
	
	public boolean isInsertionPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/insertion-in-linked-list/");
	}

	public void Deletion() {
		deletion_btn.click();		
	}
	
	public boolean isDeletionPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/deletion-in-linked-list/");
	}

	public void PracticeQuestions() {
		practicequestions_btn.click();		
	}
	
	public boolean isPracticeQuestionsPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/linked-list/practice");
	}
	
	public String getPopupAlertText() {    
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
	}
	
		
	}
	

		