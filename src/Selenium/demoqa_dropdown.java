package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class demoqa_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement select =driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s = new Select(select);
		Assert.assertEquals(true, select.isEnabled());
		
		s.selectByVisibleText("Afghanistan");
	}

}
