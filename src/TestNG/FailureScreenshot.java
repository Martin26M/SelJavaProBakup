package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listners.class)
public class FailureScreenshot extends Base {
	
	@BeforeTest
	
	public void setUp() {
		
		Initialization();
		
	}
	
	@Test
	
	public void TestingFailureScreenshot() {
		
		
		Assert.assertEquals(true, true);
		
		
	}
	
	@Test
	
     public void TestingFailureScreenshot2() {
		
		
		Assert.assertEquals(true, true);
		
		
	}
	
	@Test
	public void takesreenshot() throws IOException {
		
		
		
		File src =((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\HP\\eclipse-workspace\\SelJava\\FailiureScreenshots"+"file.jpg"));
	
	}
	

}
