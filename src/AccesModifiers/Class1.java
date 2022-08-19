package AccesModifiers;

public class Class1 {  // *****************Class can only be Public or Default it cannot be if Public class can be accessed anywhere, if default it can be accessed 
	// only in same package.
	
	//Class Member has Public, default , protected & Private
	
	
	
	//Default access modifiers can be accessed in the same package & Public can be accessed from anywhere.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 ob = new Class1();
		ob.addnew1();// Private method is accessed in same class.
		
	}
	public void add() {}// one method is created.
	
	
	protected void addnew() {
		
		
	}
	
   private  void addnew1() {
		
		
	}

   void addnew2() {
		
		
	}





}
