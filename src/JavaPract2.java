
public class JavaPract2 {

	public void show() {
		
		System.out.println("This output is from JavaPract2");
		
	}
	
	
	public int calc()
	{
		
		
		int a = 10;
		int b= 20;
		
		int d = a+b;
		
		return d;
		
	}
	
	
	public static int calc2 (int a , int b)// Parameters given here for the argument to be provided in other class.
	
	{        
		
		int c = a+b;
		
		return c;

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaPract2 j = new JavaPract2();
		int   k = j.calc();

		System.out.println(k);
		
		
		
		
		
	}

}
