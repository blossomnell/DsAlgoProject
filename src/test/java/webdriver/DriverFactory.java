package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	private static WebDriver driver;
	// Private constructor to prevent instantiation
	private DriverFactory() {
	}
	public static WebDriver getDriver() {
		if (driver == null) {

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--start-maximized"); 
			driver = new ChromeDriver(options);
			
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Ensure the driver is set to null after quitting
		}
	}
}
