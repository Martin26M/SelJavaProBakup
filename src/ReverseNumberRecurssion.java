
public class ReverseNumberRecurssion {

	static int res=0;
	public static void  WithRecursion(int n) {
		
		int rem;
		
		
		while (n!=0) {
		
		rem= n%10;
		res= res*10+rem;
		 WithRecursion(n/10);
		}
		
		System.out.println(res);

		}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 12345;
		WithRecursion(num);
	}

}
