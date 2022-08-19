package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PracticeInterview {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 
	 driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
	 driver.manage().window().maximize();
	 
//	 driver.findElement(By.xpath("//a[text()='Login']")).click();
//	 driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("martmathew26@gmail.com");
//	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("M@rtin26");
//	 driver.findElement(By.xpath("//div[@class='btns']//following-sibling::button")).click();
	 
	// driver.navigate().to("http://wallethub.com/profile/test_insurance_company/");
//	 WebDriverWait w0 = new WebDriverWait(driver,5);
//	 w0.until(ExpectedConditions.urlToBe("http://wallethub.com/profile/test_insurance_company/"));
	
	
//	 
		WebElement e=  driver.findElement(By.xpath("//h3[@class='rsba-h3 bold-font']//following-sibling::review-star//*[name()='svg'][4]"));
//		 WebElement e1= driver.findElement(By.xpath("//h3[@class='rsba-h3 bold-font']//following-sibling::review-star//*[name()='svg'][3]"));
//		
//	 JavascriptExecutor js =(JavascriptExecutor) driver;
//		
//		js.executeScript("arguments[0].scrollIntoView(true)", e);
//		
//	 
   // WebDriverWait w = new WebDriverWait(driver, 10);
	 //w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[@class='rsba-h3 bold-font']//following-sibling::review-star//*[name()='svg'][4]"))));
	 

	 
	Actions a = new Actions(driver);
	a.moveToElement(e).click().build().perform();
//	
	
	WebDriverWait w11 = new WebDriverWait(driver, 10);
	w11.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']"))));
	driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']")).click();

	
	WebDriverWait w = new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']/div/ul/li[2]"))));
//	WebElement e1= driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']/div/ul/li[2]"));
//	JavascriptExecutor js =(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click", e1);
	
	
	driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']/div/ul/li[2]")).click();
	
	//driver.findElement(By.xpath("//div[@class='android']/textarea")).sendKeys("Hi");
	//driver.findElement(By.xpath("//div[@class='sbn-back']//following-sibling::div")).click();
	 
  String s= driver.findElement(By.xpath("//article[@data-rvid='2140913965']")).getText();
       System.out.println(s);
      if(s.contains("Manual TestManual TestManual")) {
   	   
    	 Assert.assertTrue(true);
       }
}
