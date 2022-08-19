package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,5,8,6,6,3,7,6));
		
		Collections.sort(list);
		LinkedHashSet<Integer> newlist = new LinkedHashSet<Integer>(list);
		
		for (Integer res: newlist) {
			
			System.out.println(res);
			
		}
	}

}
