package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int arr1[] = {6,7,8};
		
		
		ArrayList<Integer> arrnew = new ArrayList<Integer>();
		for (Integer i:arr) {
			
			
			arrnew.add(i);
		}
    for (Integer o:arr1) {
			
			
			arrnew.add(o);
		}
		
       System.out.println(arrnew);
       Arrays.asList(arrnew);
       arrnew.toArray();
       
       
	}

}
