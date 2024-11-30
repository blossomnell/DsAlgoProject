
package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;
import pageObjects.StackPage;

public class QueueSteps {
	QueuePage queue= new QueuePage();
	@When("the user clicks on the Get started button under queue")
	public void the_user_clicks_on_the_get_started_button_under_queue() {
		queue.clickGetStarted();
	}

	@Then("the user navigates to the queue page")
	public void the_user_navigates_to_the_queue_page() {
		Assert.assertTrue( queue.isQueuePageDisplayed(),"Queue page is not displayed");
	    
	}

	@Given("the user in th queue page")
	public void the_user_in_th_queue_page() {
		queue.navigateToQueuepage(); 
	}

	@When("the user clicks on the Implementation of Queue in Python link")
	public void the_user_clicks_on_the_implementation_of_queue_in_python_link() {
		 queue.clickImplementationOfQueueInPythonLink();
	}

	@Then("the user navigates to the Implementation of Queue in Python page")
	public void the_user_navigates_to_the_implementation_of_queue_in_python_page() {
		 Assert.assertTrue(queue.isImplementationOfQueueInPythonPageDisplayed(),"Implementation of queue in python page is not displayed");
		    
	}

	@Given("the user in Implementation of Queue in Python page")
	public void the_user_in_implementation_of_queue_in_python_page() {
	   queue.navigateToImplementationOfQueueInPython();
	}

	@Given("the user is in the try editor page in Implementation of Queue in Python")
	public void the_user_is_in_the_try_editor_page_in_implementation_of_queue_in_python() {
		queue.navigateToTryEditorPage();
	}
	@When("the user clicks on the Implementation using collections.deque link")
	public void the_user_clicks_on_the_implementation_using_collections_deque_link() {
	    queue.clickImplementationUsingCollectionsDequeLink();
	}

	@Then("the user navigates to the Implementation using collections.deque page")
	public void the_user_navigates_to_the_implementation_using_collections_deque_page() {
		
		Assert.assertTrue(queue.isImplementationUsingCollectionDequePageDispayed(), "implementation using collections deque page is not displayed");
	}

	@Given("the user in Implementation using collections.deque page")
	public void the_user_in_implementation_using_collections_deque_page() {
	    queue.navigateToImplementationUsingCollectionsDequePage();
	}

	@Given("the user is in the try editor page in Implementation using collections.deque")
	public void the_user_is_in_the_try_editor_page_in_implementation_using_collections_deque() {
	queue.navigateToTryEditorPage();
	}
	
	
	
	@When("the user clicks on the Implementation using array link")
	public void the_user_clicks_on_the_implementation_using_array_link() {
		queue.clickImplementationUsingarrayLink();
	    
	}

	@Then("the user navigates to the Implementation using array page")
	public void the_user_navigates_to_the_implementation_using_array_page() {
		Assert.assertTrue(queue.isImplementationUsingArrayPageDispayed(), "implementation using array page is not displayed");	}

	@Given("the user in Implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		queue.navigateToImplementationUsingArrayPage();	
		}

	@Given("the user is in the try editor page in Implementation using array")
	public void the_user_is_in_the_try_editor_page_in_implementation_using_array() {
		queue.navigateToTryEditorPage();
	}
	
	
	
	
	@When("the user clicks on the Queue Operations link")
	public void the_user_clicks_on_the_queue_operations_link() {
		queue.clickQueueOperationsLink();
	}

	@Then("the user navigates to the Queue Operations page")
	public void the_user_navigates_to_the_queue_operations_page() {
		Assert.assertTrue(queue.isQueueOperationsPageDispayed(), "Queue operations page is not displayed");	

	}
	@Given("the user in operations in queue page")
	public void the_user_in_operations_in_queue_page() {
		queue.operationsInQueuePage();

	}
	@Given("the user is in the try editor page in Queue Operations")
	public void the_user_is_in_the_try_editor_page_in_queue_operations() {
		queue.navigateToTryEditorPage();
	}


	@Given("the user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
		queue.operationsInQueuePage();
	}

	













}
