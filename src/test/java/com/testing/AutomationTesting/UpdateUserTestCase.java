package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateUserTestCase {

	WebDriver driver = new ChromeDriver();
	  @AfterEach
	  public void tearDown() {
	    driver.quit();
	  }
	  
	@Test
	void UpdateUsertest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/viewuser");
	    driver.findElement(By.name("update59")).click();
	    driver.findElement(By.name("uname")).clear();
	    driver.findElement(By.name("uname")).sendKeys("Madhan");
	    driver.findElement(By.id("submit")).submit();
//////	
	     Thread.sleep(2000);
	     assertEquals(" Updated Successfully", driver.switchTo().alert().getText());
	}

}
