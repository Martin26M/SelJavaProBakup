
import java.util.Scanner;
public class NewPratct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		 {
		  Scanner scn = new Scanner(System.in);
		  
		  System.out.println("Enter String : ");
		  
		  String input = scn.nextLine();
		  
		  String arr[]=input.split("");
		  
		  StringBuffer str = new StringBuffer(arr[0]);
		  
		  StringBuffer str1 = new StringBuffer(arr[arr.length-1]);
		  
		  System.out.print(str.reverse()+" ");
		  
		  for(int i=1;i<=arr.length-2;i++)
			  
		  {
		  System.out.print(arr[i]+" ");
		  }
		  System.out.println(str1.reverse());
		 }
		}
		
	}


