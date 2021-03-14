package WebdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethods {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demout.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("http://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.close();

		
	}
	

}
