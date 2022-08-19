import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Integer> i = new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,5,6,7,5,5,5,5,5,5));
		
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(i);
		
		//Arrays.asList(set);

		
		
	for (Integer o: set) {
		
		
		System.out.println(o);
	}
		
	}

}
