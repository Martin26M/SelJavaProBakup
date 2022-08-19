package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		
		a.add("Martin");// WE can add any type of data inside the list unlike array where a particular data type only could be added
		a.add(51);
		a.add('c');
		a.add(true);
		a.add("Martin");// duplicate values are allowed in Arraylist
		
		
	//System.out.println(a);
//		System.out.println(a.size());// gives the size of the list 
//		a.remove(3);// to remove the index 
//		System.out.println(list.indexOf("Martin"));//to find the value in index 
		
		//Approach 1 to navigate to the values in the list 
		
//		Iterator itr= a.iterator();
//		
//		while(itr.hasNext()) {
//			
//			
//			System.out.println(itr.next());
		
		
		//Approach 2 
			
		for (int i =0 ; i< a.size(); i++) {
			
		
		System.out.println(a.get(i));
		}
			
		}
}
		
		



