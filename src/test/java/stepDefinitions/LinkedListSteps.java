package stepDefinitions;

//import static org.testng.Assert.assertTrue;
import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;


public class LinkedListSteps {
	
	LinkedListPage linkedListPage = new LinkedListPage();
		
	@Given("the user is in Linked List page")
	public void the_user_is_in_linked_list_page() {
		 linkedListPage.navigatetolinkedlistpage();
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
		linkedListPage.navigatetointroductionpage();
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
		linkedListPage.navigatetotryeditorpage();
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {	
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
		linkedListPage.navigatetolinkedlistpage();
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
		linkedListPage.navigatetocreatinglinkedlistpage();
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		linkedListPage.Tryhere();
	}

	@Given("the user is in the python editor of Creating Linked List page")
	public void the_user_is_in_the_python_editor_of_creating_linked_list_page() {
		linkedListPage.navigatetotryeditorpage();
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
		linkedListPage.navigatetotypesoflinkedlistpage();
	}

	@Given("the user is in the python editor of Types of Linked List page")
	public void the_user_is_in_the_python_editor_of_types_of_linked_list_page() {
		linkedListPage.navigatetotryeditorpage();
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
		linkedListPage.navigatetoimplementlinkedlistinpythonpage();
	}

	@Given("the user is in the python editor of the Implement Linked List in Python page")
	public void the_user_is_in_the_python_editor_of_the_implement_linked_list_in_python_page() {
		linkedListPage.navigatetotryeditorpage();
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
		linkedListPage.navigatetotraversalpage();
	}

	@Given("the user is in the python editor of the Traversal page")
	public void the_user_is_in_the_python_editor_of_the_traversal_page() {
		linkedListPage.navigatetotryeditorpage(); 
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
		linkedListPage.navigatetoinsertionpage(); 
	}

	@Given("the user is in the python editor of the Insertion page")
	public void the_user_is_in_the_python_editor_of_the_insertion_page() {
		linkedListPage.navigatetotryeditorpage(); 
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
		linkedListPage.navigatetodeletionpage();
	}

	@Given("the user is in the python editor of the Deletion page")
	public void the_user_is_in_the_python_editor_of_the_deletion_page() {
		linkedListPage.navigatetotryeditorpage();
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
	
