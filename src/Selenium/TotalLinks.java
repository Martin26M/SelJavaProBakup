package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TotalLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement footer = driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][3]"));

		List<WebElement> liks = footer
				.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][3]/ul/li"));
		for (int i = 0; i < liks.size(); i++) {
			Actions a = new Actions(driver);
			a.moveToElement(liks.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			
		}
	}

}
