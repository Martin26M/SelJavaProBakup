
public class FrequencyinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count=0;
		int[] arr = {1,2,3,4,1,2,4,5,6,76,8,5};
		
		for (int i =0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]==arr[j]) {
					
					count++;
					
					
				}
				
				
			}
			
			
			
			
		}
		System.out.println(count);

	}

}
