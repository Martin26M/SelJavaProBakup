package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,5,6,6,7,7,8));
		// Using Stream
		
		ArrayList<String> arr= new ArrayList<String>(Arrays.asList("Martin","Martin","Martin","Mathew"));
		
		LinkedHashSet<Integer> ll1 = new LinkedHashSet<Integer>(arr1);
		
		LinkedHashSet<String> ll2 = new LinkedHashSet<String>(arr);
		
		
		
	//List<Integer> list= 	arr1.stream().distinct().collect(Collectors.toList());
	
	for (Integer i :ll1 ) {
		
		
		System.out.print(i);
		
		
	}
	}

}
