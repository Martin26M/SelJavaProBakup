
public class binarysearchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {1,2,3,4,5,6,7,8};
		
		int end = arr.length-1;
		int start = 0;
		int key =6;
		
		while (start<end)
		{
			int mid = (start+end)/2;
			
   if(arr[mid]==key) {
				
			System.out.println("found at"+arr[mid]+" "+ mid);
			break;
				
			}
			if(arr[mid]<key) {
				
				start = mid+1;
				
			}
            if(arr[mid]>key) {
				
				end = mid-1;
				
			}
			
		}
	}

}
