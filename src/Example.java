import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String a,b;
/*
 *
 * 
 * Ask user to input a string, return a new string where for every char in the original, there are two chars.
Ex1: ("The") → "TThhee"
Ex2: ("AAbb") → "AAAAbbbb"
Ex3: ("Hi-There") → "HHii--TThheerree"
 * 
 * 
 * 
 * 
 * 
 * 
 */
		
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter the String");
		
		String str=  sc.next();
		
		
		NewString( str);
		
	}
	
	
	static void NewString(String str) {
		char[] carray = str.toCharArray();
		String temp="";
		for(int i=0;i<str.length();i++) {
			
			for (int j = i + 1; j < str.length(); j++)  {
				
				if( carray[i]== carray[j])
				{
					
					System.out.print(carray[i]+carray[j]);
					
				}
				
			}
			
			
		}
	/*
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string A");
		a = s.nextLine();
		System.out.println("Enter string B");
		b = s.nextLine();

		if (a.equals(" ") || a.length() == 0) {
		a = "@";
		}
		else if (b.equals(" ") || b.length() == 0) {
		b = "@";
		}
		char aa = a.charAt(0);
		char bb = b.charAt(b.length()-1);
		String fin = Character.toString(aa).concat(Character.toString(bb));
		System.out.println(fin);

	*/
		
		    int i;
		    Scanner a = new Scanner(System.in);
		    System.out.println("Enter a string");
		    String s = a.next();
		    String j="";
		    for(i=0;i<=s.length()-1;i++)
		    {
		      j += s.substring(i,i+1) + s.substring(i,i+1);
		    }
		        System.out.println(j);
		  }
		
	}


