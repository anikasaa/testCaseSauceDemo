package TestCaseSauceDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility extends Base {

	private WebDriver driver;

	// finding elements

	By unLocator = By.id("user-name");
	By pwLocator = By.id("password");
	By loginLocator = By.id("login-button");
	By errorstate = By.tagName("h3");
	By inventoryObj = By.id("item_4_img_link");

	public Utility(WebDriver driver) {
		this.driver = driver;
	}

	// creating method for username
	public void unLocator(String un) {
		driver.findElement(unLocator).sendKeys(un);
	}

	// creating method for password
	public void pwLocator(String pw) {
		driver.findElement(pwLocator).sendKeys(pw);
	}

	// creating method for login
	public void loginLocator() {
		driver.findElement(loginLocator).click();
	}

	public void login(String un, String pw) {
		unLocator(un);
		pwLocator(pw);
		loginLocator();

	}

	public void inventoryObj1() {

	}

	public boolean errorstate() {
		return driver.findElement(errorstate).isDisplayed();
	}

	public void loginwithoutPassword(String un) {
		unLocator(un);
		loginLocator();
	}

	public void loginwithoutUsername(String pw) {
		pwLocator(pw);
		loginLocator();
	}

	public void logincredentials() {
		unLocator("standard_user");
		pwLocator("secret_sauce");
		loginLocator();
	}

	public void captureScreenshot(String testName) {
		System.out.println(driver);
		if (driver != null) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = ".//screenshot//" + testName + ".png";
			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
