
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aab";
		
		String s1= "abc";
		
		boolean flag = false;
	
		boolean [] visited = new boolean[s1.length()];
		if (s.length()== s1.length()) {
			
			for (int i =0 ;i<s.length(); i++) {
				 flag = false;
				for (int j =0; j<s1.length(); j++) {
					
					if(s1.charAt(j)==s.charAt(i)&& visited[j]) { 
						visited[j]= true;
						flag = true;
						break;
							
					}	
									
				}
				if (!flag) {
					
					break;
				}
				
			}
			
			if (flag) {
				
				System.out.println("Is Anagram");
			}
			else {
				
				System.out.println("Not anagram");
			}
			
		}
		
		else {
			
			System.out.println("Not anagram");
		}
		
		

	}

}
