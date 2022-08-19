package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroeknLinks {

	
	
	public static void main(String[] args) throws MalformedURLException, IOException {
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.3.1");
		 
      String ref =	driver.findElement(By.linkText("189 artifacts")).getAttribute("href");
		 
     HttpURLConnection conn =  (HttpURLConnection)new URL(ref).openConnection();
     
     
     
     conn.setRequestMethod("HEAD");
		 conn.connect();
		int code= conn.getResponseCode();
		 
	System.out.println(code);
	
	
	}
	

}
