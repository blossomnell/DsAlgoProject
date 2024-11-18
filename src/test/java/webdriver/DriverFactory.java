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
//			String driverPath = "driver/chromedriver.exe";
//			System.out.println(driverPath);
//			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--start-maximized"); // Optional: Start maximized for better visibility
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
