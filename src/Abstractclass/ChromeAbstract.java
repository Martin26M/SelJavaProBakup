package Abstractclass;

public class ChromeAbstract extends WebdriverAbstract{

	
	public  void click(){
		
		System.out.println(" Click- Chrome");
		
	}// Abstract  Methods created in the parent class WebdriverAbstract is being overriden and made non abstract 
	// Note: Abstract class are being used so we dont forget to override the methods written in parent class
	
	
	
	public  void sendkeys() {
		System.out.println(" Send- Chrome");
		
		
	}
		
	public   void gettitles() {
		
		
		System.out.println(" Get- Chrome");
		
	}
public   void test() {
		
		
		System.out.println("Implemented in child  class");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeAbstract obj = new ChromeAbstract();
		
		obj.click();
		obj.sendkeys();
		obj.gettitles();
		obj.gettitles();
		obj.test();
	}

}
