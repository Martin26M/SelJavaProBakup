package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.hdfcbank.com/");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));// return type of element is List 
	
	WebElement e= 	driver.findElement(By.tagName("a"));// return type of element is WebElement 
				
				System.out.println("Tagnumbers"+driver.findElements(By.tagName("a")).size());
				
				for (WebElement ele : element ) {
					
					
					
					System.out.println(ele.getText());
					
				}
		 
	}

}
