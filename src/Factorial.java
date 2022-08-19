import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact =1;
	
		Scanner sc1 = new Scanner(System.in);
		
	
		
		System.out.println("Enter Number:");
	int num1=sc1.nextInt();

		Factorial f = new Factorial();
		f.Printreverese(num1);
		
		for(int i=1;i<num1;i++) {
			
			fact=fact*i;
			
		}
		
          System.out.println("="+fact);
          
			
			
	}
			static void Printreverese(int num1)
			{
				
			for(int k=num1 ; k>1; k--) 
			{
				
				System.out.print(k+"*"+ "" );	
			}
			}
				
			
	

}
