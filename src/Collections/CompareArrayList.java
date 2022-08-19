package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {
	
	
	
	public static void main(String[] args) {
		
		
	ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Martin","Mathew","Hello"));
	ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("Martin","Hello","Mathew"));
	
	
	Collections.sort(l1);
	Collections.sort(l2);
	
	System.out.println(l1.equals(l2));
	
	
	ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("Ann","Martin","Hello"));
	
	// Finding missing elements in 2 list when compared
	
//	l1.removeAll(l3);
//	
//	System.out.println(l1);
	
//	l3.removeAll(l1);
//	System.out.println(l3);
	
	
	// finding all common elements in 2 list 
	
	//System.out.println(l1.retainAll(l3));
	
	
	
	l3.retainAll(l1);
	System.out.println(l3);
}
}