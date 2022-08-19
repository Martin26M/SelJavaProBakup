package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
	WebElement ele =driver.findElement(By.xpath("//div[@id='withOptGroup']"));
ele.click();
//driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
//driver.findElement(By.xpath("//div[@id='selectOne']")).click();
//
//driver.findElement(By.xpath("//*[text()='Dr.']")).click();

List<WebElement> list  =driver.findElements(By.xpath("//div[@class='css-yk16xz-control']/div[1]/div[1]"));

for (WebElement res: list) {
	
	System.out.println(res.getText());
}

	}

}
