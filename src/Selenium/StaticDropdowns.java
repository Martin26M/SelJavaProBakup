package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.spicejet.com/");
		 
		 
		WebElement dropdowns = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));// return type is webElement which is being stored in the dropdowns .
		
		
		Select drodown = new Select(dropdowns);
		
		drodown.isMultiple();
		drodown.selectByIndex(2);
		
		drodown.selectByVisibleText("BDT");
		drodown.selectByValue("AED");
		
		driver.switchTo().frame(arg0)
		driver.switchTo().fr
		
		String selectA = Keys.chord(Keys.CONTROL, "A");
		
		// Using the for loop for multiple clicks
		
		
	}

}
