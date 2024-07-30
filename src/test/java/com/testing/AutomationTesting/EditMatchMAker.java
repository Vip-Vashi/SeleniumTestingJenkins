package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class EditMatchMAker {
	
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
	  void testEditMatchMaker() throws InterruptedException {
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();

		    
		    driver.get("http://localhost:3000/view");
		    driver.findElement(By.name("update33")).click();
		    driver.findElement(By.name("cmobile")).clear();
		    driver.findElement(By.name("cmobile")).sendKeys("9343693239");
	        
//		  
		  driver.findElement(By.id("submit")).submit();
////		
		  Thread.sleep(2000);
		     assertEquals("Updated Successfully", driver.switchTo().alert().getText());
		  	  }
	}
