import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateSet {
	
	
	public static  HashSet<Integer> FindDuplicates(ArrayList<Integer> findingList) {
		
		
	 HashSet<Integer> tempset = new HashSet<Integer>();
	 HashSet<Integer> resultset = new HashSet<Integer>();
	
	 for (Integer newlist : findingList )
	 if (!tempset.add(newlist)) {
		 
		 
		 
		 resultset.add(newlist);
		 
	 }
	 
	
//	 Iterator<Integer> it =	 resultset.iterator();
//	 
//	 if (it.hasNext())
//	 {
//		 
//		 it.next();
//		 
//	 }	 
	 return resultset;
	}

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,8,9,7,6,5,4));
		
		
		
		HashSet<Integer> result =	FindDuplicates(list);
		
		for (Integer res: result)
	
		{
			
			System.out.print(res);
		}
	}

}
