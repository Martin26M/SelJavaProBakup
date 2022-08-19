package Selenium;

import org.testng.asserts.SoftAssert;

public class SoftHardAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftAssert asser = new SoftAssert();
		asser.assertEquals(true, false);
		asser.assertAll();
		System.out.println("Continued");

	}

}
