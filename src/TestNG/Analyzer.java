package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class Analyzer implements IRetryAnalyzer {

	int count =0;
	int retrycount =3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count< retrycount) {
			
			count ++;
			return true ;
			
			
		}
		else {
		return false;
		}
	}

	
}
