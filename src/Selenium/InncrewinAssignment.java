package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class InncrewinAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		String headertext = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		Assert.assertEquals(headertext, "Frames");
		driver.findElement(By.xpath("//*[text()='iFrame']")).click();
		String headertext2 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		if (headertext2.contains("TinyMCE ")) {

			System.out.println("its there");

		} else {

			System.out.println("its not there");
		}

		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();

		driver.switchTo().defaultContent();

		List<WebElement> menu = driver.findElements(By.xpath("//div[@role='menubar']/button"));

		for (WebElement lists : menu) {

			if (lists.getText().contains("File") || lists.getText().contains("Edit")) {

				System.out.println("MEnu is presetn");

			}

			else {

				System.out.println(lists.getText()+"Its mot there");
			}
		}

		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Test");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//body[@id='tinymce']"))).doubleClick().build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@role='menubar']/button[4]")).click();
		a.moveToElement(driver.findElement(By.xpath("//div[@title='Formats']/div[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@title='Headings']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@title='Heading 1']"))).click().build().perform();
		

	}

}
