package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));
		 
	      int listofFrame= 	 framesList.size();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 Thread.sleep(4000);
		
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		
		 boolean b= driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isEnabled();
		 if(b==false) {
		System.out.println( driver.findElements(By.xpath("//input[@type='checkbox']")).size());// finding the number of checkboxes present
		 }
		 
		 // should create a arraylist find the elements and then find the element 
		 else{
			 
			 System.out.println("Not found");
		 }
	}

}
