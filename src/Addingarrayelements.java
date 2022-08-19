import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Addingarrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int[] i = {10,20,30,40};
		
		int sum=0;
		
		for (int x : i) {
			
			
			sum = sum+x;
			
		}
		
		System.out.println("Sum of arrays is :"+ sum);
		*/
	
		//***********Asking user to enter the elements of an array.
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Array Length");
		
		 int i = sc1.nextInt();
		int[] array =new int[i];
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Enter number");
		for (int j =0;j<array.length;j++) {
			
			
			
			array[j] = sc.nextInt();
			
		}
		
		for(int x: array) {
			
			
			sum = sum+x;
			
		}
		
		System.out.println("Sum of arrays is :"+ sum);
		
	}

}
