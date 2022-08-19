package Selenium;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class letcode {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://computer-database.gatling.io/computers");
		Assert.assertEquals("Computer database", driver.findElement(By.xpath("//h1[@class='fill']/a")).getText());
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@value='Filter by name']")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.xpath("//a[@class='btn success']")).isDisplayed());
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='computers zebra-striped']/thead/tr/th"));

		List<String> elements = new ArrayList<String>();
		for (WebElement res : list) {

			elements.add(res.getText());

		}

		if (elements.contains("Computer name") & elements.contains("Introduced")) {
			System.out.println("Passed");

		} else {

			System.out.println("gadbad");
		}

		Assert.assertEquals(true, driver.findElement(By.xpath("//li[@class='current']")).isDisplayed());
		driver.findElement(By.xpath("//a[@class='btn success']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='name']")).getCssValue("color"));
		System.out.println(
				Color.fromString(driver.findElement(By.xpath("//input[@id='name']")).getCssValue("color")).asHex());
		Select s = new Select(driver.findElement(By.xpath("//select[@id='company']")));
		s.selectByValue("16");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Martin");
		driver.findElement(By.xpath("//input[@value='Create this computer']")).click();
		Assert.assertEquals("Done ! Computer Martin has been created",
				driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText());
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("martin");
		driver.findElement(By.xpath("//input[@id='searchbox']//following-sibling::input")).click();
		
//	HttpURLConnection uu = 	(HttpURLConnection)new URL(driver.findElement(By.xpath("")).getAttribute("")).openConnection();
//	uu.setRequestMethod("HEAD");	
//	uu.connect();
//	uu.getResponseCode();
		
//                File  shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(shot, new File (System.getProperty("User.dir")+"") );
		
	
//		

	 }

}
