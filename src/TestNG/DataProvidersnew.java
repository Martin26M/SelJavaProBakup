package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvidersnew {
public static 	 WebDriver driver;
	@BeforeMethod
	public void check(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		
	}
	
	@Test 
	@Parameters({"Martin"}{"Mathew"})
	public void checkParameters() {
		
		
		
		
		
		
	}
	

   @Test(dataProvider="TestData")

     public void checkDataProvider(String username , String Passowrd) {
	
	driver.get("https://login.salesforce.com/?locale=eu");
   driver.findElement(By.id("username")).sendKeys(Passowrd);
	
    }

   
   @DataProvider(name ="TestData")
   public Object[][] getData() {
	   
	   
	   Object[][]  data = new Object[2][2];
	   
	   data[0][0]= "Martin";
	   data[0][1]="M@rtin26";
	   
	   data[1][0]="NewNAme";
	   data[1][1]="NewPassword";
//	   
//	   data[2][2]="";
//	   
	   return data;
   }
   
   
   
}
