package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Files\\chromedriver.exe");
		
		
		ChromeOptions options= new ChromeOptions(); // for headless browser
		
		//options.setHeadless(true);
		
		options.addArguments("--headless");
		
		WebDriver driver= new ChromeDriver(options); // not launch browser
		
		
		driver.get("http://demo.nopcommerce.com/"); // running browser in background
		
		String title= driver.getTitle();
		
		System.out.println(" " +title);
		

		

		
		driver.close();
	}
	
}
