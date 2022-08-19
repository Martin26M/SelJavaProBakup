package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorsscrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,700)");// from the javascript of the website
		 
		 js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
		js.executeAsyncScript(arg0, arg1)
		 
		 WebElement element = driver.findElement(By.id("xyz"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);// Scrollintg to partivular element
		
		 js.executeScript("document.getElementById('id name or anything like class ').click()");// in case the element is hidden or not present in the DOM
		// document.getElementsByClassName
		 //document.getElementsByName
		 
		 driver.navigate().to(arg0);;
		 driver.navigate().back();
		 driver.navigate().refresh()

	}
	
	

}
