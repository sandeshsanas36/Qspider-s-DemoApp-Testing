package PopUps;	// *

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Authentication extends Base_Class_PopUps 
{
	@Test
	public void defaultLoginAction() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		int i = 0;
		
		for (String str : id) 
		{
			driver.switchTo().window(str);
			
			if(i > 0)
			{
				System.out.println("ok");
			}
			i++;
		}
	}
}
