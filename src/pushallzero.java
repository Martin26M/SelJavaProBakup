
public class pushallzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr  = {1,2,0,3,4,5,0,8};
		
		int start =0;
		int end = arr.length-1;
		int temp =0;
		
		while (start<end) {
			
			while (arr[start]!=0) {
				
				start++;
				
			}
			
			while(arr[end]==0) {
				
				end--;
			}
			
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}

		
		for (Integer res: arr) {
			
			
			System.out.println(res);
		}
	}

}
