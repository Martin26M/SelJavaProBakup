
public class ArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []  arr = {1,2,3,4,5,6,7,8};
		int len = arr.length;
		int []  newarr = new int [len*(len+1)/2];
		int temp=0;
		
		int k=0;
		for (int i =0 ; i<arr.length-1 ; i++)
	
		{
			for (int j =0 ; j<i; j++) {
			
				
			 {
					
					newarr[temp]=  arr[j];
			
					temp++;
				
				}
				
				
			}
		
			
		}
		
	for (Integer res: newarr) {
		
		
		System.out.println(res);
	}
	}

}
