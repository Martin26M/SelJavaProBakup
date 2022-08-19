
public class PalindromePract {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 121123;
		int res=0;
		int num;
	  while (i>0) {
		
		 num= i%10;
		res= res*10+ num;
		 
		 i= i/10;
		
		
	  }
	  System.out.println(res);
	}

}
