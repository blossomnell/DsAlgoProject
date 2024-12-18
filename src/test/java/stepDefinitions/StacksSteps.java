package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;

public class StacksSteps{
	
	StackPage stack= new StackPage();
	ExcelReader excelReader;
    public StacksSteps()  {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
            excelReader = new ExcelReader(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
        }
    }
	@When("the user clicks on the Get started button under stack")
	public void the_user_clicks_on_the_get_started_button_under_stack() {
		stack.clickGetStarted();
	    
	}

	@Then("the user navigates to the Stack page")
	public void the_user_navigates_to_the_stack_page() {
	Assert.assertTrue( stack.isStackPageDisplayed(),"Stack page is not displayed");
		
	}

	@Given("the user in th stack page")
	public void the_user_in_th_stack_page() {
//		stack.navigateToStackpage();
	   stack.clickGetStarted();
	}

	@When("the user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		 stack.clickOperationsInStackLink();
		
	    
	}

	@Then("the user navigates to the Operations in Stack page")
	public void the_user_navigates_to_the_operations_in_stack_page() {
		 Assert.assertTrue(stack.isOperationsInStackPageDisplayed(),"Operations in Stack page is not displayed");
	    
	}

	@Given("the user in operations in Stack page")
	public void the_user_in_operations_in_stack_page() {
//		stack.navigateOperationsInStackPage();
	   stack.clickGetStarted();
	   stack.clickOperationsInStackLink();
	}

	@When("the user scroll down and clicks try here button")
	public void the_user_scroll_down_and_clicks_try_here_button() {
		 stack.scrollDownAndClickTryHere();
	    
	}

	@Then("the user navigates to try editor page")
	public void the_user_navigates_to_try_editor_page() {
		 Assert.assertTrue( stack.isTryEditorPageDisplayed(),"Try Editor page is not displayed");
	   
	}
	@Given("the user is in the try editor page in stack")
	public void the_user_is_in_the_try_editor_page_in_stack() {
//	    stack.navigateToTryEditorPage();
		stack.clickGetStarted();
		stack.clickOperationsInStackLink();
		stack.scrollDownAndClickTryHere();
	}
	@When("the user clicks on the Implementation link")
	public void the_user_clicks_on_the_implementation_link() {
		
		stack.clickImplementationLink();
	    
	}

	@Then("the user navigates to the Implementation page")
	public void the_user_navigates_to_the_implementation_page() {
		Assert.assertTrue(stack.isImplementationPageDisplayed(),"Implementation page is not displayed");
	    
	   
	}
	@Given("the user in Implementation page")
	public void the_user_in_implementation_page() {
//	    stack.navigateToImplementationPage();
		stack.clickGetStarted();
		stack.clickImplementationLink();
	}
	
	@Given("the user is in the try editor page in Implementation")
	public void the_user_is_in_the_try_editor_page_in_implementation() {
//		stack.navigateToTryEditorPage();
		stack.clickGetStarted();
		stack.clickImplementationLink();
		stack.scrollDownAndClickTryHere();
	    
	}
	@When("the user clicks on the Applications link")
	public void the_user_clicks_on_the_applications_link() {
		stack.clickApplicationLink();
	    	}

	@Then("the user navigates to the Applications page")
	public void the_user_navigates_to_the_applications_page() {
		Assert.assertTrue(stack.isApplicationPageDisplayed(),"Application page is not Displayed");
	    
	}
	@Given("the user in Applications page")
	public void the_user_in_applications_page() {
//		stack.navigateToApplicationPage();
	    stack.clickGetStarted();
		stack.clickApplicationLink();
	}
	@Given("the user is in the try editor page in Application")
	public void the_user_is_in_the_try_editor_page_in_application() {
//		stack.navigateToTryEditorPage();
		stack.clickGetStarted();
		stack.clickApplicationLink();
		stack.scrollDownAndClickTryHere();
	    
	}
	@When("the user clicks on the Practice questions link")
	public void the_user_clicks_on_the_practice_questions_link() {
		stack.clickPracticeQuestionsLink();
	    
	}

	@Then("the user navigates to the Practice page")
	public void the_user_navigates_to_the_practice_page() {
		Assert.assertTrue(stack.isPracticePageDisplayed(),"Practice page is not Displayed");
	    
	}











}
