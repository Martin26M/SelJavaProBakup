package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("");;
		Thread.sleep(4000);
		List <WebElement> drodowns = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement dropdowns:drodowns) {
			
			if(dropdowns.getText().equalsIgnoreCase("India")) {
				
				dropdowns.click();
			}
			
		
		
		}
		
		
	}

}
