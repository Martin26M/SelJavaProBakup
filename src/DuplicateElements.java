import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;




public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,3,4,2,3,5,6,6,7};
		
		ArrayList <Integer> arr1= new ArrayList<Integer>();
		
	

		
		for (Integer arrnew :arr) {
			
			
			arr1.add(arrnew);
			
		}
		
		 HashSet<Integer> tempset = new HashSet<Integer>();
		 tempset.addAll(arr1);
		 System.out.println(tempset);
	}

	
	

}
