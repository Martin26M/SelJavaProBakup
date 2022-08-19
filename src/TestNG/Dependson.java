package TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependson {

	
  @BeforeMethod
	
	public void beforemthod() {
		
		
		
	}
	
	@Test(timeOut=400)// Giving additional 400 4 seconds to this block we use timeOut annotation
	
    public void Test1() {
		
		System.out.println("Test1");
		int i =9/0;// Since we have given depends on for Test2 & 3 below if Test 1 fails other tests would be skipped.
		Assert.assertEquals(i, 10);
	}
	
	
	@Test(dependsOnMethods="Test1")
	
    public void Test2() {
		
		System.out.println("Test2");
		
	}
	
	
	@Test(dependsOnMethods="Test1",enabled=false)// Enabled = false means this test would be omitted while running in TestNG 
	
    public void Test3() {
		
		System.out.println("Test3");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
