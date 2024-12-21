
package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Utilities.ExcelReader;
import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;
import pageObjects.StackPage;

public class QueueSteps {
	
	 ExcelReader excelReader;
	    public QueueSteps()  {
	        try {
<<<<<<< Updated upstream
	            String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
=======
	        	String filePath = System.getProperty("user.dir") + "/" + reader.init_prop().getProperty("excelFilePath");
	            //String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
>>>>>>> Stashed changes
	            excelReader = new ExcelReader(filePath);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
	        }
	    }
	    configReader reader = new configReader();
	
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
//		queue.navigateToQueuepage(); 
		queue.clickGetStarted();
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
//	   queue.navigateToImplementationOfQueueInPython();
		queue.clickGetStarted();
		 queue.clickImplementationOfQueueInPythonLink();
	}

	@Given("the user is in the try editor page in Implementation of Queue in Python")
	public void the_user_is_in_the_try_editor_page_in_implementation_of_queue_in_python() {
//		queue.navigateToTryEditorPage();
		queue.clickGetStarted();
		 queue.clickImplementationOfQueueInPythonLink();
		queue.clickTryhereButton();
		
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
//	    queue.navigateToImplementationUsingCollectionsDequePage();
		queue.clickGetStarted();
		queue.clickImplementationUsingCollectionsDequeLink();
	}

	@Given("the user is in the try editor page in Implementation using collections.deque")
	public void the_user_is_in_the_try_editor_page_in_implementation_using_collections_deque() {
//	queue.navigateToTryEditorPage();
		queue.clickGetStarted();
		queue.clickImplementationUsingCollectionsDequeLink();
		queue.clickTryhereButton();
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
//		queue.navigateToImplementationUsingArrayPage();	
		queue.clickGetStarted();
		queue.clickImplementationUsingarrayLink();
		}

	@Given("the user is in the try editor page in Implementation using array")
	public void the_user_is_in_the_try_editor_page_in_implementation_using_array() {
//		queue.navigateToTryEditorPage();
		queue.clickGetStarted();
		queue.clickImplementationUsingarrayLink();
		queue.clickTryhereButton();
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
//		queue.operationsInQueuePage();
		queue.clickGetStarted();
		queue.clickQueueOperationsLink();

	}
	@Given("the user is in the try editor page in Queue Operations")
	public void the_user_is_in_the_try_editor_page_in_queue_operations() {
//		queue.navigateToTryEditorPage();
		queue.clickGetStarted();
		queue.clickQueueOperationsLink();
		queue.clickTryhereButton();

	}


	@Given("the user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
//		queue.operationsInQueuePage();
		queue.clickGetStarted();
		queue.clickQueueOperationsLink();
	}
	
//	@When("the user clicks on the Practice questions link")
//	public void the_user_clicks_on_the_practice_questions_link() {
//		queue.clickPracticeQuestionsLink();
//	    
//	}
//
//	@Then("the user navigates to the Practice page")
//	public void the_user_navigates_to_the_practice_page() {
//		Assert.assertTrue(queue.isPracticePageDisplayed(),"Practice page is not Displayed");
//	    
//	}

	













}
