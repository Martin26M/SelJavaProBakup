package Superkeyword;

public class Dog extends Animal {

	
	public void Testsuper1() {
		super.Testsuper(); 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Dog obj =  new Dog();
		obj.Testsuper1();// Here both the methods from child and parent will be called 
		            //eventhough we have overriden the method in the child class because of super keyword
		
	}

}
