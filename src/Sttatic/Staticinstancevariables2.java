package Sttatic;

public class Staticinstancevariables2 {

	
	int i =10;
	static int j=20;
	
	public int  add(int i, float j, double d) //here all the variables are the local variable of that method.
	{
		
		int sum= (int) (i+j+d);// casting done as we converted other variables to int ;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Staticinstancevariables2 obj = new Staticinstancevariables2();
		
		int y= obj.add(10, 40, 80);//We have done parameterization
		
		System.out.println(y);
		
		System.out.println(Staticinstancevariables2.j);// here static variables are accessed directly without any object
		System.out.println(obj.i);// non instance  vsriables are accessed only by creating object.
		
		
		//Note: Static variables & methods can be called directly , instance methods can be called only by creating objects
	}

}
