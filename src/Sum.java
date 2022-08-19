import java.util.ArrayList;

import java.util.List;

public class Sum {

	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		
		for (int i =0; i<999;i++) {
			l.add(i);
		int j = (int) l.get(i);
		
		if (j%9==0) {
			
			while(j>0) {
				
				int sum=0;
				int reminder;
				
				reminder= j%10;
				sum= sum+reminder;
				j = j/10;
				 
				if (sum==9) {
					
					System.out.println("Sum is :"+j+" "+sum);
				}
				
			}
			
			System.out.println(l.get(i));
		
				
			}
		}

	}
		
	
	
	
}
	
