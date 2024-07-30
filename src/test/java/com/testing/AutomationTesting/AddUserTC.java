package com.testing.AutomationTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddUserTC {
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
	  void ValidateAddUser() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("poornima");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("kaalvasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("25");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  Thread.sleep(2000);
		  assertEquals("Data added Successfully", driver.switchTo().alert().getText());
//		  driver.switchTo().alert().accept();
		  Thread.sleep(10000);
	  }
	 
	 
	 
	 @Test
	  void testInvalidAddUserOrNull() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("ponni");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("keelavasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("16");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  Thread.sleep(2000);
		  assertEquals("Minimum Age is 18 !!! Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  Thread.sleep(10000);
	  }
	 
	 
	 
	 
	 
	 @Test
	  void testInvalidAddUserDataOrNull() throws InterruptedException {
		  
		
		  driver.get("http://localhost:3000/");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Features")).click();
		    driver.findElement(By.linkText("Our Customers")).click();
		    driver.findElement(By.linkText("Add +")).click();
		  driver.findElement(By.name("uname")).sendKeys("");
		  driver.findElement(By.name("actype")).sendKeys("Bride");
		  driver.findElement(By.name("addr")).sendKeys("keelavasal,Madurai-08");
		  driver.findElement(By.name("age")).sendKeys("16");
		
		  driver.findElement(By.name("sal")).sendKeys("15000"); 
		  
		  driver.findElement(By.name("job")).sendKeys("Tailor");  
		  driver.findElement(By.name("pay")).sendKeys("Monthly");

		  driver.findElement(By.name("religion")).sendKeys("Hindu");  
		 
	  	 driver.findElement(By.name("sts")).sendKeys("Single");
		 driver.findElement(By.xpath("//option[. = '4']")).click();
		  driver.findElement(By.id("submit")).submit();
		  Thread.sleep(2000);
		  assertEquals("Please enter Name !!! Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  Thread.sleep(10000);
	  }
	 

}
