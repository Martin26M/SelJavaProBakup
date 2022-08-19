
 public class supercheck {

	
	 supercheck(String str ){
		
		
		System.out.println(str);
		
	}
	 
	 supercheck(String str, int i )// construtor overloading 
	 
	 {
			
			
			System.out.println(str+" "+ i);
			
		}
	 public void display() {
		 
		 
		 System.out.println("display me ");
	 }
	
public static void main(String[] args) {
	String m ="MMM";
	
	int i = 100;
	supercheck cc = new supercheck(m);
	supercheck c1 = new supercheck(m, i);
	
}
	


}




