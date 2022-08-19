package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class amazonCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 
				 driver.get("https://www.amazon.in/");
				 
				 driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			List<WebElement> check = driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/following-sibling::li"));
			
			
			for (WebElement res: check) {
				
			String texts= 	res.getText();
			System.out.println(texts);
			if (texts.contains("Shop By Department")) {
				break;
				
			}
				
			}

	}

}
