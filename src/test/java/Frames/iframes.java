package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iframes extends Base_Class_Frames 
{
	@Test(priority = 0)
	public void defaultIframes() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void nestedIframe() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		driver.switchTo().frame(ele);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("password")).sendKeys(epassword);
		
		driver.findElement(By.id("confirm-password")).sendKeys(cpassword);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void multipleIframe() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("password")).sendKeys(epassword);
		
		driver.findElement(By.id("confirm-password")).sendKeys(cpassword);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("username")).sendKeys(email2);
		
		driver.findElement(By.id("password")).sendKeys(epassword2);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void nestedWithMultipleIframe() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		driver.switchTo().frame(ele);
		
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("password")).sendKeys(epassword);
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(2);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement CP = driver.findElement(By.xpath("//label[text()='Confirm Password:']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", CP);
		
		driver.findElement(By.id("confirm")).sendKeys(cpassword);
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
	}
}





