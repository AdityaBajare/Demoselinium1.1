package PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	@Test
	public void Verifyreg() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Registration r=new Registration(driver);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		r.clickRegLink();
		r.FirstName("Aditya");
		r.LastName("Patil");
		r.Phoneno("8308158556");
		r.Emailid("adi@gmail.com");
		r.Address("Karla");
		r.City("Akola");
		r.State("Maharashtra");
		r.Country("INDIA");
		r.UserName("Aaditya");
		r.Password("adi@12345");
		r.Submit();
		
		driver.close();
		
		
		
		
	}
	

}
