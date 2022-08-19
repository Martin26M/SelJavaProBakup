import java.util.Scanner;

public class StringPractice {

	public static void callingstring(String str) {
		
		
		if (str.length()%2==0) {
			
			
			System.out.println("Please enter oodd length of Streng");
		}
		
		else {
			
			
			String[] split = str.split("");
			
			for (int i =0; i<split.length;i+2) {
				
				str.charAt(0);
				str.charAt(str.length()-1);
				str.replace(str.charAt(0), "");
				
				
			}
			
			
			
			
				
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
	String str= sc.next();
		callingstring(str);
		

	}

}
