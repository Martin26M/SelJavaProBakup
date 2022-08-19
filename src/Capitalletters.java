
public class Capitalletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "ahceclwlxo";
		s.toUpperCase();
		
		String[] split= s.split("");
		
		for (int i=1; i<s.length();i=i+2) {
			
			
			System.out.print(split[i].toUpperCase()+" ");
			
			
		}
	
		// Approach 2 but we cannot implement upper case to char array
		
		
	char[] ch= s.toCharArray();
	
	for (int i=1;i<s.length();i=i+2)
		
	{
		
		//System.out.print(ch[i]+" ");
		
	}
		
		
		
		
	}

}
