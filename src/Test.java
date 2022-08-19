
public class Test extends BaseClass {
	
	String browsername ="Chrome";
	public void initBrowser () {
		
	
		WebDriver driver = getBrowserinst(browsername);
		
			
		driver.Click();
		driver.GetTitle();
		 
	
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		t.initBrowser();
	}

}
