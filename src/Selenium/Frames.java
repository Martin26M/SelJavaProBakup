package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.List;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));// Using switch to from to reach the element 
		 		
		// Using action class to drag and drop
		 WebElement source= driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 Actions a = new Actions(driver);
		 a.dragAndDrop(source, target).build().perform();
		 String colorAfterDnD = target.getCssValue("color");
		 System.out.println(colorAfterDnD);
		 driver.switchTo().defaultContent();// To switch to the main page again.
		 
Set <String> s1=	driver.getWindowHandles();
List <WebElement>l1= driver.findElements(By.xpath(""));


	}

}
