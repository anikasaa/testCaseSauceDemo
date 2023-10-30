package TestCaseSauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}

}
