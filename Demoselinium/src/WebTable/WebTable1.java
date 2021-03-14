package WebTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.jotform.com/build/210251691155449");
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s) {
			
			System.out.println("id is " +i);
			
			
			
		}
		
	
	Select date= new Select(driver.findElement(By.xpath("//*[@id=\"input_4_month\"]")));
	
	date.selectByIndex(3);
	
	Select day= new Select(driver.findElement(By.xpath("//*[@id=\"input_4_day\"]")));
	
	day.selectByIndex(3);
	
	Select year=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_year\"]")));
	
	
	
	
	year.selectByVisibleText("1996");
	
	List olist=new ArrayList() ;
	
	List tlist=new ArrayList() ;
	
	List<WebElement> op=year.getOptions();
	
	for(WebElement e:op) {
		
		olist.add(e.getText());
		tlist.add(e.getText());
		
	}
	
	

	
	
	
	
	Collections.sort(tlist);
	

	
	if(tlist ==olist) {
		System.out.println("list sorted");
	}
	else {
		System.out.println("not sorted");
	}
	
	String a=driver.switchTo().window("20").getTitle();
	System.out.println(a);
	
	driver.close();
	
	
	}

}
