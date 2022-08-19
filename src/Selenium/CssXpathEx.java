package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Customizing xpath & css
		
		//Tagname , Attribut , Value
		
		//  Xpath - 
		
		//....//tagname[@attribute='value']   >> Syntax for xpath
		
		// If you want to skip tagname then use >>> //*[@attribute='value'] 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 //driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("Martin");// using xpath
		 
		
		 //*********************************************************Dynamic Xpath******************8
		 //tagname[contains(@id,'id name')] // Partial Text
		 //tagname[starts-with(@id,'')]
		 //tagname[ends-with(@id,'')]
		 
		 
		
		 
		 //tagname[contains(text(),'actual text')]
		 
		 //tagname[text(),'actual text']
		 
		 //*************************************************************************************
		 
		 //**************************************************CSS*******************
		 
		// ......tagname[attribute='value']   >> Syntax for css no // & @ used
		 
		// If you want to skip tagname then use >>> //[attribute='value'] for CSS 
		 
		 driver.findElement(By.cssSelector("input[name='email'] ")).sendKeys("Martin");
		 
		 // Contains text for xpath
		 
		//tagname[contains(text(),'actual text')]
		 //tag[text()='']
		 
		 //..... tagname[attribute*='actual text']
		 
		 //CSS>> <tag>nth-child(n) to find nth child of elements with n number of tags 
	}

}

//h3[@class='rsba-h3 bold-font']//following-sibling::review-star //div[@class='rating-box-wrapper']/svg
