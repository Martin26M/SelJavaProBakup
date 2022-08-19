package Polymorphicreference;

public class TestCase1 extends Base
{

	String BrowserNAme= "firefox";
	

	public void InitBrowser() {
		
		
	

		Webdriver driver =  getBrowserInstance(BrowserNAme);// Here we have done the Polymorphic reference(changing the type) to catch the obj reference from Base class
		driver.click();
		driver.sendkeys();
		driver.gettitles();
		
	}
	
	
	public static void main(String[] args) 
	
	{
		
		// TODO Auto-generated method stub
		/*Chromedriver obj = new Chromedriver();

		
		/*obj.click();//Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
		obj.sendkeys();//Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
		obj.gettitles();//Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
		
		/*FirefoxDriver obj1 = new FirefoxDriver();
		
		obj1.click(); //Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
		obj1.sendkeys(); //Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
		obj1.gettitles(); //Overriding of menthod in Webfriver and changing the content fpr Chromedriver class
	
	*/
		TestCase1 tc = new TestCase1();
		tc.InitBrowser();

}
}