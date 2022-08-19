import java.util.Scanner;

public class oddlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		char[] ch= str.toCharArray();
//		if (str.length()%2==0) {
//			
//			System.out.println("Correct string");
//		
//			
//		}
//		else {
//			
//			for (int i =0; i<str.length();i++) {
//				
//				
//				
//			}
			
	
String fin = Character.toString(ch[0])+ Character.toString(ch[1]);

	for (int i =0; i<3;i++) {
		
		System.out.print(fin);
	}
			
		}
		
		}
	


