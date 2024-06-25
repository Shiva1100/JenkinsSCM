package Testng.JenkinsBuild;

import org.testng.annotations.Test;

public class MainClass {
	@Test(priority = 1)
	public void oneMethod() {
		System.out.println("Launching browser");
	}
	@Test(priority = 2)
	public void twoMethod() {
		System.out.println("Enter URL");
	}
	
	@Test(priority = 3)
	public void threeMethod() {
		System.out.println("Locate login page and enter data");
	}
	
	@Test(priority = 4)
	public void singInMethod() {
		System.out.println("Click on signIn and It is successful");
	}

}