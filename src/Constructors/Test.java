package Constructors;

public class Test {
	static String Name;
	int Roll;
	
	
	/*public  void Test(String Name, int Roll) {// Calling the method Test
		
		String k=(this.Name= Name);
		int y= (this.Roll= Roll);
		System.out.println(k);
		System.out.println(y);
	}
	*/
	public  Test(String Name1, int Roll1) {//Constructor Test is being created 
		
		
		this.Name= Name1;// Assigning the global variables with the values using this keyword(Intstance variables Name & Roll are intialized)
		this.Roll= Roll1;
		// Assigning the global variables with the values using this keyword
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test("Mathew",200);// To call the constructor object is mandatory

		
		 System.out.println(Test.Name);// we are calling the  static variable hence test.variable name as staic can be called by classname.variable or method name
		 System.out.println(t.Roll);//  we are calling the non static variable hence t.variable name 
		 
		//t.Test("Martin", 100);// Method is being called here
	}

}


/*Types of Constructors
 * 1.Default- Created by JVM
 *2.User defined
 *
 * 
 * Contructors are created to intialize instance variables
 * Constructors must not contain return types.
 *Constructor chaining - Child constructor will call parent constructor (from which the class is extended)which inturn will call its parent and no super keyword is required
 *If the parent constructor is overloaded we can call the overloaded constructor with the superkeyword
 */

