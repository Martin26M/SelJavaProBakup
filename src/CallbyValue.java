
public class CallbyValue {

	 static int x =100;
	int y =200;
	
	
	
	public int callvalue(int x) {
		
		
		x=x*2;// Called by value of x and the value of x is changed 
		return x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CallbyValue obj = new CallbyValue();
		System.out.println(obj.callvalue(x));// We have changed the value of x
		System.out.println(CallbyValue.x);//Here we are calling the static variable directly by classname.variable
	}

}
