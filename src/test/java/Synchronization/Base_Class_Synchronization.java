package Synchronization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Class_Synchronization 
{
	WebDriver driver;
	Sheet sheet;
	
	String url;
	
	@BeforeSuite
	public void beforeSuite() throws EncryptedDocumentException, IOException
	{
		File path = new File("D:\\AUTOMATION TESTING\\QDAD\\QspidersDemoSiteData.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		sheet = wb.getSheet("Synchronization");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		url = sheet.getRow(0).getCell(1).toString();
	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(36));
		
		driver.navigate().to(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{	
		System.out.println("Logic for Login");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Logic for logOut");
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Write Post condition for Test Runner");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Logic for db disconnect");
	}
}

