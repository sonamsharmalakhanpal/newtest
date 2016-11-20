package codingtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mx4j.tools.adaptor.http.SetAttributeCommandProcessor;
import utilities.ExcelReader;

public class excelfilereading {
    @Test(dataProvider="getData")
	public void excelpractise(String UserName, String Password) throws IOException {
    	
    	
    	/*
    	System.out.println(UserName);
    	System.out.println(Password)*/;
		
	/*	
		/*ExcelReader exl = new ExcelReader("C:\\Users\\meetg\\Documents\\TestData.xlsx");
		String sheetName = "Login";
		
		//row count
		System.out.println(exl.getRowCount(sheetName));
		//cols count
		System.out.println(exl.getColumnCount(sheetName));
		
		//to read data from excel
		System.out.println(exl.getCellData(sheetName,1,2));*/
		
		//selenium use
		
     	Properties prop1 = new Properties();	       
		FileInputStream fis1 = new FileInputStream("C:\\Users\\meetg\\workspace\\newtest\\src\\properties\\config.properties");
		prop1.load(fis1);
		
		Properties prop2 = new Properties();				
		FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"\\src\\properties\\object.properties");
		prop2.load(fis2);
		
		try {
			
			WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to(prop1.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
			driver.findElement(By.id(prop2.getProperty("email"))).sendKeys(UserName);
			driver.findElement(By.id(prop2.getProperty("next"))).click();
			driver.findElement(By.id(prop2.getProperty("password"))).sendKeys(Password);
			driver.findElement(By.id(prop2.getProperty("login"))).click();
			
			
			String expected = driver.findElement(By.xpath("//div[@class='aos T-I-J3 J-J5-Ji']")).getText();
//			String expected = driver.findElement(By.xpath("//a[contains(@title,'Inbox')]")).getText();	
				
			String actual = "Inbox";
			
			
			
		boolean b = expected.contains(actual);
		boolean c = true;
			
//			expected.matches(actual+"(.*)");
			
			
		
			Assert.assertEquals(c,b);
			
			
			
			ExcelReader exl = new ExcelReader("C:\\Users\\meetg\\Documents\\TestData.xlsx");
	
			String sheetName = "LoginTestingStatus";
			int rows = exl.getRowCount(sheetName);
			int cols = exl.getColumnCount(sheetName);
			
			Object[][] data = new Object[rows-1][cols];
			
			for(int rowNum=2;rowNum<=rows;rowNum++){
				for(int colNum=0;colNum<cols;colNum++){
					
					data[rowNum-2][colNum] = exl.setCellData(sheetName, "Status", rowNum, "Valid credentials,but TestCase Passed");
					
					exl.fis.markSupported();
				   
					}
				
					
						
					}
					
				
				
			
			
			
			
			
		} catch (Exception e) {
//			System.out.println("Testcase Fail");
			ExcelReader exl = new ExcelReader("C:\\Users\\meetg\\Documents\\TestData.xlsx");
			String sheetName = "LoginTestingStatus";
			int rows = exl.getRowCount(sheetName);
			int cols = exl.getColumnCount(sheetName);
			
			Object[][] data = new Object[rows-1][cols];
			
			for(int rowNum=2;rowNum<=rows;rowNum++){
				for(int colNum=0;colNum<cols;colNum++){
					
					data[rowNum-2][colNum] = exl.setCellData(sheetName, "Status", rowNum, "Invalid credentials,but TestCase Passed");
		
					
				}
				
			}
//			exl.setCellData(sheetName, "Status", 2, "Fail");
		}
		
		

		
		
	  
	  

	}
    
    @DataProvider
    public  static Object[][] getData(){
    	
    	ExcelReader exl = new ExcelReader("C:\\Users\\meetg\\Documents\\TestData.xlsx");
    	String sheetName = "Login";
    	int rows = exl.getRowCount(sheetName);
    	int cols = exl.getColumnCount(sheetName);
    	System.out.println(rows);
    	System.out.println(cols);
    	  	
    	Object[][] data = new Object[rows-1][cols];
    	
    	
    	for(int rownum=2;rownum<=rows;rownum++){    		
    		for(int colnum=0;colnum<cols;colnum++){
    			
    			data[rownum-2][colnum] = exl.getCellData(sheetName, colnum, rownum) ;
    			
    		
    	}
    		
    	}
    	
    		

		/*for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=exl.getCellData(sheetName, colNum, rowNum); //-2
    			
    		}
    		
    		
    	}*/
    	
    	
		return data;	
    	 
    	  	
    	
    }

}
