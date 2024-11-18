package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", //
		glue = { "stepDefinitions", "appHooks" }, //
		plugin = { "pretty", "html:target/cucumber-reports.html" }, //
		dryRun = false, //
		tags = "@wip"//

)

public class CucumberTest {

}