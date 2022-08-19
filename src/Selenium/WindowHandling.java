package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 
		 WebDriverWait w = new WebDriverWait(driver,5);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".blinkingText")));
		 driver.findElement(By.cssSelector(".blinkingText")).click();
		
		 Set<String> windows = driver.getWindowHandles();
		 
		Iterator <String >itr= windows.iterator();
		 
		String parentid = itr.next();
		String childid = itr.next();
		
		driver.switchTo().window(childid);
	String s= 	driver.findElement(By.cssSelector(".im-para.red")).getText();
	String email= s.split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(parentid);
	
	driver.findElement(By.id("username")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys("123123");
	}

}
