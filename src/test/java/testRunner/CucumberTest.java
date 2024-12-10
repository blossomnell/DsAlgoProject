package testRunner;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
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
        tags="@wip"
)
public class CucumberTest extends AbstractTestNGCucumberTests {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    @Parameters({"browser", "headless"})
    public void setUp(String browser, String headless) {
        boolean isHeadless = Boolean.parseBoolean(headless); // Convert string to boolean
        System.out.println("Initializing WebDriver for browser: " + browser + ", headless: " + isHeadless);
        driver.set(DriverFactory.getDriver(browser, isHeadless));
    
    }

    @AfterClass
    public void tearDown() {
        if (driver.get() != null) {
            System.out.println("Quitting WebDriver for thread: " + Thread.currentThread().getName());
            driver.get().quit();
            driver.remove();
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Parameters;
//import webdriver.DriverFactory;
//
//@CucumberOptions(
//        features = "src/test/resources/features", // Path to feature files
//        glue = { "stepDefinitions", "appHooks" }, // Package for step definitions and hooks
//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports.html",
//                "json:target/cucumber.json",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//                
//        },
//        tags="@wip"
//)
//public class CucumberTest extends AbstractTestNGCucumberTests {
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//    @BeforeClass
//    @Parameters("browser")
//    public void setUp(@Optional("chrome") String browser) { // Default to Chrome if not specified
//        driver.set(DriverFactory.getDriver(browser));
//    }
//
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//}
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import webdriver.DriverFactory;
//
//@CucumberOptions(
//        features = "src/test/resources/features", // Path to feature files
//        glue = { "stepDefinitions", "appHooks" }, // Package for step definitions and hooks
//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports.html",
//                "json:target/cucumber.json",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
//        }
//)
//public class CucumberTest extends AbstractTestNGCucumberTests {
//    private static WebDriver driver;
//
//    @BeforeClass
//    @Parameters("browser")
//    public void setUp(String browser) {
//        driver = DriverFactory.getDriver(browser); // Initialize driver based on the browser parameter
//    }
//
//    public static WebDriver getDriver() {
//        return driver; // Provide WebDriver instance for step definitions
//    }
//}

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
//   @DataProvider(parallel = false) 
//    public Object[][] scenarios() {
//       return super.scenarios();
//    }
//}
//
// 