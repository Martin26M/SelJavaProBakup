
public class NumberofPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ss ="martinmamthew";
		boolean flag = true;
		int count=0;
		
		
		 int len = ss.length();
		 int k=0;
		 
		 
		 String  [] temp = new String [(len*(len+1))/2];
		 
		 for (int i =0; i<len ; i++) {
			 
			 for (int j =i; j<len ; j++) {
				 
			String res  =	 ss.substring(i, j+1);
				 
			
		
			System.out.println(res);
			
			int start=0;
			int end= res.length()-1;
			
			while (start<end) {
				
				if (res.charAt(start)!= res.charAt(end)) {
					
					flag= false;
					break;
				}
				start++;
				end--;
			}
			
			if (flag) {
				
				count ++;
				System.out.println(res);
			}
		 
		
			
		}
	
		 }}}
