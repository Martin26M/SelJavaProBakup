import java.util.Scanner;

public class Addingelementspract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter Array Length");
		
		int i = sc1.nextInt();
		
		int[] array = new int[i];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of array");
		
		 for (int j=0; j<array.length;j++) {
			 
			 
			 array[j]= sc.nextInt();
			 
			 
		 }
		 
		 for(int x: array) {
			 
			 sum= sum+ x;
			 
		 }
		 
		 System.out.println("Sum of arrays is :"+ sum);
	}
	
	

}
