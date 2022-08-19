package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//>>> Impplictly waiting Dec;ared globally
		 
		 driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		 driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		 WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']//div[1]")));// Here we will use by.locator for adding the time 
		 System.out.println(driver.findElement(By.xpath("//div[@id='content']//div[1]")).getText());
		// w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(""))
	
	}

}
