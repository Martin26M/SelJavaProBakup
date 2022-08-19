import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunct {
	
	
	
	public void LoginFunction( ) {
		
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String shiftkey =Keys.chord(Keys.SHIFT);
		driver.findElement(By.xpath("")).sendKeys(shiftkey, "Martin");
		Keys.chord(Keys.CONTROL)
		
	}

}
