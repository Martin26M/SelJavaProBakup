package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class AssertionsTest {

	WebDriver driver;
	
	@BeforeMethod
	
	public void getdata() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		
		
		
	}
	
	@Test
	
	public void tes1() {
		
		System.out.println(driver.getTitle());
		 
		String b= driver.getTitle();
	
		Assert.assertEquals(b, "Goole","Title is not matched");// Here we are comparing the data 
	
	}
	
	@Test
public void tes2() {
		
		
		 boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		 
		 Assert.assertTrue(b);// Here we are comparing the boolean 
			
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
