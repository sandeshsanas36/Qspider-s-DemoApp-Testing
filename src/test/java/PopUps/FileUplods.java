package PopUps;	// *

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUplods extends Base_Class_PopUps
{
	@Test(priority = 0)
	public void defaultFileUpload() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("fileInput")).sendKeys("D:\\AUTOMATION TESTING\\Qspiders Demo Site Data\\Sandesh Sanas Resume.pdf");
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void customButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).sendKeys("D:\\AUTOMATION TESTING\\Qspiders Demo Site Data\\Sandesh Sanas Resume.pdf");
		
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void dragAndDrop() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("fileInput")).sendKeys("D:\\AUTOMATION TESTING\\Qspiders Demo Site Data\\Sandesh Sanas Resume.pdf");
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void multipleSelect() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multiple select']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("fileInput")).sendKeys("D:\\AUTOMATION TESTING\\Qspiders Demo Site Data\\Sandesh Sanas Resume.pdf");
		
		Thread.sleep(2000);
	}
}









