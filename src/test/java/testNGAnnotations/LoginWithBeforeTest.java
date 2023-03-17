package testNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithBeforeTest {
	// Suitable for BDD/end to end test
	@BeforeTest
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

	@AfterTest
	public void closeApp() {
		System.out.println("close app");
	}

}
