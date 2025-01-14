package stepDefinitions;

import java.io.IOException;
import org.testng.Assert;
import Utilities.ExcelReader;
import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;


public class ArraySteps {
     
	ExcelReader excelReader;
    public ArraySteps() {
          
    }
    configReader reader = new configReader();
    ArrayPage arrayPage = new ArrayPage();
	

	@When("user clicks the Get Started button under Array")
	public void user_clicks_the_get_started_button_under_array() {
		arrayPage.clickgetstartedBtn();
	}

	@Then("user is navigated to array page")
public void user_is_navigated_to_array_page() {
		//arrayPage.navigatetoarraypage();                              //changed
		Assert.assertTrue(arrayPage.ArraypageDisplayed(), " Array page is not displayed");
}
	
	

	@Given("user is in the Array page")
	public void user_is_in_the_array_page() {
		//arrayPage.navigatetoarraypage();
		arrayPage.clickgetstartedBtn();
	}

	@When("user clicks the Arrays in Python button")
	public void user_clicks_the_arrays_in_python_button() {
		arrayPage.ArraysInPythonButton();
	}

	@Then("user should be in the Arrays in Python page")
	public void user_should_be_in_the_arrays_in_python_page() {
		//arrayPage.navigatetoarraysinpythonpage();                  //doubt on capital letters
		Assert.assertTrue(arrayPage.ArraysInPythonButtonisDisplayed(), " Arrays in Python page is not displayed");
	}

	@Given("user is in the Arrays in Python page")
    public void user_is_in_the_arrays_in_python_page() {
		//arrayPage.navigatetoarrayinpythonpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		
}

@When("user  clicks the Try here button of Arrays in Python page")
public void user_clicks_the_try_here_button_of_arrays_in_python_page() {
	arrayPage.Tryhere();
}

@Then("user should be in the Python editor page")
public void user_should_be_in_the_python_editor_page() {
	//arrayPage.navigatetotryeditorpage();                              //assert
	Assert.assertTrue(arrayPage.isTryEditorPageDisplayed(), "Try Editor page is not displayed");
	Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
}

   @Given("user is in the python editor of Arrays in python page")
   public void user_is_in_the_python_editor_of_arrays_in_python_page() {
	//arrayPage.navigatetotryeditorpage();
	arrayPage.clickgetstartedBtn();
	arrayPage.ArraysInPythonButton();
	arrayPage.Tryhere();
	
}

  @When("user will  enter data in python editor  of Arrays in python page from Excel sheet {string} and {int} and clicks Run")
   public void user_will_enter_data_in_python_editor_of_arrays_in_python_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
	arrayPage.enterPythonCode(sheetName, row);
	arrayPage.clicksrunBtn();
}
   

  @Then("user will get the expectedOutcome  of Arrays in python page  from sheet {string} and row {int}")
  public void user_will_get_the_expected_outcome_of_arrays_in_python_page_from_sheet_and_row(String sheetName, Integer row) {
	  String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
	   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
	   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
	   	
	   	}
	   	
	   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
	       if (expectedOutcome.contains("SyntaxError"))
	           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
	       else
	           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
		
	}      
	
	@Given("user is in Arrays in Python page")
    public void user_is_in_arrays_in_python_page() {
		//arrayPage.navigatetoarraysinpythonpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
}

	@When("user clicks the Arrays Using List button")
	public void user_clicks_the_arrays_using_list_button() {
		arrayPage.ArrayUsingList();
	}

	@Then("user should be in the Arrays Using List page")
	public void user_should_be_in_the_arrays_using_list_page() {
		//arrayPage.navigatetoarrayusinglistpage();
		Assert.assertTrue(arrayPage.ArraysUsingListButtonisDisplayed(), " Arrays Using List page is not displayed");  //assert
	}

	@Given("user is in the Arrays Using List page")
	public void user_is_in_the_arrays_using_list_page() {
		//arrayPage.navigatetoarrayusinglistpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.ArrayUsingList();
	}

	@When("user clicks the Try here button of Arrays Using List page")
	public void user_clicks_the_try_here_button_of_arrays_using_list_page() {
		arrayPage.Tryhere1();
	}

	@Given("user is in the python editor of Arrays Using List page")
	public void user_is_in_the_python_editor_of_arrays_using_list_page() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.ArrayUsingList();
		arrayPage.Tryhere1();
	}

	@When("user will  enter data in python editor  of Arrays Using List page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_of_arrays_using_list_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		
		 arrayPage.enterCode(sheetName,  row);
		arrayPage.clicksrunBtn();
	}

	@Then("user will get the expectedOutcome  of  Arrays Using List page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_arrays_using_list_page_from_sheet_and_row(String sheetName, Integer row) {
		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   }
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}

	 
	 @Given("user is back in the Arrays Using List page")
     public void user_is_back_in_the_arrays_using_list_page() {
		 //arrayPage.navigatetoarrayusinglistpage();
		 arrayPage.clickgetstartedBtn(); 
		 arrayPage.ArraysInPythonButton();
}
	
	
	@When("user clicks the Basic Operations in Lists button")
	public void user_clicks_the_basic_operations_in_lists_button() {
		arrayPage.BasicOperationInList();
	}

	@Then("user should be in the Basic Operations in Lists page")
	public void user_should_be_in_the_basic_operations_in_lists_page() {
		 //arrayPage.navigatetobasicoperationsinlistpage();
		 Assert.assertTrue(arrayPage.BasicOperationsInListsButtonisDisplayed(), " Basic Operations In Lists page is not displayed"); //assert
	}      

	@Given("user is in the Basic Operations in Lists page")
	public void user_is_in_the_basic_operations_in_lists_page() {
		//arrayPage.navigatetobasicoperationsinlistpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.BasicOperationInList();
	}

	@When("user clicks the Try here button of Basic Operations in Lists page")
	public void user_clicks_the_try_here_button_of_basic_operations_in_lists_page() {
		arrayPage.Tryhere2();
	}

	@Then("user should be in the Python editor of Basic Operations in Lists page")
	public void user_should_be_in_the_python_editor_of_basic_operations_in_lists_page() {
		//arrayPage.navigatetotryeditorpage();
		Assert.assertTrue(arrayPage.isTryEditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
	}

	@Given("user is in the python editor of Basic Operations in Lists page")
	public void user_is_in_the_python_editor_of_basic_operations_in_lists_page() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.BasicOperationInList();
		arrayPage.Tryhere2();
	}

	@When("user will  enter data in python editor Basic Operations in Lists page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_basic_operations_in_lists_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		
		 arrayPage.enterCode(sheetName,  row);
		arrayPage.clicksrunBtn();
	}

	@Then("user will get the expectedOutcome  of  Basic Operations in Lists page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_basic_operations_in_lists_page_from_sheet_and_row(String sheetName, Integer row) {
		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   	}
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
		
	}     

	
	@Given("user is back in the Basic Operations in Lists page")
    public void user_is_back_in_the_basic_operations_in_lists_page() {
		 //arrayPage.navigatetobasicoperationsinlistpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
}
	
	
	@When("user clicks the Applications of Array button")
	public void user_clicks_the_applications_of_array_button() {
	    arrayPage.ApplicationOfArray();
	}

	@Then("user should be in the Applications of Array page")
	public void user_should_be_in_the_applications_of_array_page() {
		//arrayPage.navigatetoapplicationofarraypage();
		Assert.assertTrue(arrayPage.ApplicationOfArrayButtonisDisplayed(), " Application Of Array page is not displayed"); //assert
	}

	@Given("user is in the Applications of Array page")
	public void user_is_in_the_applications_of_array_page() {
		//arrayPage.navigatetoapplicationofarraypage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.ApplicationOfArray();
	}

	@When("user clicks the Try here button of Applications of Array page")
	public void user_clicks_the_try_here_button_of_applications_of_array_page() {
		arrayPage.Tryhere3();
	}

	@Given("user is in the python editor of Applications of Array page")
	public void user_is_in_the_python_editor_of_applications_of_array_page() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.ApplicationOfArray();
		arrayPage.Tryhere3();
	}

	@When("user will  enter data in python editor  of Applications of Array page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_of_applications_of_array_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		
		 arrayPage.enterCode(sheetName,  row);
		arrayPage.clicksrunBtn();

	}

	@Then("user will get the expectedOutcome  of  Applications of Array page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_applications_of_array_page_from_sheet_and_row(String sheetName, Integer row) {
		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   	}
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}          // done till here3

	@Given("user is back in the Applications of Array page")
	public void user_is_back_in_the_applications_of_array_page() {
		//arrayPage.navigatetoapplicationofarraypage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.ApplicationOfArray();
	}

	@When("user clicks the Practice Questions button")
	public void user_clicks_the_practice_questions_button() {
		arrayPage.PracticeQuestions();
	}

	@Then("user should be in the Practice Questions page")
	public void user_should_be_in_the_practice_questions_page() {
	    //arrayPage.navigatetopracticequestionspage();
	    Assert.assertTrue(arrayPage.PracticeQuestionsPageisDisplayed(), " Practice Questions page is not displayed"); //assert
	}

	@Given("user is in the Practice Questions page")
	public void user_is_in_the_practice_questions_page() {
		//arrayPage.navigatetopracticequestionspage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.PracticeQuestions();
	}

	@When("user clicks on Search the Array button")
	public void user_clicks_on_search_the_array_button() {
	    arrayPage.SearchTheArray();
	}

	@Then("user is redirected to the python editor page")
	public void user_is_redirected_to_the_python_editor_page() {
		//arrayPage.navigatetotryeditorpage();
		Assert.assertTrue(arrayPage.isnavigatetopracticeqaeditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
		Assert.assertTrue(arrayPage.isSubmitButtonDisplayed(), "Submit button is not displayed");
	}

	@Given("user is in the python editor of Search the Array page")
	public void user_is_in_the_python_editor_of_search_the_array_page() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.PracticeQuestions();
		arrayPage.SearchTheArray();
		
	}
	
	@When("user will  enter data in python editor  of Search the Array page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_of_search_the_array_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		
	   arrayPage.enterPythonCode(sheetName, row);
		arrayPage.clicksrunBtn();
	}

	@Then("user will get the expectedOutcome  of  Search the Array page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_search_the_array_page_from_sheet_and_row(String sheetName, Integer row) {

		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   	}
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}     
	
	 
	 @Given("user is back in Practice Questions page")
     public void user_is_back_in_practice_questions_page() {
		 //arrayPage.navigatetopracticequestionspage();
		    arrayPage.clickgetstartedBtn();
			arrayPage.ArraysInPythonButton();
			arrayPage.PracticeQuestions();
}

	
	@When("user clicks the Max Consecutive Ones button")
	public void user_clicks_the_max_consecutive_ones_button() {
		arrayPage.MaxConsecutiveOnceButton();
	}

	@Then("user should be in the Python editor of Max Consecutive Ones page")
	public void user_should_be_in_the_python_editor_of_max_consecutive_ones_page() {
		//arrayPage.navigatetotryeditorpage();
		Assert.assertTrue(arrayPage.isnavigatetopracticeqaeditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
		Assert.assertTrue(arrayPage.isSubmitButtonDisplayed(), "Submit button is not displayed");
	}

	@Given("user is in the Python editor page of max Consecutive Ones")
	public void user_is_in_the_python_editor_page_of_max_consecutive_ones() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.PracticeQuestions();
		arrayPage.MaxConsecutiveOnceButton();
	}

	
@When("user will  enter data in python editor of Max Consecutive Ones page from Excel sheet {string} and {int} and clicks Run")
public void user_will_enter_data_in_python_editor_of_max_consecutive_ones_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		arrayPage.enterPythonCode(sheetName, row);
	    arrayPage.clicksrunBtn();
	}
	

@Then("user will get the expectedOutcome  of  Max Consecutive Ones page  from sheet {string} and row {int}")
public void user_will_get_the_expected_outcome_of_max_consecutive_ones_page_from_sheet_and_row(String sheetName, Integer row) {
	 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
	   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
	   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
	   	
	   	}
	   	
	   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
	       if (expectedOutcome.contains("SyntaxError"))
	           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
	       else
	           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}

	
	
	@Given("user back in the Practice Questions page")
    public void user_back_in_the_practice_questions_page() {
		//arrayPage.navigatetopracticequestionspage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.PracticeQuestions();
}

	
	@When("user clicks on the Find Numbers with Even Number of Digits")
	public void user_clicks_on_the_find_numbers_with_even_number_of_digits() {
		arrayPage.FindNumberWithEvenNumberOfDigits();
	}

	@Then("user is redirected to the python editor of Find Numbers with Even Number page")
	public void user_is_redirected_to_the_python_editor_of_find_numbers_with_even_number_page() {
		//arrayPage.navigatetotryeditorpage();
		Assert.assertTrue(arrayPage.isnavigatetopracticeqaeditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
		Assert.assertTrue(arrayPage.isSubmitButtonDisplayed(), "Submit button is not displayed");
	}

	@Given("user is in the Python editor page of Find Numbers with Even Number of Digits")
	public void user_is_in_the_python_editor_page_of_find_numbers_with_even_number_of_digits() {
		//arrayPage.navigatetotryeditorpage();
		arrayPage.clickgetstartedBtn();
		arrayPage.ArraysInPythonButton();
		arrayPage.PracticeQuestions();
		arrayPage.FindNumberWithEvenNumberOfDigits();
	}

	@When("user will  enter data in python editor Find Numbers With Even Number page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_find_numbers_with_even_number_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
		
		arrayPage.enterPythonCode(sheetName, row);
		arrayPage.clicksrunBtn();

	}

	@Then("user will get the expectedOutcome  of  Find Numbers With Even Number page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_find_numbers_with_even_number_page_from_sheet_and_row(String sheetName, Integer row) {
		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   	}
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}

	
	 @Given("user go back to the Practice Questions page")
     public void user_go_back_to_the_practice_questions_page() {
		 //arrayPage.navigatetopracticequestionspage();
		    arrayPage.clickgetstartedBtn();
			arrayPage.ArraysInPythonButton();
			arrayPage.PracticeQuestions();
}
	
	@When("user clicks the Squares of a Sorted Array")
	public void user_clicks_the_squares_of_a_sorted_array() {
		arrayPage.SquaresOfASortedArray();
	}

	@Then("user is redirected to the python editor of Squares of a Sorted Array page")
	public void user_is_redirected_to_the_python_editor_of_squares_of_a_sorted_array_page() {
		//arrayPage.navigatetotryeditorpage();
		Assert.assertTrue(arrayPage.isnavigatetopracticeqaeditorPageDisplayed(), "Try Editor page is not displayed");
		Assert.assertTrue(arrayPage.isRunButtonDisplayed(), "Run button is not displayed");
		Assert.assertTrue(arrayPage.isSubmitButtonDisplayed(), "Submit button is not displayed");
	}

	@Given("user is in the Python editor page of Squares of a Sorted Array")
	public void user_is_in_the_python_editor_page_of_squares_of_a_sorted_array() {
		//arrayPage.navigatetotryeditorpage();
		       arrayPage.clickgetstartedBtn();
	           arrayPage.ArraysInPythonButton();
			   arrayPage.PracticeQuestions();
			   arrayPage.SquaresOfASortedArray();
	}

	@When("user will  enter data in python editor Squares of a Sorted Array page from Excel sheet {string} and {int} and clicks Run")
	public void user_will_enter_data_in_python_editor_squares_of_a_sorted_array_page_from_excel_sheet_and_and_clicks_run(String sheetName, Integer row) {
				arrayPage.enterPythonCode(sheetName, row);
		        arrayPage.clicksrunBtn();

	}
	
	@Then("user will get the expectedOutcome  of  Squares of a Sorted Array page  from sheet {string} and row {int}")
	public void user_will_get_the_expected_outcome_of_squares_of_a_sorted_array_page_from_sheet_and_row(String sheetName, Integer row) {
		 String expectedOutcome = arrayPage.getExcelData(sheetName, row, 1);
		   	if (expectedOutcome ==null|| expectedOutcome.isEmpty()) {
		   		throw new IllegalArgumentException("Expected outcome fetched from Excel is empty or null.");
		   	
		   	}
		   	
		   	System.out.println("Expected Outcome fetched from Excel: " + expectedOutcome);
		       if (expectedOutcome.contains("SyntaxError"))
		           Assert.assertEquals(arrayPage.getPopupAlertText(), expectedOutcome);
		       else
		           Assert.assertEquals(arrayPage.getOutputTextFromTryEditorPage(), expectedOutcome);
	}



	
	
}