
public class AddBinaries1 {
	
	
	
	public static  Integer addBinaries (Integer i1, Integer i2) {
		
		String s1 = i1.toString();// comverting to String 
		
		String s2= i2.toString();
		
		int  b1 = Integer.parseInt(s1);// comverting String to int 
		
		int  b2 = Integer.parseInt(s2);
		
		int sum = b1+b2;
		
		Integer newsum= (Integer)sum;// Typecasting to Intgfer
		return newsum;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addBinaries (11101,11002));
	}

}
