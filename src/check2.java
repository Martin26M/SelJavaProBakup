
public class check2 extends supercheck 
{
	
	check2(String str ) {
		super(str);
		super.display();
	
	}
	
	public void display() {
		
		
		System.out.println("Not in check2 as method overriding ");
	}

	public void checking () {
		
		System.out.println("Marton");
		
	}

	public static void main(String[] args) {

      String s = "Mrtin";
		check2 c = new check2(s);
		c.checking();
		c.display();


	}

}
