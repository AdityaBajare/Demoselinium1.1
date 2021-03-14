package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class HeadlessFirefox 




 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		FirefoxOptions option= new FirefoxOptions();
		
		option.setHeadless(true);
		
		WebDriver driver= new FirefoxDriver(option); // not launch browser
		
		
		driver.get("http://demo.nopcommerce.com/"); // running browser in background
		
		System.out.println("Title of page " +driver.getTitle());
		
		System.out.println("current url of the page "+driver.getCurrentUrl());
		
		System.out.println("page source " +driver.getPageSource());
		
          System.out.println(driver.getWindowHandle());
		

		
		driver.close();
	}
	
}

