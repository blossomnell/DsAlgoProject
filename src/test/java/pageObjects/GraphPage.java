package pageObjects;
 
import java.util.Properties;


import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelReader;
import Utilities.configReader;
import testRunner.CucumberTest;
import webdriver.DriverFactory;

import java.io.IOException;
import java.util.Objects;
public class GraphPage {

	
	   WebDriver driver;
	  Properties prop;
	  ExcelReader excelReader;
	
	public GraphPage() {
		//GraphPage.driver = DriverFactory.getDriver();
		this.driver = CucumberTest.getDriver();
		PageFactory.initElements(driver, this);
		configReader reader = new configReader();
		prop = reader.init_prop();
		
          try {
        	
			String filePath = System.getProperty("user.dir") + "/" + reader.init_prop().getProperty("excelFilePath");
        	//String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
            excelReader = new ExcelReader(filePath);
        } catch (IOException e) {
        	throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
        }
		
		
	}
	
	@FindBy(id = "id_username")
	WebElement txt_username;
	@FindBy(id = "id_password")
	WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit'and @value='Login']")
	WebElement login_btn;
	@FindBy(xpath = "//a[@href='/login' and text()='Sign in']")
    WebElement signin_btn;
    @FindBy(xpath = "//a[@href='graph']")
    WebElement getstarted_btn;
    @FindBy( linkText="Graph")
     WebElement maingraphlink;
    @FindBy(xpath = "//a[@class='btn btn-info']")                             
    WebElement tryhere_btn;
    @FindBy(xpath="//form[@id='answer_form']/div/div/div[6]")
    WebElement codeEditor_click;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement codeEditor;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement txt_code;                                                       
    @FindBy(xpath = "//button[text()='Run']")
    WebElement run_btn;
    @FindBy(xpath = "//button[text()='Run']")
    WebElement run_btn2;
    @FindBy(xpath = "//pre[@id='output']")
    WebElement output_text;
    @FindBy(xpath = "//*[@id=\"content\"]/li[2]/a")
    WebElement graphRepresentations_btn;
    @FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")                                //failed
    WebElement practicequestions_btn;	
    @FindBy(xpath = "//a[@class='btn btn-info']")                             
    WebElement tryhere1_btn;
    
    

public void clickgetstartedBtn() {
		getstarted_btn.click();
		
}

	
public boolean isGraphPageDisplayed() {
	return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/graph/");
}

	
public void MainGraph() {
	  
	maingraphlink.click();	
	
}

public boolean isMainGraphPageDisplayed() {
		return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/graph/graph/");
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
//added code in page
public void handleAlert() {
    try {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept(); // Accept the alert
    } catch (NoAlertPresentException e) {
        System.out.println("No alert present");
    }
}



public void enterCode(String sheetName, Integer row) {
	int coloumn = 0;
    String code = excelReader.getCellData(sheetName, row, coloumn);
    if(code == null || code.isEmpty()) {
    	throw  new IllegalArgumentException("The code fetched fromExcel is empty or null.");
    }
    
    System.out.println("Code entered in editor:" + code);

	txt_code.sendKeys(code);
	
}
	 
public void enterCode(String code) {
	codeEditor_click.click();	
	codeEditor.sendKeys(code);
}

public void clicksrunBtn() {
		run_btn.click();
		
}


public String getOutputTextFromTryEditorPage() {
	return output_text.getText();
}


public String getPopupAlertText() {
		 
	Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    alert.accept();
    return alertText;
}


public boolean isGraphRepresentationPageDisplayed() {
	return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/graph/graph-representations/");     
}


public void GraphRepresentations() {
		graphRepresentations_btn.click();
		
}

public void Tryhere1() {
	tryhere1_btn.click();                                 
}

public void PracticeQuestions() {
	practicequestions_btn.click();		
}

public void clicksrunBtn2() {
	run_btn2.click();
	
}


public boolean isPracticeQuestionsPageDisplayed() {
	return Objects.requireNonNull(driver.getCurrentUrl()).endsWith("/graph/practice");
}

public void enterPythonCode(String sheetName, Integer row) {
	int coloumn = 0;
    
	String code = excelReader.getCellData(sheetName, row, coloumn);
    if(code == null || code.isEmpty()) {
    	throw  new IllegalArgumentException("The code fetched fromExcel is empty or null.");
    }

	enterPythonCodeForPractice(code, txt_code);
	
}

public void enterPythonCodeForPractice(String code, WebElement element)
{
  new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
  String[] str1 = code.split("\n");
  
  for (int i = 0; i < str1.length; i++) {
  	System.out.println(str1[i]);
    if (str1[i].equalsIgnoreCase("\\b")) {
      element.sendKeys(Keys.BACK_SPACE);
    } else {
      element.sendKeys(str1[i]);
      element.sendKeys(Keys.ENTER);
    }
  }
}

public String getExcelData(String sheetName, Integer row, int column) {
	return excelReader.getCellData(sheetName, row, column);
}


	
}


