
public class CreatingPbjects {
	
	int a=10; // instance variable 
	
	static int b=100;// static variable 
	
	public int local() {
		
		a=5000;
		b=6000;
		System.out.println(b);
		System.out.println(a);
		int c=100;
		return c;
	}

	public static void  stmethod() {
		
		//a=900; we cannot call instance variable inside static method
		
		b=800;// we can call static variable inside static method
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingPbjects obj = new CreatingPbjects();
		System.out.println(obj.local());
		System.out.println(CreatingPbjects.b);
		
		
		CreatingPbjects.b=120;
		System.out.println(b);// calling static variables 
		
		
		
		
		
		
		System.out.println(obj.a);// calling instance variables 
		
		System.out.println(obj.a=300);
		// calling local variable 
		
	}

}
