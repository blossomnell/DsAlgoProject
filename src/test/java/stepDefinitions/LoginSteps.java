package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	@Given("the user is in the homepage")
	public void the_user_is_in_the_homepage() {
		loginPage.navigatetohomepage();
	}

	@When("the user clicks the signin button")
	public void the_user_clicks_the_signin_button() {
		loginPage.signin();
	}

	@Then("the user is redirected to the login page")
	public void the_user_is_redirected_to_the_login_page() {
		loginPage.navigatetologinpage();
		// assert needs to be used
		assertTrue("Login page is not displayed", loginPage.isLoginPageDisplayed());
		assertTrue("Username Field is not displayed", loginPage.isUsernameFieldDisplayed());
		assertTrue("Password Fiels is not displayed", loginPage.isPasswordFieldDisplayed());
		assertTrue("Login Button is not displayed", loginPage.isLoginButtonDisplayed());
	}

	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() {
		loginPage.navigatetohomepage();
		loginPage.signin();
	}

	@When("the user enters {string} and  {string} and clicks login button")
	public void the_user_enters_and_and_clicks_login_button(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickloginBtn();
	}

	@Then("the user gets login message {string}")
	public void the_user_gets_login_message(String expectedMessage) {
		assertEquals("loginMessage", expectedMessage, loginPage.getAlertMessage());
	}

}