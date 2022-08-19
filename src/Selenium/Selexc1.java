package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Selexc1 {
			public static WebDriver driver;
			public static void capturescreenshot() throws IOException {
				
		         File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					
					FileUtils.copyFile(screenshotFile,new File(".//screenshot//error.jpg"));
				}

			
			 
			public static void main(String[] args) throws IOException  {
				// TODO Auto-generated method stub
				
				

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver = new ChromeDriver();
			//	driver.get("https://www.google.com");
				//driver.manage().window().maximize();
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
			//	driver.get("www.yahoo.com");
				//driver.navigate().back();
				//driver.navigate().forward();
			//	driver.close(); // closes current browser 
				//driver.quit();// closes all the browsers run by selenium script
				 
				 
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).click();
				driver.findElement(By.id("email")).sendKeys("Martin");
				//driver.findElement(By.name("login")).click();>>> finding element by name
				
				driver.findElement(By.id("pass")).sendKeys("hello");
				
			//driver.findElement(By.linkText("Forgot your password?")).click();>>>>finding element by linkText
				// Locators 
				capturescreenshot();
			//	driver.findElement(By.id("u_0_b")).click();
				
				System.out.println(driver.findElement(By.id("u_0_b")).getText());
				
				
			/*
			 * ID
			 * ClassName
			 * Name
			 * linkText
			 * Xpath
			 * Css
			 * 
			 */
				
				// Classname with spaces selenium will not work 
				// Multiple(duplucate ) values  selenium identifies the first one  and scans from top left 
				
				
				/*
				 * Validating the accuracy of xpath 
				 * 
				 * Go to console & put 
				 * $x( "....xpath in singlequote...." )
				 * 
				 *  Validating the accuracy of css
				 *  
				 *  Go to console & put 
				 *  $( "....css in signlequote...." ) >>> no use of x for css
				 * 
				 * 
				 */
				}

		

	}