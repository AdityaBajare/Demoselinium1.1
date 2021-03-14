package POPupWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.close();
		
	}

}
