package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class opennewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://login.salesforce.com/?locale=eu");
		 
	//	String ctrl = Keys.chord(Keys.CONTROL+"t");
		 
		
		Actions a  = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[@id='signup_link']"));
		 a.moveToElement(link).keyDown(Keys.CONTROL).click().build().perform();
		driver.findElement(By.cssSelector("body")).sendKeys((Keys.CONTROL +"t"));
		//driver.switchTo().newwindow(WindowType.Tab);-> NEw feature in sel 4
	}

}
