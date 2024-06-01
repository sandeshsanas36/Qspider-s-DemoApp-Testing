package PopUps;	// *

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Browser_Windows extends Base_Class_PopUps 
{
	@Test(priority = 0)
	public void handleNewWindowPopUps() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if (i == 1) 
			{
				driver.close();	
			}
			i++;

		}
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int j = 0;
		
		for (String str : ids) 
		{
			driver.switchTo().window(str);
			
			if (j < 1) 
			{
				
			}
		}
	}
	
	@Test(priority = 1)
	public void transferControlToAnotherWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if (i == 1) 
			{
				System.out.println("From Another Window");
				
				driver.close();	
			}
			i++;

		}
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int j = 0;
		
		for (String str : ids) 
		{
			driver.switchTo().window(str);
			
			if (j < 1) 
			{
				
			}
			j++;
		}
	}
	
	@Test(priority = 2)
	public void handleNewTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if (i==1) 
			{
				driver.close();
			}
			i++;
	
		}
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int j = 0;
		
		for (String str : ids) 
		{
			driver.switchTo().window(str);
			
			if (j < 1) 
			{
				
			}
			j++;
		}
	}
	
//	@Test(priority = 3)
//	public void multipleWindow() throws InterruptedException
//	{
//		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//		
//		Thread.sleep(2000);
//		
////		Actions act = new Actions(driver);
////		
////		WebElement element = driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']"));
//		
//		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
//		
//		Thread.sleep(2000);
//		
//		Set<String> id = driver.getWindowHandles();
//		
//		int i = 0;
//		
//		for (String str : id) 
//		{
//			driver.switchTo().window(str);
//			
//			if (i==1) 
//			{
//				driver.close();
//			}
//			i++;
//
//		}
//		
//		Thread.sleep(2000);
//		
//		Set<String> ids = driver.getWindowHandles();
//		
//		int j = 0;
//		
//		for (String str : ids) 
//		{
//			driver.switchTo().window(str);
//			
//			if (j < 1) 
//			{
//				
//			}
//			j++;
//		}
//	}

}
