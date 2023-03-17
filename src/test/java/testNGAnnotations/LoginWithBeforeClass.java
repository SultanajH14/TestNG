package testNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginWithBeforeClass {
	// Suitable for BDD/end to end test
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Hello welcome to suites");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Thank you for testing suites");
	}
	
	@BeforeClass
	public void openApp() {
		System.out.println("open app");
	}

	@Test
	public void m1() {
		System.out.println("m1");

	}

	@Test
	public void m2() {
		System.out.println("m2");
	}

	@Test
	public void m3() {
		System.out.println("m3");

	}

	@AfterClass
	public void closeApp() {
		System.out.println("close app");
	}

}
