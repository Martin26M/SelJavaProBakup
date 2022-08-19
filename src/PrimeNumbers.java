import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int prime;
		int flag=1;
		
		//************************************************Printing range of prime numbers
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter First Number :");
		  int num1=   sc.nextInt();
		
		  System.out.println("Enter Second  Number :");
		  
		int num2=   sc.nextInt();
		/*  
		  for (int i=num1;i<num2; i++ ) {
			  
			  
			  prime = i;
			  
			for(int j=2;j<prime;j++) {
				
				
				if(prime%j==0) {
					 
					flag=0;
      					break;
				}
				else {
					flag=1;
					break;
				}
			}	
				
				if (flag==1) {
					
					
					System.out.println(prime);
				}
				
			
				   			  }
			  */
		  

		 
		     flag = 1;
		    for (int i = 2; i <= num2 / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
			  
	}
				
				  
	}
			  
			  

			  
		  
