
public class PrimeNumbersAgain {

	public static void main(String[] args) {
	
			// prime numbers between 20-30
		boolean flag= true;
		for (int i =20; i<30; i++) {
			
			for (int j =2; j<i; j++) {
				
				if ((i%j==0)) {
					
					flag= false;
					break;
				}
				
			}
		if (flag = true) {
			
			System.out.println(i);
			
		}	
			
		}
		
		
		}		
		
		
		
	}


