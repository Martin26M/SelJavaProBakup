
public class CehckArray {
	
	public static boolean  CheckArray(int[] arr) {
		
		int counter =0;
		int counter2=0;
		for (int i =0; i<arr.length; i++) {
			
			if(arr[i]==1) {
				
				counter++;
				
			}
			
			else if (arr[i]==4) {
				
				
				counter2++;
			}
			
			
		
			
		}
		
		if (counter>counter2) {
			
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6,4};
		
		
		
		boolean check = CheckArray(arr1);
		// TODO Auto-generated method stub
		System.out.println(check);

	}

}
