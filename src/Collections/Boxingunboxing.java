package Collections;

import java.util.ArrayList;
import java.util.Set;

public class Boxingunboxing {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		String s = "Martin";
		
		Integer obj = new Integer(i);//Autoboxing- Wrapping - Using the wrapper class to wrap the variable into object
	    System.out.println(obj);
	    
	    String obj1= new String(s);
	    System.out.println(obj1);
	    
	    String ss = obj1.valueOf(s);
	    System.out.println(ss);
	    
	    int o = obj.valueOf(i);// Unboxing- Unwrapping - Using the wrapper class to unwrap the object  into variable value
	    System.out.println(o);
	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	}

}
