package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demoqa.com/buttons");
		 
		WebElement element =driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div/div[3]/button"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);
	String tect =(String) js.executeScript("arguments[0].getText()", element);
	js.executeScript("arguments[0].scrollIntoView(true)", element);

}}
