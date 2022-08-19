
public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,555,5,5,6,6,7,8};
		
		int esum=0;
		int osum=0;
		for (int arr1:arr )
		
		{
			if (arr1%2==0) {
				
				esum+= arr1;
				
			}
			
			else{
				
				osum+=arr1;
				
			}
		}
		System.out.println(esum);
		System.out.println(osum);
	}

}
