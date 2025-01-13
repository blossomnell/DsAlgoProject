package stepDefinitions;

import java.io.IOException;
import org.testng.Assert;
import Utilities.configReader;
import Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import org.openqa.selenium.WebDriver;


public class GraphSteps {
	
	ExcelReader excelReader;
	
    public GraphSteps() {
        try {
        	
			String filePath = System.getProperty("user.dir") + "/" + reader.init_prop().getProperty("excelFilePath");
        	//String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
            excelReader = new ExcelReader(filePath);
        } catch (IOException e) {
        	throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
        }
    }
    
    configReader reader = new configReader();
	GraphPage graphPage = new GraphPage();


	
	//@Given("the user is in Numpy Ninja Homepage")
	//public void the_user_is_in_numpy_ninja_homepage() {
		//graphPage.navigatetoNumpyNinjahomepage();
	//}


	@When("the user clicks the Get Started under Graph")
	public void the_user_clicks_the_get_started_under_graph() {
		graphPage.clickgetstartedBtn();
	}

	@Then("the user is navigated to Graph page")
	public void the_user_is_navigated_to_graph_page() {
		//graphPage.navigatetographpage();
		Assert.assertTrue(graphPage.isGraphPageDisplayed(), "Graph page is not displayed");
		}

	@Given("the user is in Graph page")
	public void the_user_is_in_graph_page() {
		//graphPage.navigatetographpage();
		graphPage.clickgetstartedBtn();

	}

	@When("the user clicks the Main Graph")
	public void the_user_clicks_the_main_graph() {
		graphPage.MainGraph();
	}

	@Then("the user should be in the Main Graph page")                                
	public void the_user_should_be_in_the_main_graph_page() {
		Assert.assertTrue(graphPage.isMainGraphPageDisplayed(), "Main Graph page is not displayed");
	}

	@Given("the user is in the Main Graph page")
	public void the_user_is_in_the_main_graph_page() {
		//graphPage.navigatetomaingraphpage();                     
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();
	}

	@When("the user clicks the Try here button of  Main Graph page")
	public void the_user_clicks_the_try_here_button_of_main_graph_page() {
		graphPage.Tryhere1();
	}
    
	//assert added
	
	@Then("the user should be in the python editor page of  Main Graph page")
	public void the_user_should_be_in_the_python_editor_page_of_main_graph_page() {
		//graphPage.navigatetotryeditorpage();
		Assert.assertTrue(graphPage.isTryEditorPageDisplayed(), "python editor page is not displayed");
		Assert.assertTrue(graphPage.isRunButtonDisplayed(), "Run button is not displayed");
	}

	@Given("the user is in the python editor of Main Graph page")
	public void the_user_is_in_the_python_editor_of_main_graph_page() {
		//graphPage.navigatetotryeditorpage();
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();
		graphPage.Tryhere1();
	}
	

   @When("The user enters python code of Main Graph page in Editor from Excel sheet {string} and row {int} and clicks Run")
   public void the_user_enters_python_code_of_main_graph_page_in_editor_from_excel_sheet_and_row_and_clicks_run(String sheetName, Integer row) {
   	graphPage.enterPythonCode(sheetName, row);
	graphPage.clicksrunBtn();
}

   @Then("user will get the expectedOutcome from sheet {string} and row {int}")
   public void user_will_get_the_expected_outcome_from_sheet_and_row(String sheetName, Integer row) {
	   String expectedOutcome = graphPage.getExcelData(sheetName, row, 1);
   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
   	
   	}
   	
   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
       if (expectedOutcome.contains("SyntaxError"))
           Assert.assertEquals(graphPage.getPopupAlertText(), expectedOutcome);
       else
           Assert.assertEquals(graphPage.getOutputTextFromTryEditorPage(), expectedOutcome);
   }
	

	@Given("the user is in the Graph page")
	public void the_user_is_in_the_graph_page() {                            
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();                                             
		
		
	}
	@When("the user clicks on the  Graph Representations")
	public void the_user_clicks_on_the_graph_representations() {
		                                             
		graphPage.GraphRepresentations();
	}

	@Then("the user should be in the Graph Representations page")
	public void the_user_should_be_in_the_graph_representations_page() {
		//graphPage.navigatetographrepresentationspage();                         
		Assert.assertTrue(graphPage.isGraphRepresentationPageDisplayed(), "Graph Representation page is not displayed");
	}

	@Given("the user is in the Graph Representations page")
	public void the_user_is_in_the_graph_representations_page() {
		//graphPage.navigatetographrepresentationspage();               
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();                                         
		graphPage.GraphRepresentations();
	}

	@When("the user clicks Try here button Graph Representations page")
	public void the_user_clicks_try_here_button_graph_representations_page() {
		graphPage.Tryhere1();
	}
    
	
	@Then("the user should be in the python editor page of Graph Representations page")
	public void the_user_should_be_in_the_python_editor_page_of_graph_representations_page() {
		//graphPage.navigatetotryeditorpage();                                                        
		Assert.assertTrue(graphPage.isTryEditorPageDisplayed(), "python editor page is not displayed");
		Assert.assertTrue(graphPage.isRunButtonDisplayed(), "Run button is not displayed");
	}
	
	@Given("the user is in the python editor of Graph Representations page")
	public void the_user_is_in_the_python_editor_of_graph_representations_page() {
		//graphPage.navigatetotryeditorpage();
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();
		graphPage.GraphRepresentations();
		graphPage.Tryhere1();
		
	}

    @When("the user enters python code in Editor from the Excel sheet {string} and row {int} and clicks Run")
    public void the_user_enters_python_code_in_editor_from_the_excel_sheet_and_row_and_clicks_run(String sheetName, Integer row) {
    graphPage.enterPythonCode(sheetName, row);
	graphPage.clicksrunBtn();
    
    }

    @Then("the user will get the expectedOutcome from sheet {string} and row {int}")
    public void the_user_will_get_the_expected_outcome_from_sheet_and_row(String sheetName, Integer row) {
    	String expectedOutcome = graphPage.getExcelData(sheetName, row, 1);
       	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
       		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
       	
       	}
       	
       	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
           if (expectedOutcome.contains("SyntaxError"))
               Assert.assertEquals(graphPage.getPopupAlertText(), expectedOutcome);
           else
               Assert.assertEquals(graphPage.getOutputTextFromTryEditorPage(), expectedOutcome);
    }
    
	
	@Given("user is in Graph page")
	public void user_is_in_graph_page() {
		//graphPage.navigatetographgraphpage();                  
		graphPage.clickgetstartedBtn();
		graphPage.MainGraph();                                              
	}
	    
	@When("the user clicks the Practice Questions of Graph page")
	public void the_user_clicks_the_practice_questions_of_graph_page() {
		graphPage.PracticeQuestions();
	}

	@Then("the user should see the Practice Questions page of Graph page")
	public void the_user_should_see_the_practice_questions_page_of_graph_page() {
		//graphPage.navigatetopracticequestionspage();                                     
		Assert.assertTrue(graphPage.isPracticeQuestionsPageDisplayed(), "Practice Questions page is not displayed");
	}


	
	
}

