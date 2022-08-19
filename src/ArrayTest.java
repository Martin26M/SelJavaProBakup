
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,23,11,44,3,23,2,3};
		

		for (int i=0; i<arr.length;i++) {
			
			
			for (int j =i+1; j<arr.length;j++) {
				
				if (arr[i]==arr[j])
				{
					
					System.out.println(arr[i]);
					break;
				}
				
				
				
			}
		}
		
		
		
		
	}

}
