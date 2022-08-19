package TestNG;

import org.testng.annotations.Test;

public class RetryTestNG{
	
	
	@Test(retryAnalyzer = Analyzer.class)// If packg is there we have to give .packagename
	
	public void checking() {
		
		
		
		
	}
	
	
	

}
