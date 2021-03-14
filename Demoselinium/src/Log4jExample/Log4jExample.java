package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.DOMConfiguration;

public class Log4jExample {
	public static void main(String[] args) {
		
		Logger logger= Logger.getLogger("Log4jExample");
		DOMConfigurator.configure("log4j.xml");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
	    
    	WebDriver driver = new FirefoxDriver(); // invoke the browser
		
		logger.info("Browser opened");
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		logger.info("Click on register");
		
		logger.info("Clossing the browser");
		driver.close();
		
	}

}
