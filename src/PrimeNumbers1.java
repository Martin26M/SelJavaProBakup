
public class PrimeNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for (int i =1; i<=100;i++) {
			
			boolean a = true;	
			if (i>1) {
				
				
				for (int j=2 ; j<i;j++) {
					
					if (i%j==0) {
						
						a= false;
						
				}
				}
				else {a= false;}
				
				
				
				if (a= true ) {
					
					System.out.println(i+ " ");
				}
				
				
			}
		}
		
	}	
}
