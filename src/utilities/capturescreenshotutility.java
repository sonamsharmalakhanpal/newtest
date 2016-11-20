package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class capturescreenshotutility {
	
	public static void captureScreenshot(WebDriver driver, String ScreenshotName) throws IOException
	{
	
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\GTAC_AutomationData\\Screenshots\\"+ ScreenshotName +"_"+""+year+""+date+""+(month+1)+""+day+""+min+""+sec+""+".png"));
		System.out.println("screenshot Taken "+ScreenshotName);
		
			 
			/*TakesScreenshot ts =(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("C:\\GTAC_AutomationData\\Screenshots\\"+ ScreenshotName +".png"));
			System.out.println("screenshot Taken "+ScreenshotName);*/
			
		 	}
	}


