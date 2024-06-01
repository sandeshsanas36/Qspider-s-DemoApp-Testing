package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Progress_Bar extends Base_Class_Synchronization 
{
	@Test(priority = 0)
	public void defaultProgressBar() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Thread.sleep(12000);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
	}
	
	@Test(priority = 1)
	public void withTimer() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='With Timer']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Thread.sleep(7000);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
	}
	
	@Test(priority = 2)
	public void withElement() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='With Element']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("15");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
	}
	
	@Test(priority = 3)
	public void withElementDisappear() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='With Element Disappear']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("20");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		Thread.sleep(2000);
//		
//		WebElement sel = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-slate-200 rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150 cursor-not-allowed']"));
//		
//		WebElement sel2 = driver.findElement(By.xpath("//option[@value='yes']"));
//		
//		js.executeAsyncScript("arguments[0].click();", sel);
//		
//		Thread.sleep(2000);
//		
//		js.executeAsyncScript("arguments[0].click();", sel2);
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void disabledElement() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("10");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
	}
	
	@Test(priority = 5)
	public void hiddenElement() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='Hidden Element']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("8");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
	}
}
