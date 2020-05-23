package org.cts.testing;

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

public class PracticeTestng {

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
		username.sendKeys("anandtesting45");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(priority=-20)
	private void testCase2() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("PRIORITY-1");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(priority=-18)
	private void testCase3() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("PRIORITY-2");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(priority=-14)
	private void testCase4() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("PRIORITY-4");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(priority=-12)
	private void testCase5() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("PRIORITY-5");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	@Test(priority=-16)
	private void testCase6() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("anandtesting45");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	@Test
	private void testCase7() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("PRIORITY-3");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(enabled=false)
	private void testCase8() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("anandtesting45");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	@Test(invocationCount=5)
	private void testCase9() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("COUNT - 5 Times");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
	@Test(enabled=false)
	private void testCase10() {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("anandtesting45");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234567");
		driver.findElement(By.id("loginbutton")).click();
	}
}
