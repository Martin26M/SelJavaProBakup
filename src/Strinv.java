
public class Strinv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Martin";
		
		String temp ="";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			
			char c = s.charAt(i);
			
			
			temp= temp+c;
		}
		
		
		System.out.println(temp);
		
		

	}

}
