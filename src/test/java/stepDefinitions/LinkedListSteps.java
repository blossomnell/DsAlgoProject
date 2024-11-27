package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedListSteps {
	LinkedListPage linkedListPage = new LinkedListPage();
	
//background	
	@Given("the user is already signed in")
	public void the_user_is_already_signed_in() {
		linkedListPage.navigatetohomepage();
		linkedListPage.signin();
		linkedListPage.navigatetohomepage();
		linkedListPage.enterUsername("Ninjasquad");
		linkedListPage.enterPassword("abss@123");
		linkedListPage.clickloginBtn();
}

	@And("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		linkedListPage.clickgetstartedBtn();
		linkedListPage.navigatetolinkedlistpage();
		
		assertTrue(linkedListPage.isLinkedListPageDisplayed(), "LinkedList page is not displayed");
	}

//	@Given("the user is in the Linked List page")
//	public void the_user_is_in_the_linked_list_page() {
//	}

	@When("the user clicks the Introduction")
	public void the_user_clicks_the_introduction() {
		linkedListPage.Introduction();
	}

	@Then("the user should be in the Introduction page")
	public void the_user_should_be_in_the_introduction_page() {
		linkedListPage.navigatetointroductionpage();
		assertTrue(linkedListPage.isIntroductionPageDisplayed(), "Introduction page is not displayed");
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
		assertTrue(linkedListPage.isTryEditorPageDisplayed(), "Try Editor page is not displayed");
		assertTrue(linkedListPage.isRunButtonDisplayed(), "Run button is not displayed");
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

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		assertEquals(linkedListPage.getAlertMessage(),expectedMessage, "outputMessage");
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
	}

	@When("the user clicks on the Creating Linked List")
	public void the_user_clicks_on_the_creating_linked_list() {
		
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

	@Given("the user is in the python editor of Creating Linked List page")
	public void the_user_is_in_the_python_editor_of_creating_linked_list_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
	}

	@When("the user clicks on Types of Linked List")
	public void the_user_clicks_on_types_of_linked_list() {
		
	}

	@Then("the user should be in the Types of Linked List page")
	public void the_user_should_be_in_the_types_of_linked_list_page() {
		
	}

	@Given("the user is in the Types of Linked List page")
	public void the_user_is_in_the_types_of_linked_list_page() {
		
	}

	@When("the user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
		
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		
	}

	@Given("the user is in the python editor of Types of Linked List page")
	public void the_user_is_in_the_python_editor_of_types_of_linked_list_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
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

	@When("the user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
		
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		
	}

	@Given("the user is in the python editor of the Implement Linked List in Python page")
	public void the_user_is_in_the_python_editor_of_the_implement_linked_list_in_python_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
	}

	@When("the user clicks the Traversal")
	public void the_user_clicks_the_traversal() {
		
	}

	@Then("the user should be in the Traversal page")
	public void the_user_should_be_in_the_traversal_page() {
		
	}

	@Given("the user is in the Traversal page")
	public void the_user_is_in_the_traversal_page() {
		
	}

	@When("the user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
		
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		
	}

	@Given("the user is in the python editor of the Traversal page")
	public void the_user_is_in_the_python_editor_of_the_traversal_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {		
	}

	@When("the user clicks the Insertion")
	public void the_user_clicks_the_insertion() {
		
	}

	@Then("the user should be in the Insertion page")
	public void the_user_should_be_in_the_insertion_page() {
		
	}

	@Given("the user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() {
		
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		
	}

	@Given("the user is in the python editor of the Insertion page")
	public void the_user_is_in_the_python_editor_of_the_insertion_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		
	}

	@When("the user clicks the Deletion")
	public void the_user_clicks_the_deletion() {
		
	}

	@Then("the user should be in the Deletion page")
	public void the_user_should_be_in_the_deletion_page() {
		
	}

	@Given("the user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
		
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		
	}

	@Then("the user should be in the python editor page")
	public void the_user_should_be_in_the_python_editor_page() {
		
	}

	@Given("the user is in the python editor of the Deletion page")
	public void the_user_is_in_the_python_editor_of_the_deletion_page() {
		
	}

	@When("the user enters {string} in the python editor and clicks Run")
	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
		
	}

	@Then("the user gets a message (string}")
	public void the_user_gets_a_message(String expectedMessage) {
		
	}

	@Given("the user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		
	}

	@When("the user clicks on the Introdcution")
	public void the_user_clicks_on_the_introduction() {
		
	}

	@And("the user clicks the Practice Questions")
	public void the_clicks_the_practice_questions() {
		

	}

	@Then("the user should see the Practice Questions page")
	public void the_user_should_see_the_practice_question_page() {
		
	}
}
