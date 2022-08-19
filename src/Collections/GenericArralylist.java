package Collections;

import java.util.ArrayList;

import java.util.List;

public class GenericArralylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We use generic arraylist to overcome typecasting issue because in array list we cannot use multiple types together as shown below
		
		
//		ArrayList list = new ArrayList();
//		
//		list.add(10);
//		
//		//Now to add value to 10 we had to use typecasting as shown below
//		
//	
//		
//		//int a = list.add(10);>>> we cant use int as it returns object and not integer so we have to make use of the super class object
//		
//		Object a = list.get(0);
//		
//		//Now if we want to add value to a its not possible as its an object as shown below
//		//System.out.println(a+20);
//		//So we will do typecasting
//		
////	    int a1 = (Integer)list.get(0);
////	    // Now we can add value to a after converting to int 
////	    System.out.println(a1+20);
	 
	 // This type casting is not possible always so we use generics as shown below
	    
	    
	List <Integer>list = new ArrayList<Integer>();
	    
	    
	   list.add(10);// Now here we can add only integers in the list 
	    //list.add(10.0);Not possible
	 // So here no typecasting is required
	    int a = list.get(0);// getting the value stored in the 0 index 
	    
	    System.out.println(a+20);
	}

}
