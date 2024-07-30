package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddMatchMAkerTC {
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
	  void testAddMatchMaker() throws InterruptedException {
		  
		 
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Match Makers")).click();
		    driver.findElement(By.id("add")).click();
		    driver.findElement(By.name("mname")).click();
		  driver.findElement(By.name("mname")).sendKeys("Ramana");
		  driver.findElement(By.name("addr")).click();
		  driver.findElement(By.name("addr")).sendKeys("Sinthamani,Madurai-609906");
		  driver.findElement(By.name("cmobile")).click();
		  driver.findElement(By.name("cmobile")).sendKeys("8912345678");
		 
		  driver.findElement(By.id("submit")).submit();
		  Thread.sleep(2000);
		  assertEquals("Data added Successfully", driver.switchTo().alert().getText());
		  Thread.sleep(6000);
	  }
	 
	 
	 @Test
	  void testAddMatchMakerIfInvalidOrNUll() throws InterruptedException {
		  
		 
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Match Makers")).click();
		    driver.findElement(By.id("add")).click();
		    driver.findElement(By.name("mname")).click();
		  driver.findElement(By.name("mname")).sendKeys("");
		  driver.findElement(By.name("addr")).click();
		  driver.findElement(By.name("addr")).sendKeys("Sinthamani,Madurai-609906");
		  driver.findElement(By.name("cmobile")).click();
		  driver.findElement(By.name("cmobile")).sendKeys("8912345678");
		 
		  driver.findElement(By.id("submit")).submit();
		  Thread.sleep(2000);
		  assertEquals("Name Cannot be empty value!!! PLease Enter Name", driver.switchTo().alert().getText());
		  Thread.sleep(6000);
	  }

}
