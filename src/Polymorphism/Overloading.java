package Polymorphism;

public class Overloading {

	public int add (int a) {
		
		
		System.out.println("First one is called");
		return a;
	}
	
public void add () {// Different method with same name as add and having different  arguments this is overloading
		
		

	System.out.println("Second  one is called");
	
		
	}

public void add (int a , int b) {// Different method with same name as add and having different  arguments this is overloading
	
	

	System.out.println("Third   one is called");
	
		
	}
	

public void add (int a , int b, int c ) {// Different method with same name as add and having different arguments this is overloading
	
	

	System.out.println("Fourth   one is called");
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		
		obj.add(10);
		obj.add();
        obj.add(10, 20);
        obj.add(10, 20, 30);
	}

}
// Static /Non static ,methods can be overloaded in method overlaoding