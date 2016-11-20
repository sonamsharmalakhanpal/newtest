package codingtest;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class readingPropertyfile {
	
	 
    @Test
	public void readtextfilemethod()throws IOException {
		
				
		Properties prop1 = new Properties();	       
		FileInputStream fis1 = new FileInputStream("C:\\Users\\meetg\\workspace\\newtest\\src\\properties\\config.properties");
		prop1.load(fis1);
		
		Properties prop2 = new Properties();				
		FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"\\src\\properties\\object.properties");
		prop2.load(fis2);
		
		
		
		

		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to(prop1.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		driver.findElement(By.id(prop2.getProperty("email"))).sendKeys("sonam.sharma2407@gmail.com");
		driver.findElement(By.id(prop2.getProperty("next"))).click();
		driver.findElement(By.id(prop2.getProperty("password"))).sendKeys("sonam@123");
		driver.findElement(By.id(prop2.getProperty("login"))).click();
				
				

		
		
	}

}
