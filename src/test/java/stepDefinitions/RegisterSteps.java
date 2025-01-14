package stepDefinitions;

import java.util.UUID;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
	
	@Given("the user is in homepage")
	public void the_user_is_in_homepage() {
		registerPage.navigatetohomepage();
	}
 
	@When("the user clicks the Register")
	public void the_user_clicks_the_Register() {
		registerPage.register();
	}

	@Then("the user is redirected to the register page")
	public void the_user_is_redirected_to_the_register_page() {
		//registerPage.navigatetoregisterpage();
		Assert.assertTrue(registerPage.isRegisterPageDisplayed(), "Register page is not displayed");
		Assert.assertTrue(registerPage.isUsernameFieldDisplayed(), "Username Field is not displayed");
		Assert.assertTrue(registerPage.isPassword1FieldDisplayed(), "Password1 Field is not displayed");
		Assert.assertTrue(registerPage.isPassword2FieldDisplayed(), "Password2 Field is not displayed");
		Assert.assertTrue(registerPage.isRegisterButtonDisplayed(), "Register Button is not displayed");
	}

	@Given("the user is in the registration page")
	public void the_user_is_in_the_registration_page() {
		registerPage.navigatetohomepage();
		registerPage.register();
	}

	@When("the user enters data from the sheet {string} and row {int}")
	public void the_user_enters_data_from_the_sheet_and_row(String sheetName, int row) {
			
		 String username = registerPage.getCellData(sheetName, row, 0);
	     String password1 = registerPage.getCellData(sheetName, row, 1);
	     String password2 = registerPage.getCellData(sheetName, row, 2);
	    
	    System.out.println("Username: " + (username.isBlank() ? "EMPTY" : username));
	    System.out.println("Password1: " + (password1.isBlank() ? "EMPTY" : password1));
	    System.out.println("Password2: " + (password2.isBlank() ? "EMPTY" : password2));

	    if (!username.isBlank()) {
	        username = username + UUID.randomUUID();
	    }

	    if (!username.isBlank()) {
	        registerPage.enterUsername(username);
	    }
	    if (!password1.isBlank()) {
	        registerPage.enterPassword1(password1);
	    }
	    if (!password2.isBlank()) {
	        registerPage.enterPassword2(password2);
	    }
	    
	    registerPage.clickregisterBtn();
	}

	@Then("the user gets a message {string}")
	public void the_user_gets_a_message(String expectedMessage) {
	    String actualMessage = registerPage.getAlertMessage();
	    System.out.println("Expected: " + expectedMessage);
	    System.out.println("Actual: " + actualMessage);

	    Assert.assertTrue(actualMessage.contains(expectedMessage),
	            "Expected message: '" + expectedMessage + "', but got: '" + actualMessage + "'.");
	}

}