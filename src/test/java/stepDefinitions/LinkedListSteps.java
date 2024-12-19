package stepDefinitions;

import java.io.IOException;
import org.testng.Assert;
import Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedListSteps {
	
	 ExcelReader excelReader;
	    public LinkedListSteps() {
	        try {
	            String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
	            excelReader = new ExcelReader(filePath);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
	        }
	    }
	
	LinkedListPage linkedListPage = new LinkedListPage();
	
	@Given("the user is in Homepage")
	public void the_user_is_in_homepage() {
		linkedListPage.navigatetohomepage();
	}
	
	@When("the user clicks the Get Started under Linked List")
	public void the_user_clicks_the_get_started_under_linked_list() {
		linkedListPage.clickgetstartedBtn();
	}
	
	@Then("the user is navigated to Linked List page")
	public void the_user_is_navigated_to_linked_list_page() {
		linkedListPage.navigatetolinkedlistpage();
	}
		
	@Given("the user is in Linked List page")
	public void the_user_is_in_linked_list_page() {
		 linkedListPage.clickgetstartedBtn();
		 //linkedListPage.navigatetolinkedlistpage();
	}

	@When("the user clicks the Introduction")
	public void the_user_clicks_the_introduction() {
		linkedListPage.Introduction();
	}

	@Then("the user should be in the Introduction page")
	public void the_user_should_be_in_the_introduction_page() {
		linkedListPage.navigatetointroductionpage();
		Assert.assertTrue(linkedListPage.isIntroductionPageDisplayed(), "Introduction page is not displayed");
	}

	@Given("the user is in the Introduction page")
	public void the_user_is_in_the_introduction_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Introduction();
		//linkedListPage.navigatetointroductionpage();
	}

	@When("the user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
		linkedListPage.Tryhere();
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		linkedListPage.navigatetotryeditorpage();
		Assert.assertTrue(linkedListPage.isTryEditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(linkedListPage.isRunButtonDisplayed(), "Run button is not displayed");
	}

	@Given("the user is in the python editor of Introduction page")
	public void the_user_is_in_the_python_editor_of_introduction_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Introduction();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage();
	}
	
	@When("the user enters data from sheet {string} and row {int}")
	public void the_user_enters_data_from_sheet_and_row(String sheetName, int row) {
	    int column = 0; 
	    
	    String code = excelReader.getCellData(sheetName, row, column);
	    if (code == null || code.isEmpty()) {
	        throw new IllegalArgumentException("The code fetched from Excel is empty or null.");
	    }

	    System.out.println("Code entered in editor: " + code);	    
	    linkedListPage.enterCode(code);
	    linkedListPage.clicksrunBtn();
	}
	
	@Then("the user gets the message {string}")
	public void the_user_gets_the_message(String expectedOutcome) {		
		
		if(expectedOutcome.contains("SyntaxError"))
			Assert.assertEquals(linkedListPage.getPopupAlertText(),expectedOutcome);

		else
			Assert.assertEquals(linkedListPage.getOutputTextFromTryEditorPage(), expectedOutcome);
		
	}
	  
	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		//linkedListPage.navigatetolinkedlistpage();
	}

	@When("the user clicks on the Creating Linked List")
	public void the_user_clicks_on_the_creating_linked_list() {
		linkedListPage.CreatingLinkedList();
	}

	@Then("the user should be in the Creating Linked List page")
	public void the_user_should_be_in_the_creating_linked_list_page() {
		linkedListPage.navigatetocreatinglinkedlistpage();
		//assertTrue(linkedListPage.isCreatingLinkedListPageDisplayed(), "Creating Linked List page is not displayed");
	}

	@Given("the user is in the Creating Linked List page")
	public void the_user_is_in_the_creating_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.CreatingLinkedList();
		//linkedListPage.navigatetocreatinglinkedlistpage();
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		linkedListPage.Tryhere();
	}

	@Given("the user is in the python editor of Creating Linked List page")
	public void the_user_is_in_the_python_editor_of_creating_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.CreatingLinkedList();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage();
	}

	@When("the user clicks on Types of Linked List")
	public void the_user_clicks_on_types_of_linked_list() {
		linkedListPage.TypesofLinkedList();
	}

	@Then("the user should be in the Types of Linked List page")
	public void the_user_should_be_in_the_types_of_linked_list_page() {
		linkedListPage.navigatetotypesoflinkedlistpage();
	}

	@Given("the user is in the Types of Linked List page")
	public void the_user_is_in_the_types_of_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.TypesofLinkedList();
		//linkedListPage.navigatetotypesoflinkedlistpage();
	}

	@Given("the user is in the python editor of Types of Linked List page")
	public void the_user_is_in_the_python_editor_of_types_of_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.TypesofLinkedList();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage();
	}

	@When("the user clicks the Implement Linked List in Python")
	public void the_user_clicks_the_implement_linked_list_in_python() {
		linkedListPage.ImplementLinkedListinPython();
	}

	@Then("the user should be in the Implement Linked List in Python page")
	public void the_user_should_be_in_the_implement_linked_list_in_python_page() {
		linkedListPage.navigatetoimplementlinkedlistinpythonpage();
	}

	@Given("the user is in the Implement Linked List in Python page")
	public void the_user_is_in_the_implement_linked_list_in_python_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.ImplementLinkedListinPython();
		//linkedListPage.navigatetoimplementlinkedlistinpythonpage();
	}

	@Given("the user is in the python editor of the Implement Linked List in Python page")
	public void the_user_is_in_the_python_editor_of_the_implement_linked_list_in_python_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.ImplementLinkedListinPython();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage();
	}

	@When("the user clicks the Traversal")
	public void the_user_clicks_the_traversal() {
		linkedListPage.Traversal();
	}

	@Then("the user should be in the Traversal page")
	public void the_user_should_be_in_the_traversal_page() {
		linkedListPage.navigatetotraversalpage();
	}

	@Given("the user is in the Traversal page")
	public void the_user_is_in_the_traversal_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Traversal();
		//linkedListPage.navigatetotraversalpage();
	}

	@Given("the user is in the python editor of the Traversal page")
	public void the_user_is_in_the_python_editor_of_the_traversal_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Traversal();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage(); 
	}

	@When("the user clicks the Insertion")
	public void the_user_clicks_the_insertion() {
		linkedListPage.Insertion();
	}

	@Then("the user should be in the Insertion page")
	public void the_user_should_be_in_the_insertion_page() {
		linkedListPage.navigatetoinsertionpage(); 
	}

	@Given("the user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Insertion();
		//linkedListPage.navigatetoinsertionpage(); 
	}

	@Given("the user is in the python editor of the Insertion page")
	public void the_user_is_in_the_python_editor_of_the_insertion_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Insertion();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage(); 
	}

	@When("the user clicks the Deletion")
	public void the_user_clicks_the_deletion() {
		linkedListPage.Deletion();
	}

	@Then("the user should be in the Deletion page")
	public void the_user_should_be_in_the_deletion_page() {
		linkedListPage.navigatetodeletionpage(); 
	}

	@Given("the user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Deletion();
		//linkedListPage.navigatetodeletionpage();
	}

	@Given("the user is in the python editor of the Deletion page")
	public void the_user_is_in_the_python_editor_of_the_deletion_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.Deletion();
		linkedListPage.Tryhere();
		//linkedListPage.navigatetotryeditorpage();
	}
	
	@When("the user clicks the Practice Questions")
	public void the_user_clicks_the_practice_questions() {
		linkedListPage.PracticeQuestions();
	}

	@Then("the user should see the Practice Questions page")
	public void the_user_should_see_the_practice_questions_page() {
		linkedListPage.navigatetopracticequestionspage();
	}
    
	
}
	
