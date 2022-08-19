package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
	 * Sequence of execution
	 * @BeforeSuite
       @BeforeTest
       @BeforeClass
        @BeforeMethod
        @Test
         @AfterMethod
     @AfterClass
    @AfterTest
    AfterSuite
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@BeforeSuite
	
	
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	
	@BeforeTest
	public void test() {
		System.out.println("Before Test");
		}
		
	@BeforeClass
	
	public void classtest() {
		
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	
	
public void beforemethod() {
		
		System.out.println("Before method");
	}
	
	@Test
	
public void Test1() {
		
		System.out.println("Test1");
	}
	
	@Test
	
public void Test2() {
		
		System.out.println("Test2");
	}
	
	
	

	@AfterMethod
	
	
public void aftermethod() {
		
		System.out.println("aftermethod");
	}
	
	
	@AfterClass
	
public void afterclass() {
		
		System.out.println("afterclass");
	}
	
	@AfterTest
	
public void aftertest() {
		
		System.out.println("aftertest");
	}
	
	
	@AfterSuite
	
public void aftersuite() {
		
		System.out.println("aftersuite");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	
}
