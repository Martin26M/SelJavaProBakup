package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(8000);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//***** >>>> Wrapping the Xpath to 2nd index as the Element becomes invisible once
	                                                                      //bangalore is selected so that Chennai is selected from 2nd dropdown 
	
	
	
	// **** Also we can select the Xpath of the Parent and use it with the child Xpath to select that particular child in the above case it will be
	
	
	// Here we have found the xpath of the parent and then given a space and then added the xpath of the child (origin station)
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
	
	
	// Here we have found the xpath of the parent and then given a space and then added the xpath of the child to select chennai from its parent(destination station)
	
	driver.findElement(By.xpath("//div[@d='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
