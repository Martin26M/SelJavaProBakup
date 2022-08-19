package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListMehthods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList <String> arr = new ArrayList<String>();
//		
//		arr.add("Martin");
//		arr.add("Mathew");
//		arr.add("Paradyil");
//		
//		
//		
//	    ArrayList <String> arr1 = new ArrayList<String>();
//	    
//		arr1.add("Ann");
//		
//		arr1.add("Mary");
//		arr1.add("Jose");
//		
//		
//		// arr.addAll(arr1);// Here we added all the values of arr1 to arr
//		// arr.addAll(2, arr1);// Here the arr1 data will get added from the 2nd index
//		 
//		// arr.clear();// To clear the array 
//		
////	ArrayList <String > clonedList =	(ArrayList<String>)arr.clone();
////		
////		Iterator<String> it=   clonedList.iterator();// Here we are printing the cloned list of the ArrayList arr
////		
//		
//		Iterator<String> it=   arr.iterator();
//		
//	    while (it.hasNext()) {
//	    	
//	    	
//	    	System.out.println(it.next());
//	    	
//	    }
//	   
//	    
	    //System.out.println(arr.contains("Martin"));>>> We are checking if the value is present in the Array List or not 
		
	// System.out.println( arr.indexOf("Mathew"));  >>> to find the index of the value in the arraylist
//		Iterator<String> it1=   arr1.iterator();
//	    while (it1.hasNext()) {
//	    	
//	    	
//	    	System.out.println(it1.next());
//	    	
//	    }
//		**********************Using Remove If function
	   
	   // arr.remove(1);// will remove the value from 1st index
	  //  arr.remove("Martin");// will remove Martin from the List 
//	    
//	    ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList (1,2,3,4,5,6,7));
//	    //System.out.println(numbers);
//	    numbers.removeIf(num -> num%2==0);// Lamda function 
//	    System.out.println(numbers);
		
		
		// ****************Using retainall to find a particular value from the list (Using Collections.singleton(""))
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Martin","Mathew","Ann","Mary","Martin"));
//		
//		System.out.println(list.retainAll(Collections.singleton("Martin")));//It will retain only Martin in the List 
//		System.out.println(list);
		
		
		// ***********Converting ArrayList to Array
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Martin", "Mathew"));
		Object[] arr = list.toArray();// Here we have converted List to Array
		for (Object  o : arr)
		{
			System.out.println(o);
			
		}
		
	List<Object> res =	Arrays.asList(arr);// Again converting array arr to ArrayList
		
//		
	}

}
