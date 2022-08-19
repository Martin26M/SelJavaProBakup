import java.util.Scanner;

public class StringPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.next();
		char[] ch= str.toCharArray();
		int counter=0;
	
		/*for (char c: ch) {
			
			
			
			if(c=='y'|| c=='z');
			
			counter++;
			
		}
		*/
	
		for (int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='y'||ch[i]=='z') {
				
				counter++;
				
			}
		}
		
		System.out.println("Output:"+counter);
			
		
	}

}
