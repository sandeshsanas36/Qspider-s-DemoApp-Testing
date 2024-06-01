package PopUps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Hidden_Division extends Base_Class_PopUps
{
	@Test
	public void defaultHiddenDivision() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Hidden division ']")).click();
		
		Thread.sleep(2000);
		
		
	}
}
