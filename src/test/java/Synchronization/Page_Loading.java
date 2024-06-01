package Synchronization;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Page_Loading extends Base_Class_Synchronization
{
	@Test
	public void defaultPageLoading() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		Thread.sleep(7000);
		
		Set<String> ids = driver.getWindowHandles();
		
		int i = 0;
		
		for (String stri : ids) 
		{
			driver.switchTo().window(stri);
			
			if(i == 1)
			{
				driver.close();
			}
			i++;
		}
		
		Thread.sleep(2000);
	}
}
