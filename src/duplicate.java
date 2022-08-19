
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="martinmathew";
		
		
		for (int i =0; i<name.length()-1; i++) {
			for (int j =i+1; j<name.length()-1; j++)
			{
				
				if (name.charAt(i)==name.charAt(j)) {
					
					System.out.println(name.charAt(i));
					
				}
			}
			
		}

	}

}
