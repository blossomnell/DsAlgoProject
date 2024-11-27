package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.LoginPage;
import webdriver.DriverFactory;

public class DataStructuresSteps{
	//	WebDriver driver = DriverFactory.getDriver();
	 DataStructurePage dsp = new  DataStructurePage();
//		//LoginPage loginPage = new LoginPage();
////		HomePage homePage = new HomePage();
////	
////	@Given("the user is logged in successfully")
////	public void the_user_is_logged_in_successfully() {
////		LoginPage loginPage = new LoginPage();
////		driver.get("https://dsportalapp.herokuapp.com/login"); // Navigate to the login page
////        loginPage.enterUsername("Ninjasquad");
////        loginPage.enterPassword("abss@123");
////        loginPage.clickloginBtn();
////        loginPage.navigatetohomepage();
////        Assert.assertTrue(homePage.isDataStructureSectionVisible(), "User is not logged in successfully");
////		
//	//}
//	@Given("the user is in the homepage and see DataStructure")
//	public void the_user_is_in_the_homepage_and_see_data_structure(String expectedUrl) {
//		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "The user is not on the homepage.");
//	}

	@When("the user clicks Get Started button under DataStructure")
	public void the_user_clicks_get_started_button_under_data_structure() {
	    dsp.clickGetStarted();
	}

	@Then("the user is navigated to Data Structures-Introduction page")
	public void the_user_is_navigated_to_data_structures_introduction_page() {
		 Assert.assertTrue(dsp.isIntroductionPageDisplayed(),
	                "Data Structures-Introduction page is not displayed.");
	}

	@Given("the user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	    dsp.navigatetoDatastructurePage();
	}

	@When("the user clicks the Time Complexity link")
	public void the_user_clicks_the_time_complexity_link() {
	    dsp.clickTimeComplexityLink();
	}

	@Then("the user is navigated Time Complexity page")
	public void the_user_is_navigated_time_complexity_page() {
		  Assert.assertTrue(dsp.isTimeComplexityPageDisplayed(),"The user is not on the Time Complexity page!");
	   
	}

	@Given("the user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
	   dsp.navigatetoTimeComplexityPage();
	}
	@When("the user scrolls down and clicks the Try here button in Time Complexity Page")
	public void the_user_scrolls_down_and_clicks_the_try_here_button_in_time_complexity_page() {
	    dsp.clickTryhereButton();
	}
	@Then("the user is in the try editor page")
	public void the_user_is_in_the_try_editor_page() {
	     Assert.assertTrue(dsp.isTryEditorPageDisplayed(),"The user is not in try editor page");
	}

	@Given("the user is in the Python try editor page")
	public void the_user_is_in_the_python_try_editor_page() {
		dsp.navigatetoTryEditorPage();
	    
	}

	@When("the user enters {string} in the editor and clicks Run button")
	public void the_user_enters_in_the_editor_and_clicks_run_button(String code) {
		dsp.enterCode(code);
        dsp.clickRunButton();
	}

	@Then("the user sees {string}")
	public void the_user_sees(String expectedOutcome) {
	    if (expectedOutcome.contains("popup error message")) {
	        String popupMessage = dsp.handlePopupError();
	        Assert.assertTrue(popupMessage.contains("SyntaxError"), 
	            "Popup message did not match the expected error text. Actual: " + popupMessage);
	    } else if (expectedOutcome.contains("output in the console")) {
	        String consoleOutput = dsp.getOutputText();
	        Assert.assertFalse(consoleOutput.isEmpty(), 
	            "No output found in the console.");
	    } else {
	        Assert.fail("Unexpected outcome specified in test case: " + expectedOutcome);
	    }
	}

    @When("the user clicks the Practice Questions link")
	public void the_user_clicks_the_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user is in the empty Practice Question page")
	public void the_user_is_in_the_empty_practice_question_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
////
////
////
////
////
}
