package Encapsulation;

public class Encapsulation {

	
	int Accountno=123456;
	private int passwordd= 4877;
	private int Balanceamt= 10000;
	
	
	public void Statement (int Account,int passwd,int Balance) {
		
		
		
		if (Account==Accountno && passwd == passwordd )
		{
			
			if(Balance<Balanceamt)
			{
				Balance= Balanceamt-Balance;
				System.out.println("Balance is "+ Balance );
			}
			else {
				
				
				
				System.out.println("Invalid creds");
				
				
				
			}
		}
		else {
			
				
			System.out.println("Invalid creds");
			
			
		}
		
	
		
		
		
	}
	public void updatepin(int Acctno, int oldpin, int newpin)// Creating this method is called Encapsulation as we created this method to 
	                                                         //make changes to the private members of this class like password and balance
	
	{
		
		if (Acctno==Accountno && oldpin== passwordd )
		{
			passwordd= newpin;
			System.out.println("Pin changes sucsesfully to : "+ newpin);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Encapsulation obj = new Encapsulation();
		
		
		
		
		
		
	}

}
