package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement as= driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).doubleClick();
	
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();// To right click 
		//driver.findElement(By.xpath( "//span[contains(text(),'Your Wish List')] ")).click(); 
		
		String shift = Keys.chord(Keys.SHIFT, Keys.ENTER);
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("martin").build().perform();// To send the keys in capital
	
//	driver.findElement(By.xpath("")).click()
//	a.moveToElement(driver.findElement(By.xpath(""))).click().keyDown(Keys.SHIFT).sendKeys("Martin").build().perform();
	
//	a.moveToElement(driver.findElement(By.xpath(""))).keyDown(Keys.SHIFT)
//	a.dragAndDrop(as, as);
	
	
	
	
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//a.moveToElement(driver.findElement(By.id(""))).click();
	
	FileUtils.copyFile(src, new File("C:\\Users\\HP\\Downloads\\datadrivennew"));

	driver.switchTo().defaultContent();
	
	}

}
