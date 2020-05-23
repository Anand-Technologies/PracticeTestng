 package org.testng.suite;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

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
	
	@Test
	private void testCase1() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("CLASS-ONE 1");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
