package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	
	
	
	public void Initialization() throws IOException {
		
	File fil =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fil, new File("")) ;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.get("https://automationreinvented.blogspot.com/2021/01/java-interview-questions-for.html?m=1");
		
	}
	
	
		
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File ("C:\\Users\\HP\\eclipse-workspace\\SelJava\\FailiureScreenshots"+testMethodNme+".jpg"));
		
		
		
	
	

}
