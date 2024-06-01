package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Click_And_Hold extends Base_Class_Mouse_Actions
{
	@Test
	public void defaultClickHold() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		Thread.sleep(2000);
		
		WebElement circle = driver.findElement(By.id("circle"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(circle).build().perform();
		
		Thread.sleep(3000);
	}
}
