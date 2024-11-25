package stepDefinitions;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;


public class LinkedListSteps {
	
	LinkedListPage linkedListPage = new LinkedListPage();
  
	@Given("the user is in the DsAlgo homepage")
	public void the_user_is_in_the_ds_algo_homepage() {
			linkedListPage.navigatetohomepage();
			linkedListPage.signin();
			linkedListPage.navigatetologinpage();
			linkedListPage.enterUsername("Ninjasquad");
			linkedListPage.enterPassword("abss@123");
			linkedListPage.clickloginBtn();
	}

	@When("the user clicks the Get Started button under Linked List")
	public void the_user_clicks_the_get_started_button_under_linked_list() {
		linkedListPage.getstarted();
	}

	@Then("the user should be in the Linked List page")
	public void the_user_should_be_in_the_linked_list_page() {
		linkedListPage.navigatetolinkedlistpage();
		
		assertTrue(linkedListPage.isLinkedListPageDisplayed(), "LinkedList page is not displayed");
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		linkedListPage.navigatetolinkedlistpage();
	}

	@When("the user clicks the Introduction button")
	public void the_user_clicks_the_introduction_button() {
	    linkedListPage.Introduction();
	}

	@Then("the user should be in the Introduction page")
	public void the_user_should_be_in_the_introduction_page() {
		linkedListPage.navigatetointroductionpage();
		assertTrue(linkedListPage.isIntroductionPageDisplayed(), "Introduction page is not displayed");
	}

	@Given("the user is in the Introduction page")
	public void the_user_is_in_the_introduction_page() {
	    
	}

	@When("the user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
	    
	}

	@Then("the user should be in the python page")
	public void the_user_should_be_in_the_python_page() {
	    
	}

	@Given("the user is in the python page")
	public void the_user_is_in_the_python_page() {
	    
	}

	@When("the user leaves the python editor empty and clicks Run")
	public void the_user_leaves_the_python_editor_empty_and_clicks_run() {
	    
	}

	@Then("no action occurred in the page")
	public void no_action_occurred_in_the_page() {
	    
	}

	@When("the user enters a invalid code in the python editor and clicks Run")
	public void the_user_enters_a_invalid_code_in_the_python_editor_and_clicks_run() {
	    
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
	    
	}

	@When("the user enters a valid code in the python editor and clicks Run")
	public void the_user_enters_a_valid_code_in_the_python_editor_and_clicks_run() {
	   
	}

	@Then("the user should see the output in the console")
	public void the_user_should_see_the_output_in_the_console() {
	    
	}

	@Given("the user is back in the introduction page")
	public void the_user_is_back_in_the_introduction_page() {
	    
	}

	@When("the user clicks on the Creating Linked List button")
	public void the_user_clicks_on_the_creating_linked_list_button() {
	   
	}

	@Then("the user should be in the Creating Linked List page")
	public void the_user_should_be_in_the_creating_linked_list_page() {
	    
	}

	@Given("the user is in the Creating Linked List page")
	public void the_user_is_in_the_creating_linked_list_page() {
	    
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
	   
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
	    
	}

	@Given("the user is in the python editor page")
	public void the_user_is_in_the_python_editor_page() {
	}

	@When("the user enters an invalid code in the python editor and clicks Run")
	public void the_user_enters_an_invalid_code_in_the_python_editor_and_clicks_run() {
	   
	}

	@Then("an error message is shown")
	public void an_error_message_is_shown() {
	    
	}

	@When("the user clicks on Types of Linked List button")
	public void the_user_clicks_on_types_of_linked_list_button() {
	    
	}

	@Then("the user should be in the Types of Linked List page")
	public void the_user_should_be_in_the_types_of_linked_list_page() {
	   
	}

	@Given("the user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
	    
	}

	@When("the user enters an valid code in the python editor and clicks Run")
	public void the_user_enters_an_valid_code_in_the_python_editor_and_clicks_run() {
	    
	}

	@When("the user clicks the Implement Linked List in Python")
	public void the_user_clicks_the_implement_linked_list_in_python() {
	    
	}

	@Then("the user should be in the Implement Linked List in Python page")
	public void the_user_should_be_in_the_implement_linked_list_in_python_page() {
	   
	}

	@Given("the user is in the Implement Linked List in Python page")
	public void the_user_is_in_the_implement_linked_list_in_python_page() {
	    
	}

	@When("the user clicks the Traversal")
	public void the_user_clicks_the_traversal() {
	    
	}

	@Then("the user should be in the traversal page")
	public void the_user_should_be_in_the_traversal_page() {
	    
	}

	@Given("the user is in the traversal page")
	public void the_user_is_in_the_traversal_page() {
	    
	}

	@When("the user enters an invalid code in the pyton editor and clicks Run")
	public void the_user_enters_an_invalid_code_in_the_pyton_editor_and_clicks_run() {
	    
	}

	@Given("the user is back in the Traversal page")
	public void the_user_is_back_in_the_traversal_page() {
	    
	}

	@When("the user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
	    
	}

	@Then("the user should be in the Insertion page")
	public void the_user_should_be_in_the_insertion_page() {
	    
	}

	@Given("the user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() {
	    
	}

	@When("the user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
	    
	}

	@Then("the user should be in the Deletion page")
	public void the_user_should_be_in_the_deletion_page() {
	    
	}

	@Given("the user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
	    
	}

	@When("the user clicks the practice question")
	public void the_user_clicks_the_practice_question() {
	    
	}

	@Then("the user should see the blank Practice Questions page")
	public void the_user_should_see_the_blank_practice_questions_page() {
	    
	}



}
