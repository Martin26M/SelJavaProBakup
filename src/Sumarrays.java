
public class Sumarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,4,56,3,5,6,8,8,4,53,7,98,9,9};
		
		int evesum=0;
		
		int oddsum=0;
	for (int i =0; i<arr.length; i++) {
		
		
		if (arr[i]%2==0) {
			
			evesum += arr[i];
			
			
		}
		
		else {
			
			oddsum += arr[i];
			
		}
		
		
	}
	System.out.println(evesum);
	System.out.println(oddsum);
	}

}
