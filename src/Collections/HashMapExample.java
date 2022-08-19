package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.List;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hashmap is used for reading the data from excel ,
		//here below ex we have given generics for String , String value , where 1 string is the keyname in excel and other is the keyvalue
		
	    Map<String,String > h = new HashMap<String,String >();
	    
	    
		
		h.put("Firstname", "Martin");// We use put method to add the values to keys
		
		h.put("Lastname", "Mathew");
	
		h.put("Selenium", "India");
		h.put("Lastname", "Mathew");// it does not print the duplicate key
		System.out.println(h);
		System.out.println(h.size());
		// Approach 1 to get the values of the map
		
		//1. finding all the keys 
		
	//	h.keySet(); to find the set of keys ,with the return type as set of a string  so 
		
//		Set <String>  keys  = h.keySet();
//	
//		 for (String key:keys) {
//	
//			 System.out.println(key);
			 System.out.println(h.get("Lastname"));// Getting the values of the key
			 
			 
			 // Ex2 finding the list from the excel adding multiple list to the excel 
			 
			 Map <String ,List<String>> h1 = new HashMap<String,List<String> >();
			 
			 List <String> L1= new ArrayList<String>();
			 
			 L1.add("martmathew@gmail.com");
			 L1.add("martmathew26@gmail.com");
			 L1.add("martmathew@gmail.com");
			 
			 h1.put("email", L1);
			 System.out.println(h1);
//			 Set <String>  keys1  = h1.keySet();
//				
//			 for (String key1:keys1) {
//		
//				 System.out.println(key1);
//				 System.out.println(h.get(key1));// Getting the values of the key
//		 }
	}

}
