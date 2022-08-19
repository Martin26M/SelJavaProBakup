import java.util.Scanner;

public class Fibbonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a =0;
	int j=1;
	int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Emter Number");
		
		int i = sc.nextInt();
		
		
		for (int k=0; k<i;k++) {
			
			sum= a +j;
			System.out.println(sum+ " ");
			a=j;
			j=sum;
			
		
		}
		
	
			
		}
		
}		
	
/*	for (int j=i; j>0;j--) {


sum= sum+j;
System.out.println(sum+ " ");
sum=j;


*/

