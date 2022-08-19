
public class sortingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String []  str  = {"Martin","athew"};
		String temp ="";
		
		for (int i =0; i<str.length; i++	) {
			
			for (int j =0; j<str.length; j++) {
				
				
				if (str[i].compareTo(str[j])>0) {
					
					
					temp = str[i];
					str[i]= str[j];
					str[j]= temp;
					
				}
				
			}
			
				
		}
		

		for (String res: str) { 
			
			System.out.println(res);
		}
	}

}
