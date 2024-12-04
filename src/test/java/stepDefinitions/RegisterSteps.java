package stepDefinitions;

//import static org.testng.Assert.assertTrue;

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
		registerPage.navigatetoregisterpage();
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
		Assert.assertTrue(registerPage.getAlertMessage().contains(expectedMessage), "registerMessage");

	}

}
