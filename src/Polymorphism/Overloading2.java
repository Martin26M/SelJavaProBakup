package Polymorphism;

public class Overloading2 extends Overloading {

public String  add (String b) {
		
		
		System.out.println("Second one is called after overloading");
		return b;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Overloading2 obj = new Overloading2();
		
		obj.add(10);
		obj.add("Test");

	}

}
