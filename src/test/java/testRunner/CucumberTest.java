package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import webdriver.DriverFactory;

@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = { "stepDefinitions", "appHooks" }, // Package for step definitions and hooks
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@wip"
)
public class CucumberTest extends AbstractTestNGCucumberTests {
    private static WebDriver driver;

    // Initialize the WebDriver before running tests
    @BeforeClass
    @Parameters("browser")
    public static void setUp(String browser) {
        driver = DriverFactory.getDriver(browser);
    }
    // Quit the WebDriver after running tests
    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver; // Provide WebDriver instance for step definitions
    }
}

//import org.testng.annotations.DataProvider;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//
//@CucumberOptions(features = "src/test/resources/features", //
//		glue = { "stepDefinitions", "appHooks" }, //
//		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", },
//		tags = "@wip"
//		
//)
//public class CucumberTest extends AbstractTestNGCucumberTests {
//	@Override 
//    @DataProvider(parallel = false) 
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//}

 