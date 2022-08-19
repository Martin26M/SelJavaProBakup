package Sttatic;

public class Staticinstancevariables3 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Staticinstancevariables2 obj1 = new Staticinstancevariables2();
		
		System.out.println(obj1.i++);// Here the instance variable is called 
		System.out.println(obj1.j++);// Here static variable is called
		
		Staticinstancevariables2 obj2 = new Staticinstancevariables2();
		
		System.out.println(obj2.i++);// Here the instance variable is called >>>> Here the value of i is restored back to 10 as this is a new object and its an instance variable
		System.out.println(obj2.j++);// Here static variable is called>>>>>> Here value of j increased as its a static variable and belongs to the class and hence the value remains same
		
	}

}
