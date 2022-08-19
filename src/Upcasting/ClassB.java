package Upcasting;

public class ClassB extends ClassA {

	public void method1() {

		System.out.println("In Class B");
	}

	public void method4() {

		System.out.println("In Class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA a = new ClassB();
		// ClassB b = (ClassB) a ;
		//ClassB b = new ClassB();
	
		ClassB b =(ClassB) a;
		
		
		
		
// here b can access all the methods from class A and B
	}

}
