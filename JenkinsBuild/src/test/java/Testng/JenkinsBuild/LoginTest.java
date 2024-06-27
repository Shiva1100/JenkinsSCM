package Testng.JenkinsBuild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@Test (priority = 1)
	public void oneMethod() {
		
		driver = new ChromeDriver();
		System.out.println("Launching browser successfully");
	}
	@Test (priority = 2,timeOut = 3000)
	public void testTwoMethod() throws InterruptedException {
//		Thread.sleep(5000);
		driver.get("https://www.google.com");
		System.out.println("Entered URL successfully");
	}
	
	@Test (priority = 3)
	public void threeMethod() {
		System.out.println("Locate login page and enter data");
	}
	
	@Test (priority = 4)
	public void singInMethod() {
		System.out.println("Click on signIn and It is successful");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		System.out.println("closed the browser successfully");
	}

}
