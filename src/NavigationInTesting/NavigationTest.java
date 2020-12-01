package NavigationInTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
	
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		//Firfox
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://google.com");
		
	
		driver.navigate().to("https://bbc.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://facebook.com");
		driver.navigate().refresh(); 
		
	}

	

}
