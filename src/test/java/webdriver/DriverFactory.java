package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	// Private constructor to prevent instantiation
	
	private DriverFactory() {
	}
	public static WebDriver getDriver(String browser) {
		if (driver == null) {
//			String driverPath = "driver/chromedriver.exe";
//			System.out.println(driverPath);
//			System.setProperty("webdriver.chrome.driver", driverPath);
			
			if(browser.equals("chrome")) {
				ChromeOptions chromeoptions = new ChromeOptions();
				//WebDriverManager.chromedriver().setup();
				chromeoptions.addArguments("--start-maximized"); // Optional: Start maximized for better visibility
				driver=new ChromeDriver(chromeoptions);
			}
			else if(browser.equals("firefox")) 
			{
				WebDriverManager.firefoxdriver().setup();
				// FirefoxOptions firefoxOptions = new FirefoxOptions();
				driver=new FirefoxDriver();
		    } 
			
			
            	 
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver!= null) {
			driver.quit();
			
			driver = null; // Ensure the driver is set to null after quitting
		}
	}
}
