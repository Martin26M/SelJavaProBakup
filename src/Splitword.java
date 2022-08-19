
public class Splitword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s = "Martin";
		String temp ="";

		//Approach1

		String[] sl = s.split("");

		for (int i = s.length()-1; i >=0;  i--)
				
				{

		
			temp = temp+sl[i];
			
		} 
		System.out.println(temp);
		}
	
}

		
		//Aproach 2
		
		/*char[] ch= s.toCharArray();
		
		for (int i = 1; i < ch.length; i = i+2) {// Using Char Array

			System.out.print(ch[i]);
			}
	}
*/

