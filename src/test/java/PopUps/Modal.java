package PopUps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Modal extends Base_Class_PopUps 
{
	@Test(priority = 0)
	public void defaultModal() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Modal']")).click();
		
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("modal1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("closeModal")).click();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void multipleModal() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Modal']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multiple Modal']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("multiModalButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("multiClosemodal")).click();		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='close'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("multiclose2")).click();
		
		Thread.sleep(2000);
	}
}
