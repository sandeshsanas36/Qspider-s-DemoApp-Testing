package PopUps; // *

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Notification extends Base_Class_PopUps
{
	@Test
	public void defaultNotification() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Notifications']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("browNotButton")).click();
		
		
	}
}
