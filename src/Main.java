public class Main {
  int z=100;;
static int k;
  // Constructor with a parameter
  public static void  Maining(int x, int y) {
    z=200;// static methods cannot access instance variables.
    k=5000;// static methos can access only static variables 
   y=200;
   x=300;
   System.out.println(y);
   System.out.println(x);
  }

  // Call the constructor
  public static void main(String[] args) {
    Main myObj = new Main();
    Main.Maining(50, 60);
    System.out.println("Value of y = " + myObj.y);
    
    
  }
}