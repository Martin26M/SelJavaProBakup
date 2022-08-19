import java.util.Scanner;

public class Creditcardnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,sum=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		String num = sc.nextLine();
		
		String numbers = num.substring(0,4);
		
		int i = Integer.parseInt(numbers);
		
	
		while (i>0) {
			
			
	
			m= i%10;
			sum= sum+m;
			i=i/10;
		}
		//System.out.println(sum);
		
		if (sum==16) {
			
			System.out.println("visA");
		}
		else {
			
			
			System.out.println("Master");
			
		}
	}

}
