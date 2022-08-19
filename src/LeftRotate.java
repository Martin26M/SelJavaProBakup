import java.util.GregorianCalendar;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("...........Before Rotation .....");
		
		for (int a:arr) {
		System.out.print(a);
		}
		
		int last =arr[arr.length-1];
		
		for (int i =arr.length-1; i>0; i--) {
			
			
			
			arr[i] =arr[i-1];
			
			
		}
		
		arr[0]=last;
		System.out.println("After");
		for (int a:arr) {
			System.out.print(a);
			}
	}
	
	

}
