package org.hexaware;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello2 {

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BALAKRISHNAN\\eclipse-workspace\\MavenJunit\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}		
	@AfterClass
	public static void afterClass() {
		
		driver.quit();
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
	@Test
	public void test1() {
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("bala16krishnan@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
		btnLogin.click();	
	}

}
