package stepDefinitions;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.Assert;
import Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	
	ExcelReader excelReader;
    public LoginSteps() {
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/config/TestData.xlsx";
            excelReader = new ExcelReader(filePath);
                      
        } catch (IOException e) {
            throw new RuntimeException("Failed to load TestData.xlsx file: " + e.getMessage(), e);
        }
    }
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
	
		Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not displayed");
		Assert.assertTrue(loginPage.isUsernameFieldDisplayed(), "Username Field is not displayed");
		Assert.assertTrue(loginPage.isPasswordFieldDisplayed(), "Password Fiels is not displayed");
		Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login Button is not displayed");
	}

	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() {
		loginPage.navigatetohomepage();
		loginPage.signin();
	}
		
	@When("the user enters the data from sheet {string} and row {int}")
	public void the_user_enters_the_data_from_sheet_and_row(String sheetName, int row) {
		
        String username = excelReader.getCellData(sheetName, row, 0);
        String password = excelReader.getCellData(sheetName, row, 1);
        
        System.out.println("Username: " + username + ", Password: " + password);
        
        if (username != null && !username.isEmpty()) {
            loginPage.enterUsername(username);
        }
        if (password != null && !password.isEmpty()) {
            loginPage.enterPassword(password);
        }
       
        loginPage.clickloginBtn();
	}

	@Then("the user gets login message {string}")
	public void the_user_gets_login_message(String expectedMessage) {
		assertEquals(loginPage.getAlertMessage(),expectedMessage, "loginMessage");
	}
	
    @Given("the user is logged in")
	public void the_user_is_logged_in() {
		loginPage.navigatetologinpage();
		loginPage.enterUsername("Ninjasquad");
		loginPage.enterPassword("abss@123");
		loginPage.clickloginBtn();
	}

	@When("the user clicks on Sign out button")
	public void the_user_clicks_on_Sign_out_button() {
		Assert.assertTrue(loginPage.isSignOutButtonDisplayed(), "Sign out Button is not displayed");
		loginPage.clickSignOutBtn();
	}

	@Then("the user gets message {string}")
	public void the_user_gets_message(String expectedMessage) {
		Assert.assertTrue(loginPage.isLoggedOutMessageDisplayed(expectedMessage), "logged out message is not displayed");

	}
}

