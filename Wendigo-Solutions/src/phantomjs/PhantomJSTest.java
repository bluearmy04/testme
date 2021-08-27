package phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String project_location = System.getProperty("user.dir");
		
		System.setProperty("phantomjs.binary.path", project_location + "/lib/phantomjs/phantomjs");
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();	
	}

}
