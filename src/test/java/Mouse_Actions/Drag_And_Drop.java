package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_And_Drop extends Base_Class_Mouse_Actions 
{
	@Test(priority = 0)
	public void defaultdragDrop() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		Thread.sleep(2000);
		
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(dragMe, 300, 150);
		
		act.build().perform();
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void dragPosition() throws InterruptedException 
	{
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement MobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		
		WebElement MobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		act.dragAndDrop(MobileCharger, MobileAccessories).build().perform();
		
		Thread.sleep(3000);
		
		WebElement MobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		act.dragAndDrop(MobileCover, MobileAccessories).build().perform();
		
		Thread.sleep(3000);
		
		WebElement LaptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		act.dragAndDrop(LaptopCharger, LaptopAccessories).build().perform();
		
		Thread.sleep(3000);
		
		WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		act.dragAndDrop(LaptopCover, LaptopAccessories).build().perform();
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 2,enabled = false)
	public void aa() throws InterruptedException 
	{
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement MobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		
		WebElement MobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		act.dragAndDrop(MobileCharger, MobileAccessories).build().perform();
//		
//		Thread.sleep(3000);
		
		WebElement MobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		act.dragAndDrop(MobileCover, MobileAccessories).build().perform();
		
		Thread.sleep(3000);
		
//		WebElement LaptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
//		
//		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//		
//		act.dragAndDrop(LaptopCharger, LaptopAccessories).build().perform();
//		
//		Thread.sleep(3000);
//		
//		WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//		
//		act.dragAndDrop(LaptopCover, LaptopAccessories).build().perform();
//		
//		Thread.sleep(3000);
		
	}
}







