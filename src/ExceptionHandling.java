
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//******************************************Run time Exception
		
		try {
		int[] i = new int[3];
		
		i[4]= 100;
		//System.out.println(i[2]);
		
		} catch(Exception e )
		
		{
			
			System.out.println("Error occured");
			
			System.out.println(e.fillInStackTrace()); // gives the reason for exception
			e.getMessage();// Gives the actual message
			e.printStackTrace();
			
		}
	
		
		System.out.println("Came out of loop");
		
	}

	
	
	//*************************
}
