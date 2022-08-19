
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] srr = {2,3,4,1,5,65};
		
for(int i =0; i<srr.length;i++) {
	
	
	for (int j=i+1; j<srr.length;j++) {
		int temp=0;
		if(srr[i]>srr[j]) {
			
			temp= srr[i];	
			srr[i]=srr[j];
			srr[j]=temp;
			
		}
	
		
		
		
	}
	
	System.out.println(srr[i]);
	
}


	}

}
