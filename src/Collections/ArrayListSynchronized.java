package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListSynchronized {
	
	public static void main(String[] args) {
	List<Integer> list = Collections.synchronizedList( new ArrayList<Integer>(Arrays.asList(1,2,3,5,5,6,6,7,7)));
	
	synchronized(list) {
		
		
		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>(list);
		
		for (Integer i:l1) {
			
			
			System.out.println(i);
		}
		
	}
	
	
	
	
	}

}
