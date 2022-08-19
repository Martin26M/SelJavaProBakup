import java.util.Scanner;

public class factorial1 {
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
	   int num= 	sc.nextInt();

	   int j=1;
	for (int i =1; i<=num; i++)
	{
		
		j=j*i;
		
	}
   System.out.println(j);
	
	}
}
