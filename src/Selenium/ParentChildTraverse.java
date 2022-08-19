package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Systemr = new ChromeDriver();.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver drive
		
		// Absolute Xpath >> Xpaths for which parent child traverse is required
		//Relative Xpath >> No parent child traverse is required
		 driver.get("https://www.google.com/");
		 
		 //Syntacx for parent child travrese >> //tag[@attribut='val']/div/li[2](if there are 2 li's which are siblings and we need 2nd li) single hash
		//Syntax for sibling traverese using following-sibling::
		 
		 
	//	driver.findElement(By.xpath("//div[@class='iblpc']/input/following-sibling::div[2]")).sendKeys("Hello");
		 //Sample of  sibling traverse using following sibling syntax , this is used when the parent is stable and we cant use parent child traverse.
		 
		
		 // Shortcusts for Css selector Syntax
		 
		 //1. #id 
		 //2. .classname(if there is a gap in between class name use .)
		 
		 
		 
		 
		 
		 
	}

}
