package codingtest;

import org.testng.annotations.Test;

import base.TestBase;

public class Codingtest extends TestBase{
	
	@Test
	public void test(){
		System.out.println("Test Pass Congrats you get the oppurtunity");
		
		
		
		
			/*WebDriver driver = new FirefoxDriver();
		 
		WebElement fromWebElement =	driver.findElement(By.cssSelector(".ui-draggable div[title='DragMe']"));
		WebElement toWebElement =   driver.findElement(By.cssSelector(".ui-draggable div[title='DropMe']"));
		//Action class
		Actions builder = new Actions(driver);
		builder.dragAndDrop(fromWebElement, toWebElement);
		

		//Case 2:

		//draggable web element 
		
			Actions builder = new Actions(driver);
		Action dragAndDrop =  builder.clickAndHold(fromWebElement).moveToElement(toWebElement).release(toWebElement).build();
		dragAndDrop.perform();
		

		//Case 3:

		
			Actions builder = new Actions(driver);
		Action dragAndDrop =  builder.clickAndHold(fromWebElement).moveToElement(toWebElement, 2, 2).release(toWebElement).build();
		dragAndDrop.perform();
		//You can adjust the xOffset and yOffset values(which is 2 in the above example) as per your requirements

		//Case 4:

		Actions builder = new Actions(driver);
		builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
		Thread.sleep(2000);
		builder.release(toWebElement).build().perform();
		

		//By using Robot class

		
		Point coordinates1 = fromWebElement.getLocation();
		Point coordinates2 = toWebElement.getLocation();
		 
		Robot robot = new Robot();
		 
		robot.mouseMove(coordinates1.getX(), coordinates1.getY());
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(coordinates2.getX(), coordinates2.getY());
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(2000);
*/
		
		/*  and alerts
		
		
		System.out.println(driver.switchTo().alert().getText());		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("Text"); or stringToSend
		
		or use frame
			
      driver.switchTo().frame("frameName");
		
		
		                                */
		
		/* Window pop up

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		                                            // perform operations on popup

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		*/
		
	}

}
