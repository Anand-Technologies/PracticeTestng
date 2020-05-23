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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PassParameters {

static WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\PracticeTestng\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	private void quit() {
		driver.quit();
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Parameters({"user","password"})    
	@Test
	private void testCase1(@Optional("anand")String s1, @Optional("yuvan")String s2) {
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(s1);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(s2);
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}
}
