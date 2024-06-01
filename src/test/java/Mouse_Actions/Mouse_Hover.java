package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Hover extends Base_Class_Mouse_Actions 
{
	@Test(priority = 0)
	public void icon() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void image() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		
		driver.findElement(By.xpath("//a[text()='Image']")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//p[@class='text-center pt-3 text-lg']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(element).build().perform();
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void ratings() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		
		driver.findElement(By.xpath("//a[text()='Ratings']")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']//label[5]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).click().build().perform();
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement point = driver.findElement(By.xpath("//h1[text()='Review this product']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", point);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void tab() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		
		driver.findElement(By.xpath("//a[text()='Tab']")).click();
		
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.xpath("//li[text()='Men ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(men).build().perform();
		
		Thread.sleep(3000);
		
		WebElement women = driver.findElement(By.xpath("(//li[contains(text(),'Women ')])[1]"));
		
		act.moveToElement(women).build().perform();
		
		Thread.sleep(3000);
		
		WebElement kids = driver.findElement(By.xpath("//li[text()='Kids ']"));
		
		act.moveToElement(kids).build().perform();
		
		Thread.sleep(3000);
		
		WebElement homeliving = driver.findElement(By.xpath("//li[text()='Home & Living']"));
		
		act.moveToElement(homeliving).build().perform();
		
		Thread.sleep(3000);
		
		WebElement beauty = driver.findElement(By.xpath("//li[text()='Beauty ']"));
		
		act.moveToElement(beauty).build().perform();
		
		Thread.sleep(3000);
	}
}
