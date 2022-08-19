
public class Palindrome1 {

	int num=0;
	public void    checkpalin(int i) {
		
		
		int t=i;
		while (i>0) {
		
		 int r= i%10;
		  num = num*10+r;
		 i= i/10;
		}
		 if (num==t) {
			 
			 System.out.println("Yes");
			 
		 }
		 else {
			 
			 System.out.println("No"); 
		 }
	
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Palindrome1 p = new Palindrome1();
		// TODO Auto-generated method stub

		p.checkpalin(121);
			
		}
	}


