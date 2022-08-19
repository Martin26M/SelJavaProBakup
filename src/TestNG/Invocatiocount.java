package TestNG;

import org.testng.annotations.Test;

public class Invocatiocount {

	
	@Test(invocationCount=10)// Here total test run would be 10
	
	public void sum() {
		
		int a =10;
		int b=10;
		int c=a+b;
		
		System.out.println("Sum is >>>>>"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
