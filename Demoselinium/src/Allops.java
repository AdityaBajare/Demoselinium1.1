import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Allops {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.jotform.com/build/210273945440452");
		
		driver.findElement(By.id("first_3")).sendKeys("Aditya");
		
		driver.findElement(By.name("q3_name[last]")).sendKeys("Patil");
		
		Select selectdate=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_month\"]")));
	
	List<WebElement> s= selectdate.getOptions();
	
	for(WebElement e:s) {
		
		System.out.println(e.getText());
		
	}
	
	selectdate.selectByVisibleText("March");
	
	Select selectd=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_day\"]")));
	
	List<WebElement> l=selectd.getOptions(); //extract the values from dropdow list
	for(WebElement e1:l) {
		System.out.println(e1.getText());
	}
	
	selectd.selectByVisibleText("3");
	
	
	
	
	
	
	
		driver.close();
		
		//https://www.facebook.com/
	}
	
	

}
