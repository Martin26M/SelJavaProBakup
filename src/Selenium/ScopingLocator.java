package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScopingLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		WebElement src= driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]"));
		
		WebElement link= driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul/li[2]"));
		String  key= Keys.chord(Keys.CONTROL,Keys.ENTER);
		String rightclick =Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		link.sendKeys(key);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(""))).keyDown(Keys.ALT).sendKeys(Keys.SHIFT,"Martin");
		
		
		
		
//		
//		WebDriverWait w= new WebDriverWait(driver,5); 
//	
//       w.until(ExpectedConditions.visibilityOf(element));
		
		int count = src.findElements(By.tagName("a")).size();
		System.out.println(count );
	}

}
