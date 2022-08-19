
public class CallByvaluecallbyreference {
	
	
	 int p;
	int q;
	
	
	public int  sum(int a , int b) {
		
		a=10;
		b=20;
		int c= a+b;
		
		return c;
		
	}
	
	
	public void swap(CallByvaluecallbyreference t) {
		
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=40;
		int y =50;
		CallByvaluecallbyreference obj = new CallByvaluecallbyreference();
		
		obj.sum(x, y); // Call by value 
		
		
		System.out.println(obj.sum(x, y));// Here we can see the value assigned to x & y has changed by using the method and giving other value from a& b
		
	//	CallByvaluecallbyreference.p=50;//  Calling the static variable with the class name 
		
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);// Call by reference 
		
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

}
