package Inheritance;

public class Dog extends Animal {
	
	
	int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//******************************>>>>>>>>>>>>>>>>>>>>>>>> When upcasting is done 
//		 Animal  obj = new Dog() ;
//		//obj.sound1(); Here sound 1 is not accessible due to UpCasting
//		 
//		//obj.sound();  Here sound from parent is accessible as we have done upcasting 
//	  
//	  System.out.println(obj.s="Hello");
//	  //System.out.println(obj.id);>>>>> This is not accessible 
		
		//********************************>>>>>>>>>>>>>>>> when nothing is done simply inherited 
		
		
		
//	  Dog obj = new Dog();
//	  
//	  obj.sound();
//	 System.out.println(obj.s="Martin");
//	 System.out.println(obj.id=100); 
//	  
		
		
		//********************************>>>>>>>>>>>>>>>> When downcasting  is done
		
		 Animal  obj = new Dog();
		Dog d = (Dog)obj;// Here we have done downcasting
		
		// After downcasting is done the child class methods are accessible even if object is upcasted as shown
		System.out.println(d.id=100);
		d.sound();
		
		/*Upcasting: Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. 
		 * Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child 
		 * class members using this feature. Instead of all the members, we can access some specified members of the child class. 
		 * For instance, we can access the overridden methods.
Downcasting: 
Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicitly.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

	public void sound() {
	
	System.out.println("Bow Bow");
	
	
} 
}