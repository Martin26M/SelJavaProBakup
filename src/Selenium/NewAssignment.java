package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]"))).build().perform();
	
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li/ul/li[1]//a[@title='T-shirts']")).click();
		
		try {
			Thread.sleep(5000);
			a.moveToElement(driver.findElement(By.xpath("//a[@title='View']/span"))).click().build().perform();
			
		}
		catch (Exception e){
			
			System.out.println("Here is the erro");
			e.printStackTrace();
		}
		

		WebElement drop = driver.findElement(By.xpath("//select[@id='group_1']"));
		WebElement hiddentdata =driver.findElement(By.id("quantity_wanted"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//String quantity = js.executeAsyncScript("arguments[0].text", hiddentdata).toString();
		
		String data =(String) js.executeScript("arguments[0].text", hiddentdata);
		
		System.out.println(data);
		Select s = new Select(drop);
		s.selectByValue("2");
//		if (quantity.equalsIgnoreCase("1")) {
//			s.selectByValue("2");
//			
//		}
//		else {
//			
//			System.out.println("Quanotut is not 1");
//		}

	}
}
