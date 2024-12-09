package appHooks;

import java.util.Properties;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
import webdriver.DriverFactory;

public class Hooks {

	private configReader ConfigReader;
	private Properties prop;
	

	@Before(order = 0)
	public void getProperty() {
		ConfigReader = new configReader();
		prop = ConfigReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		  
	}

	@After(order = 0)
	public void quitBrowser() {
		DriverFactory.quitDriver();

	}
//	
//	@After(order=1)
//	public void tearDown(Scenario scenario) {
//		if(scenario.isFailed()) {
//			String screenshotName = scenario.getName().replaceAll(null, null);
//			byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcepath, "image/png", screenshotName);
//			
//		}
//		
//	}
}
