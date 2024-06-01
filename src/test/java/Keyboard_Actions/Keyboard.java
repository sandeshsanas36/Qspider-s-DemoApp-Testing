package Keyboard_Actions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Keyboard extends Base_Class_Keyboard_Actions 
{
	@Test
	public void defaultKeyboardActions() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		
		Thread.sleep(2000);
		
		
	}
}
