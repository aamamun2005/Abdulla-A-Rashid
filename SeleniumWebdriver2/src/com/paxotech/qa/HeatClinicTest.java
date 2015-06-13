package com.paxotech.qa;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class HeatClinicTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(35, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(300, 600));
		driver.manage().window().setSize(new Dimension(100, 400));
		driver.get("http://demo.broadleafcommerce.org/");
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("http://demo.broadleafcommerce.org/");
		driver.navigate().to(new URL("http://demo.broadleafcommerce.org/"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

	@Test
	public void test1() {
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("Broadleaf Commerce Demo Store - Heat Clinic", title);
		
		String url =driver.getCurrentUrl();
		System.out.println("URL " + url);
		
		String source = driver.getPageSource();
		System.out.println("Source: " + source);
		
		WebElement loginLink = driver.findElement(By.xpath("//*[@id='cart_info']/a[1]/span"));
		loginLink.click();
		
		WebElement emailTextBox =driver.findElement(By.name("j_username"));
		emailTextBox.sendKeys("aamamun2005@gmail.com");
		
		WebElement passwordBox = driver.findElement(By.name("j_password"));
		passwordBox.sendKeys("abcd123");
		
		WebElement clickLoginBox = driver.findElement(By.xpath("//*[@id='login']/div/form/div[3]/input"));
		clickLoginBox.click();
	}
	
	@Test
	public void test2() {
		WebElement loginLink = driver.findElement(By.xpath("//*[@id='cart_info']/a[1]/span"));
		loginLink.click();
		
		WebElement emailTextBox =driver.findElement(By.name("j_username"));
		emailTextBox.sendKeys("aamamunrashid@yahoo.com");
		
		WebElement passwordBox = driver.findElement(By.name("j_password"));
		passwordBox.sendKeys("abcd123");
		
		WebElement clickLoginBox = driver.findElement(By.xpath("//*[@id='login']/div/form/div[3]/input"));
		clickLoginBox.click();
	}
	@After
	public void tearDown() throws Exception {
		
		driver.close();
		driver.quit();
	}

}
