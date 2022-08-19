
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,65};
		
		int temp=0;
		int start=  0;
		int end = arr.length-1;
		while(start<end){
			
			temp= arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
		}
	}

}
