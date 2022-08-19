import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class ArrayelementsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] arr = {"Martin", "Mathew","Martin","Mathew","New","New","Extra"};
		
		
		for (int i =0; i<arr.length;i++) {
			
			for (int j = i+1; j<arr.length;j++) {
				
				
				if ((arr[i]==arr[j])) {
					
					System.out.println(arr[i]);
					
				}
			}
			
			
//		}	
		
//		HashSet<String> map = new HashSet<String>();
//	
//		
//		for (String dup :arr ) {
//			
//			
//			map.add(dup);
//			
//		}
//		
//		System.out.println(map);
//		
//			
//		}
		
		
	}
		
	
	}}


