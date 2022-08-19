
public class CallbyReference {

	static int x=100;
	int y=200;
	
	
	public int getval(CallbyReference test) {
		
		x=300;
		test.y=500;
		return x+y;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CallbyReference ref = new CallbyReference();
		
		System.out.println(ref.getval(ref));// We have called the method by passing the object  
		//System.out.println(CallbyReference.x);// Here the value of x is  changed as we have called by reference  and reference also points to same object and we have changed the original value. 
		System.out.println(x);
	    System.out.println(ref.y);

	}
}
