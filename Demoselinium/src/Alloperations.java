import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloperations {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.jotform.com/build/210273945440452");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"first_3\"]")).sendKeys("Aditya");
		
		driver.findElement(By.xpath("//*[@id=\"last_3\"]")).sendKeys("Patil");
		
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_month\"]")));
		month.selectByVisibleText("March");
		
		Select date=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_day\"]")));
		date.selectByIndex(3);
		
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"input_4_year\"]")));
		year.selectByVisibleText("1996");
	
		Select ddown=new Select(driver.findElement(By.xpath("//*[@id=\"input_5\"]")));
		ddown.selectByVisibleText("Bass");
		
		List<WebElement> result= ddown.getOptions(); //extract all the operations in a dropdown
		
		
		
		System.out.println("size is "+result.size());
		List print=new ArrayList<>();
		
		for(WebElement e:result) {
			print.add(e.getText());
			
			
		}
		
		System.out.println("All options are "+print);
		
		driver.findElement(By.xpath("//*[@id=\"input_6_0\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input_6_1\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"input_7_pick\"]")).click();
		
		System.out.println("clicked");
		
String m=driver.findElement(By.xpath("/html/body/div/table/thead/tr[1]/td")).getText();
		
		System.out.println(m);
		
		if(m.equals("January 2021")) {
			driver.findElement(By.linkText("14")).click(); 
		}
		
		
		// future year
		
	/*	for(int i=6;i>=1;i--) {

		
		String m=driver.findElement(By.xpath("/html/body/div/table/thead/tr[1]/td")).getText();
		
		System.out.println(m);
		
		if(m.equals("January 2021")) {
			driver.findElement(By.linkText("14")).click(); 
		}
		
		}*/
		
		
		driver.findElement(By.xpath("//*[@id=\"input_8\"]")).sendKeys("Its very good idea ");
		
		
	//driver.close();
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"input_8\"]")).click();
		
		

		
		
	}
	
	//https://www.jotform.com/build/210273945440452

}
