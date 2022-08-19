package Selenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");
		
		 String url = driver.findElement(By.xpath("//a[contains(text(),'Broken Link')]")).getAttribute("href");
		 
		// HttpURLConnection conn  =	(HttpURLConnection) new URL(url).openConnection();
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
	   
		 conn.setRequestMethod("HEAD");
		 conn.connect();
		int code=  conn.getResponseCode();
		System.out.println(code);
		
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	
	FileUtils.copyFile(src, new File("F:\\chromedriverfile\\screenshot.png"));
	
	}

}
