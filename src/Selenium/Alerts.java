package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demoqa.com/alerts");
		 Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
WebElement ele =		driver.findElement(By.xpath(null));
Point point  =ele.getLocation();
int xcord =point.getX();
int ycord =point.getY();
		System.out.println(driver.switchTo().alert().getText());
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
		
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 wait.until(ExpectedConditions.alertIsPresent());//To check if the alert is present in case of dynamic alert
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 
		 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 
	}

}
