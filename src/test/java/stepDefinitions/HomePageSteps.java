package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;


public class HomePageSteps {
	
	HomePage home = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerpage = new RegisterPage();
	configReader reader = new configReader();
	 
	HomePage msg;
	String login_url;
	String registerurl;
//	String registerurl= configReader.getLoginPageUrl();
//	 String loginurl = configReader.getRegisterPageUrl();
	 

	
	 
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link()  {
		home.dsalgopage();
		
	}
	
	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		home.getStarted();
	}


	
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homePage() throws InterruptedException {

		String title = home.getPageTitle();
		
		assertEquals(title,"NumpyNinja","Do not match");
		

	}
	
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		home.homePg();
		    
	}
	
	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String option) {
//		home.homePg();
		home.dropdown(option);
		
	}

	
	@Then("The user get warning message {string}")
	  public void the_user_get_warning_message(String message){
	//   String msg= home.alertmsg();
	//   assertEquals(msg, string, "Title do not match");
	   assertEquals(home.alertmsg(),message);
	   
	}
	
	@When("The user clicks on Get Started link on homepage without login {string}")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
		home.getStartedForModule(option);
	}

 

@When("The user clicks on signin link")
public void the_user_clicks_on_signin_link() {
    home.click_login();
    
}

@Then("The user redirected to login page")
public void the_user_redirected_to_login_page() {

	   Assert.assertTrue(home.isloginbuttonpresent());
}


@When("The user clicks on register link")
public void the_user_clicks_on_register_link() throws InterruptedException {
	Thread.sleep(1000);
home.click_register();

}

@Then("The user redirected to Registration page")
public void the_user_redirected_to_registration_page() {
Assert.assertTrue(home.isRegistrationPagedisplayed());



}

}