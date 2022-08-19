import java.util.Scanner;

public class ReverseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str= sc.next();
		String temp="";
		String[] str1= str.split("");
		
		
			for (int i=str.length()-1;i>=0;i--) {
				
				temp = temp + str.charAt(i);
				
			}
			
			System.out.println(temp);
		}
		
	}


