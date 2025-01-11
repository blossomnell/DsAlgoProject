package pageObjects;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelReader;
import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.CucumberTest;
import webdriver.DriverFactory;

import java.io.IOException;
import java.util.Objects;

public class TreePage {
	
	WebDriver driver;
	Properties prop;
	ExcelReader excelReader;
	
	public TreePage() {
		
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
		
		  String filePath = System.getProperty("user.dir") + "/" + prop.getProperty("excelFilePath");
	        try {
	            excelReader = new ExcelReader(filePath);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
	        }
		
		
	}

	
// Home page
	@FindBy(xpath = "//button[text()='Get Started']") WebElement getStarted;
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle' and text() = 'Data Structures']")
	WebElement dropdwnbtn;
	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password")
	WebElement txt_password;
    @FindBy(xpath = "//a[@href='tree' and text()='Get Started']")
    WebElement getstartedbtn;
	@FindBy(xpath = "//a[@class='dropdown-item' and text() = 'Tree']")
	WebElement treegetstarted;
	@FindBy(xpath="//*[@href='overview-of-trees']")
	WebElement overviewOfTrees;
	@FindBy(xpath="//a[@href ='/tree/overview-of-trees/']")
	WebElement overviewOfTreesLink;
	//a[@href='overview-of-trees' and text()='Overview of Trees']"
	// (or) a[normalize-space()='Tree'] 
	
	// Tree Page
	@FindBy(xpath="//h4[@class='bg-secondary text-white' and text()='Tree']") WebElement treetitle;
	@FindBy(xpath="//div[@class='CodeMirror-code']") WebElement treetryherebtn;
	@FindBy(linkText = "Terminologies")
	WebElement terminologiesLink;
	@FindBy(xpath="//a[@href='binary-search-trees']") WebElement binarysearchtreeslink;
	
	@FindBy(xpath="//a[@href='/tree/terminologies/']") WebElement terminologytitle;
	@FindBy(xpath = "//a[@href='/tree/overview-of-trees/' and text()='Overview of Trees']")
	WebElement overviewOfTreesTitle;
	@FindBy(xpath = "//*[@href='types-of-trees']")
	WebElement typesoftreesLink;
//	@FindBy(xpath="//div[@class='CodeMirror-gutter-wrapper']") WebElement terminologytitle;
	@FindBy(xpath = "//*[@href='tree-traversals']")
	WebElement treetraversalsLink;
	@FindBy(xpath = "//*[@href='traversals-illustration']")
	WebElement trav_illustrationsLink;
	@FindBy(xpath = "//*[@href='binary-trees']")
	WebElement binarytreesLink;
	@FindBy(xpath = "//*[@href='types-of-binary-trees']")
	WebElement typesofBinaryTreesLink;
	@FindBy(xpath = "//a[@href='implementation-in-python']")
	WebElement implementationInPythonLink;
	@FindBy(xpath = "//a[@href='binary-tree-traversals']")
	WebElement binaryTreeTraversalsLink;
	@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")
	WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")
	WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='binary-search-trees']")
	WebElement binarySearchTreesLink;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")
	WebElement implementationOfBSTLink;
	@FindBy(xpath = "//a[@href='/tree/practice']")
	WebElement practiceQuestionLink;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryhere_btn;	
	@FindBy(xpath = "//button[text()='Run']")
    WebElement run_btn;		
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	 WebElement text_code;
	@FindBy(xpath = "//pre[@id='output']")
	WebElement output_text;
	@FindBy(xpath = "//a[@href='/logout' and text()='Sign out']")
	WebElement signoutBtn;
	 @FindBy(xpath="//div[@class='bs-example']")
	 WebElement practiceQuestionsPageTitle;	
	
public void navigatetohomepage() {
	
	//driver.get(configReader.gettestUrl());
	//System.out.println("testurl" + configReader.gettestUrl());
	//driver.navigate().to("https://dsportalapp.herokuapp.com");
	driver.get("https://dsportalapp.herokuapp.com");
	getStarted.click();
}

public void getstarted() {
	 getstartedbtn.click();
}		

public void navigatetoOVoftreepage()  {
	overviewOfTreesLink.click();
}

public void navigatetotreepage() throws InterruptedException  {
	 getstartedbtn.click();
	Thread.sleep(5000);
}

public void clickdropdownmenu() {
	dropdwnbtn.click();	
}

public void clickOnoverviewOfTreesPage()    {
	overviewOfTrees.click();
}

public void tryhere() {
	tryhere_btn.click();
	
}
public void clickOnTerminaLink() {
	terminologiesLink.click();	
}

public void clickOnTypesOfTreesPage() {
	typesoftreesLink.click();
}
public void clickOnTreeTraversalsLink() {
	treetraversalsLink.click();
	
}
public void clickonbinarysearchtreeslink() {
	binarysearchtreeslink.click();
}

public void clickOnTrav_illus_Link() {
	trav_illustrationsLink.click();
	
}

public void clickOnBinaryTreesLink() {
	binarytreesLink.click();
	
}
public void clickOnTypesOfBTLink() {
	typesofBinaryTreesLink.click();	
}

public void click_implementationinPython() {
	implementationInPythonLink.click();
	
}

public void click_binaryTreeTraversals() {
	binaryTreeTraversalsLink.click();
	
}

public void click_implementationOfBinaryTrees() {
	implementationOfBinaryTreesLink.click();
	
}

public void click_applicationsOfBinaryTrees() {
	applicationsOfBinaryTreesLink.click();
	
}

public void click_implementationOfBST() {
	implementationOfBSTLink.click();
}
public void click_practiceQuestion() {
	practiceQuestionLink.click();
}

public boolean istreePageDisplayed() {

return treetitle.isDisplayed();
}


public boolean isOverviewoftreePageDisplayed() {

return overviewOfTreesTitle.isDisplayed();

}
public boolean tryeditorpageisDisplayed() {
	
	return treetryherebtn.isDisplayed();
}

public boolean isterminologiesPageDisplayed() {
	return terminologytitle.isDisplayed();
	
}
public String isresultdisplayed() throws InterruptedException {
	Thread.sleep(2000);
	return output_text.getText();
}
public void enterCode(String code) {
	text_code.sendKeys(code);
	
}


public void clicksrunBtn() {
	run_btn.click();
	
}

//public void enterpythoncode (String sheetName, Integer row) {
//	  int column = 0;    
//		String code = excelReader.getCellData(sheetName , row, column);
//	    if (code == null || code.isEmpty()) {
//	        throw new IllegalArgumentException("The code fetched from Excel is empty or null.");
//	    }
//
//	    System.out.println("Code entered in editor: " + code);	    
//	    
//}

public String getExcelData(String sheetName, int row, int column) {
    String data = excelReader.getCellData(sheetName, row, column);
    if (data == null || data.isEmpty()) {
        throw new IllegalArgumentException("Data fetched from Excel is empty or null.");
    }
    return data;
}

//public String getPopupAlertText() {
//	 Alert alert = driver.switchTo().alert();
//     String alertText = alert.getText();
//     alert.accept();
//     return alertText;
//}


public String popupError() {
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
public String getOutputText() {
	
	  return output_text.getText();
	}
	
	
public String getOutputTextFromTryEditorPage() {
	
	return output_text.getText();
}

public boolean isPQPageDisplayed() {
	
	return practiceQuestionsPageTitle.isDisplayed();
}

//public String getExcelData(String sheetName, int row, int column) {
//    return excelReader.getCellData(sheetName, row, column);
//}
//public String treepage() {
//			
// String treeurl = driver.getCurrentUrl();
//// System.out.println("Page title is: " + driver.getTitle());
////	   driver.get(prop.getProperty("testurl") + "/tree/");
//	return treeurl;
//}
//public String getTreePageTitle() {
//	String title = driver.getCurrentUrl();
//	return title;
//	
//}

}
	

	
	
	

	


