package org.cts.dataprovider;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
	
	static WebDriver driver;
	@BeforeClass
	private void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\PracticeTestng\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@AfterClass
	private void quit() {
		driver.quit();
	}
	
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(dataProvider="Anand")
	private void testCase1(String s1, String s2, String s3, String s4) {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(s1);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(s2);
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys(s3);
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys(s4);				
		driver.findElement(By.id("loginbutton")).click();
	}

	@DataProvider(name="Anand")
	public Object[][] data() {
		
		return new Object[][] {
			
			{"anand","yuvan","1234","5678"},
			{"arun","4455","hello","Java"}		
		};		
	}
}
