package Polymorphism;

public class OverridingSBI extends OverridingRbi {
	
	/*
	 * public double HomeLoan() {
	 * 
	 * return 10; }
	 */
		
	
	
	
public double  CarLoan( )
   {
		
		
		return 12.5;
		}
 	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingSBI obj= new OverridingSBI();
		System.out.println(obj.CarLoan());// Here Carloan  is called from child  class OverridingSBI by using Polymorphism overriding
		System.out.println(obj.HomeLoan());// Here homeloan is called from Parent class OverridingRbi by using Inheritance
		
		
	}
// If the returm types are covariant i.e we return a class  instead of the primitive dataype then we should be able to change the returm type in overriding the methods.
	// *********************Go to the lecture overriding from RahulAroroa for revision
}
