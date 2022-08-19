
public class BaseClass {
	
	
	public WebDriver  getBrowserinst( String browsername) {
		
		if (browsername=="firefox") {
			
			
			return new FireFoxDriver();
		}
		

		if (browsername=="chrome") {
			
			
			return new ChromeDriver();
		}
		else {
			
			return new ChromeDriver();
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
