package Scroll;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroll extends Base_Class_Scroll
{
	@Test(priority = 0)
	public void newTabVertical() throws InterruptedException
	{
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if (i == 1) 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("window.scrollTo(0,1600);");
				
				Thread.sleep(2000);
			}
			i++;
		}
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int j = 0;
		
		for (String stri : ids) 
		{
			driver.switchTo().window(stri);
			
			if(j == 1)
			{
				driver.close();
			}
			j++;
		}

	}
	
	@Test(priority = 1)
	public void newTabHorizontal() throws InterruptedException
	{
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if (i == 1) 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("window.scrollTo(1000,0);");
				
				Thread.sleep(2000);
			}
			i++;
		}
		
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int j = 0;
		
		for (String stri : ids) 
		{
			driver.switchTo().window(stri);
			
			if(j == 1)
			{
				driver.close();
			}
			j++;
		}
	}
}


