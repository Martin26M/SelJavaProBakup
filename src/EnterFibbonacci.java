import java.util.Scanner;

public class EnterFibbonacci {
	
	
	public void  findFibonnaci(int num ) {
		
		
		int a=0;
		int b= 1;
		
		int sum=0;
		
		for (int i =0; i<num; i++) {
			
			sum= a+b;
			System.out.println(sum+" ");
			
			a=b;
			b=sum;
		}
	
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to Find Fibonacci");

	int num=	sc.nextInt();
	
	EnterFibbonacci fm = new EnterFibbonacci();
	
	    fm.findFibonnaci(num);
	
	}

}
