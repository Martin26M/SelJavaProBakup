package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssert {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	
	public void trying () {
		
		
		System.out.println("Hello");
		Assert.assertTrue(true);
		softassert.assertTrue(true);
		softassert.assertAll();
	}

}
