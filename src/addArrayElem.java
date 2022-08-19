
public class addArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,1,3,7};
		
		int sum=0;
		
		for (int i = 0; i<=arr.length-1; i++) {
			
			if (!( arr[i]>=6)&&(arr[i]<=9)||arr[i]>9) {
					sum = sum+arr[i];
			}
			

			
		}
	System.out.println(sum);
	}

}
