//package testRunner;

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/features", //
//		glue = { "stepDefinitions", "appHooks" }, //
//		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", }, 
//		dryRun = false, //
//		tags = "@tag"//
//
//)
//
//public class CucumberTest {
//
//}
// 
package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/features/login.feature", // Path to feature files
    glue = {"stepDefinitions","appHooks"},                      // Step definition packages
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
    //            // Add plugin for reporting
     monochrome = true// Makes console output readable
   )
public class CucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) // Set parallel execution to false
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
