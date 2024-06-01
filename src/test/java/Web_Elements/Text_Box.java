package Web_Elements;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Text_Box extends Base_Class_WebElement
{
	@Test
	public void plaeholder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys(gmail);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
}
