class Animal { // Superclass (parent)
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }


public void agaisound() {
	
	  System.out.println("The animal makes sound agaain");
	
}
}
class Dog extends Animal { // Subclass (child)
  public void animalSound()
  
  {
    super.animalSound(); // Call the superclass method
    super.agaisound();
    System.out.println("The dog says: bow wow");
  }
}

public class SuperAgain {
	
	
	 public static void main(String args[]) {
		    Animal myDog = new Dog(); // Create a Dog object
		    myDog.animalSound();
//		    Dog d = (Dog)myDog;
//		    d.animalSounding(); // Call the method on the Dog object
		  }
}
 
