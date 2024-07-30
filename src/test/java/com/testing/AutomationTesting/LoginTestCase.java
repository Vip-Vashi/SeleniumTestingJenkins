package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTestCase {
	
	WebDriver driver;
	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	@Test
	
	void  testlogin() {
		    WebDriver driver = new ChromeDriver();
		
		    driver.get("http://localhost:3000/");
		    driver.manage().window().setSize(new Dimension(1552, 832));
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("raj@gmail.com");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("Raja@123");
		    driver.findElement(By.cssSelector(".text-white")).click();
		    assertEquals("Login Success!!",driver.switchTo().alert().getText());



	}
	
	@Test
	
	void  testLoginWithInvalidCredentitals() throws InterruptedException {
		  
		    
		    driver.get("http://localhost:3000/");
		    driver.manage().window().setSize(new Dimension(1552, 832));
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("raju@gmail.com");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("Raju@123");
		    driver.findElement(By.cssSelector(".text-white")).click();
		   
		    assertEquals("Invalid credentials. Please try again.",driver.switchTo().alert().getText());
		    Thread.sleep(10000);


	} 

}
