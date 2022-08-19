
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "12113456";
		char[] ch = s.toCharArray();
		
		
		
		for (int i =0; i<s.length()-1; i++) {
			if (s.charAt(i)==ch[i+1])
	
			 {
			
				count++;
			}
		
			
		}
		System.out.println(count);
	}

}
