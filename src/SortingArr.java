import java.util.Arrays;

public class SortingArr {
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,4,2,6,8,7,9,3,2,5};
		
	 Arrays.sort(arr);
		
		
			for (int i=arr.length-1; i>=0;i--) {
				
				
				System.out.print(arr[i]);
			}
			
		}
	}


