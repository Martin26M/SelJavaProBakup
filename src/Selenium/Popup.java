package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.id("email")).sendKeys("testmeagain12345@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Hello@world12345");
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 
		
		 
		
				  
				      WebDriverWait w= new WebDriverWait(driver, 100);
					 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Facebook']")));
					 driver.findElement(By.xpath("//a[@aria-label='Facebook']")).click();
				
			 
					 WebDriverWait w1= new WebDriverWait(driver, 100);
					 w1.until(ExpectedConditions.elementToBeClickable(By.xpath(" //div[@aria-label='Create a post'] //div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 ni8dbmo4 stjgntxs kbf60n1y']")));
		 driver.findElement(By.xpath(" //div[@aria-label='Create a post'] //div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 ni8dbmo4 stjgntxs kbf60n1y']")).click();
		 String s= driver.getWindowHandle();
		 driver.switchTo().window(s);
	 driver.findElement(By.xpath("//div[@class='rq0escxv buofh1pr df2bnetk hv4rvrfc dati1w0a l9j0dhe7 k4urcfbm du4w35lb gbhij3x4']")).sendKeys("Hello Martin");
	

	}

}
