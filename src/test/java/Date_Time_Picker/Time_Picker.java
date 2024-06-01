package Date_Time_Picker;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Time_Picker extends Base_Class_Date_Time_Picker 
{
	@Test(priority = 0)
	public void defaultTimePicker() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@aria-label='1 hours']")).click();
		
		driver.findElement(By.xpath("//li[@aria-label='5 minutes']")).click();
		
		driver.findElement(By.xpath("//li[@aria-label='PM']")).click();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void timePickerClock() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@inputmode='text']")).click();
		
		Thread.sleep(2000);
		
		//select time**
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(2000);
	}
}
