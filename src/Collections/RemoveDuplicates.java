package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	
	public void check () {
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[]  arr = {1,2,3,4,4,4,5,6};
	
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(5);
		
//		Set<Integer> set = new HashSet<Integer>(list);
//		set.addAll(list);
//		
//		for (Integer val : set) {
//			
//			
//			System.out.println(val);
		
		List<Integer > list1 =Arrays.asList(arr);
	
		List<Integer > list = new ArrayList<Integer >(list1);	
		
		System.out.println(list);
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		Object[]  arr1 =set.toArray();
		
		for (Object oo : arr1) {
			
			
			System.out.println(oo);
		}
		
	
	
//		}
	}

}
