package Polymorphicreference;

public class Base extends Webdriver{
	
	
	
	public Webdriver  getBrowserInstance(String BrowserNAme)// Here method return type is webdriver as all the below objects "FirefoxDriver,Chromedriver etc are extends the Webdriver class
	
	{
		if (BrowserNAme.equals("firefox")) {
			
			return new  FirefoxDriver();// returning the object  for firefoxdriver class which extends webdriver class -Polymorphic reference 
			
		}
		
		
		else if (BrowserNAme.equals("chrome")){
			
			return new Chromedriver();// returning the object  for Chromedriver class -Polymorphic reference 
			
			
			
		}
		
		else 
		{
			return new IEDriver();// returning the object reference for IEDriver  class -Polymorphic reference 
			
			
			
		}
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {

		
		
		
		
		
		
	}

}
