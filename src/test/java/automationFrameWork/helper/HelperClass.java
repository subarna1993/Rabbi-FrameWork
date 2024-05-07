package automationFrameWork.helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {

	static WebDriver driver;

	public static WebDriver callDriver() {
		driver = new ChromeDriver();
		driver.get("https://agile1test.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	public static void callLogin(){
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Kapow");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kapow-Heroes01");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
