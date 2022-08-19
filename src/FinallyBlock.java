
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			System.out.println("DB Connection opened in try and then error occured");
			int[] j = new int[3];
			
			j[4]= 100;
		}
		
		catch(Exception e ) {
			
			System.out.println("Error occured in try and then error msg displayed in catch");
			
		}
		
		finally{// Finally is executed all the time and will execute all the necessary codes  written in it from try;
			
			
			System.out.println("DB Connection closed  in finally  after the catch method is run");
			
			
			
			//**********************Q>>>> Diff b/w finally and final
			
			
			final int i =100;
			
			i = 30;// Changing the value not possible as it is final.
		}
	}

}
