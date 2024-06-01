package PopUps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaScript extends Base_Class_PopUps
{
	@Test(priority = 0)
	public void handleAlertPopups() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void getText() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Text - "+text);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void handleConfirmAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void getTextFromConformAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Text From Conform Alert - "+text);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void handlePromptAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void sendDataToPromptAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Yes");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	public void getTextFromPromptAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Text From Prompt Alert - "+text);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
	}
	
//	@Test(priority = 0)
//	public void defaultAlert() throws InterruptedException
//	{
//		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//		
//		Thread.sleep(2000);
//		
//		String text = driver.switchTo().alert().getText();
//		
//		System.out.println("Text From default alert - "+text);
//		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority = 1)
//	public void confirmAlert() throws InterruptedException
//	{
//		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
//		
//		Thread.sleep(2000);
//		
//		String text = driver.switchTo().alert().getText();
//		
//		System.out.println("Text From Conform Alert - "+text);
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority = 2)
//	public void promptAlert() throws InterruptedException
//	{
//		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
//		
//		Thread.sleep(2000);
//		
//		String text = driver.switchTo().alert().getText();
//		
//		System.out.println("Text From Prompt Alert - "+text);
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().sendKeys("Yes");
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//	}
}
	






