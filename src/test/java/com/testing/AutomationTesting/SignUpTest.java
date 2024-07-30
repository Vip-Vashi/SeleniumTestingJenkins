package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SignUpTest {
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
	   @Order(1)
	   void testSignup() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		    driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("SignUp")).click();
		 
		    driver.findElement(By.id("uname")).sendKeys("vasi");
		  
		    driver.findElement(By.id("email") ).sendKeys("vasi@gmail.com");
		   
		    driver.findElement(By.id("pwd") ).sendKeys("vasi@123");
		    
		    driver.findElement(By.id("btn")).submit();
		    
		    Thread.sleep(2000);
		  assertEquals("Registered Successfully",driver.switchTo().alert().getText() );
	 }
	@Test
	void testSignupfail() throws InterruptedException {
//		     WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();

		driver.findElement(By.id("uname")).sendKeys("Ravi");

		driver.findElement(By.id("email")).sendKeys("ravi@gmail.com");

		driver.findElement(By.id("pwd")).sendKeys(" ");

		driver.findElement(By.id("btn")).submit();

		Thread.sleep(2000);

		assertEquals(("Password  Cannot be empty value !!  It Should Contain atleast 8 characters!!!"),
				driver.switchTo().alert().getText());
      Thread.sleep(10000);
	}
}
