package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class DeleteUserTC {
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
		void DeleteUsertest() throws InterruptedException {
			driver.get("http://localhost:3000/viewuser");
			driver.manage().window().maximize();
		
		    driver.findElement(By.name("delete58")).click();
		    Thread.sleep(5000);
		    driver.switchTo().alert().accept();
		    
		    WebDriverWait waitDriver = new WebDriverWait(driver,Duration.ofSeconds(5));
		    waitDriver.until(ExpectedConditions.alertIsPresent());
		   Thread.sleep(6000);
		    assertEquals("record has deleted", driver.switchTo().alert().getText());
		}


}
