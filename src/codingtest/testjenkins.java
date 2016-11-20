package codingtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testjenkins {
	
	@Test
	public void test(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\meetg\\Downloads\\chromedriver.exe");
	WebDriver  driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("sonam.sharma2407");
	}

}
