package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Prioritygrouping {
	@BeforeMethod
	
	public void beforemthod() {
		
		
		
	}
	
	@Test(priority=1, groups="Test1")
	
    public void Test1() {
		
		System.out.println("Test1");
		
	}
	
	
	@Test(priority=3,groups="Test2")
	
    public void Test2() {
		
		System.out.println("Test2");
		
	}
	
	
	@Test(priority=2,groups="Test2")
	
    public void Test3() {
		
		System.out.println("Test3");
		
	}
	
	
	
	/*
	 * Output - Based on priority , if priority is not there it wud be called first on the basis of alphabets , 
	 * 
	 * Grouping the test cases will give the output in groups when we check in index.html
	 * 
	 * [RemoteTestNG] detected TestNG version 6.14.3
Test1
Test3
Test2
PASSED: Test1
PASSED: Test3
PASSED: Test2
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

}
