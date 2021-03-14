package Downloadsfile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadsfile {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		
		
		//creating browser profile firefox profile when occur popup message not occur using firefoxprofile
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "application/zip");// set mime type
		
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		
		WebDriver driver=new FirefoxDriver(option);
		driver.get("http://demo.guru99.com/test/yahoo.html");
		
		driver.findElement(By.id("messenger-download")).click();
		
		
		
		System.out.println("downloded");
		
		//driver.close();
		
	}
	

}
