package POPupWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertspopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).submit();
		
	
		
		//switching to alert box
		
		Alert alert=driver.switchTo().alert(); // to work with alert
		
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}

}
