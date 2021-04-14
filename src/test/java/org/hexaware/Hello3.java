package org.hexaware;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello3 {
	

	static WebDriver driver;
	
		@BeforeClass
		public static void browser() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BALAKRISHNAN\\eclipse-workspace\\MavenJunit\\drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		}	
		@Before
		public void beforeMethod() {
			
			Date date=new Date();
			System.out.println(date);
		}
		@After
		public void afterMethod() {
			
			Date date=new Date();
			System.out.println(date);		
		}
		@AfterClass
		public static void close() {
			
			driver.close();
		}
		@Test
		public void test1() {
			
			WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys("Welcome");
			Assert.assertEquals("Welcome",txtUserName.getAttribute("value"));
		}
}
