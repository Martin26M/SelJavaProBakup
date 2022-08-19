package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
		String calendar = "18/June/2028";
		String [] datep= calendar.split("/");
		 String day= datep[0];
		 String month = datep[1];	
		 String year= datep[2];
		 
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/date-picker");
		 Thread.sleep(3000);
		WebElement driver1= driver.findElement(By.id("datePickerMonthYearInput"));
		 driver1.click();
		 driver.findElement(By.className("react-datepicker__month-select")).click();
		 Select s = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		 s.selectByVisibleText(month);
		 
		 
		 driver.findElement(By.className("react-datepicker__year-select")).click();
		 Select s1 = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		 s.selectByValue("2028");;// need to check for the month
		 
		
	}

}
