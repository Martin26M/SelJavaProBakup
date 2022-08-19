import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,4,7,8,4};
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for (int i1 : a) {
			
			
			l1.add(i1);
		}
		 
		
		System.out.println(l1);
		
		if (l1.contains(8)) {
			
			System.out.println("True");
		}


}
}