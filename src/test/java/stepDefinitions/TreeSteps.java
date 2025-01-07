package stepDefinitions;


import static org.testng.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ExcelReader;
import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TreePage;
import webdriver.DriverFactory;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.TreePage;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Utilities.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.TreePage;

public class TreeSteps {
     
	
//	WebDriverWait wait;
//	Properties prop;
//	
	
    TreePage tree = new TreePage();
	HomePage homepage = new HomePage();;
//	WebDriver driver =DriverFactory.getDriver();
	

@Given("The user is on the home page after logged in")
public void the_user_is_on_the_home_page_after_logged_in() {
    tree.navigatetohomepage();
}

@When("The user selects Tree item from the drop down menu")
public void the_user_selects_tree_data_structure_from_drop_down_menu() {
	tree.clickdropdownmenu();

}

@Then("The user should be directed to the Tree Page")
public void the_user_should_be_navigated_to_tree_page() throws InterruptedException {
	tree.navigatetotreepage();
	Assert.assertTrue( tree.istreePageDisplayed(),"Tree page is not displayed");
 
}


@Given("The user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() throws InterruptedException {
	tree.navigatetotreepage();
}	

@When("The user clicks on the Overview of Trees link")
public void the_user_clicks_on_the_overview_of_trees_link() {
	tree.clickOnoverviewOfTreesPage();
	
}

@Then("The user should be directed to the {string}  Page")
public void the_user_should_be_directed_to_the_page(String string) throws InterruptedException {

	Assert.assertTrue( tree.isOverviewoftreePageDisplayed(),"Overview of Tree page is not displayed");
}
@Given("The user is on the Overview of trees page after logged in")
public void the_user_is_on_the_overview_of_trees_page_after_logged_in() throws InterruptedException {
    
	
	tree.navigatetotreepage();
	tree.clickOnoverviewOfTreesPage();
//	tree.navigatetoOVoftreepage();
	
	}
@When("The user clicks {string} button in a {string} page")
public void the_user_clicks_button_in_a_page(String string, String string2) {
    tree.tryhere(); 
    }

@Then("The user should be redirected to a page having tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
Assert.assertTrue(tree.tryeditorpageisDisplayed(),"Try editor page is not displayed"); 
}
@Given("The user is in a page having an Editor with a Run button to test")
public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() throws InterruptedException {
	tree.navigatetotreepage();
	tree.clickOnoverviewOfTreesPage();
	tree.tryhere(); 
}
@When("The user clicks on the Terminologies button")
public void the_user_clicks_on_the_terminologies_button() {
	tree.clickOnTerminaLink();
}

@Then("The user should be directed to the {string} of tree Page")
public void the_user_should_be_directed_to_the_of_tree_page(String string) {
	Assert.assertTrue( tree.isterminologiesPageDisplayed(),"Terminologies page is not displayed");
}

@Given("The user is on the terminologies page after logged in")
public void the_user_is_on_the_terminologies_page_after_logged_in() throws InterruptedException {
	tree.navigatetotreepage();
	tree.clickOnTerminaLink();
}



@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	Assert.assertTrue(tree.tryeditorpageisDisplayed(),"Try editor page is not displayed"); 
}



@When("The user clicks on the Types of Trees button")
public void the_user_clicks_on_the_types_of_trees_button() {
	tree.clickOnTypesOfTreesPage();
}



@Given("The user is on the types of trees after logged in")
public void the_user_is_on_the_types_of_trees_after_logged_in() throws InterruptedException {
	tree.navigatetotreepage();
	tree.clickOnTypesOfTreesPage();
}

@When("The user clicks on the Tree Traversals button")
public void the_user_clicks_on_the_tree_traversals_button() {
	tree.clickOnTreeTraversalsLink();  

}

@When("The user clicks on the Traversal illustration button")
public void the_user_clicks_on_the_traversal_illustration_button() {
	tree.clickOnTrav_illus_Link();  
}

@When("The user clicks on the binary trees button")
public void the_user_clicks_on_the_binary_trees_button() {
	tree.clickOnBinaryTreesLink(); 
}

@When("The user clicks on the types of binary trees button")
public void the_user_clicks_on_the_types_of_binary_trees_button() {
	tree.clickOnTypesOfBTLink();   
}

@When("The user clicks on the Implementation in Python button")
public void the_user_clicks_on_the_implementation_in_python_button() {
	tree.click_implementationinPython();   
}

@When("The user clicks on the binary tree traversals button")
public void the_user_clicks_on_the_binary_tree_traversals_button() {
	tree.click_binaryTreeTraversals();  
}

@When("The user clicks on the Implementation of Binary Trees button")
public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
	tree.click_implementationOfBinaryTrees(); 
}

@When("The user clicks on the Applications of Binary Trees button")
public void the_user_clicks_on_the_applications_of_binary_trees_button() {
	tree.click_applicationsOfBinaryTrees(); 
}

@Given("The user is on the Binary Search Trees after logged in")
public void the_user_is_on_the_binary_search_trees_after_logged_in() throws InterruptedException {
	tree.navigatetotreepage();
	tree.clickonbinarysearchtreeslink();
}
@When("The user clicks on the Implementation of BST button")
public void the_user_clicks_on_the_implementation_of_bst_button() {
	tree.click_implementationOfBST();
}
    


@When("The user clicks on the Practice Questions in Overview of Trees")
public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
    tree.click_practiceQuestion();
   
}

@Then("The user should be directed to Practice Questions of tree page Page")
public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
	
}


}