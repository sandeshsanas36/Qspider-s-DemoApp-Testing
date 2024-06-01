package PopUps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Download extends Base_Class_PopUps
{
	@Test
	public void defaultDownload() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Download ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("writeArea")).sendKeys("Sandesh Sanas");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("downloadButton")).click();
		
		Thread.sleep(2000);
		
		
	}
}
