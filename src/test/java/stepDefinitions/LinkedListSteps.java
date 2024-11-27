package stepDefinitions;

import static org.testng.Assert.assertTrue;

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
//
//	@Given("the user is in the python editor of Introduction page")
//	public void the_user_is_in_the_python_editor_of_introduction_page() {
//		linkedListPage.navigatetotryeditorpage();
//	}

//	@When("the user enters {string} in the python editor and clicks Run")
//	public void the_user_enters_in_the_python_editor_and_clicks_run(String code) {
//		linkedListPage.enterCode(code);
//		linkedListPage.clicksrunBtn();
//	}

//	@Then("the user gets a message (string}")
//	public void the_user_gets_a_message(String expectedMessage) {
//		assertEquals(linkedListPage.getAlertMessage(),expectedMessage, "outputMessage");
//	}





//	@And("the user is in the Linked List page")
//	public void theUserIsInTheLinkedListPage() {
//		linkedListPage.clickgetstartedBtn();
//
//	}
}
