package stepDefinitions;


import org.testng.Assert;


import Utilities.configReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;

public class DataStructuresSteps {

	public DataStructuresSteps() {
 
	}

	configReader reader = new configReader();
	DataStructurePage dsp = new DataStructurePage();

	@When("the user clicks Get Started button under DataStructure")
	public void the_user_clicks_get_started_button_under_data_structure() {
		dsp.clickGetStarted();
	}

	@Then("the user is navigated to Data Structures-Introduction page")
	public void the_user_is_navigated_to_data_structures_introduction_page() {
		Assert.assertTrue(dsp.isIntroductionPageDisplayed(), "Data Structures-Introduction page is not displayed.");
	}

	@Given("the user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {

		dsp.clickGetStarted();

	}

	@When("the user clicks the Time Complexity link")
	public void the_user_clicks_the_time_complexity_link() {
		dsp.clickTimeComplexityLink();
	}

	@Then("the user is navigated Time Complexity page")
	public void the_user_is_navigated_time_complexity_page() {
		Assert.assertTrue(dsp.isTimeComplexityPageDisplayed(), "The user is not on the Time Complexity page!");

	}

	@Given("the user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		dsp.clickGetStarted();

		dsp.clickTimeComplexityLink();

	}

	@When("the user scrolls down and clicks the Try here button in Time Complexity Page")
	public void the_user_scrolls_down_and_clicks_the_try_here_button_in_time_complexity_page() {
		dsp.clickTryhereButton();
	}

	@Then("the user is in the try editor page")
	public void the_user_is_in_the_try_editor_page() {
		Assert.assertTrue(dsp.isTryEditorPageDisplayed(), "The user is not in try editor page");
	}

	@Given("the user is in the Python try editor page")
	public void the_user_is_in_the_python_try_editor_page() {

		dsp.clickGetStarted();

		dsp.clickTimeComplexityLink();

		dsp.clickTryhereButton();

	}

	@When("the user enters data from excel sheet {string} and row {int}")
	public void the_user_enters_data_from_excel_sheet_and_row(String sheetName, int row) {
		// Default column index for fetching data
		int column = 0; // Always fetch the first column
		String code = dsp.getExcelData(sheetName, row, column);
//	    String code = excelReader.getCellData(sheetName, row, column);
		if (code == null || code.isEmpty()) {
			throw new IllegalArgumentException("The code fetched from Excel is empty or null.");
		}

		System.out.println("Code entered in editor: " + code);
		dsp.enterCode(code);
		dsp.clickRunButton();
	}

	@Then("the user sees the expected outcome from excel sheet {string} and row {int}")
	public void the_user_sees_the_expected_outcome_from_excel_sheet_and_row(String sheetName, int row) {
		// Fetch the expected outcome from Column B (index 1)
//	    String expectedOutcome = excelReader.getCellData(sheetName, row, 1);
		String expectedOutcome = dsp.getExcelData(sheetName, row, 1);

		if (expectedOutcome == null || expectedOutcome.isEmpty()) {
			throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		}

		System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);

		// Validate the outcome
		if (expectedOutcome.contains("popup error message")) {
			String popupMessage = dsp.handlePopupError();
			Assert.assertTrue(popupMessage.contains("SyntaxError"),
					"Popup message did not match the expected error text. Actual: " + popupMessage);
		} else if (expectedOutcome.contains("output in the console")) {
			String consoleOutput = dsp.getOutputText();
			Assert.assertFalse(consoleOutput.isEmpty(), "No output found in the console");
		} else {
			Assert.fail("Unexpected outcome specified in the test case: " + expectedOutcome);
		}
	}

	@When("the user clicks the Practice Questions link")
	public void the_user_clicks_the_practice_questions_link() {
		dsp.clickPracticeQuestionsLink();
	}

	@Then("the user is in the empty Practice Question page")
	public void the_user_is_in_the_empty_practice_question_page() {
		Assert.assertTrue(dsp.ispracticeQuestionPageDisplayed(), "Practice Question page is not displayed");
	}

}
