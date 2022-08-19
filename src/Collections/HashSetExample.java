package Collections;

import java.util.HashSet;
import java.util.Iterator;

public abstract class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		// we can also write above as Set<String> h = new HashSet<String>();
		
	h.add(1);
	h.add(2);
	h.add(3);
	h.add(4);
	h.add(5);
	
	System.out.println(h);// The output is generated randomly unlike Arraylist where o/p is in order also there is no duplicate o/p given see the ex of Martin above
		
	// Approach 1- Getting values of a set , here we cannot use for loop as arraylist as we cannot use get method like arraylist as the indexes are not ordered for a set
	
	// we will use iterator
	
	Iterator<Integer> it =  h.iterator();// Iterator is made of String genrics 
	
	while (it.hasNext()) {
		
		//System.out.println(it.next());// Here we will get all the values of the set 
		
		int  var = it.next();
		if (var==1) {
			
			
			System.out.println(var);// We can use this method to get a particular value from the set.
		}
		
		else if (var==5) {
			
			System.out.println("True");
		}
		// Note - WE cant use h.get as like in Arraylist as the index is random 
	}
	}

}
