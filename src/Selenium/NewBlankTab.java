package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewBlankTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://login.salesforce.com/?locale=eu");
		 
	String tabKEy =	 Keys.chord(Keys.CONTROL, Keys.DOWN);
	Actions a = new Actions (driver);
	
	a.moveToElement(driver.findElement(By.linkText("Forgot Your Password?"))).keyDown(Keys.CONTROL).click().build().perform();

	
	Set<String> wins = driver.getWindowHandles();

 Iterator <String> res=  wins.iterator();
	String parent = res.next();
	String child= res.next();
	driver.switchTo().window(child);
	String url =driver.getCurrentUrl();
	System.out.println(url);
	driver.navigate().to("https://login.salesforce.com/?locale=eu");
		 

	}

}
