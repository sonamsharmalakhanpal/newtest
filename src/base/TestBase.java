package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExcelReader;
import utilities.capturescreenshotutility;


public class TestBase {
	
	/*WebDriver Browser
	 * properties Config, OR
	 * excel
	 * logs// 
	 * java mail	 *     
	 *     
	 *     
	 *     */
	
	public static WebDriver driver;
	public static Properties Config= new Properties();
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"//src//utilities//TestData.xlsx");
	public static FileInputStream fis;
	

	
	@BeforeSuite
	public void setup(){
		
		if(driver==null){
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"//properties//Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(Config.getProperty("browser").equals("ie")){
				
				System.getProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}else if(Config.getProperty("browser").equals("chrome")){
				
				System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			
				
			}else if(Config.getProperty("browser").equals("firefox")){
				driver = new FirefoxDriver();
			}
			
			
			driver.navigate().to(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			
			// Login
			
			/*driver.findElement(By.xpath("")).sendKeys("");
			driver.findElement(By.xpath("")).sendKeys("");
			driver.findElement(By.xpath("")).click();*/
			
			
			driver.findElement(By.xpath(".//*[@id='gmail-sign-in']")).click();
			driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("sonam.sharma2407@gmail.com");
			driver.findElement(By.xpath(".//*[@id='next']")).click();
		    driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("sonam@123");
		    driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		    
		    
			
			
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException{
		
	
		
		try {
			Calendar cal = new GregorianCalendar();
			int month = cal.get(Calendar.MONTH);
			int year = cal.get(Calendar.YEAR);
			int sec = cal.get(Calendar.SECOND);
			int min = cal.get(Calendar.MINUTE);
			int date = cal.get(Calendar.DATE);
			int day = cal.get(Calendar.HOUR_OF_DAY);
			capturescreenshotutility.captureScreenshot(driver, ""+year+""+date+""+(month+1)+""+day+""+min+""+sec+"");
		} catch (IOException e) {
			e.printStackTrace();
		}
//				driver.quit();
		
	}

}

