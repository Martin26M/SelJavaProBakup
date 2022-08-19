package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NEw {
		
	
		
		
		WebDriver driver;	
		
		@Test(dataProvider ="newdata")
		public void testmethod  (String Url, String username, String password) {
			
			System.out.println(Url);
			System.out.println(username);
			System.out.println(password);
			
//			driver.get(Url);
//			driver.findElement(By.id("username")).sendKeys(username);
//			driver.findElement(By.id("password")).sendKeys(password);
		}
		
		
		
		public Object[][] newdata() {
			
			Object[][] data = new Object[3][3];// We have to run 3 times with 3 datas
			
			data[0][0]="data1";
			data[0][1]="data2";
			data[0][2]="data3";
			
			data[1][0]="data1";
			data[1][1]="data2";
			data[1][2]="data3";
			
			data[2][0]="data1";
			data[2][1]="data2";
			data[2][2]="data3";
			return data;
			
			
			
		}
		
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
		}

	}


