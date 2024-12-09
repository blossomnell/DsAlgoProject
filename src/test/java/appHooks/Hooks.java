package appHooks;

import java.util.Properties;

import Utilities.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.DriverFactory;

public class Hooks {

	private configReader ConfigReader;
	Properties prop;

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
	
	

}
