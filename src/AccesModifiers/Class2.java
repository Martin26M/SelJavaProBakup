package AccesModifiers;

 class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Class1 obj = new Class1();
		
		obj.add();
		
		obj.addnew();
		
		obj.addnew2();//Can be accessed as this method is default and in same package.Outside package it cannot access with inheritance also.
		obj.addnew1();// Cannot be accessed as its a pivate method and outside the class , it can be accessed only inside same class
	}

	public void show () {
		
		
	}
	
}
