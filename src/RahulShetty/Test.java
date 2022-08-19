package RahulShetty;


	
	import java.util.Scanner;

	public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  {
				    /*
				     * check If boolean value set to TRUE, return a string length 1 from its
				     * beginning, if its set to FALSE, return a string length 1 from its end. Note :
				     * The string will be non-empty. Ex1:("Hello", true) → "H" Ex2:("Hello", false)
				     * → "o" Ex3:("oh", true) → "o
				     */    
				    Scanner sc1,sc2;
				    System.out.println("enter the string");
				    sc1=new Scanner(System.in);   
				   
				    String str=sc1.next();
				    
				    System.out.println("enter the boolean value");
				    sc2=new Scanner(System.in);
				    
				    boolean b=sc2.nextBoolean();
				  
				    
				    if(b==true)
				    {
				      System.out.println(str.charAt(0));
				    }
				    else
				    System.out.println(str.charAt(str.length()-1));
				    sc1.close();
				    sc2.close();
				  }

				}
			
		}



