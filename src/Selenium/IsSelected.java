package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 
		if( driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			
			System.out.println("Is enabled");
			boolean b= driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			System.out.println(b);
		}
		else {
			System.out.println("Is not enabled");
		}
	}

}
