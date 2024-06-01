package Date_Time_Picker;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Date_Picker extends Base_Class_Date_Time_Picker 
{
	@Test(priority = 0)
	public void simpleDatePicker() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='24']")).click();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void dropDownDatePicker() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Dropdown DatePicker']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='24']")).click();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 2,enabled = false)
	public void iconTrigger() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Icon Trigger']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__tab-loop__start']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[text()='24']")).click();
		
		Thread.sleep(2000);
	}
}





