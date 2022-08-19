
public class plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ss = "asdasd";
		boolean flag= true;
		
		
		int start=0;
		int end= ss.length()-1;
		
		while (start<end) {
			
			
			if (ss.charAt(start)!= ss.charAt(end)) {
				
				flag= false;
				break;
				
				
			}
			
			start++;
			end--;
		}
			
		if (flag= false)	{
			
			System.out.println("Notpal");
		}
		
		else {
			
			System.out.println("pal");
		}
		}
		
	}

