import java.util.Scanner;

public class Stringp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Etner String");
		String str= sc.next();
		String temp="";
		
		
		String [] split = str.split("");
		
		for (int i =0; i<str.length();i++) {
			
			String n =temp+ split[i]+split[i];
		System.out.print(n);
	}

	}}
