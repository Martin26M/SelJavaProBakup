import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newstring="";
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
	    String[] split= 	A.split("");
	  
	    
	    
	  for (int i=A.length()-1;i>=0; i--) {
		  
		  
		  
		 newstring+=  split[i];
		
	  }
	
	  if (newstring.equals(A)&& A.length()<50)
	  {
		  
		  System.out.println("Yes");
	  }
	  
	  else {
		  
		  System.out.println("Not");
	  }
	 
	}
	
}
