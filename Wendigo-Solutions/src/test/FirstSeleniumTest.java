package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class FirstSeleniumTest {
	
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}
	
	public static void setBrowser() {
		browser = "Chrome";
	}
	
	public static void setBrowserConfig() {
		String project_location = System.getProperty("user.dir");
		if(browser.toLowerCase().contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", project_location + "/lib/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browser.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", project_location + "/lib/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
	}
	
	public static void runTest() {
		
		//driver.get("https://www.google.com/");
		driver.get("https://bongobd.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
