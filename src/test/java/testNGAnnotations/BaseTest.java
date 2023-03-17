package testNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	//Suitable for TDD/functional test
	@BeforeMethod
	public void openApp() {
		System.out.println("open app");
	}
	
	@Test
	public void m1() {
		System.out.println("m1");
		m2();
		
	}
	
public void m2() {
	System.out.println("m2");		
	}




@Test
public void m3() {
	System.out.println("m3");

	
}
@AfterMethod
public void closeApp() {
	System.out.println("close app");
}
}
