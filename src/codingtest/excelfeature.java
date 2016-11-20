package codingtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;





public class excelfeature extends TestBase{

	
	@Test(dataProvider="getData",groups={"excel"})
	public void addCountry(String username,String password) throws IOException
		{
		
	
         System.out.println(username);
         System.out.println(password);
    
   
		
			
		}
	
		
	
	
	
	
	
    
	
	
    
	@DataProvider
	public static Object[][] getData(){
		
		
		
        String sheetName = "TestDatasheet";
		
		int rows = excel.getRowCount(sheetName);
		System.out.println("Total rows are : "+rows);
		int cols = excel.getColumnCount(sheetName);
		System.out.println("Total cols are : "+cols);
		Object[][] data = new Object[rows-1][cols];
		
	
		

		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			}
		}
		
		
	return data;
	
	
		
	
	}

 	
}
