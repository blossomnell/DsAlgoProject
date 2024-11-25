package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

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
		registerPage.navigatetoregisterpage();
		assertTrue("Register page is not displayed", registerPage.isRegisterPageDisplayed());
		assertTrue("Username Field is not displayed", registerPage.isUsernameFieldDisplayed());
		assertTrue("Password1 Field is not displayed", registerPage.isPassword1FieldDisplayed());
		assertTrue("Password2 Field is not displayed", registerPage.isPassword2FieldDisplayed());
		assertTrue("Register Button is not displayed", registerPage.isRegisterButtonDisplayed());
	}

	@Given("the user is in the registration page")
	public void the_user_is_in_the_registration_page() {
		registerPage.navigatetohomepage();
		registerPage.register();
	}

	@When("the user enters {string}, {string}, {string} and clicks Register button")
	public void the_user_enters_and_clicks_register_button(String username, String password1, String password2) {
		
		if(!username.isBlank()) {
			username = username+ UUID.randomUUID();
		}
		
		registerPage.enterUsername(username);
		registerPage.enterPassword1(password1);
		registerPage.enterPassword2(password2);
		registerPage.clickregisterBtn();
	}

	@Then("the user gets a message {string}")
	public void the_user_gets_a_message(String expectedMessage) {
		assertTrue("registerMessage", registerPage.getAlertMessage().contains(expectedMessage));

	}

}
