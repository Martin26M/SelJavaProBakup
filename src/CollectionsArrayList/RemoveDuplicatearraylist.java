package CollectionsArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer [] arr  = {8,1,2,3,4,4,4,5,6,7,8};
		
	List<Integer> list =	Arrays.asList(arr);
	
	//Collections.sort(list);
	
	LinkedHashSet<Integer> newlist = new LinkedHashSet<Integer>(list);
	
	for (Integer res: newlist) {
		
		
		System.out.println(res);
	}

	}

}
