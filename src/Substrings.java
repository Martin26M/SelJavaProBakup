import java.util.Scanner;

public class Substrings {

	public static String FindString(String s , int i) {
		
		
		String s1 = s.substring(0, i);
		String s2= s.substring(s.length()-i, s.length());
		
		String s3 = s1+s2;
		
		return s3;
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter String ");
	String s= 	sc.next();
		System.out.println("Enter Integer  ");
	int i=	sc.nextInt();
		 
	
	System.out.println(FindString(s,i));
	
	
	}
}


/*
 * 	String s= "Martin";
		
		int n=2;
		
		
		s.substring(0, n);
		
		s.subSequence(n-2, s.length()-1);

 * 
 * 
 * 
 * 
 */
