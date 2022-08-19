
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		int evensum=0;
		int oddsum=0;
		for(int x : arr) {
			
			
			if(x%2==0) {
				
				
				evensum= evensum+x;
								
			}
			
			else {
				

				
				oddsum= oddsum+x;
								
				
			}
			
			System.out.println(evensum);
		}
	}

}
