package WebdriverCommands;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {
	
	public static void main(String[] args) {
		
		/* Conditional Commands= Return true or false
		 * 
		 * 1)idDisplayed();= element displayed on page or not
		 * 2)isEnabled();= varify text box we can check whether can we right or not
		 * 3)isSelected(); = for radio buttion , if return true then element selected
		
		 */
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement email=	driver.findElement(By.xpath("//*[@id=\"email\"]"));
	
	
	System.out.println(email.isDisplayed());
	
	System.out.println(email.isEnabled());
		
	WebElement pass=	driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	
	if(email.isDisplayed() && email.isEnabled()) {
		
	
		email.sendKeys("8308158556");
	}
	
	
	
	else {
		System.out.println("Not displayed");
	}
		
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("Aditya");
		}
		
		
		
		
		
		driver.close();
		
		
	}
	
	


}
