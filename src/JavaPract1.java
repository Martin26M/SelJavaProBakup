
public class JavaPract1 {
	
	public static void display ()
	{
		
		
		System.out.println("Hello");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a ;
		float f;
		double d ;
		String s;
		char c ;
		boolean true;
		*/
		
		
		//JavaPract1 j = new JavaPract1();
		
		JavaPract2 k = new JavaPract2();
		

		display();// Created a static method display,and called that method without cresting an object.
		k.show();
		System.out.println(k.calc());
		System.out.println(k.calc2(10, 10));// Providing arguments to parameters
	
		
		
	}

}
