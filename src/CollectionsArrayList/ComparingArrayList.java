package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []  arr = {"Martin","Msthew"};
	List <String> newlist  =	Arrays.asList(arr);
		ArrayList<String> list = new ArrayList<String>(newlist);
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("String3", "String4", "String5"));
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("String3", "String4", "String5"));
		
		System.out.println(list.equals(list2));
		
	   System.out.println(list2.equals(list3));	
	   

	   Collections.sort(list);
	   System.out.println(list);
	
		
	}

}
