
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divisor=0;
		int j=28;
		for (int i=1; i<100; i++) {
			
			if (j%i==0) {
				
				
				divisor = divisor+i;
				
				if(divisor==j) {
					System.out.println("Number is Prime");
					
				}
			}
			
			}
		}
	}


