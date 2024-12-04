package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", //
		glue = { "stepDefinitions", "appHooks" }, //
		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", },
		tags = "@tag"
		
)
public class CucumberTest extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false) 
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

 