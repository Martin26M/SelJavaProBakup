
public class REverseSentence {

	public static void  check(String str ) {
		
		String split[] = str.split(" ");
		
		
		
		
		String reult="";
		
		for (int i =0; i<split.length;i++) {
		reult = reult + reverse( split[i])+" " ;
		
		}
		System.out.print(reult);
	}
		
		public static String reverse(String str) {
			char[] ch = str.toCharArray();
			
			String temp="";
			
		for (int i=ch.length-1;i>=0;i--)
		
		{
			
		
			
			temp= temp+ch[i];
			
			
		}
		return temp;
		}
		

	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String str1 ="My name is Martin";
		
		
		check( str1 );
	}

}
